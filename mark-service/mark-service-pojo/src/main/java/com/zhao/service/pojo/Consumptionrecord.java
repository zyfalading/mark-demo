package com.zhao.service.pojo;

import java.io.Serializable;

public class Consumptionrecord implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String serialnumber;

    private String shopid;

    private Integer uid;

    private Integer buynum;

    private String buydate;

    private String createtime;

    private String updtime;

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber == null ? null : serialnumber.trim();
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid == null ? null : shopid.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getBuynum() {
        return buynum;
    }

    public void setBuynum(Integer buynum) {
        this.buynum = buynum;
    }

    public String getBuydate() {
        return buydate;
    }

    public void setBuydate(String buydate) {
        this.buydate = buydate == null ? null : buydate.trim();
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