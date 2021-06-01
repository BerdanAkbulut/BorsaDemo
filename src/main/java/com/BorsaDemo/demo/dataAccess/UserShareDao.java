package com.BorsaDemo.demo.dataAccess;

import com.BorsaDemo.demo.entities.UserShare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserShareDao extends JpaRepository<UserShare,Integer> {
}
