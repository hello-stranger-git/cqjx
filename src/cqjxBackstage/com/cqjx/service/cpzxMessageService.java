package cqjxBackstage.com.cqjx.service;

import java.util.List;

import cqjxBackstage.com.cqjx.domain.cpzx;
import cqjxBackstage.com.cqjx.domain.cpzxMessage;

public interface cpzxMessageService {

	public void addcpzxMessage(cpzxMessage cpzxmessage);
	
	public List<cpzxMessage> findCplx(cpzxMessage cpzxmessage);
	
	public List<cpzxMessage> findCplxUuid(cpzxMessage cpzxmessage);

}
