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

package product.service.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import aQute.bnd.annotation.ProviderType;
import product.model.Product;
import product.model.impl.ProductImpl;
import product.service.ProductLocalServiceUtil;
import product.service.base.ProductLocalServiceBaseImpl;

/**
 * The implementation of the product local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link product.service.ProductLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductLocalServiceBaseImpl
 * @see product.service.ProductLocalServiceUtil
 */
@ProviderType
public class ProductLocalServiceImpl extends ProductLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link product.service.ProductLocalServiceUtil} to access the product local service.
	 */
	 public void saveProduct(String productName,long productPrice){
		 
	  Product product=new ProductImpl();
	  product.setProductId(counterLocalService.increment());
	  product.setProductName(productName);
	  product.setProductPrice(productPrice);
	  updateProduct(product);

	 }
	 
	 public List<Product> getProductByPrice(long price) {
		 return productFinder.getProductByPrice(price);
	 }
	 
	 public List<Product> findByPriceRange(long price1, long price2) {
		 
		 DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Product.class, PortalClassLoaderUtil.getClassLoader());
		 dynamicQuery.add(PropertyFactoryUtil.forName("productPrice").between(new Long(price1), new Long(price2)));
		 
		 List<Product> productList = ProductLocalServiceUtil.dynamicQuery(dynamicQuery);
		 return productList;
	 }
	 
	 
	 //List<Product> products=ProductLocalServiceUtil.getProductByPrice(500);
}