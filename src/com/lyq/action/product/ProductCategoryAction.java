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
		if(pid != null && pid>0){//����и��ڵ�
			ProductCategory parent = categoryDao.load(pid);//���ظ���
			//��μ�1
			category.setLevel(parent.getLevel()+1);
		}
		return INPUT;
	}
	/**
	 * ������
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception{
		if(pid != null && pid > 0 ){//����и��ڵ�
			category.setParent(categoryDao.load(pid));//���ø��ڵ�
		}
		categoryDao.saveOrUpdate(category);//��������Ϣ
		return list();//��������б�Ĳ��ҷ���
	}
	/**
	 * ��ѯ���
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception{
		Object[] params = null ;//������������ֵΪ��
		String where;//�����ѯ��������
		if(pid != null && pid > 0 ){//����и��ڵ�
			where = "where parent.id = ?";//ִ�в�ѯ����
			params = new Integer[]{pid};//���ò���ֵ
		}else{
			where ="where parent is null";//��ѯ���ڵ�
		}
		pageModel = categoryDao.find(pageNo, pageSize, where, params);//ִ�з�װ�� ������Ϣ��ҳ���� ��ѯ����
		return LIST;//���غ�̨����б�ҳ��
	}
	/**
	 * �༭���
	 * @return String
	 * @throws Exception
	 */
	public String edit() throws Exception{
		if(category.getId() != null && category.getId() > 0){//�ж��Ƿ���ID����
			this.category = categoryDao.get(category.getId());//���ض���ID����
		}	
		return EDIT;
	}
	/**
	 * ɾ�����
	 * @return String
	 * @throws Exception
	 */
	public String del() throws Exception{
		if(category.getId() != null && category.getId() > 0){//�ж��Ƿ���ID����
			categoryDao.delete(category.getId());//ִ��ɾ������
		}
		return list();//������Ʒ����б�Ĳ��ҷ���
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
