package cqjxBackstage.com.cqjx.service;

import java.util.List;

import cqjxBackstage.com.cqjx.dao.rczpDao;
import cqjxBackstage.com.cqjx.dao.rczpDaoImp;
import cqjxBackstage.com.cqjx.domain.rczp;

public class rczpServiceImp implements rczpService {

	@Override
	public void addrczp(rczp rczp) {
		// TODO Auto-generated method stub
		rczpDao rczpdao = new rczpDaoImp();
		rczpdao.addrczp(rczp);
	}

	@Override
	public List<rczp> findRczp() {
		// TODO Auto-generated method stub
		rczpDao rczpdao = new rczpDaoImp();
		return rczpdao.findRczp();
	}

	@Override
	public void updateRczp(rczp rczp) {
		// TODO Auto-generated method stub
		rczpDao rczpdao = new rczpDaoImp();
		rczpdao.updateRczp(rczp);		
	}

	@Override
	public void deleteRczp(rczp rczp) {
		// TODO Auto-generated method stub
		rczpDao rczpdao = new rczpDaoImp();
		rczpdao.deleteRczp(rczp);			
	}

	@Override
	public List<rczp> findRczpMessage(rczp rczp) {
		// TODO Auto-generated method stub
		rczpDao rczpdao = new rczpDaoImp();
		return rczpdao.findRczpMessage(rczp);
	}



}
