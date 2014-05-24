package com.lyq.action.product;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lyq.action.BaseAction;
import com.lyq.model.PageModel;
import com.lyq.model.product.ProductCategory;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 商品类别Action对象
 * @author Li Yongqiang
 *
 */
@Scope("prototype")
@Controller("productCategoryAction")
public class ProductCategoryAction extends BaseAction implements ModelDriven<ProductCategory>{
	private static final long serialVersionUID = 1L;
	
	private ProductCategory category = new ProductCategory();//一定要先初始化obj对象！
	@Override
	public ProductCategory getModel() {//此方法是Modeldriven接口的方法，要重写
		return category;
	}
	// 父类别id
	private Integer pid;
	// 所有类别
	private PageModel<ProductCategory> pageModel;
	
	@Override
	public String add() throws Exception {

		return INPUT;
	}
	/**
	 * 添加类别
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception{

		return list();//返回类别列表的查找方法
	}
	/**
	 * 查询类别
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception{

		return LIST;//返回后台类别列表页面
	}
	/**
	 * 编辑类别
	 * @return String
	 * @throws Exception
	 */
	public String edit() throws Exception{

		return EDIT;
	}
	//getter和setter方法
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public PageModel<ProductCategory> getPageModel() {
		return pageModel;
	}
	public void setPageModel(PageModel<ProductCategory> pageModel) {
		this.pageModel = pageModel;
	}
	public ProductCategory getCategory() {
		return category;
	}
	public void setCategory(ProductCategory category) {
		this.category = category;
	}

}
