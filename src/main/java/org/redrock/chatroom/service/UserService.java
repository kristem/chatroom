package org.redrock.chatroom.service;

import org.redrock.chatroom.dao.UserMapper;
import org.redrock.chatroom.PoJo.User;
import org.redrock.chatroom.exception.ParameterException;
import org.redrock.chatroom.exception.ServerException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

import static org.redrock.chatroom.constant.ExceptionMessage.*;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public void addUser(User user) {
        checkAddUserParameter(user);
        if (!userMapper.insertUser(user))
            throw new ServerException();
    }

    public User checkUser(User user) {
        User getUser = userMapper.findUserByUserId(user.getUserId());
        Objects.requireNonNull(getUser, USER_NOT_EXIST);
        if (!user.getPassword().equals(getUser.getPassword()))
            throw new ParameterException(PASSWORD_WRONG);
        return user;
    }


    public User getUserByUserName(String username) {
        User user = userMapper.findUserByUserName(username);
        Objects.requireNonNull(user);
        return user;
    }

    public User getUserByUserId(int userId) {
        User user = userMapper.findUserByUserId(userId);
        Objects.requireNonNull(user);
        return user;
    }

    private void checkAddUserParameter(User user) {
        if (user.getUsername() == null || user.getPassword() == null ||
                user.getNickname() == null)
            throw new ParameterException(PARAMETER_CANNOT_NULL);
        checkUserName(user.getUsername());
        checkPassword(user.getPassword());
    }

    private void checkUserName(String userName) {
        User user = userMapper.findUserByUserName(userName);
        if (user != null && !user.getUsername().equals(userName))
            throw new ParameterException(DOUBLE_USER_NAME);
        if (userName.length() > 20)
            throw new ParameterException(USER_NAME_IS_TOO_LONG);
    }

    private void checkPassword(String password) {
        if (password.length() > 20)
            throw new ParameterException(PASSWORD_IS_TOO_LONG);
    }
}

