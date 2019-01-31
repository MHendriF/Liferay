package productweb.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import product.service.ProductLocalServiceUtil;
import productweb.constants.ProductwebPortletKeys;

/**
 * @author hendr
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ProductwebPortletKeys.Productweb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ProductwebPortlet extends MVCPortlet {
	 private static final Log log=LogFactoryUtil.getLog(ProductwebPortlet.class);
	 @Override
	 public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	   throws IOException, PortletException {
	  // TODO Auto-generated method stub
	  super.render(renderRequest, renderResponse);
	 }
	 @ProcessAction(name="addProduct")
	 public void addProduct(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException {
		  String productName=ParamUtil.getString(actionRequest,"productName");
		  long productPrice=ParamUtil.getLong(actionRequest,"productPrice");
		  ProductLocalServiceUtil.saveProduct(productName, productPrice);
	 }
}