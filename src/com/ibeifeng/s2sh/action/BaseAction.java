package com.ibeifeng.s2sh.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
	this.response=arg0;
		
	}
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
this.request=arg0;
		
	}
}
