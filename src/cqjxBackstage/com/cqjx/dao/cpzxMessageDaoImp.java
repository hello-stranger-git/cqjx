package cqjxBackstage.com.cqjx.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.cpzxMessage;
import cqjxBackstage.com.cqjx.web.util.HibernateUtils;

public class cpzxMessageDaoImp implements cpzxMessageDao {

	@Override
	public void addcpzxMessage(cpzxMessage cpzxmessage) {
		// TODO Auto-generated method stub
		System.out.println("addcpzxMessage");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.save(cpzxmessage);
		
		tx.commit();
	}

	@Override
	public void deleteCpzxMessage(cpzx cpzx) {
		// TODO Auto-generated method stub
		System.out.println("deleteCpzxMessage");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String sql="delete from cpzxMessage where cplxtype=?";
		Query query = session.createQuery(sql);
		query.setString(0, cpzx.getCplxtype());
		query.executeUpdate();
//		tx.commit();
	}

	@Override
	public List<cpzxMessage> findCplx(cpzxMessage cpzxmessage) {
		// TODO Auto-generated method stub
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from cpzxMessage where cplxtype=?";
		Query query = session.createQuery(hql);
		query.setString(0, cpzxmessage.getCplxtype());
		List<cpzxMessage> cpzxList=query.list();
		
		tx.commit();
		return cpzxList;
	}

	@Override
	public List<cpzxMessage> findCplxUuid(cpzxMessage cpzxmessage) {
		// TODO Auto-generated method stub
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from cpzxMessage where uuid=?";
		Query query = session.createQuery(hql);
		query.setString(0, cpzxmessage.getUuid());
		List<cpzxMessage> cpzxList=query.list();
		
		tx.commit();
		return cpzxList;
	}



}
