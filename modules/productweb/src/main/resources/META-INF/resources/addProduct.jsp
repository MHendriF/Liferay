<%@ include file="init.jsp"%>
<portlet:actionURL name="addProduct" var="addProductURL">
</portlet:actionURL>

<aui:form action="${addProductURL}">
	<aui:input name="productName" label="productName"></aui:input>
	<aui:input name="productPrice" label="productPrice"></aui:input>
	<%-- <aui:input name="" type="submit" value="add-product"></aui:input> --%>
	
	<aui:button-row>
         <aui:button type="submit"></aui:button>
     </aui:button-row>
</aui:form>