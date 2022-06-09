package com.memoryFaded.springframework.test.bean;

public class UserService {
    private String uId;
    private UserDao userDao;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String queryUserInfo(){
        return userDao.queryUserName(uId);
    }
}