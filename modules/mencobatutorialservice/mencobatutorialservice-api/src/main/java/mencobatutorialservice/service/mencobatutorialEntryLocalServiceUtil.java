/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package mencobatutorialservice.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for mencobatutorialEntry. This utility wraps
 * {@link mencobatutorialservice.service.impl.mencobatutorialEntryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author liferay
 * @see mencobatutorialEntryLocalService
 * @see mencobatutorialservice.service.base.mencobatutorialEntryLocalServiceBaseImpl
 * @see mencobatutorialservice.service.impl.mencobatutorialEntryLocalServiceImpl
 * @generated
 */
@ProviderType
public class mencobatutorialEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link mencobatutorialservice.service.impl.mencobatutorialEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static mencobatutorialservice.model.mencobatutorialEntry addEntry(
		long userId, long guestbookId, String name, String email,
		String message,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .addEntry(userId, guestbookId, name, email, message,
			serviceContext);
	}

	/**
	* Adds the mencobatutorial entry to the database. Also notifies the appropriate model listeners.
	*
	* @param mencobatutorialEntry the mencobatutorial entry
	* @return the mencobatutorial entry that was added
	*/
	public static mencobatutorialservice.model.mencobatutorialEntry addmencobatutorialEntry(
		mencobatutorialservice.model.mencobatutorialEntry mencobatutorialEntry) {
		return getService().addmencobatutorialEntry(mencobatutorialEntry);
	}

	/**
	* Creates a new mencobatutorial entry with the primary key. Does not add the mencobatutorial entry to the database.
	*
	* @param entryId the primary key for the new mencobatutorial entry
	* @return the new mencobatutorial entry
	*/
	public static mencobatutorialservice.model.mencobatutorialEntry createmencobatutorialEntry(
		long entryId) {
		return getService().createmencobatutorialEntry(entryId);
	}

	public static mencobatutorialservice.model.mencobatutorialEntry deleteEntry(
		long entryId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteEntry(entryId, serviceContext);
	}

	/**
	* Deletes the mencobatutorial entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the mencobatutorial entry
	* @return the mencobatutorial entry that was removed
	* @throws PortalException if a mencobatutorial entry with the primary key could not be found
	*/
	public static mencobatutorialservice.model.mencobatutorialEntry deletemencobatutorialEntry(
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletemencobatutorialEntry(entryId);
	}

	/**
	* Deletes the mencobatutorial entry from the database. Also notifies the appropriate model listeners.
	*
	* @param mencobatutorialEntry the mencobatutorial entry
	* @return the mencobatutorial entry that was removed
	*/
	public static mencobatutorialservice.model.mencobatutorialEntry deletemencobatutorialEntry(
		mencobatutorialservice.model.mencobatutorialEntry mencobatutorialEntry) {
		return getService().deletemencobatutorialEntry(mencobatutorialEntry);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialservice.model.impl.mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialservice.model.impl.mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static mencobatutorialservice.model.mencobatutorialEntry fetchmencobatutorialEntry(
		long entryId) {
		return getService().fetchmencobatutorialEntry(entryId);
	}

	/**
	* Returns the mencobatutorial entry matching the UUID and group.
	*
	* @param uuid the mencobatutorial entry's UUID
	* @param groupId the primary key of the group
	* @return the matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialservice.model.mencobatutorialEntry fetchmencobatutorialEntryByUuidAndGroupId(
		String uuid, long groupId) {
		return getService()
				   .fetchmencobatutorialEntryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static java.util.List<mencobatutorialservice.model.mencobatutorialEntry> getEntries(
		long groupId, long guestbookId) {
		return getService().getEntries(groupId, guestbookId);
	}

	public static java.util.List<mencobatutorialservice.model.mencobatutorialEntry> getEntries(
		long groupId, long guestbookId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEntries(groupId, guestbookId, start, end);
	}

	public static java.util.List<mencobatutorialservice.model.mencobatutorialEntry> getEntries(
		long groupId, long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialservice.model.mencobatutorialEntry> obc) {
		return getService().getEntries(groupId, guestbookId, start, end, obc);
	}

	public static int getEntriesCount(long groupId, long guestbookId) {
		return getService().getEntriesCount(groupId, guestbookId);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns a range of all the mencobatutorial entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialservice.model.impl.mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @return the range of mencobatutorial entries
	*/
	public static java.util.List<mencobatutorialservice.model.mencobatutorialEntry> getmencobatutorialEntries(
		int start, int end) {
		return getService().getmencobatutorialEntries(start, end);
	}

	/**
	* Returns all the mencobatutorial entries matching the UUID and company.
	*
	* @param uuid the UUID of the mencobatutorial entries
	* @param companyId the primary key of the company
	* @return the matching mencobatutorial entries, or an empty list if no matches were found
	*/
	public static java.util.List<mencobatutorialservice.model.mencobatutorialEntry> getmencobatutorialEntriesByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService()
				   .getmencobatutorialEntriesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of mencobatutorial entries matching the UUID and company.
	*
	* @param uuid the UUID of the mencobatutorial entries
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching mencobatutorial entries, or an empty list if no matches were found
	*/
	public static java.util.List<mencobatutorialservice.model.mencobatutorialEntry> getmencobatutorialEntriesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialservice.model.mencobatutorialEntry> orderByComparator) {
		return getService()
				   .getmencobatutorialEntriesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of mencobatutorial entries.
	*
	* @return the number of mencobatutorial entries
	*/
	public static int getmencobatutorialEntriesCount() {
		return getService().getmencobatutorialEntriesCount();
	}

	/**
	* Returns the mencobatutorial entry with the primary key.
	*
	* @param entryId the primary key of the mencobatutorial entry
	* @return the mencobatutorial entry
	* @throws PortalException if a mencobatutorial entry with the primary key could not be found
	*/
	public static mencobatutorialservice.model.mencobatutorialEntry getmencobatutorialEntry(
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getmencobatutorialEntry(entryId);
	}

	/**
	* Returns the mencobatutorial entry matching the UUID and group.
	*
	* @param uuid the mencobatutorial entry's UUID
	* @param groupId the primary key of the group
	* @return the matching mencobatutorial entry
	* @throws PortalException if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialservice.model.mencobatutorialEntry getmencobatutorialEntryByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getmencobatutorialEntryByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static mencobatutorialservice.model.mencobatutorialEntry updateEntry(
		long userId, long guestbookId, long entryId, String name, String email,
		String message,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateEntry(userId, guestbookId, entryId, name, email,
			message, serviceContext);
	}

	/**
	* Updates the mencobatutorial entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mencobatutorialEntry the mencobatutorial entry
	* @return the mencobatutorial entry that was updated
	*/
	public static mencobatutorialservice.model.mencobatutorialEntry updatemencobatutorialEntry(
		mencobatutorialservice.model.mencobatutorialEntry mencobatutorialEntry) {
		return getService().updatemencobatutorialEntry(mencobatutorialEntry);
	}

	public static mencobatutorialEntryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<mencobatutorialEntryLocalService, mencobatutorialEntryLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(mencobatutorialEntryLocalService.class);

		ServiceTracker<mencobatutorialEntryLocalService, mencobatutorialEntryLocalService> serviceTracker =
			new ServiceTracker<mencobatutorialEntryLocalService, mencobatutorialEntryLocalService>(bundle.getBundleContext(),
				mencobatutorialEntryLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}