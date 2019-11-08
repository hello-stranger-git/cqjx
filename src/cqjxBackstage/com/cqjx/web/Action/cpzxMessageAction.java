package cqjxBackstage.com.cqjx.web.Action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.cpzxMessage;
import cqjxBackstage.com.cqjx.service.cpzxMessageService;
import cqjxBackstage.com.cqjx.service.cpzxMessageServiceImp;
import cqjxBackstage.com.cqjx.service.cpzxService;
import cqjxBackstage.com.cqjx.service.cpzxServiceImp;

public class cpzxMessageAction extends ActionSupport implements ModelDriven<cpzxMessage>{
	cpzxMessage cpzxmessage=new cpzxMessage();
	@Override
	public cpzxMessage getModel() {
		// TODO Auto-generated method stub
		return cpzxmessage;
	}

	
//	����ͼƬ
	private File cpzxImage;  //�ϴ�ͼƬ�ļ�
	private String cpzxImageContentType; //�ϴ�ͼƬ����
	private String cpzxImageFileName; //�ϴ�ͼƬ�ļ���
	public File getCpzxImage() {
		return cpzxImage;
	}

	public void setCpzxImage(File cpzxImage) {
		this.cpzxImage = cpzxImage;
	}

	public String getCpzxImageContentType() {
		return cpzxImageContentType;
	}

	public void setCpzxImageContentType(String cpzxImageContentType) {
		this.cpzxImageContentType = cpzxImageContentType;
	}

	public String getCpzxImageFileName() {
		return cpzxImageFileName;
	}

	public void setCpzxImageFileName(String cpzxImageFileName) {
		this.cpzxImageFileName = cpzxImageFileName;
	}

	

	public void add() {
		try {
//			��WebRoot���½�һ���ļ��У���Ϊupload����ȡ��ʵ��ַ
			String realPath=ServletActionContext.getServletContext().getRealPath("/upload");
			File file1=new File(realPath);
			if(!file1.exists())
			{
				file1.mkdirs();
			}
			File file=new File(realPath,cpzxImageFileName);

			//�����ļ�
			FileUtils.copyFile(cpzxImage, file);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			ActionContext.getContext().put("cpzxImageMessage", "ͼƬ�ϴ�ʧ��");
		}
		
		cpzxmessage.setCpzxImageName(cpzxImageFileName);
		
	}
	
	
	public String addCpzxMessage() {//��Ӳ�Ʒ��Ѷ�����Ϣ
		add();
		cpzxMessageService cpzxmessageService=new cpzxMessageServiceImp();
		cpzxmessageService.addcpzxMessage(cpzxmessage);
		return "addCpzxMessage";
	}
}
