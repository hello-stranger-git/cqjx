package cqjxBackstage.com.cqjx.web.Action;

import java.io.File;import java.util.List;


import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.news;
import cqjxBackstage.com.cqjx.service.newsService;
import cqjxBackstage.com.cqjx.service.newsServiceImp;

public class newsAction extends ActionSupport implements ModelDriven<news>{
	
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
	news.setNewsImageName(newsImageFileName);
	}
	
	
	

	news news=new news();
	public String addnews() {//添加新闻
		add();
		newsService newsservice=new newsServiceImp();
		newsservice.addnews(news);
		return "addnews";
	}
	public String addNewsIndex() {//默认进入界面
		newsService newsservice=new newsServiceImp();
		List<news> addNewsIndex = newsservice.findNews();
		ServletActionContext.getRequest().setAttribute("addNewsIndex", addNewsIndex);

		return "addNewsIndex";
	}
	
	
	public String addNewslxIndex() {//默认进入界面
		newsService newsservice=new newsServiceImp();
		List<news> addNewsIndex = newsservice.findNews();
		ServletActionContext.getRequest().setAttribute("addNewsIndex", addNewsIndex);

		return "addNewslxIndex";
	}
	
	public String deleteNewsIndex() {//默认进入界面
		return "deleteNewsIndex";
	}
	
	public String findNews() {//查找新闻
		newsService newsservice=new newsServiceImp();
		List<news> newsList = newsservice.findNews();
		System.out.println(newsList);
		ServletActionContext.getRequest().setAttribute("newsList", newsList);
		return "findNews";
		
	}
	
	
	public String findNewsDelete() {//查找新闻
		newsService newsservice=new newsServiceImp();
		List<news> findNewsDelete = newsservice.findNews();
		System.out.println(findNewsDelete);
		ServletActionContext.getRequest().setAttribute("findNewsDelete", findNewsDelete);
		return "deleteNews";
		
	}
	
	public String updateNews() {//更新新闻
		newsService newsservice=new newsServiceImp();
		newsservice.updateNews(news);
		return "updateNews";
		
	}
	
	
	public String deleteNews() {//删除新闻
		newsService newsservice=new newsServiceImp();
		newsservice.deleteNews(news);
		return "deleteNewsIndex";
		
	}
	
	

	@Override
	public news getModel() {
		// TODO Auto-generated method stub
		return news;
	}
}
