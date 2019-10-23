package cqjxBackstage.com.cqjx.service;

import cqjxBackstage.com.cqjx.dao.gsjjDao;
import cqjxBackstage.com.cqjx.dao.gsjjDaoImp;
import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.gsjj;

public class gsjjServiceImp implements gsjjService {

	@Override
	public void updategsjj(gsjj gsjj) {
		// TODO Auto-generated method stub
		gsjjDao gsjjdao=new gsjjDaoImp();
		gsjjdao.updategsjj(gsjj);
	}

	@Override
	public gsjj findGsjj() {
		// TODO Auto-generated method stub
		gsjjDao gsjjdao=new gsjjDaoImp();

		return	gsjjdao.findGsjj();
	}

}
