package com.BorsaDemo.demo.business.abstracts;

import com.BorsaDemo.demo.core.results.DataResult;
import com.BorsaDemo.demo.core.results.Result;
import com.BorsaDemo.demo.entities.Share;
import com.BorsaDemo.demo.entities.UserShare;

public interface UserService {

   Result hisseAl(UserShare userShare);
   Result hisseSat(UserShare userShare);

   DataResult<UserShare> userHisseListele();

}
