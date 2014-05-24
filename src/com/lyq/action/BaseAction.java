package com.lyq.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 基本Action对象，其它Action的父类
 * @author Li Yongqiang
 */
public class BaseAction extends ActionSupport{
	private static final long serialVersionUID = 1L;

	public static final String MANAGER = "manager";
	public static final String LEFT = "left";
	public static final String RIGHT = "right";
	public static final String TOP = "top";
	
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

}
