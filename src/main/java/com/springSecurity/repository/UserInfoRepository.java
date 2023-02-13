package com.springSecurity.repository;

import com.springSecurity.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserInfoRepository extends MongoRepository<UserInfo,Integer> {
    Optional<UserInfo> findByName(String username);

}
