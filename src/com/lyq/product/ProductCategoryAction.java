package com.lyq.product;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lyq.action.BaseAction;
//import com.lyq.model.product.ProductCategory;
//import com.lyq.model.PageModel;
//import com.lyq.model.product.ProductCategory;
//import com.opensymphony.xwork2.ModelDriven;
/**
 * 商品类别Action对象
 * @author Li Yongqiang
 *
 */
@Scope("prototype")
@Controller("productCategoryAction")
public class ProductCategoryAction extends BaseAction{
	private static final long serialVersionUID = 1L;

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

}
