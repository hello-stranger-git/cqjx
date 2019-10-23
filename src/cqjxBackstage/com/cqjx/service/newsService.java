package cqjxBackstage.com.cqjx.service;

import java.util.List;

import cqjxBackstage.com.cqjx.domain.news;

public interface newsService {

	public void addnews(news news);

	public List<news> findNews();

	public void updateNews(news news);

	public void deleteNews(news news);

	public List<news> findNewsMessag(news news);

}
