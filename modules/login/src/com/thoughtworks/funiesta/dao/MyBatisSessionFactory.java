package com.thoughtworks.funiesta.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSessionFactory {

	private static SqlSessionFactory sqlSessionFactory;

	private MyBatisSessionFactory() throws IOException {
		String resource = "com/thoughtworks/funiesta/dao/mybatis-main.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	public static SqlSessionFactory getSQLSessionFactory() throws IOException {
		if (sqlSessionFactory == null) {
			new MyBatisSessionFactory();
		}
		return sqlSessionFactory;
	}

}
