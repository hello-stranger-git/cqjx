package cqjxBackstage.com.cqjx.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import cqjxBackstage.com.cqjx.domain.user;
import cqjxBackstage.com.cqjx.web.util.HibernateUtils;

public class userDaoImp implements userDao {

	@Override
	public void regist(user user) {//ÓÃ»§×¢²á
		// TODO Auto-generated method stub
		System.out.println("regist");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		
		tx.commit();
	}

	@Override
	public user singIn(user user) {
		// TODO Auto-generated method stub
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("from user where username=? and password=?");
		query.setString(0, user.getUsername());
		query.setString(1, user.getPassword());
		List<user> list=query.list();
		if(list.size()>0){
			return list.get(0);
		}
		tx.commit();
		return null;
	}



}
