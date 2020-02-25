package com.zhangbohua.bean;

public class Goods {
	private Integer gid;
	private String 	gname;
	private String 	ename;
	private Integer bid;
	private Integer kid;
	private Integer size;
	private double 	price;
	private Integer gnum;
	private String 	label;
	private String 	picurl;
	
	//附加属性
	private String bname;
	private String kname;
	private Integer sp;
	private Integer ep;
	
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getKid() {
		return kid;
	}
	public void setKid(Integer kid) {
		this.kid = kid;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getGnum() {
		return gnum;
	}
	public void setGnum(Integer gnum) {
		this.gnum = gnum;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getPicurl() {
		return picurl;
	}
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public Integer getSp() {
		return sp;
	}
	public void setSp(Integer sp) {
		this.sp = sp;
	}
	public Integer getEp() {
		return ep;
	}
	public void setEp(Integer ep) {
		this.ep = ep;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", ename=" + ename + ", bid=" + bid + ", kid=" + kid
				+ ", size=" + size + ", price=" + price + ", gnum=" + gnum + ", label=" + label + ", picurl=" + picurl
				+ ", bname=" + bname + ", kname=" + kname + ", sp=" + sp + ", ep=" + ep + "]";
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(Integer gid, String gname, String ename, Integer bid, Integer kid, Integer size, double price,
			Integer gnum, String label, String picurl, String bname, String kname, Integer sp, Integer ep) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.ename = ename;
		this.bid = bid;
		this.kid = kid;
		this.size = size;
		this.price = price;
		this.gnum = gnum;
		this.label = label;
		this.picurl = picurl;
		this.bname = bname;
		this.kname = kname;
		this.sp = sp;
		this.ep = ep;
	}
	
	
	
}
