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
	
	public void add() {
	try {
//		��WebRoot���½�һ���ļ��У���Ϊupload����ȡ��ʵ��ַ
		String realPath=ServletActionContext.getServletContext().getRealPath("/upload");
		File file1=new File(realPath);
		if(!file1.exists())
		{
			file1.mkdirs();
		}
		File file=new File(realPath,newsImageFileName);

		//�����ļ�
		FileUtils.copyFile(newsImage, file);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		ActionContext.getContext().put("newsImageMessage", "ͼƬ�ϴ�ʧ��");
	}
	newsmessage.setNewsImageName(newsImageFileName);
	}
	
	public String addnewsMessage() {//�������
		add();
		newsMessageService newsservice=new newsMessageServiceImp();
		newsservice.addnewsMessage(newsmessage);
		return "addNewsMessage";
	}
	
}
