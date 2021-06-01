package com.BorsaDemo.demo.business.concretes;

import com.BorsaDemo.demo.business.abstracts.UserService;
import com.BorsaDemo.demo.core.results.DataResult;
import com.BorsaDemo.demo.core.results.Result;
import com.BorsaDemo.demo.core.results.SuccessDataResult;
import com.BorsaDemo.demo.core.results.SuccessResult;
import com.BorsaDemo.demo.dataAccess.UserShareDao;
import com.BorsaDemo.demo.entities.Share;
import com.BorsaDemo.demo.entities.UserShare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserShareDao userShareDao;

    @Autowired
    public UserManager(UserShareDao userShareDao) {
        this.userShareDao = userShareDao;
    }

    @Override
    public Result hisseAl(UserShare userShare) {
        userShareDao.save(userShare);
        return new SuccessResult("Hisse Alındı");
    }

    @Override
    public Result hisseSat(UserShare userShare) {

        userShareDao.save(userShare);
        return new SuccessResult("Hisse Satıldı");
    }

    @Override
    public DataResult<UserShare> userHisseListele() {
        return new SuccessDataResult(userShareDao.findAll(),"Sahip olduğunuz hisseler listelendi");
    }
}
