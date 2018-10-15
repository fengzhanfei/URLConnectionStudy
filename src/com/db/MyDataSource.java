package com.db;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class MyDataSource {
	public static DataSource getDataSource(String connectURI){
		BasicDataSource ds = new BasicDataSource();
		//MySQL的jdbc驱动
		ds.setDriverClassName("com.mysql.jdbc.Driver"); //驱动名称
		ds.setUsername("root");              //数据库用户名
		ds.setPassword("123456");             //数据库密码
		ds.setUrl(connectURI);				//连接地址
		return ds;
	}
}

