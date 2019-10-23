package cqjxBackstage.com.cqjx.service;

import java.util.List;

import cqjxBackstage.com.cqjx.dao.newsDao;
import cqjxBackstage.com.cqjx.dao.newsDaoImp;
import cqjxBackstage.com.cqjx.domain.news;

public class newsServiceImp implements newsService {

	@Override
	public void addnews(news news) {
		// TODO Auto-generated method stub
		newsDao newsdao = new newsDaoImp();
		newsdao.addnews(news);
	}

	@Override
	public List<news> findNews() {
		// TODO Auto-generated method stub
		newsDao newsdao = new newsDaoImp();
		
		return newsdao.findNews();
	}

	@Override
	public void updateNews(news news) {
		// TODO Auto-generated method stub
		newsDao newsdao = new newsDaoImp();
		newsdao.updateNews(news);		
	}

	@Override
	public void deleteNews(news news) {
		// TODO Auto-generated method stub
		newsDao newsdao = new newsDaoImp();
		newsdao.deleteNews(news);
	}

	@Override
	public List<news> findNewsMessag(news news) {
		// TODO Auto-generated method stub
		newsDao newsdao = new newsDaoImp();
		
		return newsdao.findNewsMessag(news);
	}

}
