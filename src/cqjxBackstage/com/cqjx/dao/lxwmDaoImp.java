package cqjxBackstage.com.cqjx.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cqjxBackstage.com.cqjx.domain.lxwm;
import cqjxBackstage.com.cqjx.web.util.HibernateUtils;

public class lxwmDaoImp implements lxwmDao {

	@Override
	public void update(lxwm lxwm) {
		// TODO Auto-generated method stub
		System.out.println("update lxwm");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
//		session.save(lxwm);
		String hql="from lxwm";
		Query query = session.createQuery(hql);
		lxwm result=(lxwm)query.uniqueResult();
		
		result.setLxwm(lxwm.getLxwm());
		session.update(result);
		
		tx.commit();
	}

	@Override
	public lxwm findLxwm() {
		// TODO Auto-generated method stub
		System.out.println("find lxwm");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from lxwm";
		Query query=session.createQuery(hql);
		
		lxwm result=(lxwm)query.uniqueResult();
		
		return result;
	}
	

}
