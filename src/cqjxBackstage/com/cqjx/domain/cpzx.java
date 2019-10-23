package cqjxBackstage.com.cqjx.domain;

import java.util.Map;

public class cpzx {
	private String uuid;
	private String cplxtype;
	private String cplxcontent;
	private String cpzxImageName;
	public String getCpzxImageName() {
		return cpzxImageName;
	}
	public void setCpzxImageName(String cpzxImageName) {
		this.cpzxImageName = cpzxImageName;
	}
	@Override
	public String toString() {
		return "cpzx [uuid=" + uuid + ", cplxtype=" + cplxtype + ", cplxcontent=" + cplxcontent + "]";
	}
	public cpzx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public cpzx(String uuid, String cplxtype, String cplxcontent) {
		super();
		this.uuid = uuid;
		this.cplxtype = cplxtype;
		this.cplxcontent = cplxcontent;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getCplxtype() {
		return cplxtype;
	}
	public void setCplxtype(String cplxtype) {
		this.cplxtype = cplxtype;
	}
	public String getCplxcontent() {
		return cplxcontent;
	}
	public void setCplxcontent(String cplxcontent) {
		this.cplxcontent = cplxcontent;
	}

}
