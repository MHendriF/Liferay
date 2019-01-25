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
 * Provides the local service utility for mencobatutorial. This utility wraps
 * {@link mencobatutorialservice.service.impl.mencobatutorialLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author liferay
 * @see mencobatutorialLocalService
 * @see mencobatutorialservice.service.base.mencobatutorialLocalServiceBaseImpl
 * @see mencobatutorialservice.service.impl.mencobatutorialLocalServiceImpl
 * @generated
 */
@ProviderType
public class mencobatutorialLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link mencobatutorialservice.service.impl.mencobatutorialLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static mencobatutorialservice.model.mencobatutorial addGuestbook(
		long userId, String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().addGuestbook(userId, name, serviceContext);
	}

	/**
	* Adds the mencobatutorial to the database. Also notifies the appropriate model listeners.
	*
	* @param mencobatutorial the mencobatutorial
	* @return the mencobatutorial that was added
	*/
	public static mencobatutorialservice.model.mencobatutorial addmencobatutorial(
		mencobatutorialservice.model.mencobatutorial mencobatutorial) {
		return getService().addmencobatutorial(mencobatutorial);
	}

	/**
	* Creates a new mencobatutorial with the primary key. Does not add the mencobatutorial to the database.
	*
	* @param guestbookId the primary key for the new mencobatutorial
	* @return the new mencobatutorial
	*/
	public static mencobatutorialservice.model.mencobatutorial createmencobatutorial(
		long guestbookId) {
		return getService().createmencobatutorial(guestbookId);
	}

	public static mencobatutorialservice.model.mencobatutorial deleteGuestbook(
		long guestbookId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteGuestbook(guestbookId, serviceContext);
	}

	/**
	* Deletes the mencobatutorial with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the mencobatutorial
	* @return the mencobatutorial that was removed
	* @throws PortalException if a mencobatutorial with the primary key could not be found
	*/
	public static mencobatutorialservice.model.mencobatutorial deletemencobatutorial(
		long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletemencobatutorial(guestbookId);
	}

	/**
	* Deletes the mencobatutorial from the database. Also notifies the appropriate model listeners.
	*
	* @param mencobatutorial the mencobatutorial
	* @return the mencobatutorial that was removed
	*/
	public static mencobatutorialservice.model.mencobatutorial deletemencobatutorial(
		mencobatutorialservice.model.mencobatutorial mencobatutorial) {
		return getService().deletemencobatutorial(mencobatutorial);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialservice.model.impl.mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialservice.model.impl.mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static mencobatutorialservice.model.mencobatutorial fetchmencobatutorial(
		long guestbookId) {
		return getService().fetchmencobatutorial(guestbookId);
	}

	/**
	* Returns the mencobatutorial matching the UUID and group.
	*
	* @param uuid the mencobatutorial's UUID
	* @param groupId the primary key of the group
	* @return the matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public static mencobatutorialservice.model.mencobatutorial fetchmencobatutorialByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchmencobatutorialByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static java.util.List<mencobatutorialservice.model.mencobatutorial> getGuestbooks(
		long groupId) {
		return getService().getGuestbooks(groupId);
	}

	public static java.util.List<mencobatutorialservice.model.mencobatutorial> getGuestbooks(
		long groupId, int start, int end) {
		return getService().getGuestbooks(groupId, start, end);
	}

	public static java.util.List<mencobatutorialservice.model.mencobatutorial> getGuestbooks(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialservice.model.mencobatutorial> obc) {
		return getService().getGuestbooks(groupId, start, end, obc);
	}

	public static int getGuestbooksCount(long groupId) {
		return getService().getGuestbooksCount(groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the mencobatutorial with the primary key.
	*
	* @param guestbookId the primary key of the mencobatutorial
	* @return the mencobatutorial
	* @throws PortalException if a mencobatutorial with the primary key could not be found
	*/
	public static mencobatutorialservice.model.mencobatutorial getmencobatutorial(
		long guestbookId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getmencobatutorial(guestbookId);
	}

	/**
	* Returns the mencobatutorial matching the UUID and group.
	*
	* @param uuid the mencobatutorial's UUID
	* @param groupId the primary key of the group
	* @return the matching mencobatutorial
	* @throws PortalException if a matching mencobatutorial could not be found
	*/
	public static mencobatutorialservice.model.mencobatutorial getmencobatutorialByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getmencobatutorialByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the mencobatutorials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialservice.model.impl.mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @return the range of mencobatutorials
	*/
	public static java.util.List<mencobatutorialservice.model.mencobatutorial> getmencobatutorials(
		int start, int end) {
		return getService().getmencobatutorials(start, end);
	}

	/**
	* Returns all the mencobatutorials matching the UUID and company.
	*
	* @param uuid the UUID of the mencobatutorials
	* @param companyId the primary key of the company
	* @return the matching mencobatutorials, or an empty list if no matches were found
	*/
	public static java.util.List<mencobatutorialservice.model.mencobatutorial> getmencobatutorialsByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService()
				   .getmencobatutorialsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of mencobatutorials matching the UUID and company.
	*
	* @param uuid the UUID of the mencobatutorials
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching mencobatutorials, or an empty list if no matches were found
	*/
	public static java.util.List<mencobatutorialservice.model.mencobatutorial> getmencobatutorialsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialservice.model.mencobatutorial> orderByComparator) {
		return getService()
				   .getmencobatutorialsByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of mencobatutorials.
	*
	* @return the number of mencobatutorials
	*/
	public static int getmencobatutorialsCount() {
		return getService().getmencobatutorialsCount();
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

	public static mencobatutorialservice.model.mencobatutorial updateGuestbook(
		long userId, long guestbookId, String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateGuestbook(userId, guestbookId, name, serviceContext);
	}

	/**
	* Updates the mencobatutorial in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mencobatutorial the mencobatutorial
	* @return the mencobatutorial that was updated
	*/
	public static mencobatutorialservice.model.mencobatutorial updatemencobatutorial(
		mencobatutorialservice.model.mencobatutorial mencobatutorial) {
		return getService().updatemencobatutorial(mencobatutorial);
	}

	public static mencobatutorialLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<mencobatutorialLocalService, mencobatutorialLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(mencobatutorialLocalService.class);

		ServiceTracker<mencobatutorialLocalService, mencobatutorialLocalService> serviceTracker =
			new ServiceTracker<mencobatutorialLocalService, mencobatutorialLocalService>(bundle.getBundleContext(),
				mencobatutorialLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}