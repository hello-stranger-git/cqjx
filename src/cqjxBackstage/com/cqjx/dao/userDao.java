package cqjxBackstage.com.cqjx.dao;

import java.util.List;

import cqjxBackstage.com.cqjx.domain.user;

public interface userDao {

	public void regist(user user);

	public user singIn(user user);

}
