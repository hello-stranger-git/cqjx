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

	
//	保存图片
	private File cpzxImage;  //上传图片文件
	private String cpzxImageContentType; //上传图片种类
	private String cpzxImageFileName; //上传图片文件名
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
//			在WebRoot下新建一个文件夹，名为upload，获取真实地址
			String realPath=ServletActionContext.getServletContext().getRealPath("/upload");
			File file1=new File(realPath);
			if(!file1.exists())
			{
				file1.mkdirs();
			}
			File file=new File(realPath,cpzxImageFileName);

			//复制文件
			FileUtils.copyFile(cpzxImage, file);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			ActionContext.getContext().put("cpzxImageMessage", "图片上传失败");
		}
		
		cpzxmessage.setCpzxImageName(cpzxImageFileName);
		
	}
	
	
	public String addCpzxMessage() {//添加产品资讯相关信息
		add();
		cpzxMessageService cpzxmessageService=new cpzxMessageServiceImp();
		cpzxmessageService.addcpzxMessage(cpzxmessage);
		return "addCpzxMessage";
	}
}
