package com.peter.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.peter.entity.User;

@Component
//@Repository
public class UserDao extends AutowiringSqlMapClientDaoSupport {

	

	public List<User> queryUserByPage(String compid, String departid, String username, int start, int end) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("username", username);
		@SuppressWarnings("unchecked")
		List<User> list = getSqlMapClientTemplate().queryForList("queryAllUser", paramMap);
		return list;
	}
}
