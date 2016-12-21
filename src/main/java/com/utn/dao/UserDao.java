package com.utn.dao;

import com.utn.modelo.User;

public interface UserDao {

	User findByUserName(String username);

}