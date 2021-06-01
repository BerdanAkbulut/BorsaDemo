package com.BorsaDemo.demo.business.concretes;

import com.BorsaDemo.demo.business.abstracts.AdminService;
import com.BorsaDemo.demo.core.results.DataResult;
import com.BorsaDemo.demo.core.results.Result;
import com.BorsaDemo.demo.core.results.SuccessDataResult;
import com.BorsaDemo.demo.core.results.SuccessResult;
import com.BorsaDemo.demo.dataAccess.ShareDao;
import com.BorsaDemo.demo.dataAccess.UserDao;
import com.BorsaDemo.demo.entities.Share;
import com.BorsaDemo.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;

@Service
public class AdminManager implements AdminService {

    private UserDao userDao;
    private ShareDao shareDao;

    @Autowired
    public AdminManager(UserDao userDao,ShareDao shareDao) {
        this.userDao = userDao;
        this.shareDao = shareDao;
    }

    @Override
    public Result hisseEkle(Share share) {
        Date date = new Date();

        share.setSharePrice(10);

        shareDao.save(share);

        return new SuccessResult("Hisse Eklendi");

    }

    @Override
    public Result hisseSil(int id) {
        shareDao.deleteById(id);
        return new SuccessResult("Hisse Silindi");
    }

    @Override
    public Result hisseGuncelle(int id,Share share) {

        Share existShare = shareDao.getById(id);
        existShare.setCode(share.getCode());
        existShare.setSharePrice(share.getSharePrice());
        existShare.setShareName(share.getShareName());

        return new SuccessResult("Hisse Güncellendi");
    }

    @Override
    public DataResult<Share> hisseListele() {

        return new SuccessDataResult(shareDao.findAll());
    }

    @Override
    public Result userEkle(User user) {

        userDao.save(user);
        return new SuccessResult("Kullanıcı Eklendi");
    }

    @Override
    public Result userSil(int id) {

        userDao.deleteById(id);
        return new SuccessResult("Kullanıcı Silindi");
    }
}
