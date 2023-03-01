package com.lcwd.orm;

import com.lcwd.orm.entities.UserEntity;
import com.lcwd.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class LearningormApplication {
public class LearningormApplication implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger(LearningormApplication.class);

    @Autowired
    private UserService userService;

    //main is a static method and UserServic is not satatic
    //therefore we are using/implementing CommandLineRunner
    public static void main(String[] args) {
        SpringApplication.run(LearningormApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

      /*  //save user
        UserEntity user = new UserEntity();
        user.setName("pranay");
        user.setCity("pune");
        user.setAge(24);
        UserEntity savedUser = userService.saveUser(user);
        logger.info("Saved Users : {}", savedUser);
        System.out.println(savedUser);*/

        //get all user
       /* List<UserEntity> allUser = userService.getAllUser();
        logger.info("All User {}", allUser);
        logger.info("All User {}", allUser.size());*/

        /*//get single user
        UserEntity singleUser = userService.getUser(3);
        logger.info("Single User is: {}", singleUser);*/

        //update user
     /*   UserEntity user = new UserEntity();
        user.setName("maya");
        user.setCity("chandrapur");
        user.setAge(25 );
        UserEntity updateEntity = userService.updateUser(user, 2);
        logger.info("user update : {}", updateEntity);*/

        //delete user
        userService.deleteUser(1);

    }
}
