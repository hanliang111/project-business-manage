package com.neuedu.service.impl;

import com.neuedu.exception.MyException;
import com.neuedu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

    @Override
    public UserInfo login(UserInfo userInfo) throws MyException{

        //1.参数的非空校验
        if(userInfo==null){
            throw new MyException("参数不能为空");
        }
        if (userInfo.getUsername()==null||userInfo.getUsername.equals("")){
            throw new MyException("用户名不能为空");
        }
    }

}
