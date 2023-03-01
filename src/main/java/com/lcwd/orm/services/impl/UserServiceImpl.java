package com.lcwd.orm.services.impl;

import com.lcwd.orm.entities.UserEntity;
import com.lcwd.orm.repositories.UserRepository;
import com.lcwd.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity saveUser(UserEntity user) {
        UserEntity savedUser = userRepository.save(user);
        logger.info("User Saved : {}", savedUser.getId());
        return savedUser;
    }

    @Override
    public UserEntity updateUser(UserEntity useNew, int userId) {
        //get user from database through userId
        UserEntity oldUser = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        //this oldUser has old details of user
        oldUser.setName(useNew.getName());
        oldUser.setCity(useNew.getCity());
        oldUser.setAge(useNew.getAge());

        //update user
        UserEntity saveNewUser = userRepository.save(oldUser);
        return saveNewUser;
    }

    @Override
    public void deleteUser(int userId) {
        UserEntity userNotFound = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        userRepository.delete(userNotFound);
        logger.info("User Deleted");

    }

    @Override
    public List<UserEntity> getAllUser() {
        List<UserEntity> all = userRepository.findAll();
        return all;
    }

    //get single user by id
    @Override
    public UserEntity getUser(int userId) {
        Optional<UserEntity> userOptional = userRepository.findById(userId);
        UserEntity userEntity = userOptional.orElseThrow(() -> new RuntimeException("User with given id not found"));
        return userEntity;
    }
}
