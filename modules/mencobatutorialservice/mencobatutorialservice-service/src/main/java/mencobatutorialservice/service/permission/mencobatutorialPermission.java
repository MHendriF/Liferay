package mencobatutorialservice.service.permission;

import mencobatutorialservice.model.mencobatutorial;
import mencobatutorialservice.service.mencobatutorialLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    property = {"model.class.name=mencobatutorialservice.model.mencobatutorial.2"}
)

public class mencobatutorialPermission implements BaseModelPermissionChecker {
	
	 public static void check(
        PermissionChecker permissionChecker, long guestbookId, String actionId)
        throws PortalException, SystemException {

        if (!contains(permissionChecker, guestbookId, actionId)) {
            throw new PrincipalException();
        }
    }

    public static void check(
        PermissionChecker permissionChecker, long groupId, long guestbookId,
        String actionId)
        throws PortalException {

        if (!contains(permissionChecker, groupId, actionId)) {
            throw new PrincipalException.MustHavePermission(
                permissionChecker, mencobatutorial.class.getName(), guestbookId,
                actionId);
        }
    }

    public static boolean contains(
        PermissionChecker permissionChecker, long groupId, long guestbookId, String actionId) 
            throws PortalException {

    	mencobatutorial guestbook = _guestbookLocalService.getmencobatutorial(guestbookId);

        return mencobatutorialModelPermission.contains(permissionChecker, groupId, actionId);
    }

    public static boolean contains(
        PermissionChecker permissionChecker, long guestbookId, String actionId)
        throws PortalException, SystemException {

    	mencobatutorial guestbook
            = _guestbookLocalService.getmencobatutorial(guestbookId);
        return contains(permissionChecker, guestbook, actionId);
    }

    public static boolean contains(
        PermissionChecker permissionChecker, mencobatutorial guestbook, String actionId) 
            throws PortalException, SystemException {

        return permissionChecker.hasPermission(
        guestbook.getGroupId(), mencobatutorial.class.getName(), guestbook.getGuestbookId(), actionId);

    }

    @Reference(unbind = "-")
    protected void setGuestbookLocalService(mencobatutorialLocalService guestbookLocalService) {
        _guestbookLocalService = guestbookLocalService;
    }

    private static mencobatutorialLocalService _guestbookLocalService;

    @Override
    public void checkBaseModel(
        PermissionChecker permissionChecker, long groupId, long guestbookId, String actionId) throws PortalException {
            check(permissionChecker, guestbookId, actionId);
    }

}
