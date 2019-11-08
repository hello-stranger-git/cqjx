package cqjxBackstage.com.cqjx.web.Action;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.news;
import cqjxBackstage.com.cqjx.service.cpzxService;
import cqjxBackstage.com.cqjx.service.cpzxServiceImp;
import cqjxBackstage.com.cqjx.service.newsService;
import cqjxBackstage.com.cqjx.service.newsServiceImp;

public class cpzxAction extends ActionSupport implements ModelDriven<cpzx>{
	cpzx cpzx=new cpzx();
	
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
		
		cpzx.setCpzxImageName(cpzxImageFileName);
		
	}
	
	
	
	
	
	public String addCpzxIndex() {//Ĭ�Ͻ������
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> addCpzxIndex = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("addCpzxIndex", addCpzxIndex);
		return "addCpzxIndex";
	}
	
	
	public String addCplxIndex() {//Ĭ�Ͻ������
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> addCpzxIndex = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("addCpzxIndex", addCpzxIndex);
		return "addCplxIndex";
	}
	
	public String deleteCpzxIndex() {//Ĭ�Ͻ������
		return "deleteCpzxIndex";
	}
	
	public String addCpzx() {//��Ӳ�Ʒ��Ѷ�����Ϣ
		
		add();
		cpzxService cpzxservice=new cpzxServiceImp();
		cpzxservice.addcpzx(cpzx);
		return "addCpzx";
	}
	

	
	public String findCpzx() {//���Ҳ�Ʒ��Ѷ�����Ϣ
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> cpzxList = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("cpzxList", cpzxList);
		System.out.println(cpzxList);
		return "findCpzx";
	}
	
	
	public String updateCpzx() {//���²�Ʒ��Ѷ�����Ϣ
		cpzxService cpzxservice=new cpzxServiceImp();
		cpzxservice.updateCpzx(cpzx);
		return "updateCpzx";
	}
	
	
	
	public String findCpzxDelete() {//���Ҳ�Ʒ��Ѷ�����Ϣ
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> findCpzxDelete = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("findCpzxDelete", findCpzxDelete);
		System.out.println(findCpzxDelete);
		return "deleteCpzx";
	}
	
	public String deleteCpzx() {//���²�Ʒ��Ѷ�����Ϣ
		cpzxService cpzxservice=new cpzxServiceImp();
		cpzxservice.deleteCpzx(cpzx);
		return "deleteCpzxIndex";
	}
	
	@Override
	public cpzx getModel() {
		// TODO Auto-generated method stub
		return cpzx;
	}

}
