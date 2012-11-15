package com.thoughtworks.funiesta.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class TestUserDAO {

	@Test
	public void testUserCreation() throws IOException {
		SqlSessionFactory sqlSessionFactory = MyBatisSessionFactory
				.getSQLSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			// TODO
			// userMapper.insertUser("S", "M", "s@m.com", "sam");
			userMapper.tryIt(10);
		} finally {
			session.commit();
			session.close();
		}
	}

}
