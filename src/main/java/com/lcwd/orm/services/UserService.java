package com.lcwd.orm.services;

import com.lcwd.orm.entities.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity saveUser(UserEntity user);

    UserEntity updateUser(UserEntity user, int userId);

    void deleteUser(int userId);

    List<UserEntity> getAllUser();

    UserEntity getUser(int userId);
}
