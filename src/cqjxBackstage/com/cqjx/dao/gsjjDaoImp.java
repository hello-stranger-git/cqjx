package cqjxBackstage.com.cqjx.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.gsjj;
import cqjxBackstage.com.cqjx.web.util.HibernateUtils;

public class gsjjDaoImp implements gsjjDao {


	@Override
	public void updategsjj(gsjj gsjj) {
		// TODO Auto-generated method stub
		System.out.println("更新公司简介");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
//		session.save(gsjj);
		String hql="from gsjj";
		Query query = session.createQuery(hql);
		
		gsjj result=(gsjj)query.uniqueResult();
		result.setGsjj(gsjj.getGsjj());
		session.update(result);;
		
		tx.commit();
	}

	@Override
	public gsjj findGsjj() {
		// TODO Auto-generated method stub
		System.out.println("findGsjj");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from gsjj";
		Query query = session.createQuery(hql);
		gsjj result=(gsjj)query.uniqueResult();
		
		
		tx.commit();
		
		return result;
	}

}
