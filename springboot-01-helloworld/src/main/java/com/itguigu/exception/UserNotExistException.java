package com.itguigu.exception;

/**
 * @author 58212
 * @date 2019-08-31 15:17
 */
public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("用户不存在");
    }

}
