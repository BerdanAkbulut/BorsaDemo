package com.BorsaDemo.demo.dataAccess;

import com.BorsaDemo.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}
