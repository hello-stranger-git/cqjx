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
		
		cpzx.setCpzxImageName(cpzxImageFileName);
		
	}
	
	
	
	
	
	public String addCpzxIndex() {//默认进入界面
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> addCpzxIndex = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("addCpzxIndex", addCpzxIndex);
		return "addCpzxIndex";
	}
	
	
	public String addCplxIndex() {//默认进入界面
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> addCpzxIndex = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("addCpzxIndex", addCpzxIndex);
		return "addCplxIndex";
	}
	
	public String deleteCpzxIndex() {//默认进入界面
		return "deleteCpzxIndex";
	}
	
	public String addCpzx() {//添加产品资讯相关信息
		
		add();
		cpzxService cpzxservice=new cpzxServiceImp();
		cpzxservice.addcpzx(cpzx);
		return "addCpzx";
	}
	

	
	public String findCpzx() {//查找产品资讯相关信息
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> cpzxList = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("cpzxList", cpzxList);
		System.out.println(cpzxList);
		return "findCpzx";
	}
	
	
	public String updateCpzx() {//更新产品资讯相关信息
		cpzxService cpzxservice=new cpzxServiceImp();
		cpzxservice.updateCpzx(cpzx);
		return "updateCpzx";
	}
	
	
	
	public String findCpzxDelete() {//查找产品资讯相关信息
		cpzxService cpzxservice=new cpzxServiceImp();
		List<cpzx> findCpzxDelete = cpzxservice.findCpzx();
		ServletActionContext.getRequest().setAttribute("findCpzxDelete", findCpzxDelete);
		System.out.println(findCpzxDelete);
		return "deleteCpzx";
	}
	
	public String deleteCpzx() {//更新产品资讯相关信息
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
