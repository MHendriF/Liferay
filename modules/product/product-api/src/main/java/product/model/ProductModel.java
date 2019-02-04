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

package product.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Product service. Represents a row in the &quot;product_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link product.model.impl.ProductModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link product.model.impl.ProductImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Product
 * @see product.model.impl.ProductImpl
 * @see product.model.impl.ProductModelImpl
 * @generated
 */
@ProviderType
public interface ProductModel extends BaseModel<Product>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a product model instance should use the {@link Product} interface instead.
	 */

	/**
	 * Returns the primary key of this product.
	 *
	 * @return the primary key of this product
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this product.
	 *
	 * @param primaryKey the primary key of this product
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this product.
	 *
	 * @return the uuid of this product
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this product.
	 *
	 * @param uuid the uuid of this product
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the product ID of this product.
	 *
	 * @return the product ID of this product
	 */
	public long getProductId();

	/**
	 * Sets the product ID of this product.
	 *
	 * @param productId the product ID of this product
	 */
	public void setProductId(long productId);

	/**
	 * Returns the company ID of this product.
	 *
	 * @return the company ID of this product
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this product.
	 *
	 * @param companyId the company ID of this product
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the product name of this product.
	 *
	 * @return the product name of this product
	 */
	@AutoEscape
	public String getProductName();

	/**
	 * Sets the product name of this product.
	 *
	 * @param productName the product name of this product
	 */
	public void setProductName(String productName);

	/**
	 * Returns the product price of this product.
	 *
	 * @return the product price of this product
	 */
	public long getProductPrice();

	/**
	 * Sets the product price of this product.
	 *
	 * @param productPrice the product price of this product
	 */
	public void setProductPrice(long productPrice);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Product product);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Product> toCacheModel();

	@Override
	public Product toEscapedModel();

	@Override
	public Product toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}