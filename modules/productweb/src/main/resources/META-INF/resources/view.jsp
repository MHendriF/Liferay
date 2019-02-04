<%@ include file="init.jsp"%>
<%@page import="product.service.ProductLocalServiceUtil"%>

<portlet:renderURL var="addProductURL">
 <portlet:param name="mvcPath" value="/addProduct.jsp" />
</portlet:renderURL>

<aui:button onClick= "${addProductURL}" value="add-product"></aui:button>

<liferay-ui:search-container delta="5" deltaConfigurable="true" emptyResultsMessage="no-products">
 <liferay-ui:search-container-results results="<%= ProductLocalServiceUtil.getProducts(searchContainer.getStart(), searchContainer.getEnd()) %>" />

 <liferay-ui:search-container-row
  className="product.model.Product"
  modelVar="aProduct">
 <liferay-ui:search-container-column-text property="productId" name=""/>
 <liferay-ui:search-container-column-text property="productName"/>
 <liferay-ui:search-container-column-text property="productPrice"/>
 
 
 </liferay-ui:search-container-row>

 <liferay-ui:search-iterator />
</liferay-ui:search-container>

<b>ProductLocalServiceUtil.getProductByPrice(10000)</b><br/>
<%="Get Product:"+ProductLocalServiceUtil.getProductByPrice(10000)+"<br/>"%>

<br/>
<b>findByPriceRange(10000, 20000)</b><br/>
<%="Get Product:"+ProductLocalServiceUtil.findByPriceRange(10000, 20000)+"<br/>"%>