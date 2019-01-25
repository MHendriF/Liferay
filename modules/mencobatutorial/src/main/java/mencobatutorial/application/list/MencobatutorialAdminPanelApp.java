package mencobatutorial.application.list;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.model.Portlet;

import mencobatutorial.constants.MencobatutorialPortletKeys;

@Component(
    immediate = true,
    property = {
        "panel.app.order:Integer=300",
        "panel.category.key=" + PanelCategoryKeys.SITE_ADMINISTRATION_CONTENT
    },
    service = PanelApp.class
)

public class MencobatutorialAdminPanelApp extends BasePanelApp {

	@Override
    public String getPortletId() {
        return MencobatutorialPortletKeys.MencobatutorialAdmin;
    }

    @Override
    @Reference(
        target = "(javax.portlet.name=" + MencobatutorialPortletKeys.MencobatutorialAdmin  + ")",
        unbind = "-"
    )
    public void setPortlet(Portlet portlet) {
        super.setPortlet(portlet);
    }


}
