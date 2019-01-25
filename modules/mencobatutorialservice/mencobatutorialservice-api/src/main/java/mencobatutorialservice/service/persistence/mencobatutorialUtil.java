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

package mencobatutorialservice.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import mencobatutorialservice.model.mencobatutorial;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the mencobatutorial service. This utility wraps {@link mencobatutorialservice.service.persistence.impl.mencobatutorialPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see mencobatutorialPersistence
 * @see mencobatutorialservice.service.persistence.impl.mencobatutorialPersistenceImpl
 * @generated
 */
@ProviderType
public class mencobatutorialUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(mencobatutorial mencobatutorial) {
		getPersistence().clearCache(mencobatutorial);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<mencobatutorial> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<mencobatutorial> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<mencobatutorial> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<mencobatutorial> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static mencobatutorial update(mencobatutorial mencobatutorial) {
		return getPersistence().update(mencobatutorial);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static mencobatutorial update(mencobatutorial mencobatutorial,
		ServiceContext serviceContext) {
		return getPersistence().update(mencobatutorial, serviceContext);
	}

	/**
	* Returns all the mencobatutorials where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching mencobatutorials
	*/
	public static List<mencobatutorial> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the mencobatutorials where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @return the range of matching mencobatutorials
	*/
	public static List<mencobatutorial> findByUuid(String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the mencobatutorials where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mencobatutorials
	*/
	public static List<mencobatutorial> findByUuid(String uuid, int start,
		int end, OrderByComparator<mencobatutorial> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencobatutorials where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching mencobatutorials
	*/
	public static List<mencobatutorial> findByUuid(String uuid, int start,
		int end, OrderByComparator<mencobatutorial> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first mencobatutorial in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial findByUuid_First(String uuid,
		OrderByComparator<mencobatutorial> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first mencobatutorial in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial fetchByUuid_First(String uuid,
		OrderByComparator<mencobatutorial> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial findByUuid_Last(String uuid,
		OrderByComparator<mencobatutorial> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial fetchByUuid_Last(String uuid,
		OrderByComparator<mencobatutorial> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the mencobatutorials before and after the current mencobatutorial in the ordered set where uuid = &#63;.
	*
	* @param guestbookId the primary key of the current mencobatutorial
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencobatutorial
	* @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	*/
	public static mencobatutorial[] findByUuid_PrevAndNext(long guestbookId,
		String uuid, OrderByComparator<mencobatutorial> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialException {
		return getPersistence()
				   .findByUuid_PrevAndNext(guestbookId, uuid, orderByComparator);
	}

	/**
	* Removes all the mencobatutorials where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of mencobatutorials where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching mencobatutorials
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the mencobatutorial where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchmencobatutorialException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial findByUUID_G(String uuid, long groupId)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the mencobatutorial where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the mencobatutorial where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the mencobatutorial where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the mencobatutorial that was removed
	*/
	public static mencobatutorial removeByUUID_G(String uuid, long groupId)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of mencobatutorials where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching mencobatutorials
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the mencobatutorials where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching mencobatutorials
	*/
	public static List<mencobatutorial> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the mencobatutorials where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @return the range of matching mencobatutorials
	*/
	public static List<mencobatutorial> findByUuid_C(String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the mencobatutorials where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mencobatutorials
	*/
	public static List<mencobatutorial> findByUuid_C(String uuid,
		long companyId, int start, int end,
		OrderByComparator<mencobatutorial> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencobatutorials where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching mencobatutorials
	*/
	public static List<mencobatutorial> findByUuid_C(String uuid,
		long companyId, int start, int end,
		OrderByComparator<mencobatutorial> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first mencobatutorial in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial findByUuid_C_First(String uuid,
		long companyId, OrderByComparator<mencobatutorial> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first mencobatutorial in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial fetchByUuid_C_First(String uuid,
		long companyId, OrderByComparator<mencobatutorial> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial findByUuid_C_Last(String uuid,
		long companyId, OrderByComparator<mencobatutorial> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial fetchByUuid_C_Last(String uuid,
		long companyId, OrderByComparator<mencobatutorial> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the mencobatutorials before and after the current mencobatutorial in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param guestbookId the primary key of the current mencobatutorial
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencobatutorial
	* @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	*/
	public static mencobatutorial[] findByUuid_C_PrevAndNext(long guestbookId,
		String uuid, long companyId,
		OrderByComparator<mencobatutorial> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(guestbookId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the mencobatutorials where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of mencobatutorials where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching mencobatutorials
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the mencobatutorials where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching mencobatutorials
	*/
	public static List<mencobatutorial> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the mencobatutorials where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @return the range of matching mencobatutorials
	*/
	public static List<mencobatutorial> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the mencobatutorials where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mencobatutorials
	*/
	public static List<mencobatutorial> findByGroupId(long groupId, int start,
		int end, OrderByComparator<mencobatutorial> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencobatutorials where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching mencobatutorials
	*/
	public static List<mencobatutorial> findByGroupId(long groupId, int start,
		int end, OrderByComparator<mencobatutorial> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first mencobatutorial in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial findByGroupId_First(long groupId,
		OrderByComparator<mencobatutorial> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first mencobatutorial in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial fetchByGroupId_First(long groupId,
		OrderByComparator<mencobatutorial> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial findByGroupId_Last(long groupId,
		OrderByComparator<mencobatutorial> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public static mencobatutorial fetchByGroupId_Last(long groupId,
		OrderByComparator<mencobatutorial> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the mencobatutorials before and after the current mencobatutorial in the ordered set where groupId = &#63;.
	*
	* @param guestbookId the primary key of the current mencobatutorial
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencobatutorial
	* @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	*/
	public static mencobatutorial[] findByGroupId_PrevAndNext(
		long guestbookId, long groupId,
		OrderByComparator<mencobatutorial> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(guestbookId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the mencobatutorials where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of mencobatutorials where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching mencobatutorials
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Caches the mencobatutorial in the entity cache if it is enabled.
	*
	* @param mencobatutorial the mencobatutorial
	*/
	public static void cacheResult(mencobatutorial mencobatutorial) {
		getPersistence().cacheResult(mencobatutorial);
	}

	/**
	* Caches the mencobatutorials in the entity cache if it is enabled.
	*
	* @param mencobatutorials the mencobatutorials
	*/
	public static void cacheResult(List<mencobatutorial> mencobatutorials) {
		getPersistence().cacheResult(mencobatutorials);
	}

	/**
	* Creates a new mencobatutorial with the primary key. Does not add the mencobatutorial to the database.
	*
	* @param guestbookId the primary key for the new mencobatutorial
	* @return the new mencobatutorial
	*/
	public static mencobatutorial create(long guestbookId) {
		return getPersistence().create(guestbookId);
	}

	/**
	* Removes the mencobatutorial with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the mencobatutorial
	* @return the mencobatutorial that was removed
	* @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	*/
	public static mencobatutorial remove(long guestbookId)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialException {
		return getPersistence().remove(guestbookId);
	}

	public static mencobatutorial updateImpl(mencobatutorial mencobatutorial) {
		return getPersistence().updateImpl(mencobatutorial);
	}

	/**
	* Returns the mencobatutorial with the primary key or throws a {@link NoSuchmencobatutorialException} if it could not be found.
	*
	* @param guestbookId the primary key of the mencobatutorial
	* @return the mencobatutorial
	* @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	*/
	public static mencobatutorial findByPrimaryKey(long guestbookId)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialException {
		return getPersistence().findByPrimaryKey(guestbookId);
	}

	/**
	* Returns the mencobatutorial with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param guestbookId the primary key of the mencobatutorial
	* @return the mencobatutorial, or <code>null</code> if a mencobatutorial with the primary key could not be found
	*/
	public static mencobatutorial fetchByPrimaryKey(long guestbookId) {
		return getPersistence().fetchByPrimaryKey(guestbookId);
	}

	public static java.util.Map<java.io.Serializable, mencobatutorial> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the mencobatutorials.
	*
	* @return the mencobatutorials
	*/
	public static List<mencobatutorial> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mencobatutorials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @return the range of mencobatutorials
	*/
	public static List<mencobatutorial> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mencobatutorials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mencobatutorials
	*/
	public static List<mencobatutorial> findAll(int start, int end,
		OrderByComparator<mencobatutorial> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencobatutorials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencobatutorials
	* @param end the upper bound of the range of mencobatutorials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of mencobatutorials
	*/
	public static List<mencobatutorial> findAll(int start, int end,
		OrderByComparator<mencobatutorial> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the mencobatutorials from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mencobatutorials.
	*
	* @return the number of mencobatutorials
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static mencobatutorialPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<mencobatutorialPersistence, mencobatutorialPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(mencobatutorialPersistence.class);

		ServiceTracker<mencobatutorialPersistence, mencobatutorialPersistence> serviceTracker =
			new ServiceTracker<mencobatutorialPersistence, mencobatutorialPersistence>(bundle.getBundleContext(),
				mencobatutorialPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}