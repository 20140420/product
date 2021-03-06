package com.lyq.action;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;


import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.ApplicationAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.lyq.dao.order.OrderDao;
import com.lyq.dao.product.ProductCategoryDao;
import com.lyq.dao.product.ProductDao;
import com.lyq.dao.product.UploadFileDao;
import com.lyq.dao.user.CustomerDao;
import com.lyq.dao.user.UserDao;
import com.lyq.model.order.OrderItem;
import com.lyq.model.user.Customer;
import com.lyq.model.user.User;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 基本Action对象，其它Action的父类
 * @author Li Yongqiang
 */
public class BaseAction extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware {
	private static final long serialVersionUID = 1L;
	
	protected Integer id;
	protected Integer[] ids;
	protected int pageNo = 1;//当前页
	protected int pageSize = 5;//每页显示多少条
	
	// 注入Dao
	@Autowired
	protected ProductCategoryDao categoryDao;
	@Autowired
	protected ProductDao productDao;
	@Autowired
	protected UploadFileDao uploadFileDao;
	@Autowired
	protected OrderDao orderDao;
	@Autowired
	protected UserDao userDao;
	@Autowired
	protected CustomerDao customerDao;

	// Map类型的request
	protected Map<String, Object> request;
	// Map类型的session
	protected Map<String, Object> session;
	// Map类型的application
	protected Map<String, Object> application;
	
	public static final String MANAGER = "manager";
	public static final String LEFT = "left";
	public static final String RIGHT = "right";
	public static final String TOP = "top";
	public static final String ADD = "add";
	public static final String LIST = "list";
	public static final String EDIT = "edit";
	public static final String SELECT = "select";
	public static final String QUERY = "query";
	public static final String INDEX = "index";
	public static final String LOGIN = "login";
	public static final String REG = "reg";
	public static final String LOGOUT = "logout";
	public static final String CUSTOMER_LOGIN = "customerLogin";
	public static final String ADMIN_LOGIN = "adminLogin";

	
	// 处理方法
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
	public String select() throws Exception {
		return SELECT;
	}
	public String query() throws Exception{
		return QUERY;
	}
	public String login() throws Exception{
		return LOGIN;
	}
	public String reg() throws Exception{
		return REG;
	}
	/**
	 * 助于基于此类的扩展类可以直接INDEX跳到主页面
	 * @return
	 * @throws Exception
	 */
	public String index() throws Exception {
		return INDEX;
	}
	/**
	 * 继承重写ActionSupport
	 */
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}


	
	
	@Override
	public void setRequest(Map<String, Object> request) {
		// 获取Map类型的request赋值
		this.request = request;
	}
	/**
	 * 获取Map类型的session赋值
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		// 获取Map类型的session赋值
		this.session = session;
	}
	@Override
	public void setApplication(Map<String, Object> application) {
		// 获取Map类型的application赋值
		this.application = application;
	}
	
	// 获取用户id
	// 获取用户对象
	public Customer getLoginCustomer(){
		if(session.get("customer") != null){
			return (Customer) session.get("customer");
		}
		return null;
	}
	// 获取管理员id
	// 获取管理员对象
	public User getLoginUser(){
		if(session.get("admin") != null){
			return (User) session.get("admin");
		}
		return null;
	}
	// 从session中取出购物车
	@SuppressWarnings("unchecked")
	protected Set<OrderItem> getCart(){
		Object obj = session.get("cart");
		if(obj == null){
			return new HashSet<OrderItem>();
		}else{
			return (Set<OrderItem>) obj;
		}
	}
	
	
	// getter和settter方法
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer[] getIds() {
		return ids;
	}
	public void setIds(Integer[] ids) {
		this.ids = ids;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}


}
