package com.BorsaDemo.demo.business.abstracts;

import com.BorsaDemo.demo.core.results.DataResult;
import com.BorsaDemo.demo.core.results.Result;
import com.BorsaDemo.demo.entities.Share;
import com.BorsaDemo.demo.entities.User;

public interface AdminService {

    Result hisseEkle(Share share);
    Result hisseSil(int id);
    Result hisseGuncelle(int id, Share share);

    DataResult<Share> hisseListele();

    Result userEkle(User user);
    Result userSil(int id);

}
