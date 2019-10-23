package cqjxBackstage.com.cqjx.dao;

import java.util.List;

import cqjxBackstage.com.cqjx.domain.cpzx;

public interface cpzxDao {


	public void addcpzx(cpzx cpzx);

	public List<cpzx> findCpzx();

	public void updateCpzx(cpzx cpzx);

	public void deleteCpzx(cpzx cpzx);

	public List<cpzx> findCpzxMessage(cpzx cpzx);

}
