package cqjxBackstage.com.cqjx.domain;

public class news {
private String uuid;
private String newstype;
private String newscontent;

private String newsImage;

public String getNewsImage() {
	return newsImage;
}
public void setNewsImage(String newsImage) {
	this.newsImage = newsImage;
}

@Override
public String toString() {
	return "news [uuid=" + uuid + ", newstype=" + newstype + ", newscontent=" + newscontent + ", newsImage=" + newsImage
			+ "]";
}


public news() {
//	super();
	// TODO Auto-generated constructor stub
}
public news(String uuid, String newstype, String newscontent,String newsImage) {
//	super();
	this.uuid = uuid;
	this.newstype = newstype;
	this.newscontent = newscontent;
	this.newsImage = newsImage;
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
