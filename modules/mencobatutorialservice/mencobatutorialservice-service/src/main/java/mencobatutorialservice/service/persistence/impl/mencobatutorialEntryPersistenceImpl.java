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

package mencobatutorialservice.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import mencobatutorialservice.exception.NoSuchmencobatutorialEntryException;

import mencobatutorialservice.model.impl.mencobatutorialEntryImpl;
import mencobatutorialservice.model.impl.mencobatutorialEntryModelImpl;

import mencobatutorialservice.model.mencobatutorialEntry;

import mencobatutorialservice.service.persistence.mencobatutorialEntryPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the mencobatutorial entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author liferay
 * @see mencobatutorialEntryPersistence
 * @see mencobatutorialservice.service.persistence.mencobatutorialEntryUtil
 * @generated
 */
@ProviderType
public class mencobatutorialEntryPersistenceImpl extends BasePersistenceImpl<mencobatutorialEntry>
	implements mencobatutorialEntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link mencobatutorialEntryUtil} to access the mencobatutorial entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = mencobatutorialEntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			mencobatutorialEntryModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the mencobatutorial entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mencobatutorial entries
	 */
	@Override
	public List<mencobatutorialEntry> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<mencobatutorialEntry> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<mencobatutorialEntry> findByUuid(String uuid, int start,
		int end, OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<mencobatutorialEntry> findByUuid(String uuid, int start,
		int end, OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<mencobatutorialEntry> list = null;

		if (retrieveFromCache) {
			list = (List<mencobatutorialEntry>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (mencobatutorialEntry mencobatutorialEntry : list) {
					if (!Objects.equals(uuid, mencobatutorialEntry.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MENCOBATUTORIALENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(mencobatutorialEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<mencobatutorialEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencobatutorialEntry>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first mencobatutorial entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencobatutorial entry
	 * @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	 */
	@Override
	public mencobatutorialEntry findByUuid_First(String uuid,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException {
		mencobatutorialEntry mencobatutorialEntry = fetchByUuid_First(uuid,
				orderByComparator);

		if (mencobatutorialEntry != null) {
			return mencobatutorialEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchmencobatutorialEntryException(msg.toString());
	}

	/**
	 * Returns the first mencobatutorial entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	 */
	@Override
	public mencobatutorialEntry fetchByUuid_First(String uuid,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		List<mencobatutorialEntry> list = findByUuid(uuid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mencobatutorial entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencobatutorial entry
	 * @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	 */
	@Override
	public mencobatutorialEntry findByUuid_Last(String uuid,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException {
		mencobatutorialEntry mencobatutorialEntry = fetchByUuid_Last(uuid,
				orderByComparator);

		if (mencobatutorialEntry != null) {
			return mencobatutorialEntry;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchmencobatutorialEntryException(msg.toString());
	}

	/**
	 * Returns the last mencobatutorial entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	 */
	@Override
	public mencobatutorialEntry fetchByUuid_Last(String uuid,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<mencobatutorialEntry> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public mencobatutorialEntry[] findByUuid_PrevAndNext(long entryId,
		String uuid, OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException {
		mencobatutorialEntry mencobatutorialEntry = findByPrimaryKey(entryId);

		Session session = null;

		try {
			session = openSession();

			mencobatutorialEntry[] array = new mencobatutorialEntryImpl[3];

			array[0] = getByUuid_PrevAndNext(session, mencobatutorialEntry,
					uuid, orderByComparator, true);

			array[1] = mencobatutorialEntry;

			array[2] = getByUuid_PrevAndNext(session, mencobatutorialEntry,
					uuid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected mencobatutorialEntry getByUuid_PrevAndNext(Session session,
		mencobatutorialEntry mencobatutorialEntry, String uuid,
		OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MENCOBATUTORIALENTRY_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals("")) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(mencobatutorialEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(mencobatutorialEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<mencobatutorialEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mencobatutorial entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (mencobatutorialEntry mencobatutorialEntry : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(mencobatutorialEntry);
		}
	}

	/**
	 * Returns the number of mencobatutorial entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mencobatutorial entries
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MENCOBATUTORIALENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "mencobatutorialEntry.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "mencobatutorialEntry.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(mencobatutorialEntry.uuid IS NULL OR mencobatutorialEntry.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialEntryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			mencobatutorialEntryModelImpl.UUID_COLUMN_BITMASK |
			mencobatutorialEntryModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the mencobatutorial entry where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchmencobatutorialEntryException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mencobatutorial entry
	 * @throws NoSuchmencobatutorialEntryException if a matching mencobatutorial entry could not be found
	 */
	@Override
	public mencobatutorialEntry findByUUID_G(String uuid, long groupId)
		throws NoSuchmencobatutorialEntryException {
		mencobatutorialEntry mencobatutorialEntry = fetchByUUID_G(uuid, groupId);

		if (mencobatutorialEntry == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchmencobatutorialEntryException(msg.toString());
		}

		return mencobatutorialEntry;
	}

	/**
	 * Returns the mencobatutorial entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	 */
	@Override
	public mencobatutorialEntry fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the mencobatutorial entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	 */
	@Override
	public mencobatutorialEntry fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof mencobatutorialEntry) {
			mencobatutorialEntry mencobatutorialEntry = (mencobatutorialEntry)result;

			if (!Objects.equals(uuid, mencobatutorialEntry.getUuid()) ||
					(groupId != mencobatutorialEntry.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MENCOBATUTORIALENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<mencobatutorialEntry> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					mencobatutorialEntry mencobatutorialEntry = list.get(0);

					result = mencobatutorialEntry;

					cacheResult(mencobatutorialEntry);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (mencobatutorialEntry)result;
		}
	}

	/**
	 * Removes the mencobatutorial entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mencobatutorial entry that was removed
	 */
	@Override
	public mencobatutorialEntry removeByUUID_G(String uuid, long groupId)
		throws NoSuchmencobatutorialEntryException {
		mencobatutorialEntry mencobatutorialEntry = findByUUID_G(uuid, groupId);

		return remove(mencobatutorialEntry);
	}

	/**
	 * Returns the number of mencobatutorial entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mencobatutorial entries
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MENCOBATUTORIALENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "mencobatutorialEntry.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "mencobatutorialEntry.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(mencobatutorialEntry.uuid IS NULL OR mencobatutorialEntry.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "mencobatutorialEntry.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			mencobatutorialEntryModelImpl.UUID_COLUMN_BITMASK |
			mencobatutorialEntryModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mencobatutorial entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mencobatutorial entries
	 */
	@Override
	public List<mencobatutorialEntry> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<mencobatutorialEntry> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<mencobatutorialEntry> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<mencobatutorialEntry> findByUuid_C(String uuid, long companyId,
		int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<mencobatutorialEntry> list = null;

		if (retrieveFromCache) {
			list = (List<mencobatutorialEntry>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (mencobatutorialEntry mencobatutorialEntry : list) {
					if (!Objects.equals(uuid, mencobatutorialEntry.getUuid()) ||
							(companyId != mencobatutorialEntry.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_MENCOBATUTORIALENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(mencobatutorialEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<mencobatutorialEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencobatutorialEntry>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public mencobatutorialEntry findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException {
		mencobatutorialEntry mencobatutorialEntry = fetchByUuid_C_First(uuid,
				companyId, orderByComparator);

		if (mencobatutorialEntry != null) {
			return mencobatutorialEntry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchmencobatutorialEntryException(msg.toString());
	}

	/**
	 * Returns the first mencobatutorial entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	 */
	@Override
	public mencobatutorialEntry fetchByUuid_C_First(String uuid,
		long companyId,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		List<mencobatutorialEntry> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public mencobatutorialEntry findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException {
		mencobatutorialEntry mencobatutorialEntry = fetchByUuid_C_Last(uuid,
				companyId, orderByComparator);

		if (mencobatutorialEntry != null) {
			return mencobatutorialEntry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchmencobatutorialEntryException(msg.toString());
	}

	/**
	 * Returns the last mencobatutorial entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	 */
	@Override
	public mencobatutorialEntry fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<mencobatutorialEntry> list = findByUuid_C(uuid, companyId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public mencobatutorialEntry[] findByUuid_C_PrevAndNext(long entryId,
		String uuid, long companyId,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException {
		mencobatutorialEntry mencobatutorialEntry = findByPrimaryKey(entryId);

		Session session = null;

		try {
			session = openSession();

			mencobatutorialEntry[] array = new mencobatutorialEntryImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, mencobatutorialEntry,
					uuid, companyId, orderByComparator, true);

			array[1] = mencobatutorialEntry;

			array[2] = getByUuid_C_PrevAndNext(session, mencobatutorialEntry,
					uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected mencobatutorialEntry getByUuid_C_PrevAndNext(Session session,
		mencobatutorialEntry mencobatutorialEntry, String uuid, long companyId,
		OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_MENCOBATUTORIALENTRY_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals("")) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(mencobatutorialEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(mencobatutorialEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<mencobatutorialEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mencobatutorial entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (mencobatutorialEntry mencobatutorialEntry : findByUuid_C(uuid,
				companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(mencobatutorialEntry);
		}
	}

	/**
	 * Returns the number of mencobatutorial entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mencobatutorial entries
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MENCOBATUTORIALENTRY_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals("")) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "mencobatutorialEntry.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "mencobatutorialEntry.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(mencobatutorialEntry.uuid IS NULL OR mencobatutorialEntry.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "mencobatutorialEntry.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_G = new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_G",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G = new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED,
			mencobatutorialEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_G",
			new String[] { Long.class.getName(), Long.class.getName() },
			mencobatutorialEntryModelImpl.GROUPID_COLUMN_BITMASK |
			mencobatutorialEntryModelImpl.GUESTBOOKID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_G = new FinderPath(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_G",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mencobatutorial entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @return the matching mencobatutorial entries
	 */
	@Override
	public List<mencobatutorialEntry> findByG_G(long groupId, long guestbookId) {
		return findByG_G(groupId, guestbookId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<mencobatutorialEntry> findByG_G(long groupId, long guestbookId,
		int start, int end) {
		return findByG_G(groupId, guestbookId, start, end, null);
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
	@Override
	public List<mencobatutorialEntry> findByG_G(long groupId, long guestbookId,
		int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return findByG_G(groupId, guestbookId, start, end, orderByComparator,
			true);
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
	@Override
	public List<mencobatutorialEntry> findByG_G(long groupId, long guestbookId,
		int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G;
			finderArgs = new Object[] { groupId, guestbookId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_G;
			finderArgs = new Object[] {
					groupId, guestbookId,
					
					start, end, orderByComparator
				};
		}

		List<mencobatutorialEntry> list = null;

		if (retrieveFromCache) {
			list = (List<mencobatutorialEntry>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (mencobatutorialEntry mencobatutorialEntry : list) {
					if ((groupId != mencobatutorialEntry.getGroupId()) ||
							(guestbookId != mencobatutorialEntry.getGuestbookId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_MENCOBATUTORIALENTRY_WHERE);

			query.append(_FINDER_COLUMN_G_G_GROUPID_2);

			query.append(_FINDER_COLUMN_G_G_GUESTBOOKID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(mencobatutorialEntryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(guestbookId);

				if (!pagination) {
					list = (List<mencobatutorialEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencobatutorialEntry>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public mencobatutorialEntry findByG_G_First(long groupId, long guestbookId,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException {
		mencobatutorialEntry mencobatutorialEntry = fetchByG_G_First(groupId,
				guestbookId, orderByComparator);

		if (mencobatutorialEntry != null) {
			return mencobatutorialEntry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", guestbookId=");
		msg.append(guestbookId);

		msg.append("}");

		throw new NoSuchmencobatutorialEntryException(msg.toString());
	}

	/**
	 * Returns the first mencobatutorial entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	 */
	@Override
	public mencobatutorialEntry fetchByG_G_First(long groupId,
		long guestbookId,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		List<mencobatutorialEntry> list = findByG_G(groupId, guestbookId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public mencobatutorialEntry findByG_G_Last(long groupId, long guestbookId,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException {
		mencobatutorialEntry mencobatutorialEntry = fetchByG_G_Last(groupId,
				guestbookId, orderByComparator);

		if (mencobatutorialEntry != null) {
			return mencobatutorialEntry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", guestbookId=");
		msg.append(guestbookId);

		msg.append("}");

		throw new NoSuchmencobatutorialEntryException(msg.toString());
	}

	/**
	 * Returns the last mencobatutorial entry in the ordered set where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mencobatutorial entry, or <code>null</code> if a matching mencobatutorial entry could not be found
	 */
	@Override
	public mencobatutorialEntry fetchByG_G_Last(long groupId, long guestbookId,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		int count = countByG_G(groupId, guestbookId);

		if (count == 0) {
			return null;
		}

		List<mencobatutorialEntry> list = findByG_G(groupId, guestbookId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public mencobatutorialEntry[] findByG_G_PrevAndNext(long entryId,
		long groupId, long guestbookId,
		OrderByComparator<mencobatutorialEntry> orderByComparator)
		throws NoSuchmencobatutorialEntryException {
		mencobatutorialEntry mencobatutorialEntry = findByPrimaryKey(entryId);

		Session session = null;

		try {
			session = openSession();

			mencobatutorialEntry[] array = new mencobatutorialEntryImpl[3];

			array[0] = getByG_G_PrevAndNext(session, mencobatutorialEntry,
					groupId, guestbookId, orderByComparator, true);

			array[1] = mencobatutorialEntry;

			array[2] = getByG_G_PrevAndNext(session, mencobatutorialEntry,
					groupId, guestbookId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected mencobatutorialEntry getByG_G_PrevAndNext(Session session,
		mencobatutorialEntry mencobatutorialEntry, long groupId,
		long guestbookId,
		OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_MENCOBATUTORIALENTRY_WHERE);

		query.append(_FINDER_COLUMN_G_G_GROUPID_2);

		query.append(_FINDER_COLUMN_G_G_GUESTBOOKID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(mencobatutorialEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(guestbookId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(mencobatutorialEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<mencobatutorialEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mencobatutorial entries where groupId = &#63; and guestbookId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 */
	@Override
	public void removeByG_G(long groupId, long guestbookId) {
		for (mencobatutorialEntry mencobatutorialEntry : findByG_G(groupId,
				guestbookId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(mencobatutorialEntry);
		}
	}

	/**
	 * Returns the number of mencobatutorial entries where groupId = &#63; and guestbookId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param guestbookId the guestbook ID
	 * @return the number of matching mencobatutorial entries
	 */
	@Override
	public int countByG_G(long groupId, long guestbookId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_G;

		Object[] finderArgs = new Object[] { groupId, guestbookId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MENCOBATUTORIALENTRY_WHERE);

			query.append(_FINDER_COLUMN_G_G_GROUPID_2);

			query.append(_FINDER_COLUMN_G_G_GUESTBOOKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(guestbookId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_G_G_GROUPID_2 = "mencobatutorialEntry.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_G_GUESTBOOKID_2 = "mencobatutorialEntry.guestbookId = ?";

	public mencobatutorialEntryPersistenceImpl() {
		setModelClass(mencobatutorialEntry.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the mencobatutorial entry in the entity cache if it is enabled.
	 *
	 * @param mencobatutorialEntry the mencobatutorial entry
	 */
	@Override
	public void cacheResult(mencobatutorialEntry mencobatutorialEntry) {
		entityCache.putResult(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryImpl.class,
			mencobatutorialEntry.getPrimaryKey(), mencobatutorialEntry);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] {
				mencobatutorialEntry.getUuid(),
				mencobatutorialEntry.getGroupId()
			}, mencobatutorialEntry);

		mencobatutorialEntry.resetOriginalValues();
	}

	/**
	 * Caches the mencobatutorial entries in the entity cache if it is enabled.
	 *
	 * @param mencobatutorialEntries the mencobatutorial entries
	 */
	@Override
	public void cacheResult(List<mencobatutorialEntry> mencobatutorialEntries) {
		for (mencobatutorialEntry mencobatutorialEntry : mencobatutorialEntries) {
			if (entityCache.getResult(
						mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
						mencobatutorialEntryImpl.class,
						mencobatutorialEntry.getPrimaryKey()) == null) {
				cacheResult(mencobatutorialEntry);
			}
			else {
				mencobatutorialEntry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mencobatutorial entries.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(mencobatutorialEntryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mencobatutorial entry.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(mencobatutorialEntry mencobatutorialEntry) {
		entityCache.removeResult(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryImpl.class, mencobatutorialEntry.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((mencobatutorialEntryModelImpl)mencobatutorialEntry,
			true);
	}

	@Override
	public void clearCache(List<mencobatutorialEntry> mencobatutorialEntries) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (mencobatutorialEntry mencobatutorialEntry : mencobatutorialEntries) {
			entityCache.removeResult(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
				mencobatutorialEntryImpl.class,
				mencobatutorialEntry.getPrimaryKey());

			clearUniqueFindersCache((mencobatutorialEntryModelImpl)mencobatutorialEntry,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		mencobatutorialEntryModelImpl mencobatutorialEntryModelImpl) {
		Object[] args = new Object[] {
				mencobatutorialEntryModelImpl.getUuid(),
				mencobatutorialEntryModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			mencobatutorialEntryModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		mencobatutorialEntryModelImpl mencobatutorialEntryModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					mencobatutorialEntryModelImpl.getUuid(),
					mencobatutorialEntryModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((mencobatutorialEntryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					mencobatutorialEntryModelImpl.getOriginalUuid(),
					mencobatutorialEntryModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new mencobatutorial entry with the primary key. Does not add the mencobatutorial entry to the database.
	 *
	 * @param entryId the primary key for the new mencobatutorial entry
	 * @return the new mencobatutorial entry
	 */
	@Override
	public mencobatutorialEntry create(long entryId) {
		mencobatutorialEntry mencobatutorialEntry = new mencobatutorialEntryImpl();

		mencobatutorialEntry.setNew(true);
		mencobatutorialEntry.setPrimaryKey(entryId);

		String uuid = PortalUUIDUtil.generate();

		mencobatutorialEntry.setUuid(uuid);

		mencobatutorialEntry.setCompanyId(companyProvider.getCompanyId());

		return mencobatutorialEntry;
	}

	/**
	 * Removes the mencobatutorial entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entryId the primary key of the mencobatutorial entry
	 * @return the mencobatutorial entry that was removed
	 * @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	 */
	@Override
	public mencobatutorialEntry remove(long entryId)
		throws NoSuchmencobatutorialEntryException {
		return remove((Serializable)entryId);
	}

	/**
	 * Removes the mencobatutorial entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mencobatutorial entry
	 * @return the mencobatutorial entry that was removed
	 * @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	 */
	@Override
	public mencobatutorialEntry remove(Serializable primaryKey)
		throws NoSuchmencobatutorialEntryException {
		Session session = null;

		try {
			session = openSession();

			mencobatutorialEntry mencobatutorialEntry = (mencobatutorialEntry)session.get(mencobatutorialEntryImpl.class,
					primaryKey);

			if (mencobatutorialEntry == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchmencobatutorialEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(mencobatutorialEntry);
		}
		catch (NoSuchmencobatutorialEntryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected mencobatutorialEntry removeImpl(
		mencobatutorialEntry mencobatutorialEntry) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(mencobatutorialEntry)) {
				mencobatutorialEntry = (mencobatutorialEntry)session.get(mencobatutorialEntryImpl.class,
						mencobatutorialEntry.getPrimaryKeyObj());
			}

			if (mencobatutorialEntry != null) {
				session.delete(mencobatutorialEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (mencobatutorialEntry != null) {
			clearCache(mencobatutorialEntry);
		}

		return mencobatutorialEntry;
	}

	@Override
	public mencobatutorialEntry updateImpl(
		mencobatutorialEntry mencobatutorialEntry) {
		boolean isNew = mencobatutorialEntry.isNew();

		if (!(mencobatutorialEntry instanceof mencobatutorialEntryModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(mencobatutorialEntry.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(mencobatutorialEntry);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in mencobatutorialEntry proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom mencobatutorialEntry implementation " +
				mencobatutorialEntry.getClass());
		}

		mencobatutorialEntryModelImpl mencobatutorialEntryModelImpl = (mencobatutorialEntryModelImpl)mencobatutorialEntry;

		if (Validator.isNull(mencobatutorialEntry.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			mencobatutorialEntry.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (mencobatutorialEntry.getCreateDate() == null)) {
			if (serviceContext == null) {
				mencobatutorialEntry.setCreateDate(now);
			}
			else {
				mencobatutorialEntry.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!mencobatutorialEntryModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				mencobatutorialEntry.setModifiedDate(now);
			}
			else {
				mencobatutorialEntry.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (mencobatutorialEntry.isNew()) {
				session.save(mencobatutorialEntry);

				mencobatutorialEntry.setNew(false);
			}
			else {
				mencobatutorialEntry = (mencobatutorialEntry)session.merge(mencobatutorialEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!mencobatutorialEntryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { mencobatutorialEntryModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					mencobatutorialEntryModelImpl.getUuid(),
					mencobatutorialEntryModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] {
					mencobatutorialEntryModelImpl.getGroupId(),
					mencobatutorialEntryModelImpl.getGuestbookId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_G_G, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((mencobatutorialEntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						mencobatutorialEntryModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { mencobatutorialEntryModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((mencobatutorialEntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						mencobatutorialEntryModelImpl.getOriginalUuid(),
						mencobatutorialEntryModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						mencobatutorialEntryModelImpl.getUuid(),
						mencobatutorialEntryModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((mencobatutorialEntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						mencobatutorialEntryModelImpl.getOriginalGroupId(),
						mencobatutorialEntryModelImpl.getOriginalGuestbookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G,
					args);

				args = new Object[] {
						mencobatutorialEntryModelImpl.getGroupId(),
						mencobatutorialEntryModelImpl.getGuestbookId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_G, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G,
					args);
			}
		}

		entityCache.putResult(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
			mencobatutorialEntryImpl.class,
			mencobatutorialEntry.getPrimaryKey(), mencobatutorialEntry, false);

		clearUniqueFindersCache(mencobatutorialEntryModelImpl, false);
		cacheUniqueFindersCache(mencobatutorialEntryModelImpl);

		mencobatutorialEntry.resetOriginalValues();

		return mencobatutorialEntry;
	}

	/**
	 * Returns the mencobatutorial entry with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mencobatutorial entry
	 * @return the mencobatutorial entry
	 * @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	 */
	@Override
	public mencobatutorialEntry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchmencobatutorialEntryException {
		mencobatutorialEntry mencobatutorialEntry = fetchByPrimaryKey(primaryKey);

		if (mencobatutorialEntry == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchmencobatutorialEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return mencobatutorialEntry;
	}

	/**
	 * Returns the mencobatutorial entry with the primary key or throws a {@link NoSuchmencobatutorialEntryException} if it could not be found.
	 *
	 * @param entryId the primary key of the mencobatutorial entry
	 * @return the mencobatutorial entry
	 * @throws NoSuchmencobatutorialEntryException if a mencobatutorial entry with the primary key could not be found
	 */
	@Override
	public mencobatutorialEntry findByPrimaryKey(long entryId)
		throws NoSuchmencobatutorialEntryException {
		return findByPrimaryKey((Serializable)entryId);
	}

	/**
	 * Returns the mencobatutorial entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mencobatutorial entry
	 * @return the mencobatutorial entry, or <code>null</code> if a mencobatutorial entry with the primary key could not be found
	 */
	@Override
	public mencobatutorialEntry fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
				mencobatutorialEntryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		mencobatutorialEntry mencobatutorialEntry = (mencobatutorialEntry)serializable;

		if (mencobatutorialEntry == null) {
			Session session = null;

			try {
				session = openSession();

				mencobatutorialEntry = (mencobatutorialEntry)session.get(mencobatutorialEntryImpl.class,
						primaryKey);

				if (mencobatutorialEntry != null) {
					cacheResult(mencobatutorialEntry);
				}
				else {
					entityCache.putResult(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
						mencobatutorialEntryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
					mencobatutorialEntryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return mencobatutorialEntry;
	}

	/**
	 * Returns the mencobatutorial entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param entryId the primary key of the mencobatutorial entry
	 * @return the mencobatutorial entry, or <code>null</code> if a mencobatutorial entry with the primary key could not be found
	 */
	@Override
	public mencobatutorialEntry fetchByPrimaryKey(long entryId) {
		return fetchByPrimaryKey((Serializable)entryId);
	}

	@Override
	public Map<Serializable, mencobatutorialEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, mencobatutorialEntry> map = new HashMap<Serializable, mencobatutorialEntry>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			mencobatutorialEntry mencobatutorialEntry = fetchByPrimaryKey(primaryKey);

			if (mencobatutorialEntry != null) {
				map.put(primaryKey, mencobatutorialEntry);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
					mencobatutorialEntryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (mencobatutorialEntry)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_MENCOBATUTORIALENTRY_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (mencobatutorialEntry mencobatutorialEntry : (List<mencobatutorialEntry>)q.list()) {
				map.put(mencobatutorialEntry.getPrimaryKeyObj(),
					mencobatutorialEntry);

				cacheResult(mencobatutorialEntry);

				uncachedPrimaryKeys.remove(mencobatutorialEntry.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(mencobatutorialEntryModelImpl.ENTITY_CACHE_ENABLED,
					mencobatutorialEntryImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the mencobatutorial entries.
	 *
	 * @return the mencobatutorial entries
	 */
	@Override
	public List<mencobatutorialEntry> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<mencobatutorialEntry> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<mencobatutorialEntry> findAll(int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<mencobatutorialEntry> findAll(int start, int end,
		OrderByComparator<mencobatutorialEntry> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<mencobatutorialEntry> list = null;

		if (retrieveFromCache) {
			list = (List<mencobatutorialEntry>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_MENCOBATUTORIALENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MENCOBATUTORIALENTRY;

				if (pagination) {
					sql = sql.concat(mencobatutorialEntryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<mencobatutorialEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mencobatutorialEntry>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the mencobatutorial entries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (mencobatutorialEntry mencobatutorialEntry : findAll()) {
			remove(mencobatutorialEntry);
		}
	}

	/**
	 * Returns the number of mencobatutorial entries.
	 *
	 * @return the number of mencobatutorial entries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MENCOBATUTORIALENTRY);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return mencobatutorialEntryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mencobatutorial entry persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(mencobatutorialEntryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_MENCOBATUTORIALENTRY = "SELECT mencobatutorialEntry FROM mencobatutorialEntry mencobatutorialEntry";
	private static final String _SQL_SELECT_MENCOBATUTORIALENTRY_WHERE_PKS_IN = "SELECT mencobatutorialEntry FROM mencobatutorialEntry mencobatutorialEntry WHERE entryId IN (";
	private static final String _SQL_SELECT_MENCOBATUTORIALENTRY_WHERE = "SELECT mencobatutorialEntry FROM mencobatutorialEntry mencobatutorialEntry WHERE ";
	private static final String _SQL_COUNT_MENCOBATUTORIALENTRY = "SELECT COUNT(mencobatutorialEntry) FROM mencobatutorialEntry mencobatutorialEntry";
	private static final String _SQL_COUNT_MENCOBATUTORIALENTRY_WHERE = "SELECT COUNT(mencobatutorialEntry) FROM mencobatutorialEntry mencobatutorialEntry WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "mencobatutorialEntry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No mencobatutorialEntry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No mencobatutorialEntry exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(mencobatutorialEntryPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}