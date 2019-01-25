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

package mencobatutorialservice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link mencobatutorialEntry}.
 * </p>
 *
 * @author liferay
 * @see mencobatutorialEntry
 * @generated
 */
@ProviderType
public class mencobatutorialEntryWrapper implements mencobatutorialEntry,
	ModelWrapper<mencobatutorialEntry> {
	public mencobatutorialEntryWrapper(
		mencobatutorialEntry mencobatutorialEntry) {
		_mencobatutorialEntry = mencobatutorialEntry;
	}

	@Override
	public Class<?> getModelClass() {
		return mencobatutorialEntry.class;
	}

	@Override
	public String getModelClassName() {
		return mencobatutorialEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("entryId", getEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("message", getMessage());
		attributes.put("guestbookId", getGuestbookId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		Long guestbookId = (Long)attributes.get("guestbookId");

		if (guestbookId != null) {
			setGuestbookId(guestbookId);
		}
	}

	@Override
	public Object clone() {
		return new mencobatutorialEntryWrapper((mencobatutorialEntry)_mencobatutorialEntry.clone());
	}

	@Override
	public int compareTo(
		mencobatutorialservice.model.mencobatutorialEntry mencobatutorialEntry) {
		return _mencobatutorialEntry.compareTo(mencobatutorialEntry);
	}

	/**
	* Returns the company ID of this mencobatutorial entry.
	*
	* @return the company ID of this mencobatutorial entry
	*/
	@Override
	public long getCompanyId() {
		return _mencobatutorialEntry.getCompanyId();
	}

	/**
	* Returns the create date of this mencobatutorial entry.
	*
	* @return the create date of this mencobatutorial entry
	*/
	@Override
	public Date getCreateDate() {
		return _mencobatutorialEntry.getCreateDate();
	}

	/**
	* Returns the email of this mencobatutorial entry.
	*
	* @return the email of this mencobatutorial entry
	*/
	@Override
	public String getEmail() {
		return _mencobatutorialEntry.getEmail();
	}

	/**
	* Returns the entry ID of this mencobatutorial entry.
	*
	* @return the entry ID of this mencobatutorial entry
	*/
	@Override
	public long getEntryId() {
		return _mencobatutorialEntry.getEntryId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _mencobatutorialEntry.getExpandoBridge();
	}

	/**
	* Returns the group ID of this mencobatutorial entry.
	*
	* @return the group ID of this mencobatutorial entry
	*/
	@Override
	public long getGroupId() {
		return _mencobatutorialEntry.getGroupId();
	}

	/**
	* Returns the guestbook ID of this mencobatutorial entry.
	*
	* @return the guestbook ID of this mencobatutorial entry
	*/
	@Override
	public long getGuestbookId() {
		return _mencobatutorialEntry.getGuestbookId();
	}

	/**
	* Returns the message of this mencobatutorial entry.
	*
	* @return the message of this mencobatutorial entry
	*/
	@Override
	public String getMessage() {
		return _mencobatutorialEntry.getMessage();
	}

	/**
	* Returns the modified date of this mencobatutorial entry.
	*
	* @return the modified date of this mencobatutorial entry
	*/
	@Override
	public Date getModifiedDate() {
		return _mencobatutorialEntry.getModifiedDate();
	}

	/**
	* Returns the name of this mencobatutorial entry.
	*
	* @return the name of this mencobatutorial entry
	*/
	@Override
	public String getName() {
		return _mencobatutorialEntry.getName();
	}

	/**
	* Returns the primary key of this mencobatutorial entry.
	*
	* @return the primary key of this mencobatutorial entry
	*/
	@Override
	public long getPrimaryKey() {
		return _mencobatutorialEntry.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _mencobatutorialEntry.getPrimaryKeyObj();
	}

	/**
	* Returns the status of this mencobatutorial entry.
	*
	* @return the status of this mencobatutorial entry
	*/
	@Override
	public int getStatus() {
		return _mencobatutorialEntry.getStatus();
	}

	/**
	* Returns the status by user ID of this mencobatutorial entry.
	*
	* @return the status by user ID of this mencobatutorial entry
	*/
	@Override
	public long getStatusByUserId() {
		return _mencobatutorialEntry.getStatusByUserId();
	}

	/**
	* Returns the status by user name of this mencobatutorial entry.
	*
	* @return the status by user name of this mencobatutorial entry
	*/
	@Override
	public String getStatusByUserName() {
		return _mencobatutorialEntry.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this mencobatutorial entry.
	*
	* @return the status by user uuid of this mencobatutorial entry
	*/
	@Override
	public String getStatusByUserUuid() {
		return _mencobatutorialEntry.getStatusByUserUuid();
	}

	/**
	* Returns the status date of this mencobatutorial entry.
	*
	* @return the status date of this mencobatutorial entry
	*/
	@Override
	public Date getStatusDate() {
		return _mencobatutorialEntry.getStatusDate();
	}

	/**
	* Returns the user ID of this mencobatutorial entry.
	*
	* @return the user ID of this mencobatutorial entry
	*/
	@Override
	public long getUserId() {
		return _mencobatutorialEntry.getUserId();
	}

	/**
	* Returns the user name of this mencobatutorial entry.
	*
	* @return the user name of this mencobatutorial entry
	*/
	@Override
	public String getUserName() {
		return _mencobatutorialEntry.getUserName();
	}

	/**
	* Returns the user uuid of this mencobatutorial entry.
	*
	* @return the user uuid of this mencobatutorial entry
	*/
	@Override
	public String getUserUuid() {
		return _mencobatutorialEntry.getUserUuid();
	}

	/**
	* Returns the uuid of this mencobatutorial entry.
	*
	* @return the uuid of this mencobatutorial entry
	*/
	@Override
	public String getUuid() {
		return _mencobatutorialEntry.getUuid();
	}

	@Override
	public int hashCode() {
		return _mencobatutorialEntry.hashCode();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial entry is approved.
	*
	* @return <code>true</code> if this mencobatutorial entry is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _mencobatutorialEntry.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _mencobatutorialEntry.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial entry is denied.
	*
	* @return <code>true</code> if this mencobatutorial entry is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _mencobatutorialEntry.isDenied();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial entry is a draft.
	*
	* @return <code>true</code> if this mencobatutorial entry is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _mencobatutorialEntry.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _mencobatutorialEntry.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial entry is expired.
	*
	* @return <code>true</code> if this mencobatutorial entry is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _mencobatutorialEntry.isExpired();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial entry is inactive.
	*
	* @return <code>true</code> if this mencobatutorial entry is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _mencobatutorialEntry.isInactive();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial entry is incomplete.
	*
	* @return <code>true</code> if this mencobatutorial entry is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _mencobatutorialEntry.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _mencobatutorialEntry.isNew();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial entry is pending.
	*
	* @return <code>true</code> if this mencobatutorial entry is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _mencobatutorialEntry.isPending();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial entry is scheduled.
	*
	* @return <code>true</code> if this mencobatutorial entry is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _mencobatutorialEntry.isScheduled();
	}

	@Override
	public void persist() {
		_mencobatutorialEntry.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_mencobatutorialEntry.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this mencobatutorial entry.
	*
	* @param companyId the company ID of this mencobatutorial entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_mencobatutorialEntry.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this mencobatutorial entry.
	*
	* @param createDate the create date of this mencobatutorial entry
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_mencobatutorialEntry.setCreateDate(createDate);
	}

	/**
	* Sets the email of this mencobatutorial entry.
	*
	* @param email the email of this mencobatutorial entry
	*/
	@Override
	public void setEmail(String email) {
		_mencobatutorialEntry.setEmail(email);
	}

	/**
	* Sets the entry ID of this mencobatutorial entry.
	*
	* @param entryId the entry ID of this mencobatutorial entry
	*/
	@Override
	public void setEntryId(long entryId) {
		_mencobatutorialEntry.setEntryId(entryId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_mencobatutorialEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_mencobatutorialEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_mencobatutorialEntry.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this mencobatutorial entry.
	*
	* @param groupId the group ID of this mencobatutorial entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_mencobatutorialEntry.setGroupId(groupId);
	}

	/**
	* Sets the guestbook ID of this mencobatutorial entry.
	*
	* @param guestbookId the guestbook ID of this mencobatutorial entry
	*/
	@Override
	public void setGuestbookId(long guestbookId) {
		_mencobatutorialEntry.setGuestbookId(guestbookId);
	}

	/**
	* Sets the message of this mencobatutorial entry.
	*
	* @param message the message of this mencobatutorial entry
	*/
	@Override
	public void setMessage(String message) {
		_mencobatutorialEntry.setMessage(message);
	}

	/**
	* Sets the modified date of this mencobatutorial entry.
	*
	* @param modifiedDate the modified date of this mencobatutorial entry
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_mencobatutorialEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this mencobatutorial entry.
	*
	* @param name the name of this mencobatutorial entry
	*/
	@Override
	public void setName(String name) {
		_mencobatutorialEntry.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_mencobatutorialEntry.setNew(n);
	}

	/**
	* Sets the primary key of this mencobatutorial entry.
	*
	* @param primaryKey the primary key of this mencobatutorial entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_mencobatutorialEntry.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_mencobatutorialEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this mencobatutorial entry.
	*
	* @param status the status of this mencobatutorial entry
	*/
	@Override
	public void setStatus(int status) {
		_mencobatutorialEntry.setStatus(status);
	}

	/**
	* Sets the status by user ID of this mencobatutorial entry.
	*
	* @param statusByUserId the status by user ID of this mencobatutorial entry
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_mencobatutorialEntry.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this mencobatutorial entry.
	*
	* @param statusByUserName the status by user name of this mencobatutorial entry
	*/
	@Override
	public void setStatusByUserName(String statusByUserName) {
		_mencobatutorialEntry.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this mencobatutorial entry.
	*
	* @param statusByUserUuid the status by user uuid of this mencobatutorial entry
	*/
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_mencobatutorialEntry.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this mencobatutorial entry.
	*
	* @param statusDate the status date of this mencobatutorial entry
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_mencobatutorialEntry.setStatusDate(statusDate);
	}

	/**
	* Sets the user ID of this mencobatutorial entry.
	*
	* @param userId the user ID of this mencobatutorial entry
	*/
	@Override
	public void setUserId(long userId) {
		_mencobatutorialEntry.setUserId(userId);
	}

	/**
	* Sets the user name of this mencobatutorial entry.
	*
	* @param userName the user name of this mencobatutorial entry
	*/
	@Override
	public void setUserName(String userName) {
		_mencobatutorialEntry.setUserName(userName);
	}

	/**
	* Sets the user uuid of this mencobatutorial entry.
	*
	* @param userUuid the user uuid of this mencobatutorial entry
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_mencobatutorialEntry.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this mencobatutorial entry.
	*
	* @param uuid the uuid of this mencobatutorial entry
	*/
	@Override
	public void setUuid(String uuid) {
		_mencobatutorialEntry.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<mencobatutorialservice.model.mencobatutorialEntry> toCacheModel() {
		return _mencobatutorialEntry.toCacheModel();
	}

	@Override
	public mencobatutorialservice.model.mencobatutorialEntry toEscapedModel() {
		return new mencobatutorialEntryWrapper(_mencobatutorialEntry.toEscapedModel());
	}

	@Override
	public String toString() {
		return _mencobatutorialEntry.toString();
	}

	@Override
	public mencobatutorialservice.model.mencobatutorialEntry toUnescapedModel() {
		return new mencobatutorialEntryWrapper(_mencobatutorialEntry.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _mencobatutorialEntry.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof mencobatutorialEntryWrapper)) {
			return false;
		}

		mencobatutorialEntryWrapper mencobatutorialEntryWrapper = (mencobatutorialEntryWrapper)obj;

		if (Objects.equals(_mencobatutorialEntry,
					mencobatutorialEntryWrapper._mencobatutorialEntry)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _mencobatutorialEntry.getStagedModelType();
	}

	@Override
	public mencobatutorialEntry getWrappedModel() {
		return _mencobatutorialEntry;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _mencobatutorialEntry.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _mencobatutorialEntry.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_mencobatutorialEntry.resetOriginalValues();
	}

	private final mencobatutorialEntry _mencobatutorialEntry;
}