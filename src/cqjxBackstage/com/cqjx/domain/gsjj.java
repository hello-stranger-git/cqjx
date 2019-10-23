package cqjxBackstage.com.cqjx.domain;

public class gsjj {
	private String uuid;
	private String gsjj;
	@Override
	public String toString() {
		return "gsjj [uuid=" + uuid + ", gsjj=" + gsjj + "]";
	}
	public gsjj() {
		super();
		// TODO Auto-generated constructor stub
	}
	public gsjj(String uuid, String gsjj) {
		super();
		this.uuid = uuid;
		this.gsjj = gsjj;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getGsjj() {
		return gsjj;
	}
	public void setGsjj(String gsjj) {
		this.gsjj = gsjj;
	}
}
