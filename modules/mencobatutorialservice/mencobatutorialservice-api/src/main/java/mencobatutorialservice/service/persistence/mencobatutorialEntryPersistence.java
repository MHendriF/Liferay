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

import mencobatutorialservice.exception.NoSuchmencobatutorialEntryException;

import mencobatutorialservice.model.mencobatutorialEntry;

/**
 * The persistence interface for the mencobatutorial entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see mencobatutorialservice.service.persistence.impl.mencobatutorialEntryPersistenceImpl
 * @see mencobatutorialEntryUtil
 * @generated
 */
@ProviderType
public interface mencobatutorialEntryPersistence extends BasePersistence<mencobatutorialEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link mencobatutorialEntryUtil} to access the mencobatutorial entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the mencobatutorial entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching mencobatutorial entries
	*/
	public java.util.List<mencobatutorialEntry> findByUuid(String uuid);

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
	public java.util.List<mencobatutorialEntry> findByUuid(String uuid,
		int start, int end);

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
	public java.util.List<mencobatutorialEntry> findByUuid(String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator);

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
	public java.util.List<mencobatutorialEntry> findByUuid(String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first mencobatutorial entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException;

	/**
	* Returns the first mencobatutorial entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator);

	/**
	* Returns the last mencobatutorial entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException;

	/**
	* Returns the last mencobatutorial entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator);

	/**
	* Returns the mencobatutorial entries before and after the current mencobatutorial entry in the ordered set where uuid = &#63;.
	*
	* @param entryId the primary key of the current mencobatutorial entry
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	*/
	public mencobatutorialEntry[] findByUuid_PrevAndNext(long entryId,
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException;

	/**
	* Removes all the mencobatutorial entries where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of mencobatutorial entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching mencobatutorial entries
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the mencobatutorial entry where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchmencobatutorialEntryException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry findByUUID_G(String uuid, long groupId)
		throws NoSuchmencobatutorialEntryException;

	/**
	* Returns the mencobatutorial entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the mencobatutorial entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the mencobatutorial entry where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the mencobatutorial entry that was removed
	*/
	public mencobatutorialEntry removeByUUID_G(String uuid, long groupId)
		throws NoSuchmencobatutorialEntryException;

	/**
	* Returns the number of mencobatutorial entries where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching mencobatutorial entries
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the mencobatutorial entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching mencobatutorial entries
	*/
	public java.util.List<mencobatutorialEntry> findByUuid_C(String uuid,
		long companyId);

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
	public java.util.List<mencobatutorialEntry> findByUuid_C(String uuid,
		long companyId, int start, int end);

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
	public java.util.List<mencobatutorialEntry> findByUuid_C(String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator);

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
	public java.util.List<mencobatutorialEntry> findByUuid_C(String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first mencobatutorial entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException;

	/**
	* Returns the first mencobatutorial entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry fetchByUuid_C_First(String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator);

	/**
	* Returns the last mencobatutorial entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException;

	/**
	* Returns the last mencobatutorial entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator);

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
	public mencobatutorialEntry[] findByUuid_C_PrevAndNext(long entryId,
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException;

	/**
	* Removes all the mencobatutorial entries where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of mencobatutorial entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching mencobatutorial entries
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the mencobatutorial entries where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @return the matching mencobatutorial entries
	*/
	public java.util.List<mencobatutorialEntry> findByG_G(long groupId,
		long guestbookId);

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
	public java.util.List<mencobatutorialEntry> findByG_G(long groupId,
		long guestbookId, int start, int end);

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
	public java.util.List<mencobatutorialEntry> findByG_G(long groupId,
		long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator);

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
	public java.util.List<mencobatutorialEntry> findByG_G(long groupId,
		long guestbookId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first mencobatutorial entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry findByG_G_First(long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException;

	/**
	* Returns the first mencobatutorial entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry fetchByG_G_First(long groupId,
		long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator);

	/**
	* Returns the last mencobatutorial entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry findByG_G_Last(long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException;

	/**
	* Returns the last mencobatutorial entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	*/
	public mencobatutorialEntry fetchByG_G_Last(long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator);

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
	public mencobatutorialEntry[] findByG_G_PrevAndNext(long entryId,
		long groupId, long guestbookId,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException;

	/**
	* Removes all the mencobatutorial entries where groupId = &#63; and guestbookId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	*/
	public void removeByG_G(long groupId, long guestbookId);

	/**
	* Returns the number of mencobatutorial entries where groupId = &#63; and guestbookId = &#63;.
	*
	* @param groupId the group ID
	* @param guestbookId the guestbook ID
	* @return the number of matching mencobatutorial entries
	*/
	public int countByG_G(long groupId, long guestbookId);

	/**
	* Caches the mencobatutorial entry in the entity cache if it is enabled.
	*
	* @param mencobatutorialEntry the mencobatutorial entry
	*/
	public void cacheResult(mencobatutorialEntry mencobatutorialEntry);

	/**
	* Caches the mencobatutorial entries in the entity cache if it is enabled.
	*
	* @param mencobatutorialEntries the mencobatutorial entries
	*/
	public void cacheResult(
		java.util.List<mencobatutorialEntry> mencobatutorialEntries);

	/**
	* Creates a new mencobatutorial entry with the primary key. Does not add the mencobatutorial entry to the database.
	*
	* @param entryId the primary key for the new mencobatutorial entry
	* @return the new mencobatutorial entry
	*/
	public mencobatutorialEntry create(long entryId);

	/**
	* Removes the mencobatutorial entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the mencobatutorial entry
	* @return the mencobatutorial entry that was removed
	* @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	*/
	public mencobatutorialEntry remove(long entryId)
		throws NoSuchmencobatutorialEntryException;

	public mencobatutorialEntry updateImpl(
		mencobatutorialEntry mencobatutorialEntry);

	/**
	* Returns the mencobatutorial entry with the primary key or throws a {@link NoSuchmencobatutorialEntryException} if it could not be found.
	*
	* @param entryId the primary key of the mencobatutorial entry
	* @return the mencobatutorial entry
	* @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	*/
	public mencobatutorialEntry findByPrimaryKey(long entryId)
		throws NoSuchmencobatutorialEntryException;

	/**
	* Returns the mencobatutorial entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entryId the primary key of the mencobatutorial entry
	* @return the mencobatutorial entry, or <code>null</code> if a mencobatutorial entry with the primary key could not be found
	*/
	public mencobatutorialEntry fetchByPrimaryKey(long entryId);

	@Override
	public java.util.Map<java.io.Serializable, mencobatutorialEntry> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the mencobatutorial entries.
	*
	* @return the mencobatutorial entries
	*/
	public java.util.List<mencobatutorialEntry> findAll();

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
	public java.util.List<mencobatutorialEntry> findAll(int start, int end);

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
	public java.util.List<mencobatutorialEntry> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator);

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
	public java.util.List<mencobatutorialEntry> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the mencobatutorial entries from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of mencobatutorial entries.
	*
	* @return the number of mencobatutorial entries
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}