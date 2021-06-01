package com.BorsaDemo.demo.api;

import com.BorsaDemo.demo.business.abstracts.AdminService;
import com.BorsaDemo.demo.business.abstracts.UserService;
import com.BorsaDemo.demo.core.results.Result;
import com.BorsaDemo.demo.core.results.SuccessResult;
import com.BorsaDemo.demo.dataAccess.UserDao;
import com.BorsaDemo.demo.entities.Share;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/")
public class AdminController {

    private AdminService adminService;

    @Autowired
    public AdminController(AdminService  adminService) {
        this.adminService = adminService;
    }

    @GetMapping("getAll")
    ResponseEntity<?> getAll() {
        return ResponseEntity.ok(adminService.hisseListele());
    }

    @PostMapping("add")
    ResponseEntity<?> add(@RequestBody Share share) {
        return ResponseEntity.ok(adminService.hisseEkle(share));
    }
}
