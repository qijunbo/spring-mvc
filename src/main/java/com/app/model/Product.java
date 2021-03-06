package com.app.model;

import java.io.Serializable;

public class Product implements Serializable{
    private String id;

    private String proname;

    private String uname;

    private Integer buycount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Integer getBuycount() {
        return buycount;
    }

    public void setBuycount(Integer buycount) {
        this.buycount = buycount;
    }

	@Override
	public String toString() {
		return "Product [id=" + id + ", proname=" + proname + ", uname=" + uname + ", buycount=" + buycount + "]";
	}
    
}