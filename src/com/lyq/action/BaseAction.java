package com.lyq.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.lyq.dao.product.ProductCategoryDao;
import com.opensymphony.xwork2.ActionSupport;
/**
 * ����Action��������Action�ĸ���
 * @author Li Yongqiang
 */
public class BaseAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	protected int pageNo = 1;//��ǰҳ
	protected int pageSize = 5;//ÿҳ��ʾ������
	
	// ע��Dao
	@Autowired
	protected ProductCategoryDao categoryDao;
	
	public static final String MANAGER = "manager";
	public static final String LEFT = "left";
	public static final String RIGHT = "right";
	public static final String TOP = "top";
	public static final String ADD = "add";
	public static final String LIST = "list";
	public static final String EDIT = "edit";
	
	// ������
	public String manager() throws Exception {
		return MANAGER;
	}
	public String top() throws Exception {
		return TOP;
	}
	public String left() throws Exception {
		return LEFT;
	}
	public String right() throws Exception {
		return RIGHT;
	}
	public String add() throws Exception {
		return ADD;
	}

}
