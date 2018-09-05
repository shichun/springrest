package com.peter.dao;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;

public class AutowiringSqlMapClientDaoSupport extends SqlMapClientDaoSupport{
//	 @Autowired
	  /*injectSqlMapClient(SqlMapClient sqlMapClient) {
	      setSqlMapClient(sqlMapClient);
	   }*/
	@Resource(name = "sqlMapClient")
	private SqlMapClient sqlMapClient;
	
	@PostConstruct
    public void initSqlMapClient(){
     super.setSqlMapClient(sqlMapClient);
	}  
	
}
