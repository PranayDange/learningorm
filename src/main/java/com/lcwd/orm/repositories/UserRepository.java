package com.lcwd.orm.repositories;

import com.lcwd.orm.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    //use UserEntity primary key  datatype
//public interface UserRepository extends CrudRepository {
}
