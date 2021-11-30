package com.haojie.service;

import com.haojie.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
