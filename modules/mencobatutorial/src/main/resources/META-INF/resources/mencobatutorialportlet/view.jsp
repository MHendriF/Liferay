<%@include file="../init.jsp"%>

<%
long guestbookId = Long.valueOf((Long) renderRequest
        .getAttribute("guestbookId"));
%>

<aui:button-row cssClass="guestbook-buttons">
	
	<%-- <c:if test='<%= mencobatutorialPermission.contains(permissionChecker, guestbookId, "ADD_ENTRY") %>'>
 --%>	
	    <portlet:renderURL var="addEntryURL">
	        <portlet:param name="mvcPath" value="/mencobatutorialportlet/edit_entry.jsp" />
	        <portlet:param name="guestbookId"
	            value="<%=String.valueOf(guestbookId)%>" />
	    </portlet:renderURL>
	    <aui:button onClick="<%=addEntryURL.toString()%>" value="Add Entry"></aui:button>
	
	<%-- </c:if> --%>
</aui:button-row>

<liferay-ui:search-container total="<%=mencobatutorialEntryLocalServiceUtil.getEntriesCount(scopeGroupId,
guestbookId) %>">

<%-- <aui:nav cssClass="nav-tabs">

    <%
        List<mencobatutorial> guestbooks = mencobatutorialLocalServiceUtil.getGuestbooks(scopeGroupId);

            for (int i = 0; i < guestbooks.size(); i++) {

            	mencobatutorial curGuestbook = (mencobatutorial) guestbooks.get(i);
                String cssClass = StringPool.BLANK;

                if (curGuestbook.getGuestbookId() == guestbookId) {
                    cssClass = "active";
                }

                if (mencobatutorialPermission.contains(
                    permissionChecker, curGuestbook.getGuestbookId(), "VIEW")) {

    %>

    <portlet:renderURL var="viewPageURL">
        <portlet:param name="mvcPath" value="/mencobatutorialportlet/view.jsp" />
        <portlet:param name="guestbookId"
            value="<%=String.valueOf(curGuestbook.getGuestbookId())%>" />
    </portlet:renderURL>

    <aui:nav-item cssClass="<%=cssClass%>" href="<%=viewPageURL%>"
        label="<%=HtmlUtil.escape(curGuestbook.getName())%>" />

    <%  
                }

            }
    %>

</aui:nav> --%>
 
<liferay-ui:search-container-results
    results="<%=mencobatutorialEntryLocalServiceUtil.getEntries(scopeGroupId.longValue(),
                    guestbookId, searchContainer.getStart(),
                    searchContainer.getEnd())%>" />

<liferay-ui:search-container-row
    className="mencobatutorialservice.model.mencobatutorialEntry" modelVar="entry">
	
	<%-- <liferay-ui:search-container-column-jsp path="/mencobatutorialportlet/entry_actions.jsp" align="right" /> --%>
	
	<liferay-ui:search-container-column-text property="name" />
	
    <liferay-ui:search-container-column-text property="message" />
    
    <liferay-ui:search-container-column-text property="email" />

</liferay-ui:search-container-row>

<liferay-ui:search-iterator />

</liferay-ui:search-container>