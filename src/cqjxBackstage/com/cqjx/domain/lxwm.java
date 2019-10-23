package cqjxBackstage.com.cqjx.domain;

public class lxwm {
	private String uuid;
	private String lxwm;
	@Override
	public String toString() {
		return "lxwm [uuid=" + uuid + ", lxwm=" + lxwm + "]";
	}
	public lxwm(String uuid, String lxwm) {
		super();
		this.uuid = uuid;
		this.lxwm = lxwm;
	}
	public lxwm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getLxwm() {
		return lxwm;
	}
	public void setLxwm(String lxwm) {
		this.lxwm = lxwm;
	}
	
}
