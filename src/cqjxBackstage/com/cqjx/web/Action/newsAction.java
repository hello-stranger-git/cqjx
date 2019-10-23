package cqjxBackstage.com.cqjx.web.Action;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.news;
import cqjxBackstage.com.cqjx.service.newsService;
import cqjxBackstage.com.cqjx.service.newsServiceImp;

public class newsAction extends ActionSupport implements ModelDriven<news>{
	
//	����ͼƬ
	private File newsImage;  //�ϴ�ͼƬ�ļ�
	private String newsImageContentType; //�ϴ�ͼƬ����
	private String newsImageFileName; //�ϴ�ͼƬ�ļ���
	
	
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
	
	public String add() {
		try {
//			��WebRoot���½�һ���ļ��У���Ϊupload����ȡ��ʵ��ַ
			String realPath=ServletActionContext.getServletContext().getRealPath("/upload");
//			File file1=new File(realPath);
//            if(!file1.exists()){ 
//
//                file1.mkdir(); 
//
//            }
			File file=new File(realPath,newsImageFileName);


			//�����ļ�
			FileUtils.copyFile(newsImage, file);
		} catch (Exception e) {
			// TODO: handle exception
			ActionContext.getContext().put("newsImageMessage", "ͼƬ�ϴ�ʧ��");
			return "newsImageMessage_falid";
		}
		news.setNewsImage(newsImageFileName);
		ActionContext.getContext().put("newsImageMessage", "ͼƬ�ϴ��ɹ�");
		return "newsImageMessage_success";
	}
	
	
	

	news news=new news();
	public String addnews() {//��������
		add();
		newsService newsservice=new newsServiceImp();
		newsservice.addnews(news);
		return "addnews";
	}
	public String addNewsIndex() {//Ĭ�Ͻ������
		return "addNewsIndex";
	}
	
	public String deleteNewsIndex() {//Ĭ�Ͻ������
		return "deleteNewsIndex";
	}
	
	public String findNews() {//��������
		newsService newsservice=new newsServiceImp();
		List<news> newsList = newsservice.findNews();
		System.out.println(newsList);
		ServletActionContext.getRequest().setAttribute("newsList", newsList);
		return "findNews";
		
	}
	
	
	public String findNewsDelete() {//��������
		newsService newsservice=new newsServiceImp();
		List<news> findNewsDelete = newsservice.findNews();
		System.out.println(findNewsDelete);
		ServletActionContext.getRequest().setAttribute("findNewsDelete", findNewsDelete);
		return "deleteNews";
		
	}
	
	public String updateNews() {//��������
		newsService newsservice=new newsServiceImp();
		newsservice.updateNews(news);
		return "updateNews";
		
	}
	
	
	public String deleteNews() {//ɾ������
		newsService newsservice=new newsServiceImp();
		newsservice.deleteNews(news);
//		System.out.println(newsList);
//		ServletActionContext.getRequest().setAttribute("newsList", newsList);
		return "deleteNewsIndex";
		
	}

	@Override
	public news getModel() {
		// TODO Auto-generated method stub
		return news;
	}
}