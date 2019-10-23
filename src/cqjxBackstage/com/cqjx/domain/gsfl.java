package cqjxBackstage.com.cqjx.domain;

public class gsfl {
	private String uuid;
	private String gsfl;
	@Override
	public String toString() {
		return "gsfl [uuid=" + uuid + ", gsfl=" + gsfl + "]";
	}
	public gsfl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public gsfl(String uuid, String gsfl) {
		super();
		this.uuid = uuid;
		this.gsfl = gsfl;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getGsfl() {
		return gsfl;
	}
	public void setGsfl(String gsfl) {
		this.gsfl = gsfl;
	}
	
}
