package mencobatutorialservice.mencobatutorial.asset;

import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;

import mencobatutorialservice.model.mencobatutorialEntry;
import mencobatutorialservice.service.mencobatutorialEntryLocalService;
//import mencobatutorialservice.service.permission.EntryPermission;
import mencobatutorial.constants.MencobatutorialPortletKeys;

import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
//import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.portlet.WindowStateException;
import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    property = {"javax.portlet.name=" + MencobatutorialPortletKeys.GUESTBOOK},
    service = AssetRendererFactory.class
)

public class mencobatutorialEntryAssetRendererFactory extends BaseAssetRendererFactory<mencobatutorialEntry>{
	public mencobatutorialEntryAssetRendererFactory() {
        setClassName(CLASS_NAME);
        setLinkable(_LINKABLE);
        setPortletId(MencobatutorialPortletKeys.GUESTBOOK);
        setSearchable(true);
        setSelectable(true);
    }

    @Override
    public AssetRenderer<mencobatutorialEntry> getAssetRenderer(long classPK, int type)
        throws PortalException {

    	mencobatutorialEntry entry = _entryLocalService.getmencobatutorialEntry(classPK);

    	mencobatutorialEntryAssetRenderer entryAssetRenderer = new mencobatutorialEntryAssetRenderer(entry);

        entryAssetRenderer.setAssetRendererType(type);
        entryAssetRenderer.setServletContext(_servletContext);

        return entryAssetRenderer;
    }

    @Override
    public String getClassName() {
        return CLASS_NAME;
    }

    @Override
    public String getType() {
        return TYPE;
    }

//    @Override
//    public boolean hasPermission(PermissionChecker permissionChecker,
//        long classPK, String actionId) throws Exception {
//
//    	mencobatutorialEntry entry = _entryLocalService.getmencobatutorialEntry(classPK);
//        return EntryPermission.contains(permissionChecker, entry, actionId);
//    }

    @Override
    public PortletURL getURLAdd(LiferayPortletRequest liferayPortletRequest,
        LiferayPortletResponse liferayPortletResponse, long classTypeId) {

        PortletURL portletURL = null;

        try {
            ThemeDisplay themeDisplay = (ThemeDisplay) liferayPortletRequest.getAttribute(WebKeys.THEME_DISPLAY);

            portletURL = liferayPortletResponse.createLiferayPortletURL(getControlPanelPlid(themeDisplay),
            		MencobatutorialPortletKeys.GUESTBOOK, PortletRequest.RENDER_PHASE);
            portletURL.setParameter("mvcRenderCommandName", "/mencobatutorialportlet/edit_entry");
            portletURL.setParameter("showback", Boolean.FALSE.toString());
        } catch (PortalException e) {
        }

        return portletURL;
    }

    @Override
    public PortletURL getURLView(LiferayPortletResponse liferayPortletResponse, WindowState windowState) {

        LiferayPortletURL liferayPortletURL
            = liferayPortletResponse.createLiferayPortletURL(
            		MencobatutorialPortletKeys.GUESTBOOK, PortletRequest.RENDER_PHASE);

        try {
            liferayPortletURL.setWindowState(windowState);
        } catch (WindowStateException wse) {

        }
        return liferayPortletURL;
    }

    @Override
    public boolean isLinkable() {
        return _LINKABLE;
    }

    @Override
    public String getIconCssClass() {
        return "pencil";
    }

    @Reference(target = "(osgi.web.symbolicname=mencobatutorial.portlet)",
        unbind = "-")
    public void setServletContext (ServletContext servletContext) {
        _servletContext = servletContext;
    }

    @Reference(unbind = "-")
    protected void setEntryLocalService(mencobatutorialEntryLocalService entryLocalService) {
        _entryLocalService = entryLocalService;
    }

    private mencobatutorialEntryLocalService _entryLocalService;
    private ServletContext _servletContext;
    private static final boolean _LINKABLE = true;
    public static final String CLASS_NAME = mencobatutorialEntry.class.getName();
    public static final String TYPE = "entry";

}
