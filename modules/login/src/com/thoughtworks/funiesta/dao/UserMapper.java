package com.thoughtworks.funiesta.dao;

public interface UserMapper {

	// @Insert("insert into Fun_User(firstname,lastname,email,password) values (#{firstname},#{lastname},#{email},#{password})")
	User insertUser(String firstname, String lastName, String emailId,
			String password);

	void tryIt(int id);
}
