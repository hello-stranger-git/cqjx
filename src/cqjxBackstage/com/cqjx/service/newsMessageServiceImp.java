package cqjxBackstage.com.cqjx.service;

import java.util.List;

import cqjxBackstage.com.cqjx.dao.cpzxMessageDao;
import cqjxBackstage.com.cqjx.dao.cpzxMessageDaoImp;
import cqjxBackstage.com.cqjx.dao.newsMessageDao;
import cqjxBackstage.com.cqjx.dao.newsMessageDaoImp;
import cqjxBackstage.com.cqjx.domain.newsMessage;

public class newsMessageServiceImp implements newsMessageService {

	@Override
	public void addnewsMessage(newsMessage newsmessage) {
		// TODO Auto-generated method stub
		newsMessageDao newsmessagedao=new newsMessageDaoImp();
		newsmessagedao.addnewsMessage(newsmessage);
	}

	@Override
	public List<newsMessage> findNewsUuid(newsMessage newsmessage) {
		// TODO Auto-generated method stub
		newsMessageDao newsmessagedao=new newsMessageDaoImp();
		return newsmessagedao.findNewsUuid(newsmessage);
	}

	@Override
	public List<newsMessage> findNews(newsMessage newsmessage) {
		// TODO Auto-generated method stub
		newsMessageDao newsmessagedao=new newsMessageDaoImp();
		return newsmessagedao.findNews(newsmessage);
	}

}
