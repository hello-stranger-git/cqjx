package cqjxBackstage.com.cqjx.web.Action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.newsMessage;
import cqjxBackstage.com.cqjx.service.newsMessageService;
import cqjxBackstage.com.cqjx.service.newsMessageServiceImp;
import cqjxBackstage.com.cqjx.service.newsService;
import cqjxBackstage.com.cqjx.service.newsServiceImp;

public class newsMessageAction extends ActionSupport implements ModelDriven<newsMessage>{
	newsMessage newsmessage=new newsMessage();
	@Override
	public newsMessage getModel() {
		// TODO Auto-generated method stub
		return newsmessage;
	}
	
	
	
//	保存图片
	private File newsImage;  //上传图片文件
	private String newsImageContentType; //上传图片种类
	private String newsImageFileName; //上传图片文件名
	
	
	public File getNewsImage() {
		return newsImage;
	}
	public void setNewsImage(File newsImage) {
		this.newsImage = newsImage;
	}
	public String getNewsImageContentType() {
		return newsImageContentType;
	}
	public void setNewsImageContentType(String newsImageContentType) {
		this.newsImageContentType = newsImageContentType;
	}
	public String getNewsImageFileName() {
		return newsImageFileName;
	}
	public void setNewsImageFileName(String newsImageFileName) {
		this.newsImageFileName = newsImageFileName;
	}
	
	public void add() {
	try {
//		在WebRoot下新建一个文件夹，名为upload，获取真实地址
		String realPath=ServletActionContext.getServletContext().getRealPath("/upload");
		File file1=new File(realPath);
		if(!file1.exists())
		{
			file1.mkdirs();
		}
		File file=new File(realPath,newsImageFileName);

		//复制文件
		FileUtils.copyFile(newsImage, file);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		ActionContext.getContext().put("newsImageMessage", "图片上传失败");
	}
	newsmessage.setNewsImageName(newsImageFileName);
	}
	
	public String addnewsMessage() {//添加新闻
		add();
		newsMessageService newsservice=new newsMessageServiceImp();
		newsservice.addnewsMessage(newsmessage);
		return "addNewsMessage";
	}
	
}
