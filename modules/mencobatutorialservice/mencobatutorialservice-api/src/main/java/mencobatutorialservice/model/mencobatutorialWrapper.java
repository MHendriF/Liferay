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
 * This class is a wrapper for {@link mencobatutorial}.
 * </p>
 *
 * @author liferay
 * @see mencobatutorial
 * @generated
 */
@ProviderType
public class mencobatutorialWrapper implements mencobatutorial,
	ModelWrapper<mencobatutorial> {
	public mencobatutorialWrapper(mencobatutorial mencobatutorial) {
		_mencobatutorial = mencobatutorial;
	}

	@Override
	public Class<?> getModelClass() {
		return mencobatutorial.class;
	}

	@Override
	public String getModelClassName() {
		return mencobatutorial.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("guestbookId", getGuestbookId());
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

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long guestbookId = (Long)attributes.get("guestbookId");

		if (guestbookId != null) {
			setGuestbookId(guestbookId);
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
	}

	@Override
	public Object clone() {
		return new mencobatutorialWrapper((mencobatutorial)_mencobatutorial.clone());
	}

	@Override
	public int compareTo(
		mencobatutorialservice.model.mencobatutorial mencobatutorial) {
		return _mencobatutorial.compareTo(mencobatutorial);
	}

	/**
	* Returns the company ID of this mencobatutorial.
	*
	* @return the company ID of this mencobatutorial
	*/
	@Override
	public long getCompanyId() {
		return _mencobatutorial.getCompanyId();
	}

	/**
	* Returns the create date of this mencobatutorial.
	*
	* @return the create date of this mencobatutorial
	*/
	@Override
	public Date getCreateDate() {
		return _mencobatutorial.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _mencobatutorial.getExpandoBridge();
	}

	/**
	* Returns the group ID of this mencobatutorial.
	*
	* @return the group ID of this mencobatutorial
	*/
	@Override
	public long getGroupId() {
		return _mencobatutorial.getGroupId();
	}

	/**
	* Returns the guestbook ID of this mencobatutorial.
	*
	* @return the guestbook ID of this mencobatutorial
	*/
	@Override
	public long getGuestbookId() {
		return _mencobatutorial.getGuestbookId();
	}

	/**
	* Returns the modified date of this mencobatutorial.
	*
	* @return the modified date of this mencobatutorial
	*/
	@Override
	public Date getModifiedDate() {
		return _mencobatutorial.getModifiedDate();
	}

	/**
	* Returns the name of this mencobatutorial.
	*
	* @return the name of this mencobatutorial
	*/
	@Override
	public String getName() {
		return _mencobatutorial.getName();
	}

	/**
	* Returns the primary key of this mencobatutorial.
	*
	* @return the primary key of this mencobatutorial
	*/
	@Override
	public long getPrimaryKey() {
		return _mencobatutorial.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _mencobatutorial.getPrimaryKeyObj();
	}

	/**
	* Returns the status of this mencobatutorial.
	*
	* @return the status of this mencobatutorial
	*/
	@Override
	public int getStatus() {
		return _mencobatutorial.getStatus();
	}

	/**
	* Returns the status by user ID of this mencobatutorial.
	*
	* @return the status by user ID of this mencobatutorial
	*/
	@Override
	public long getStatusByUserId() {
		return _mencobatutorial.getStatusByUserId();
	}

	/**
	* Returns the status by user name of this mencobatutorial.
	*
	* @return the status by user name of this mencobatutorial
	*/
	@Override
	public String getStatusByUserName() {
		return _mencobatutorial.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this mencobatutorial.
	*
	* @return the status by user uuid of this mencobatutorial
	*/
	@Override
	public String getStatusByUserUuid() {
		return _mencobatutorial.getStatusByUserUuid();
	}

	/**
	* Returns the status date of this mencobatutorial.
	*
	* @return the status date of this mencobatutorial
	*/
	@Override
	public Date getStatusDate() {
		return _mencobatutorial.getStatusDate();
	}

	/**
	* Returns the user ID of this mencobatutorial.
	*
	* @return the user ID of this mencobatutorial
	*/
	@Override
	public long getUserId() {
		return _mencobatutorial.getUserId();
	}

	/**
	* Returns the user name of this mencobatutorial.
	*
	* @return the user name of this mencobatutorial
	*/
	@Override
	public String getUserName() {
		return _mencobatutorial.getUserName();
	}

	/**
	* Returns the user uuid of this mencobatutorial.
	*
	* @return the user uuid of this mencobatutorial
	*/
	@Override
	public String getUserUuid() {
		return _mencobatutorial.getUserUuid();
	}

	/**
	* Returns the uuid of this mencobatutorial.
	*
	* @return the uuid of this mencobatutorial
	*/
	@Override
	public String getUuid() {
		return _mencobatutorial.getUuid();
	}

	@Override
	public int hashCode() {
		return _mencobatutorial.hashCode();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial is approved.
	*
	* @return <code>true</code> if this mencobatutorial is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _mencobatutorial.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _mencobatutorial.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial is denied.
	*
	* @return <code>true</code> if this mencobatutorial is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _mencobatutorial.isDenied();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial is a draft.
	*
	* @return <code>true</code> if this mencobatutorial is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _mencobatutorial.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _mencobatutorial.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial is expired.
	*
	* @return <code>true</code> if this mencobatutorial is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _mencobatutorial.isExpired();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial is inactive.
	*
	* @return <code>true</code> if this mencobatutorial is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _mencobatutorial.isInactive();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial is incomplete.
	*
	* @return <code>true</code> if this mencobatutorial is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _mencobatutorial.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _mencobatutorial.isNew();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial is pending.
	*
	* @return <code>true</code> if this mencobatutorial is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _mencobatutorial.isPending();
	}

	/**
	* Returns <code>true</code> if this mencobatutorial is scheduled.
	*
	* @return <code>true</code> if this mencobatutorial is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _mencobatutorial.isScheduled();
	}

	@Override
	public void persist() {
		_mencobatutorial.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_mencobatutorial.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this mencobatutorial.
	*
	* @param companyId the company ID of this mencobatutorial
	*/
	@Override
	public void setCompanyId(long companyId) {
		_mencobatutorial.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this mencobatutorial.
	*
	* @param createDate the create date of this mencobatutorial
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_mencobatutorial.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_mencobatutorial.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_mencobatutorial.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_mencobatutorial.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this mencobatutorial.
	*
	* @param groupId the group ID of this mencobatutorial
	*/
	@Override
	public void setGroupId(long groupId) {
		_mencobatutorial.setGroupId(groupId);
	}

	/**
	* Sets the guestbook ID of this mencobatutorial.
	*
	* @param guestbookId the guestbook ID of this mencobatutorial
	*/
	@Override
	public void setGuestbookId(long guestbookId) {
		_mencobatutorial.setGuestbookId(guestbookId);
	}

	/**
	* Sets the modified date of this mencobatutorial.
	*
	* @param modifiedDate the modified date of this mencobatutorial
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_mencobatutorial.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this mencobatutorial.
	*
	* @param name the name of this mencobatutorial
	*/
	@Override
	public void setName(String name) {
		_mencobatutorial.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_mencobatutorial.setNew(n);
	}

	/**
	* Sets the primary key of this mencobatutorial.
	*
	* @param primaryKey the primary key of this mencobatutorial
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_mencobatutorial.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_mencobatutorial.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this mencobatutorial.
	*
	* @param status the status of this mencobatutorial
	*/
	@Override
	public void setStatus(int status) {
		_mencobatutorial.setStatus(status);
	}

	/**
	* Sets the status by user ID of this mencobatutorial.
	*
	* @param statusByUserId the status by user ID of this mencobatutorial
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_mencobatutorial.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this mencobatutorial.
	*
	* @param statusByUserName the status by user name of this mencobatutorial
	*/
	@Override
	public void setStatusByUserName(String statusByUserName) {
		_mencobatutorial.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this mencobatutorial.
	*
	* @param statusByUserUuid the status by user uuid of this mencobatutorial
	*/
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_mencobatutorial.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this mencobatutorial.
	*
	* @param statusDate the status date of this mencobatutorial
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_mencobatutorial.setStatusDate(statusDate);
	}

	/**
	* Sets the user ID of this mencobatutorial.
	*
	* @param userId the user ID of this mencobatutorial
	*/
	@Override
	public void setUserId(long userId) {
		_mencobatutorial.setUserId(userId);
	}

	/**
	* Sets the user name of this mencobatutorial.
	*
	* @param userName the user name of this mencobatutorial
	*/
	@Override
	public void setUserName(String userName) {
		_mencobatutorial.setUserName(userName);
	}

	/**
	* Sets the user uuid of this mencobatutorial.
	*
	* @param userUuid the user uuid of this mencobatutorial
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_mencobatutorial.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this mencobatutorial.
	*
	* @param uuid the uuid of this mencobatutorial
	*/
	@Override
	public void setUuid(String uuid) {
		_mencobatutorial.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<mencobatutorialservice.model.mencobatutorial> toCacheModel() {
		return _mencobatutorial.toCacheModel();
	}

	@Override
	public mencobatutorialservice.model.mencobatutorial toEscapedModel() {
		return new mencobatutorialWrapper(_mencobatutorial.toEscapedModel());
	}

	@Override
	public String toString() {
		return _mencobatutorial.toString();
	}

	@Override
	public mencobatutorialservice.model.mencobatutorial toUnescapedModel() {
		return new mencobatutorialWrapper(_mencobatutorial.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _mencobatutorial.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof mencobatutorialWrapper)) {
			return false;
		}

		mencobatutorialWrapper mencobatutorialWrapper = (mencobatutorialWrapper)obj;

		if (Objects.equals(_mencobatutorial,
					mencobatutorialWrapper._mencobatutorial)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _mencobatutorial.getStagedModelType();
	}

	@Override
	public mencobatutorial getWrappedModel() {
		return _mencobatutorial;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _mencobatutorial.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _mencobatutorial.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_mencobatutorial.resetOriginalValues();
	}

	private final mencobatutorial _mencobatutorial;
}