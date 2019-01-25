package mencobatutorial.portlet;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import mencobatutorial.constants.MencobatutorialPortletKeys;
import mencobatutorialservice.model.mencobatutorial;
import mencobatutorialservice.service.mencobatutorialLocalService;

@Component(
    immediate = true,
    property = {
            "com.liferay.portlet.display-category=category.hidden",
            "com.liferay.portlet.scopeable=true",
            "javax.portlet.display-name=mencobatutorialadmin",
            "javax.portlet.expiration-cache=0",
            "javax.portlet.init-param.portlet-title-based-navigation=true",
            "javax.portlet.init-param.template-path=/",
            "javax.portlet.init-param.view-template=/mencobatutorialadminportlet/view.jsp",
            "javax.portlet.name=" + MencobatutorialPortletKeys.MencobatutorialAdmin,
            "javax.portlet.resource-bundle=content.Language",
            "javax.portlet.security-role-ref=administrator",
            "javax.portlet.supports.mime-type=text/html",
            "com.liferay.portlet.add-default-resource=true"
    },
    service = Portlet.class
)

public class MencobatutorialAdminPortlet extends MVCPortlet {
	
	private mencobatutorialLocalService _mencobatutorialLocalService;
	
	public void addGuestbook(ActionRequest request, ActionResponse response)
	    throws PortalException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	    		mencobatutorial.class.getName(), request);

	    String name = ParamUtil.getString(request, "name");

	    try {
	        _mencobatutorialLocalService.addGuestbook(
	            serviceContext.getUserId(), name, serviceContext);
	    }
	    catch (PortalException pe) {

	        Logger.getLogger(MencobatutorialAdminPortlet.class.getName()).log(
	            Level.SEVERE, null, pe);

	        response.setRenderParameter(
	            "mvcPath", "/mencobatutorialadminportlet/edit_guestbook.jsp");
	    }
	}
	
	public void updateGuestbook(ActionRequest request, ActionResponse response)
	    throws PortalException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	    		mencobatutorial.class.getName(), request);

	    String name = ParamUtil.getString(request, "name");
	    long guestbookId = ParamUtil.getLong(request, "guestbookId");

	    try {
	        _mencobatutorialLocalService.updateGuestbook(
	            serviceContext.getUserId(), guestbookId, name, serviceContext);

	    } catch (PortalException pe) {

	        Logger.getLogger(MencobatutorialAdminPortlet.class.getName()).log(
	            Level.SEVERE, null, pe);

	        response.setRenderParameter(
	            "mvcPath", "/mencobatutorialadminportlet/edit_guestbook.jsp");
	    }
	}
	
	@Reference(unbind = "-")
	protected void setGuestbookService(mencobatutorialLocalService guestbookLocalService) {
		_mencobatutorialLocalService = guestbookLocalService;
	}
	
	public void deleteGuestbook(ActionRequest request, ActionResponse response)
	    throws PortalException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	    		mencobatutorial.class.getName(), request);

	    long guestbookId = ParamUtil.getLong(request, "guestbookId");

	    try {
	        _mencobatutorialLocalService.deleteGuestbook(guestbookId, serviceContext);
	    }
	    catch (PortalException pe) {

	        Logger.getLogger(MencobatutorialAdminPortlet.class.getName()).log(
	            Level.SEVERE, null, pe);
	    }
	}
}
