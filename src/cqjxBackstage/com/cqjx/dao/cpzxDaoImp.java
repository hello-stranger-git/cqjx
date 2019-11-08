package cqjxBackstage.com.cqjx.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.cpzxMessage;
import cqjxBackstage.com.cqjx.service.cpzxMessageService;
import cqjxBackstage.com.cqjx.service.cpzxMessageServiceImp;
import cqjxBackstage.com.cqjx.web.util.HibernateUtils;

public class cpzxDaoImp implements cpzxDao{

//	@Override
//	public void update(cpzx cpzx) {//更新产品资讯
		// TODO Auto-generated method stub
//		System.out.println("update cpzx");
//		Session session=HibernateUtils.getCurrentSession();
//		Transaction tx=session.beginTransaction();
////		session.save(cpzx);
//		String hql="from cpzx";
//		Query query = session.createQuery(hql);
//		cpzx result=(cpzx)query.uniqueResult();
//		
//		result.setCpzx(cpzx.getCpzx());
//		session.update(result);
//		
//		tx.commit();
		
//	}

	@Override
	public void addcpzx(cpzx cpzx) {
		// TODO Auto-generated method stub
		System.out.println("add cpzx");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.save(cpzx);
		
		tx.commit();
	}

	@Override
	public List<cpzx> findCpzx() {
		// TODO Auto-generated method stub
		System.out.println("findCpzx");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from cpzx";
		Query query = session.createQuery(hql);
		
		List<cpzx> cpzxList=query.list();
		
		tx.commit();
		return cpzxList;
	}

	@Override
	public void updateCpzx(cpzx cpzx) {
		// TODO Auto-generated method stub
		System.out.println("updateCpzx");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from cpzx where cplxtype=?";
		Query query = session.createQuery(hql);
		query.setString(0, cpzx.getCplxtype());
		
		cpzx cpzxResult=(cpzx)query.uniqueResult();
		cpzxResult.setCplxcontent(cpzx.getCplxcontent());
		session.update(cpzxResult);
		
		tx.commit();
	}

	@Override
	public void deleteCpzx(cpzx cpzx) {
		// TODO Auto-generated method stub
		System.out.println("updateCpzx");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from cpzx where uuid=?";
		Query query = session.createQuery(hql);
		query.setString(0, cpzx.getUuid());
		
		cpzx cpzxResult=(cpzx)query.uniqueResult();
		session.delete(cpzxResult);
		
		cpzxMessageDao cpzxmessagedao=new cpzxMessageDaoImp();
		cpzxmessagedao.deleteCpzxMessage(cpzx);
		tx.commit();
	}

	@Override
	public List<cpzx> findCpzxMessage(cpzx cpzx) {
		// TODO Auto-generated method stub
		System.out.println("findCpzxMessage");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from cpzx where uuid=?";
		Query query = session.createQuery(hql);
		query.setString(0, cpzx.getUuid());
		List<cpzx> cpzxList=query.list();
		tx.commit();
		return cpzxList;
	}


	
	
	

}
