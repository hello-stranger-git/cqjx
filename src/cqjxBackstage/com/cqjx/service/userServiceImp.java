package cqjxBackstage.com.cqjx.service;

import java.util.List;

import cqjxBackstage.com.cqjx.dao.userDao;
import cqjxBackstage.com.cqjx.dao.userDaoImp;
import cqjxBackstage.com.cqjx.domain.user;

public class userServiceImp implements userService {

	@Override
	public void regist(user user) {
		// TODO Auto-generated method stub
		userDao userDao=new userDaoImp();
		userDao.regist(user);
		
	}

	@Override
	public user singIn(user user) {
		// TODO Auto-generated method stub
		userDao userdao=new userDaoImp();
		return userdao.singIn(user);
	}

}
