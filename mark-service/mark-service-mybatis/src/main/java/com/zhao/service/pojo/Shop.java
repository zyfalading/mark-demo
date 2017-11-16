package com.zhao.service.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Shop implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String shopid;

    private String shopname;

    private BigDecimal shopprice;

    private String createtime;

    private String updtime;

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public BigDecimal getShopprice() {
        return shopprice;
    }

    public void setShopprice(BigDecimal shopprice) {
        this.shopprice = shopprice;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getUpdtime() {
        return updtime;
    }

    public void setUpdtime(String updtime) {
        this.updtime = updtime == null ? null : updtime.trim();
    }
}