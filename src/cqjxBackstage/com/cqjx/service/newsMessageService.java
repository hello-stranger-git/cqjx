package cqjxBackstage.com.cqjx.service;

import java.util.List;

import cqjxBackstage.com.cqjx.domain.newsMessage;

public interface newsMessageService {

	public void addnewsMessage(newsMessage newsmessage);

	public List<newsMessage> findNewsUuid(newsMessage newsmessage);

	public List<newsMessage> findNews(newsMessage newsmessage);
	
	public List<newsMessage> findNewsMessage();
}
