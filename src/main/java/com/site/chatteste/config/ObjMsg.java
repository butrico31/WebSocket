package com.site.chatteste.config;



public class ObjMsg {
    private String user;
    private String msg;
    
    
	public ObjMsg(String user, String msg) {
		super();
		this.setUser(user);
		this.setMsg(msg);
	}


	public ObjMsg() {
		super();
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}
    
	
    
}
