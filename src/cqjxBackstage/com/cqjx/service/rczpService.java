package cqjxBackstage.com.cqjx.service;

import java.util.List;

import cqjxBackstage.com.cqjx.domain.rczp;

public interface rczpService {

	public void addrczp(rczp rczp);

	public List<rczp> findRczp();

	public void updateRczp(rczp rczp);

	public void deleteRczp(rczp rczp);

	public List<rczp> findRczpMessage(rczp rczp);

}
