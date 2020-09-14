package com.devil.han.login;

import com.devil.han.bean.TblUserRecord;
import com.devil.han.mapper.TblUserRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import sun.security.provider.MD5;

/**
 * @author Han
 * @date 2020/9/13
 */
@Service
public class LoginService {

    @Autowired
    private TblUserRecordMapper userRecordMapper;

    public TblUserRecord login(String username,String password){
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        return userRecordMapper.login(username,password);
    }
}
