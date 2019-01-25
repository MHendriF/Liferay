<%@include file="../init.jsp"%>

<liferay-ui:search-container
    total="<%= mencobatutorialLocalServiceUtil.getGuestbooksCount(scopeGroupId) %>">
    <liferay-ui:search-container-results
        results="<%= mencobatutorialLocalServiceUtil.getGuestbooks(scopeGroupId, 
            searchContainer.getStart(), searchContainer.getEnd()) %>" />

    <liferay-ui:search-container-row
        className="mencobatutorialservice.model.mencobatutorial" modelVar="guestbook">

        <liferay-ui:search-container-column-text property="name" />

        <liferay-ui:search-container-column-jsp
            align="right" 
            path="/mencobatutorialadminportlet/guestbook_actions.jsp" />

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row cssClass="guestbook-admin-buttons">
    <portlet:renderURL var="addGuestbookURL">
        <portlet:param name="mvcPath"
            value="/mencobatutorialadminportlet/edit_guestbook.jsp" />
        <portlet:param name="redirect" value="<%= "currentURL" %>" />
    </portlet:renderURL>

    <aui:button onClick="<%= addGuestbookURL.toString() %>"
        value="Add Guestbook" />
</aui:button-row>