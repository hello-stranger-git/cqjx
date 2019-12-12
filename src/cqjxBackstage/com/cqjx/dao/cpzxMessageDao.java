package cqjxBackstage.com.cqjx.dao;

import java.util.List;

import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.cpzxMessage;

public interface cpzxMessageDao {

	void addcpzxMessage(cpzxMessage cpzxmessage);
	
	public void deleteCpzxMessage(cpzx cpzx);//ɾ����Ʒ��Ѷ
	
	List<cpzxMessage> findCplx(cpzxMessage cpzxmessage);
	
	List<cpzxMessage> findCplxUuid(cpzxMessage cpzxmessage);

	List<cpzxMessage> findCpzxMessage();

}
