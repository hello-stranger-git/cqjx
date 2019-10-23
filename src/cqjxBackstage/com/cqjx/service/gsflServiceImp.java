package cqjxBackstage.com.cqjx.service;

import java.util.List;

import cqjxBackstage.com.cqjx.dao.gsflDao;
import cqjxBackstage.com.cqjx.dao.gsflDaoImp;
import cqjxBackstage.com.cqjx.domain.gsfl;

public class gsflServiceImp implements gsflService {

	@Override
	public void updategsfl(gsfl gsfl) {
		// TODO Auto-generated method stub
		gsflDao gsfldao=new gsflDaoImp();
		gsfldao.updategsfl(gsfl);
	}

	@Override
	public gsfl findGsfl() {
		// TODO Auto-generated method stub
		gsflDao gsfldao=new gsflDaoImp();
		
		return gsfldao.findGsfl();
	}


}
