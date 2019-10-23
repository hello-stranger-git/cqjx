package cqjxBackstage.com.cqjx.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cqjxBackstage.com.cqjx.domain.gsfl;
import cqjxBackstage.com.cqjx.web.util.HibernateUtils;

public class gsflDaoImp implements gsflDao {

	@Override
	public void updategsfl(gsfl gsfl) {
		// TODO Auto-generated method stub
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
//		session.save(gsfl);
		String hql="from gsfl";
		Query query = session.createQuery(hql);
		gsfl result = (gsfl)query.uniqueResult();
		result.setGsfl(gsfl.getGsfl());;
		
		session.update(result);
//		
		tx.commit();
	}

	@Override
	public gsfl findGsfl() {
		// TODO Auto-generated method stub
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from gsfl";
		Query query = session.createQuery(hql);
		
		gsfl gsfl=(gsfl)query.uniqueResult(); 
		
		tx.commit();
		return gsfl;
	}



}
