package com.zhangbohua.bean;

public class Kind {
	private Integer kid;
	private String kname;
	public Integer getKid() {
		return kid;
	}
	public void setKid(Integer kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	@Override
	public String toString() {
		return "Kind [kid=" + kid + ", kname=" + kname + "]";
	}
	public Kind() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kind(Integer kid, String kname) {
		super();
		this.kid = kid;
		this.kname = kname;
	}

	
	
}
