package cqjxBackstage.com.cqjx.service;

import java.util.List;

import cqjxBackstage.com.cqjx.dao.cpzxMessageDao;
import cqjxBackstage.com.cqjx.dao.cpzxMessageDaoImp;
import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.cpzxMessage;

public class cpzxMessageServiceImp implements cpzxMessageService {

	@Override
	public void addcpzxMessage(cpzxMessage cpzxmessage) {
		// TODO Auto-generated method stub
		cpzxMessageDao cpzxmessagedao=new cpzxMessageDaoImp();
		cpzxmessagedao.addcpzxMessage(cpzxmessage);
	}

	@Override
	public List<cpzxMessage> findCplx(cpzxMessage cpzxmessage) {
		// TODO Auto-generated method stub
		cpzxMessageDao cpzxmessagedao=new cpzxMessageDaoImp();
		return cpzxmessagedao.findCplx(cpzxmessage);
	}

	@Override
	public List<cpzxMessage> findCplxUuid(cpzxMessage cpzxmessage) {
		// TODO Auto-generated method stub
		cpzxMessageDao cpzxmessagedao=new cpzxMessageDaoImp();
		return cpzxmessagedao.findCplxUuid(cpzxmessage);
	}

	@Override
	public List<cpzxMessage> findCpzxMessage() {
		// TODO Auto-generated method stub
		cpzxMessageDao cpzxmessagedao=new cpzxMessageDaoImp();
		return cpzxmessagedao.findCpzxMessage();
	}

}
