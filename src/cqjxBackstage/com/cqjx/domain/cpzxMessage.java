package cqjxBackstage.com.cqjx.domain;

public class cpzxMessage {
	private String uuid;
	private String cplxtype;
	private String cplxname;
	private String cplxcontent;
	private String cpzxImageName;

	public String getCplxname() {
		return cplxname;
	}
	public void setCplxname(String cplxname) {
		this.cplxname = cplxname;
	}
	
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
	public cpzxMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public cpzxMessage(String uuid, String cplxtype, String cplxcontent) {
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

