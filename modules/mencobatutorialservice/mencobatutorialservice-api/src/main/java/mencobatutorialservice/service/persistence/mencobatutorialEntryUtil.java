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

import mencobatutorialservice.model.mencobatutorialEntry;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the mencobatutorial entry service. This utility wraps {@link mencobatutorialservice.service.persistence.impl.mencobatutorialEntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see mencobatutorialEntryPersistence
 * @see mencobatutorialservice.service.persistence.impl.mencobatutorialEntryPersistenceImpl
 * @generated
 */
@ProviderType
public class mencobatutorialEntryUtil {
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
	public static void clearCache(mencobatutorialEntry mencobatutorialEntry) {
		getPersistence().clearCache(mencobatutorialEntry);
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
	public static List<mencobatutorialEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<mencobatutorialEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<mencobatutorialEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static mencobatutorialEntry update(
		mencobatutorialEntry mencobatutorialEntry) {
		return getPersistence().update(mencobatutorialEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static mencobatutorialEntry update(
		mencobatutorialEntry mencobatutorialEntry, ServiceContext serviceContext) {
		return getPersistence().update(mencobatutorialEntry, serviceContext);
	}

	/**
	* Returns all the mencobatutorial entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the mencobatutorial entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @return the range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByUuid(String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the mencobatutorial entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByUuid(String uuid, int start,
		int end, OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencobatutorial entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByUuid(String uuid, int start,
		int end, OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first mencobatutorial entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry findByUuid_First(String uuid,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first mencobatutorial entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry fetchByUuid_First(String uuid,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry findByUuid_Last(String uuid,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry fetchByUuid_Last(String uuid,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the mencobatutorial entries before and after the current mencobatutorial entry in the ordered set where uuid = &#63;.
	*
	* @param entryId the primary key of the current mencobatutorial entry
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	*/
	public static mencobatutorialEntry[] findByUuid_PrevAndNext(long entryId,
		String uuid, OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence()
				   .findByUuid_PrevAndNext(entryId, uuid, orderByComparator);
	}

	/**
	* Removes all the mencobatutorial entries where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of mencobatutorial entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching mencobatutorial entries
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the mencobatutorial entry where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchmencobatutorialEntryException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry findByUUID_G(String uuid, long groupId)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the mencobatutorial entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the mencobatutorial entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the mencobatutorial entry where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the mencobatutorial entry that was removed
	*/
	public static mencobatutorialEntry removeByUUID_G(String uuid, long groupId)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of mencobatutorial entries where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching mencobatutorial entries
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the mencobatutorial entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByUuid_C(String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the mencobatutorial entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @return the range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByUuid_C(String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the mencobatutorial entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByUuid_C(String uuid,
		long companyId, int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencobatutorial entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByUuid_C(String uuid,
		long companyId, int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first mencobatutorial entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry findByUuid_C_First(String uuid,
		long companyId,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first mencobatutorial entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry fetchByUuid_C_First(String uuid,
		long companyId,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry findByUuid_C_Last(String uuid,
		long companyId,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry fetchByUuid_C_Last(String uuid,
		long companyId,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the mencobatutorial entries before and after the current mencobatutorial entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param entryId the primary key of the current mencobatutorial entry
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	*/
	public static mencobatutorialEntry[] findByUuid_C_PrevAndNext(
		long entryId, String uuid, long companyId,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(entryId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the mencobatutorial entries where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of mencobatutorial entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching mencobatutorial entries
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the mencobatutorial entries where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @return the matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByG_G(long groupId,
		long guestbookId) {
		return getPersistence().findByG_G(groupId, guestbookId);
	}

	/**
	* Returns a range of all the mencobatutorial entries where groupId = &#63; and guestbookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @return the range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByG_G(long groupId,
		long guestbookId, int start, int end) {
		return getPersistence().findByG_G(groupId, guestbookId, start, end);
	}

	/**
	* Returns an ordered range of all the mencobatutorial entries where groupId = &#63; and guestbookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByG_G(long groupId,
		long guestbookId, int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence()
				   .findByG_G(groupId, guestbookId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencobatutorial entries where groupId = &#63; and guestbookId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByG_G(long groupId,
		long guestbookId, int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_G(groupId, guestbookId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first mencobatutorial entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry findByG_G_First(long groupId,
		long guestbookId,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence()
				   .findByG_G_First(groupId, guestbookId, orderByComparator);
	}

	/**
	* Returns the first mencobatutorial entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry fetchByG_G_First(long groupId,
		long guestbookId,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence()
				   .fetchByG_G_First(groupId, guestbookId, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry findByG_G_Last(long groupId,
		long guestbookId,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence()
				   .findByG_G_Last(groupId, guestbookId, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry fetchByG_G_Last(long groupId,
		long guestbookId,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence()
				   .fetchByG_G_Last(groupId, guestbookId, orderByComparator);
	}

	/**
	* Returns the mencobatutorial entries before and after the current mencobatutorial entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param entryId the primary key of the current mencobatutorial entry
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	*/
	public static mencobatutorialEntry[] findByG_G_PrevAndNext(long entryId,
		long groupId, long guestbookId,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence()
				   .findByG_G_PrevAndNext(entryId, groupId, guestbookId,
			orderByComparator);
	}

	/**
	* Removes all the mencobatutorial entries where groupId = &#63; and guestbookId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	*/
	public static void removeByG_G(long groupId, long guestbookId) {
		getPersistence().removeByG_G(groupId, guestbookId);
	}

	/**
	* Returns the number of mencobatutorial entries where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @return the number of matching mencobatutorial entries
	*/
	public static int countByG_G(long groupId, long guestbookId) {
		return getPersistence().countByG_G(groupId, guestbookId);
	}

	/**
	* Returns all the mencobatutorial entries where status = &#63;.
	*
	* @param status the status
	* @return the matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByStatus(int status) {
		return getPersistence().findByStatus(status);
	}

	/**
	* Returns a range of all the mencobatutorial entries where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @return the range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByStatus(int status,
		int start, int end) {
		return getPersistence().findByStatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the mencobatutorial entries where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByStatus(int status,
		int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencobatutorial entries where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByStatus(int status,
		int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first mencobatutorial entry in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry findByStatus_First(int status,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the first mencobatutorial entry in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry fetchByStatus_First(int status,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial entry in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry findByStatus_Last(int status,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial entry in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry fetchByStatus_Last(int status,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the mencobatutorial entries before and after the current mencobatutorial entry in the ordered set where status = &#63;.
	*
	* @param entryId the primary key of the current mencobatutorial entry
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	*/
	public static mencobatutorialEntry[] findByStatus_PrevAndNext(
		long entryId, int status,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence()
				   .findByStatus_PrevAndNext(entryId, status, orderByComparator);
	}

	/**
	* Removes all the mencobatutorial entries where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeByStatus(int status) {
		getPersistence().removeByStatus(status);
	}

	/**
	* Returns the number of mencobatutorial entries where status = &#63;.
	*
	* @param status the status
	* @return the number of matching mencobatutorial entries
	*/
	public static int countByStatus(int status) {
		return getPersistence().countByStatus(status);
	}

	/**
	* Returns all the mencobatutorial entries where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByG_S(long groupId, int status) {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	* Returns a range of all the mencobatutorial entries where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @return the range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByG_S(long groupId,
		int status, int start, int end) {
		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	* Returns an ordered range of all the mencobatutorial entries where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByG_S(long groupId,
		int status, int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencobatutorial entries where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findByG_S(long groupId,
		int status, int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first mencobatutorial entry in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry findByG_S_First(long groupId,
		int status, OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence()
				   .findByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the first mencobatutorial entry in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry fetchByG_S_First(long groupId,
		int status, OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence()
				   .fetchByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial entry in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry findByG_S_Last(long groupId, int status,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence()
				   .findByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the last mencobatutorial entry in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public static mencobatutorialEntry fetchByG_S_Last(long groupId,
		int status, OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence()
				   .fetchByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the mencobatutorial entries before and after the current mencobatutorial entry in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param entryId the primary key of the current mencobatutorial entry
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	*/
	public static mencobatutorialEntry[] findByG_S_PrevAndNext(long entryId,
		long groupId, int status,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence()
				   .findByG_S_PrevAndNext(entryId, groupId, status,
			orderByComparator);
	}

	/**
	* Removes all the mencobatutorial entries where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public static void removeByG_S(long groupId, int status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	* Returns the number of mencobatutorial entries where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching mencobatutorial entries
	*/
	public static int countByG_S(long groupId, int status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	* Caches the mencobatutorial entry in the entity cache if it is enabled.
	*
	* @param mencobatutorialEntry the mencobatutorial entry
	*/
	public static void cacheResult(mencobatutorialEntry mencobatutorialEntry) {
		getPersistence().cacheResult(mencobatutorialEntry);
	}

	/**
	* Caches the mencobatutorial entries in the entity cache if it is enabled.
	*
	* @param mencobatutorialEntries the mencobatutorial entries
	*/
	public static void cacheResult(
		List<mencobatutorialEntry> mencobatutorialEntries) {
		getPersistence().cacheResult(mencobatutorialEntries);
	}

	/**
	* Creates a new mencobatutorial entry with the primary key. Does not add the mencobatutorial entry to the database.
	*
	* @param entryId the primary key for the new mencobatutorial entry
	* @return the new mencobatutorial entry
	*/
	public static mencobatutorialEntry create(long entryId) {
		return getPersistence().create(entryId);
	}

	/**
	* Removes the mencobatutorial entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the mencobatutorial entry
	* @return the mencobatutorial entry that was removed
	* @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	*/
	public static mencobatutorialEntry remove(long entryId)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence().remove(entryId);
	}

	public static mencobatutorialEntry updateImpl(
		mencobatutorialEntry mencobatutorialEntry) {
		return getPersistence().updateImpl(mencobatutorialEntry);
	}

	/**
	* Returns the mencobatutorial entry with the primary key or throws a {@link NoSuchmencobatutorialEntryException} if it could not be found.
	*
	* @param entryId the primary key of the mencobatutorial entry
	* @return the mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	*/
	public static mencobatutorialEntry findByPrimaryKey(long entryId)
		throws mencobatutorialservice.exception.NoSuchmencobatutorialEntryException {
		return getPersistence().findByPrimaryKey(entryId);
	}

	/**
	* Returns the mencobatutorial entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entryId the primary key of the mencobatutorial entry
	* @return the mencobatutorial entry, or <code>null</code> if a mencobatutorial entry with the primary key could not be found
	*/
	public static mencobatutorialEntry fetchByPrimaryKey(long entryId) {
		return getPersistence().fetchByPrimaryKey(entryId);
	}

	public static java.util.Map<java.io.Serializable, mencobatutorialEntry> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the mencobatutorial entries.
	*
	* @return the mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mencobatutorial entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @return the range of mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mencobatutorial entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findAll(int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the mencobatutorial entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mencobatutorial entries
	* @param end the upper bound of the range of mencobatutorial entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of mencobatutorial entries
	*/
	public static List<mencobatutorialEntry> findAll(int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the mencobatutorial entries from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mencobatutorial entries.
	*
	* @return the number of mencobatutorial entries
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static mencobatutorialEntryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<mencobatutorialEntryPersistence, mencobatutorialEntryPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(mencobatutorialEntryPersistence.class);

		ServiceTracker<mencobatutorialEntryPersistence, mencobatutorialEntryPersistence> serviceTracker =
			new ServiceTracker<mencobatutorialEntryPersistence, mencobatutorialEntryPersistence>(bundle.getBundleContext(),
				mencobatutorialEntryPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}