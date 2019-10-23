package cqjxBackstage.com.cqjx.web.Action;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cqjxBackstage.com.cqjx.domain.rczp;
import cqjxBackstage.com.cqjx.service.rczpService;
import cqjxBackstage.com.cqjx.service.rczpServiceImp;

public class rczpAction extends ActionSupport implements ModelDriven<rczp>{
	rczp rczp=new rczp();
	
	private File rczpImage;  //�ϴ�ͼƬ�ļ�
	private String rczpImageContentType; //�ϴ�ͼƬ����
	private String rczpImageFileName; //�ϴ�ͼƬ�ļ���


	public File getRczpImage() {
		return rczpImage;
	}
	public void setRczpImage(File rczpImage) {
		this.rczpImage = rczpImage;
	}
	public String getRczpImageContentType() {
		return rczpImageContentType;
	}
	public void setRczpImageContentType(String rczpImageContentType) {
		this.rczpImageContentType = rczpImageContentType;
	}
	public String getRczpImageFileName() {
		return rczpImageFileName;
	}
	public void setRczpImageFileName(String rczpImageFileName) {
		this.rczpImageFileName = rczpImageFileName;
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
		File file=new File(realPath,rczpImageFileName);

		//�����ļ�
		FileUtils.copyFile(rczpImage, file);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		ActionContext.getContext().put("rczpImageMessage", "ͼƬ�ϴ�ʧ��");
	}
	rczp.setRczpImageName(rczpImageFileName);
	}	
	
	
	
	
	
	
	
	
	public String addrczp() {//����˲���Ƹ
		add();
		rczpService rczpservice=new rczpServiceImp();
		rczpservice.addrczp(rczp);
		return "addRczp";
	}
	public String addRczpIndex() {//Ĭ�Ͻ������
		return "addRczpIndex";
	}
	
	public String deleteRczpIndex() {//Ĭ�Ͻ������
		return "deleteRczpIndex";
	}
	
	public String findRczp() {//�����˲���Ƹ
		rczpService rczpservice=new rczpServiceImp();
		List<rczp> rczpList = rczpservice.findRczp();
		System.out.println(rczpList);
		ServletActionContext.getRequest().setAttribute("rczpList", rczpList);
		return "findRczp";
		
	}
	
	
	public String findRczpDelete() {//�����˲���Ƹ
		rczpService rczpservice=new rczpServiceImp();
		List<rczp> findRczpDelete = rczpservice.findRczp();
		System.out.println(findRczpDelete);
		ServletActionContext.getRequest().setAttribute("findRczpDelete", findRczpDelete);
		return "deleteRczp";
		
	}
	
	public String updateRczp() {//�����˲���Ƹ
		rczpService rczpservice=new rczpServiceImp();
		rczpservice.updateRczp(rczp);
		return "updateRczp";
		
	}
	
	
	public String deleteRczp() {//ɾ���˲���Ƹ
		rczpService rczpservice=new rczpServiceImp();
		rczpservice.deleteRczp(rczp);
		return "deleteRczpIndex";
		
	}

	@Override
	public rczp getModel() {
		// TODO Auto-generated method stub
		return rczp;
	}
}
