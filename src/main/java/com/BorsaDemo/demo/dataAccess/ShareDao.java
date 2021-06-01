package com.BorsaDemo.demo.dataAccess;

import com.BorsaDemo.demo.entities.Share;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShareDao extends JpaRepository<Share,Integer> {
}
