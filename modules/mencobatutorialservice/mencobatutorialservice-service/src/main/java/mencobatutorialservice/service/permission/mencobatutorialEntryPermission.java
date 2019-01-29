package mencobatutorialservice.service.permission;

import mencobatutorialservice.model.mencobatutorialEntry;
import mencobatutorialservice.service.mencobatutorialEntryLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.BaseModelPermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    property = {"model.class.name=mencobatutorialservice.model.mencobatutorialEntry"}
)

public class mencobatutorialEntryPermission implements BaseModelPermissionChecker {
	
	public static void check(
        PermissionChecker permissionChecker, long entryId, String actionId)
        throws PortalException, SystemException {

        if (!contains(permissionChecker, entryId, actionId)) {
            throw new PrincipalException();
        }
    }

    public static boolean contains(
        PermissionChecker permissionChecker, long entryId, String actionId)
        throws PortalException, SystemException {

    	mencobatutorialEntry entry = _entryLocalService.getmencobatutorialEntry(entryId);

        return contains (permissionChecker, entry, actionId);

    }

    public static boolean contains(
        PermissionChecker permissionChecker, mencobatutorialEntry entry, String actionId) throws
        PortalException, SystemException {

        return permissionChecker.hasPermission(entry.getGroupId(), mencobatutorialEntry.class.getName(), entry.getEntryId(), actionId);
    }

    @Reference(unbind = "-")
    protected void setEntryLocalService (mencobatutorialEntryLocalService entryLocalService) {

        _entryLocalService = entryLocalService;
    }

    private static mencobatutorialEntryLocalService _entryLocalService; 

    @Override
    public void checkBaseModel(
        PermissionChecker permissionChecker, long groupId, long primaryKey, String actionId) throws PortalException {
            check(permissionChecker, primaryKey, actionId);
    }

}
