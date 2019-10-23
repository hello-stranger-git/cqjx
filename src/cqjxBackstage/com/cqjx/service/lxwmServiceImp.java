package cqjxBackstage.com.cqjx.service;

import cqjxBackstage.com.cqjx.dao.lxwmDao;
import cqjxBackstage.com.cqjx.dao.lxwmDaoImp;
import cqjxBackstage.com.cqjx.domain.lxwm;

public class lxwmServiceImp implements lxwmService {

	@Override
	public void updatelxwm(lxwm lxwm) {
		// TODO Auto-generated method stub
		lxwmDao lxwmdao=new lxwmDaoImp();
		lxwmdao.update(lxwm);
	}

	@Override
	public lxwm findlxwm() {
		// TODO Auto-generated method stub
		lxwmDao lxwmdao=new lxwmDaoImp();
		
		return lxwmdao.findLxwm();
	}

}
