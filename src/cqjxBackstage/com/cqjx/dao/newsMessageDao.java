package cqjxBackstage.com.cqjx.dao;

import java.util.List;

import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.news;
import cqjxBackstage.com.cqjx.domain.newsMessage;

public interface newsMessageDao {

	void addnewsMessage(newsMessage newsmessage);
	
	public void deleteNewsMessage(news news);//ɾ����Ʒ��Ѷ
	
	List<newsMessage> findNews(newsMessage newsmessage);
	
	List<newsMessage> findNewsMessage();
	
	List<newsMessage> findNewsUuid(newsMessage newsmessage);
}
