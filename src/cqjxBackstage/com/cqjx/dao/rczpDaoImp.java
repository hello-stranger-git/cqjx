package cqjxBackstage.com.cqjx.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cqjxBackstage.com.cqjx.domain.news;
import cqjxBackstage.com.cqjx.domain.rczp;
import cqjxBackstage.com.cqjx.web.util.HibernateUtils;

public class rczpDaoImp implements rczpDao {

	@Override
	public void addrczp(rczp rczp) {
		// TODO Auto-generated method stub
		System.out.println("add rczp");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.save(rczp);
		
		tx.commit();
	}

	@Override
	public List<rczp> findRczp() {
		// TODO Auto-generated method stub
		System.out.println("findRczp");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from rczp";
		Query query = session.createQuery(hql);
		List<rczp> rczpList=query.list();
		
		
		tx.commit();
		return rczpList;
	}
	
	@Override
	public void updateRczp(rczp rczp) {
		// TODO Auto-generated method stub
		System.out.println("updateRczp");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from rczp where rczptype=?";
		Query query = session.createQuery(hql);
		query.setString(0, rczp.getRczptype());
		rczp rczpResult= (rczp)query.uniqueResult();
		rczpResult.setRczpcontent(rczp.getRczpcontent());
		session.update(rczpResult);
		
		tx.commit();		
	}
	
	
	@Override
	public void deleteRczp(rczp rczp) {
		// TODO Auto-generated method stub
		System.out.println("deleteRczp");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from rczp where uuid=?";
		Query query = session.createQuery(hql);
		query.setString(0, rczp.getUuid());
		rczp rczpResult=(rczp)query.uniqueResult();
		session.delete(rczpResult);
		
		tx.commit();	
	}

	@Override
	public List<rczp> findRczpMessage(rczp rczp) {
		// TODO Auto-generated method stub
		System.out.println("findRczp");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from rczp where uuid=?";
		Query query = session.createQuery(hql);
		query.setString(0, rczp.getUuid());
		List<rczp> rczpList=query.list();
		
		
		tx.commit();
		return rczpList;
	}

}
