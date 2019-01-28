package mencobatutorialservice.mencobatutorial.asset;

import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;

import mencobatutorialservice.model.mencobatutorial;
import mencobatutorialservice.service.mencobatutorialEntryLocalService;
import mencobatutorialservice.service.mencobatutorialLocalService;
//import com.liferay.docs.guestbook.service.permission.GuestbookPermission;
import mencobatutorial.constants.MencobatutorialPortletKeys;

import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(immediate = true, 
  property = {"javax.portlet.name=" + MencobatutorialPortletKeys.GUESTBOOK}, 
  service = AssetRendererFactory.class
  )

public class mencobatutorialAssetRendererFactory extends BaseAssetRendererFactory<mencobatutorial> {
	
	public mencobatutorialAssetRendererFactory() {
	    setClassName(CLASS_NAME);
	    setLinkable(_LINKABLE);
	    setPortletId(MencobatutorialPortletKeys.GUESTBOOK);
	    setSearchable(true);
	    setSelectable(true);
	}
	
	@Override
	public AssetRenderer<mencobatutorial> getAssetRenderer(long classPK, int type) 
	throws PortalException {

	  mencobatutorial guestbook = _guestbookLocalService.getmencobatutorial(classPK);

	  mencobatutorialAssetRenderer guestbookAssetRenderer = 
	  new mencobatutorialAssetRenderer(guestbook);

	  guestbookAssetRenderer.setAssetRendererType(type);
	  guestbookAssetRenderer.setServletContext(_servletContext);

	  return guestbookAssetRenderer;
	}
	
	 @Override
	  public String getClassName() {
	    return CLASS_NAME;
	  }

	  @Override
	  public String getType() {
	    return TYPE;
	  }
	  
      @Override
      public PortletURL getURLAdd(LiferayPortletRequest liferayPortletRequest,
          LiferayPortletResponse liferayPortletResponse, long classTypeId) {
        PortletURL portletURL = null;

        try {
          ThemeDisplay themeDisplay = (ThemeDisplay) 
          liferayPortletRequest.getAttribute(WebKeys.THEME_DISPLAY);

          portletURL = liferayPortletResponse.createLiferayPortletURL(getControlPanelPlid(themeDisplay),
        		  MencobatutorialPortletKeys.GUESTBOOK, PortletRequest.RENDER_PHASE);
          portletURL.setParameter("mvcRenderCommandName", "/guestbookwebportlet/edit_guestbook");
          portletURL.setParameter("showback", Boolean.FALSE.toString());
        } catch (PortalException e) {
        }

        return portletURL;
      }

      @Override
      public boolean isLinkable() {
        return _LINKABLE;
      }

      @Override
      public String getIconCssClass() {
          return "bookmarks";
      }

    @Reference(target = "(osgi.web.symbolicname=com.liferay.docs.guestbook.portlet)",
            unbind = "-")
    public void setServletContext(ServletContext servletContext) {
            _servletContext = servletContext;
        }
        private ServletContext _servletContext;

    @Reference(unbind = "-")
        protected void setGuestbookLocalService(mencobatutorialLocalService guestbookLocalService) {
            _guestbookLocalService = guestbookLocalService; 
    }

    private mencobatutorialLocalService _guestbookLocalService;
    private static final boolean _LINKABLE = true;
    public static final String CLASS_NAME = mencobatutorial.class.getName();
    public static final String TYPE = "guestbook";

	    
}
