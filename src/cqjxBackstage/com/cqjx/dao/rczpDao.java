package cqjxBackstage.com.cqjx.dao;

import java.util.List;

import cqjxBackstage.com.cqjx.domain.rczp;

public interface rczpDao {
	
	public void addrczp(rczp rczp);

	public List<rczp> findRczp();

	public void updateRczp(rczp rczp);

	public void deleteRczp(rczp rczp);

	public List<rczp> findRczpMessage(rczp rczp);

}
