package com.lyq.action.product;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lyq.action.BaseAction;
import com.lyq.model.PageModel;
import com.lyq.model.product.ProductCategory;
import com.opensymphony.xwork2.ModelDriven;
/**
 * ��Ʒ���Action����
 * @author Li Yongqiang
 *
 */
@Scope("prototype")
@Controller("productCategoryAction")
public class ProductCategoryAction extends BaseAction implements ModelDriven<ProductCategory>{
	private static final long serialVersionUID = 1L;
	
	private ProductCategory category = new ProductCategory();//һ��Ҫ�ȳ�ʼ��obj����
	@Override
	public ProductCategory getModel() {//�˷�����Modeldriven�ӿڵķ�����Ҫ��д
		return category;
	}
	// �����id
	private Integer pid;
	// �������
	private PageModel<ProductCategory> pageModel;
	
	@Override
	public String add() throws Exception {

		return INPUT;
	}
	/**
	 * ������
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception{

		return list();//��������б�Ĳ��ҷ���
	}
	/**
	 * ��ѯ���
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception{

		return LIST;//���غ�̨����б�ҳ��
	}
	/**
	 * �༭���
	 * @return String
	 * @throws Exception
	 */
	public String edit() throws Exception{

		return EDIT;
	}
	//getter��setter����
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
