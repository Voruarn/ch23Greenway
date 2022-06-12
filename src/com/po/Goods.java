package com.po;

import org.springframework.web.multipart.MultipartFile;

public class Goods {
	private Integer id;
	private String gname;
	private String gtype;
	private String gcategory;
	private String gfeatures;	
	
	private Double gprice;
	
	private Integer gstore;
	private MultipartFile logoImage;
	private String gpicture;

	public String getGtype() {
		return gtype;
	}
	
	public void setGtype(String gtype) {
		this.gtype=gtype;
	}
	
	public String getGcategory() {
		return gcategory;
	}
	
	public void setGcategory(String cg) {
		this.gcategory=cg;
	}
	
	public String getGfeatures() {
		return gfeatures;
	}
	
	public void setGfeatures(String gft) {
		this.gfeatures=gft;
	}	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Double getGprice() {
		return gprice;
	}
	public void setGprice(Double gprice) {
		this.gprice = gprice;
	}
	
	public Integer getGstore() {
		return gstore;
	}
	public void setGstore(Integer gstore) {
		this.gstore = gstore;
	}
	public MultipartFile getLogoImage() {
		return logoImage;
	}
	public void setLogoImage(MultipartFile logoImage) {
		this.logoImage = logoImage;
	}
	public String getGpicture() {
		return gpicture;
	}
	public void setGpicture(String gpicture) {
		this.gpicture = gpicture;
	}
	
	
}
