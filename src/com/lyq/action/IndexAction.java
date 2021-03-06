package com.lyq.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lyq.model.product.ProductCategory;
//import com.lyq.model.product.ProductInfo;

@Scope("prototype")
@Controller("indexAction")
public class IndexAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	
	// 所有类别
	private List<ProductCategory> categories;
	/**
	 * 
	
	// 推荐商品
	private List<ProductInfo> product_commend;
	// 销售最好的商品
	private List<ProductInfo> product_sellCount;
	// 人气最高的商品
	private List<ProductInfo> product_clickcount;
	*/

	public List<ProductCategory> getCategories() {
		return categories;
	}


	public void setCategories(List<ProductCategory> categories) {
		this.categories = categories;
	} 

	/**
	 * 
	 * 	
	public List<ProductInfo> getProduct_commend() {
		return product_commend;
	}


	public void setProduct_commend(List<ProductInfo> product_commend) {
		this.product_commend = product_commend;
	}


	public List<ProductInfo> getProduct_sellCount() {
		return product_sellCount;
	}


	public void setProduct_sellCount(List<ProductInfo> product_sellCount) {
		this.product_sellCount = product_sellCount;
	}


	public List<ProductInfo> getProduct_clickcount() {
		return product_clickcount;
	}


	public void setProduct_clickcount(List<ProductInfo> product_clickcount) {
		this.product_clickcount = product_clickcount;
	}
	 */

	/**
	 * 继承重写BaseAction
	 */
	@Override
	public String execute() throws Exception {
		// 查询所有类别
		String where = "where parent is null";
		categories = categoryDao.find(-1, -1, where, null).getList();
		/**
		 * 
		// 查询推荐的商品
		product_commend = productDao.findCommend();
		// 查询销量最高的商品
		product_sellCount = productDao.findSellCount();
		// 查询人气高的商品
		product_clickcount = productDao.findClickcount();
		 */
		return SUCCESS;
	}
		
}
