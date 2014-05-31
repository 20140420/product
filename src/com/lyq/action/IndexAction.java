package com.lyq.action;

//import java.util.List;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lyq.model.product.ProductCategory;

//import com.lyq.model.product.ProductCategory;
//import com.lyq.model.product.ProductInfo;
@Scope("prototype")
@Controller("indexAction")
public class IndexAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	/**
	 * �̳���дBaseAction
	 */
	@Override
	public String execute() throws Exception {
		// ��ѯ�������
		String where = "where parent is null";
		categories = categoryDao.find(-1, -1, where, null).getList();

		return SUCCESS;
	}
	
	// �������
	private List<ProductCategory> categories;


	public List<ProductCategory> getCategories() {
		return categories;
	}


	public void setCategories(List<ProductCategory> categories) {
		this.categories = categories;
	}
		
}
