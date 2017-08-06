package com.xyz.dao;

import com.xyz.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dell on 2017/8/6.
 */
public interface UserRepository extends JpaRepository<User,String> {



}
