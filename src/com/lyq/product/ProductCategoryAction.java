package com.lyq.product;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lyq.action.BaseAction;
//import com.lyq.model.product.ProductCategory;
//import com.lyq.model.PageModel;
//import com.lyq.model.product.ProductCategory;
//import com.opensymphony.xwork2.ModelDriven;
/**
 * ��Ʒ���Action����
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

}
