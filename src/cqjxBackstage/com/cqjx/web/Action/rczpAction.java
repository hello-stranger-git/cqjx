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
	
	private File rczpImage;  //上传图片文件
	private String rczpImageContentType; //上传图片种类
	private String rczpImageFileName; //上传图片文件名


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
//		在WebRoot下新建一个文件夹，名为upload，获取真实地址
		String realPath=ServletActionContext.getServletContext().getRealPath("/upload");
		File file1=new File(realPath);
		if(!file1.exists())
		{
			file1.mkdirs();
		}
		File file=new File(realPath,rczpImageFileName);

		//复制文件
		FileUtils.copyFile(rczpImage, file);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		ActionContext.getContext().put("rczpImageMessage", "图片上传失败");
	}
	rczp.setRczpImageName(rczpImageFileName);
	}	
	
	
	
	
	
	
	
	
	public String addrczp() {//添加人才招聘
		add();
		rczpService rczpservice=new rczpServiceImp();
		rczpservice.addrczp(rczp);
		return "addRczp";
	}
	public String addRczpIndex() {//默认进入界面
		return "addRczpIndex";
	}
	
	public String deleteRczpIndex() {//默认进入界面
		return "deleteRczpIndex";
	}
	
	public String findRczp() {//查找人才招聘
		rczpService rczpservice=new rczpServiceImp();
		List<rczp> rczpList = rczpservice.findRczp();
		System.out.println(rczpList);
		ServletActionContext.getRequest().setAttribute("rczpList", rczpList);
		return "findRczp";
		
	}
	
	
	public String findRczpDelete() {//查找人才招聘
		rczpService rczpservice=new rczpServiceImp();
		List<rczp> findRczpDelete = rczpservice.findRczp();
		System.out.println(findRczpDelete);
		ServletActionContext.getRequest().setAttribute("findRczpDelete", findRczpDelete);
		return "deleteRczp";
		
	}
	
	public String updateRczp() {//更新人才招聘
		rczpService rczpservice=new rczpServiceImp();
		rczpservice.updateRczp(rczp);
		return "updateRczp";
		
	}
	
	
	public String deleteRczp() {//删除人才招聘
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
