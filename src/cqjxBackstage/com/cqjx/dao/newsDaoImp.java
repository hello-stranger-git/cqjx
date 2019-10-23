package cqjxBackstage.com.cqjx.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cqjxBackstage.com.cqjx.domain.news;
import cqjxBackstage.com.cqjx.web.util.HibernateUtils;

public class newsDaoImp implements newsDao {

	@Override
	public void addnews(news news) {
		// TODO Auto-generated method stub
		System.out.println("add news");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		session.save(news);
		
		tx.commit();
	}

	@Override
	public List<news> findNews() {
		// TODO Auto-generated method stub
		System.out.println("findNews");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from news";
		Query query = session.createQuery(hql);
		List<news> newsList=query.list();
		
		
		tx.commit();
		return newsList;
	}

	@Override
	public void updateNews(news news) {
		// TODO Auto-generated method stub
		System.out.println("updateNews");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from news where newstype=?";
		Query query = session.createQuery(hql);
		query.setString(0, news.getNewstype());
		news newsResult= (news)query.uniqueResult();
		newsResult.setNewscontent(news.getNewscontent());
		session.update(newsResult);
		
		tx.commit();		
	}

	@Override
	public void deleteNews(news news) {
		// TODO Auto-generated method stub
		System.out.println("deleteNews");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from news where uuid=?";
		Query query = session.createQuery(hql);
		query.setString(0, news.getUuid());
		news newsResult=(news)query.uniqueResult();
		session.delete(newsResult);
		
		tx.commit();	
	}

	@Override
	public List<news> findNewsMessag(news news) {
		// TODO Auto-generated method stub
		System.out.println("findNews");
		Session session=HibernateUtils.getCurrentSession();
		Transaction tx=session.beginTransaction();
		
		String hql="from news where uuid=?";
		Query query = session.createQuery(hql);
		query.setString(0, news.getUuid());
		List<news> newsMessageResult=query.list();
		
		
		tx.commit();
		return newsMessageResult;
	}

}
