package mencobatutorialservice.mencobatutorial.asset;

import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;

import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;

import mencobatutorial.constants.MencobatutorialPortletKeys;
import mencobatutorialservice.model.mencobatutorial;

import java.util.Locale;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class mencobatutorialAssetRenderer extends BaseJSPAssetRenderer<mencobatutorial> {
	
	public mencobatutorialAssetRenderer(mencobatutorial guestbook) {

        _guestbook = guestbook;
	}
	
	private mencobatutorial _guestbook;
	
	@Override
	public mencobatutorial getAssetObject() {
	  return _guestbook;
	}

	@Override
	public long getGroupId() {
	  return _guestbook.getGroupId();
	}

	@Override
	public long getUserId() {

	  return _guestbook.getUserId();
	}

	@Override
	public String getUserName() {
	  return _guestbook.getUserName();
	}

	@Override
	public String getUuid() {
	  return _guestbook.getUuid();
	}

	@Override
	public String getClassName() {
	  return mencobatutorial.class.getName();
	}

	@Override
	public long getClassPK() {
	  return _guestbook.getGuestbookId();
	}

	@Override
	public String getSummary(PortletRequest portletRequest, PortletResponse 
	  portletResponse) {
	    return "Name: " + _guestbook.getName();
	}

	@Override
	public String getTitle(Locale locale) {
	  return _guestbook.getName();
	}

	@Override
	public boolean include(HttpServletRequest request, HttpServletResponse 
	  response, String template) throws Exception {
	    request.setAttribute("GUESTBOOK", _guestbook);
	    request.setAttribute("HtmlUtil", HtmlUtil.getHtml());
	    request.setAttribute("StringUtil", new StringUtil());
	    return super.include(request, response, template);
	}
	
	@Override
	  public String getJspPath(HttpServletRequest request, String template) {

	    if (template.equals(TEMPLATE_FULL_CONTENT)) {
	      request.setAttribute("gb_guestbook", _guestbook);

	      return "/asset/guestbook/" + template + ".jsp";
	    } else {
	      return null;
	    }
	  }
	
	 @Override
	  public PortletURL getURLEdit(LiferayPortletRequest liferayPortletRequest,
	      LiferayPortletResponse liferayPortletResponse) throws Exception {
	    PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(
	        getControlPanelPlid(liferayPortletRequest), MencobatutorialPortletKeys.GUESTBOOK,
	        PortletRequest.RENDER_PHASE);
	    portletURL.setParameter("mvcRenderCommandName", "/guestbookwebportlet/edit_guestbook");
	    portletURL.setParameter("guestbookId", String.valueOf(_guestbook.getGuestbookId()));
	    portletURL.setParameter("showback", Boolean.FALSE.toString());

	    return portletURL;
	  }
	 
	 @Override
	  public String getURLViewInContext(LiferayPortletRequest liferayPortletRequest,
	      LiferayPortletResponse liferayPortletResponse, String noSuchEntryRedirect) throws Exception {
	    try {
	      long plid = PortalUtil.getPlidFromPortletId(_guestbook.getGroupId(),
	    		 MencobatutorialPortletKeys.GUESTBOOK);

	      PortletURL portletURL;
	      if (plid == LayoutConstants.DEFAULT_PLID) {
	        portletURL = liferayPortletResponse.createLiferayPortletURL(getControlPanelPlid(liferayPortletRequest),
	        	MencobatutorialPortletKeys.GUESTBOOK, PortletRequest.RENDER_PHASE);
	      } else {
	        portletURL = PortletURLFactoryUtil.create(liferayPortletRequest,
	        	MencobatutorialPortletKeys.GUESTBOOK, plid, PortletRequest.RENDER_PHASE);
	      }

	      portletURL.setParameter("mvcRenderCommandName", "/guestbookwebportlet/view");
	      portletURL.setParameter("guestbookId", String.valueOf(_guestbook.getGuestbookId()));

	      String currentUrl = PortalUtil.getCurrentURL(liferayPortletRequest);

	      portletURL.setParameter("redirect", currentUrl);

	      return portletURL.toString();

	    } catch (PortalException e) {

	    } catch (SystemException e) {
	    }

	    return noSuchEntryRedirect;
	  }
	 
	 @Override
	  public String getURLView(LiferayPortletResponse liferayPortletResponse, 
	  WindowState windowState) throws Exception {

	    return super.getURLView(liferayPortletResponse, windowState);
	  }
	
}
