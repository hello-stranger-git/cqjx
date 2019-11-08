package cqjxBackstage.com.cqjx.domain;

public class newsMessage {
	private String uuid;
	private String newstype;
	private String newscontent;

	private String newsImageName;
	
	private String newsname;


	public String getNewsname() {
		return newsname;
	}


	public void setNewsname(String newsname) {
		this.newsname = newsname;
	}


	public String getNewsImageName() {
		return newsImageName;
	}


	public void setNewsImageName(String newsImageName) {
		this.newsImageName = newsImageName;
	}


	@Override
	public String toString() {
		return "news [uuid=" + uuid + ", newstype=" + newstype + ", newscontent=" + newscontent + ", newsImage=";
	}


	public newsMessage() {
//		super();
		// TODO Auto-generated constructor stub
	}
	public newsMessage(String uuid, String newstype, String newscontent) {
//		super();
		this.uuid = uuid;
		this.newstype = newstype;
		this.newscontent = newscontent;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getNewstype() {
		return newstype;
	}
	public void setNewstype(String newstype) {
		this.newstype = newstype;
	}
	public String getNewscontent() {
		return newscontent;
	}
	public void setNewscontent(String newscontent) {
		this.newscontent = newscontent;
	}
}
