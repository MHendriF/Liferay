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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import mencobatutorialservice.exception.NoSuchmencobatutorialException;

import mencobatutorialservice.model.mencobatutorial;

/**
 * The persistence interface for the mencobatutorial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see mencobatutorialservice.service.persistence.impl.mencobatutorialPersistenceImpl
 * @see mencobatutorialUtil
 * @generated
 */
@ProviderType
public interface mencobatutorialPersistence extends BasePersistence<mencobatutorial> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link mencobatutorialUtil} to access the mencobatutorial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the mencobatutorials where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching mencobatutorials
	*/
	public java.util.List<mencobatutorial> findByUuid(String uuid);

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
	public java.util.List<mencobatutorial> findByUuid(String uuid, int start,
		int end);

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
	public java.util.List<mencobatutorial> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator);

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
	public java.util.List<mencobatutorial> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first mencobatutorial in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public mencobatutorial findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException;

	/**
	* Returns the first mencobatutorial in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public mencobatutorial fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator);

	/**
	* Returns the last mencobatutorial in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public mencobatutorial findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException;

	/**
	* Returns the last mencobatutorial in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public mencobatutorial fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator);

	/**
	* Returns the mencobatutorials before and after the current mencobatutorial in the ordered set where uuid = &#63;.
	*
	* @param guestbookId the primary key of the current mencobatutorial
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencobatutorial
	* @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	*/
	public mencobatutorial[] findByUuid_PrevAndNext(long guestbookId,
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException;

	/**
	* Removes all the mencobatutorials where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of mencobatutorials where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching mencobatutorials
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the mencobatutorial where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchmencobatutorialException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public mencobatutorial findByUUID_G(String uuid, long groupId)
		throws NoSuchmencobatutorialException;

	/**
	* Returns the mencobatutorial where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public mencobatutorial fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the mencobatutorial where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public mencobatutorial fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the mencobatutorial where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the mencobatutorial that was removed
	*/
	public mencobatutorial removeByUUID_G(String uuid, long groupId)
		throws NoSuchmencobatutorialException;

	/**
	* Returns the number of mencobatutorials where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching mencobatutorials
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the mencobatutorials where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching mencobatutorials
	*/
	public java.util.List<mencobatutorial> findByUuid_C(String uuid,
		long companyId);

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
	public java.util.List<mencobatutorial> findByUuid_C(String uuid,
		long companyId, int start, int end);

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
	public java.util.List<mencobatutorial> findByUuid_C(String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator);

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
	public java.util.List<mencobatutorial> findByUuid_C(String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first mencobatutorial in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public mencobatutorial findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException;

	/**
	* Returns the first mencobatutorial in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public mencobatutorial fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator);

	/**
	* Returns the last mencobatutorial in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public mencobatutorial findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException;

	/**
	* Returns the last mencobatutorial in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public mencobatutorial fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator);

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
	public mencobatutorial[] findByUuid_C_PrevAndNext(long guestbookId,
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException;

	/**
	* Removes all the mencobatutorials where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of mencobatutorials where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching mencobatutorials
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the mencobatutorials where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching mencobatutorials
	*/
	public java.util.List<mencobatutorial> findByGroupId(long groupId);

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
	public java.util.List<mencobatutorial> findByGroupId(long groupId,
		int start, int end);

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
	public java.util.List<mencobatutorial> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator);

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
	public java.util.List<mencobatutorial> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first mencobatutorial in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public mencobatutorial findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException;

	/**
	* Returns the first mencobatutorial in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public mencobatutorial fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator);

	/**
	* Returns the last mencobatutorial in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial
	* @throws NoSuchmencobatutorialException if a matching mencobatutorial could not be found
	*/
	public mencobatutorial findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException;

	/**
	* Returns the last mencobatutorial in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	*/
	public mencobatutorial fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator);

	/**
	* Returns the mencobatutorials before and after the current mencobatutorial in the ordered set where groupId = &#63;.
	*
	* @param guestbookId the primary key of the current mencobatutorial
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencobatutorial
	* @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	*/
	public mencobatutorial[] findByGroupId_PrevAndNext(long guestbookId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator)
		throws NoSuchmencobatutorialException;

	/**
	* Removes all the mencobatutorials where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of mencobatutorials where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching mencobatutorials
	*/
	public int countByGroupId(long groupId);

	/**
	* Caches the mencobatutorial in the entity cache if it is enabled.
	*
	* @param mencobatutorial the mencobatutorial
	*/
	public void cacheResult(mencobatutorial mencobatutorial);

	/**
	* Caches the mencobatutorials in the entity cache if it is enabled.
	*
	* @param mencobatutorials the mencobatutorials
	*/
	public void cacheResult(java.util.List<mencobatutorial> mencobatutorials);

	/**
	* Creates a new mencobatutorial with the primary key. Does not add the mencobatutorial to the database.
	*
	* @param guestbookId the primary key for the new mencobatutorial
	* @return the new mencobatutorial
	*/
	public mencobatutorial create(long guestbookId);

	/**
	* Removes the mencobatutorial with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestbookId the primary key of the mencobatutorial
	* @return the mencobatutorial that was removed
	* @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	*/
	public mencobatutorial remove(long guestbookId)
		throws NoSuchmencobatutorialException;

	public mencobatutorial updateImpl(mencobatutorial mencobatutorial);

	/**
	* Returns the mencobatutorial with the primary key or throws a {@link NoSuchmencobatutorialException} if it could not be found.
	*
	* @param guestbookId the primary key of the mencobatutorial
	* @return the mencobatutorial
	* @throws NoSuchmencobatutorialException if a mencobatutorial with the primary key could not be found
	*/
	public mencobatutorial findByPrimaryKey(long guestbookId)
		throws NoSuchmencobatutorialException;

	/**
	* Returns the mencobatutorial with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param guestbookId the primary key of the mencobatutorial
	* @return the mencobatutorial, or <code>null</code> if a mencobatutorial with the primary key could not be found
	*/
	public mencobatutorial fetchByPrimaryKey(long guestbookId);

	@Override
	public java.util.Map<java.io.Serializable, mencobatutorial> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the mencobatutorials.
	*
	* @return the mencobatutorials
	*/
	public java.util.List<mencobatutorial> findAll();

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
	public java.util.List<mencobatutorial> findAll(int start, int end);

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
	public java.util.List<mencobatutorial> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator);

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
	public java.util.List<mencobatutorial> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorial> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the mencobatutorials from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of mencobatutorials.
	*
	* @return the number of mencobatutorials
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}