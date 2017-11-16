package com.zhao.service.pojo;

import java.io.Serializable;

public class Users implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer uid;

    private String uname;

    private Integer uage;

    private String usex;

    private String ucreatetime;

    private String updtime;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex == null ? null : usex.trim();
    }

    public String getUcreatetime() {
        return ucreatetime;
    }

    public void setUcreatetime(String ucreatetime) {
        this.ucreatetime = ucreatetime == null ? null : ucreatetime.trim();
    }

    public String getUpdtime() {
        return updtime;
    }

    public void setUpdtime(String updtime) {
        this.updtime = updtime == null ? null : updtime.trim();
    }
}