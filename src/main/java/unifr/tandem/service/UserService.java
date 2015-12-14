package main.java.unifr.tandem.service;

import main.java.unifr.tandem.dao.UserDao;
import main.java.unifr.tandem.domain.User;
import main.java.unifr.tandem.domain.UserPref;
import org.springframework.dao.IncorrectResultSizeDataAccessException;

import java.util.List;

public class UserService {

    UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int getUserCount() {
        return userDao.getUserCount();
    }

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public User getUser(String username, String password) {
        User user = null;
        try {
            user = userDao.getUser(username, password);
        } catch (IncorrectResultSizeDataAccessException e) {
            e.printStackTrace();
        } finally {
            return user;
        }
    }

    public boolean findUser(String username) {
    	return userDao.findUser(username);
    }
    
    public UserPref getUserPref(String username) {
        return userDao.getUserPref(username);
    }

    public void addUserPref(UserPref userPref) {
        userDao.addUserPref(userPref);
    }

    public boolean hasUserPref(String username) {
        return userDao.hasUserPref(username);
    }

    public List<UserPref> getSportPartners(UserPref userPref) {
        return userDao.getSportPartners(userPref);
    }
}
