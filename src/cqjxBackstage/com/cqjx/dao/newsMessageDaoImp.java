package cqjxBackstage.com.cqjx.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.cpzxMessage;
import cqjxBackstage.com.cqjx.domain.news;
import cqjxBackstage.com.cqjx.domain.newsMessage;
import cqjxBackstage.com.cqjx.web.util.HibernateUtils;

public class newsMessageDaoImp implements newsMessageDao {

	@Override
	public void addnewsMessage(newsMessage newsmessage) {
		// TODO Auto-generated method stub
		System.out.println("addcpzxMessage");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.save(newsmessage);
		
		tx.commit();
	}

	@Override
	public void deleteNewsMessage(news news) {
		// TODO Auto-generated method stub
		System.out.println("deleteCpzxMessage");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String sql="delete from newsMessage where newstype=?";
		Query query = session.createQuery(sql);
		query.setString(0, news.getNewstype());
		query.executeUpdate();
	}

	@Override
	public List<newsMessage> findNewsUuid(newsMessage newsmessage) {
		// TODO Auto-generated method stub
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from newsMessage where uuid=?";
		Query query = session.createQuery(hql);
		query.setString(0, newsmessage.getUuid());
		List<newsMessage> newsList=query.list();
		
		tx.commit();
		return newsList;
	}

	@Override
	public List<newsMessage> findNews(newsMessage newsmessage) {
		// TODO Auto-generated method stub
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from newsMessage where newstype=?";
		Query query = session.createQuery(hql);
		query.setString(0, newsmessage.getNewstype());
		List<newsMessage> newsList=query.list();
		
		tx.commit();
		return newsList;
	}
	public List<newsMessage> findNewsMessage() {
		// TODO Auto-generated method stub
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from newsMessage";
		Query query = session.createQuery(hql);
		List<newsMessage> newsList=query.list();
		
		tx.commit();
		return newsList;
	}
}
