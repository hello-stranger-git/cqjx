package cqjxBackstage.com.cqjx.service;

import java.util.List;

import cqjxBackstage.com.cqjx.dao.cpzxDao;
import cqjxBackstage.com.cqjx.dao.cpzxDaoImp;
import cqjxBackstage.com.cqjx.domain.cpzx;

public class cpzxServiceImp implements cpzxService {

	@Override
	public void addcpzx(cpzx cpzx) {
		// TODO Auto-generated method stub
		cpzxDao cpzxdao=new cpzxDaoImp();
		cpzxdao.addcpzx(cpzx);
	}

	@Override
	public List<cpzx> findCpzx() {
		// TODO Auto-generated method stub
		cpzxDao cpzxdao=new cpzxDaoImp();
		return cpzxdao.findCpzx();
	}

	@Override
	public void updateCpzx(cpzx cpzx) {
		// TODO Auto-generated method stub
		cpzxDao cpzxdao=new cpzxDaoImp();
		cpzxdao.updateCpzx(cpzx);		
	}

	@Override
	public void deleteCpzx(cpzx cpzx) {
		// TODO Auto-generated method stub
		cpzxDao cpzxdao=new cpzxDaoImp();
		cpzxdao.deleteCpzx(cpzx);	
	}

	@Override
	public List<cpzx> findCpzxMessage(cpzx cpzx) {
		// TODO Auto-generated method stub
		cpzxDao cpzxdao=new cpzxDaoImp();
		return cpzxdao.findCpzxMessage(cpzx);
	}


}
