package org.example.readit.domain;

/**
 * Author    Rick Qiu
 * Email     qiudejun@gmail.com
 * Date      12/11/14
 * Time      1:32 PM
 */
public class Login {
    private static int LOGIN_SUCCESS = 0;
    private static int LOGIN_FAILURE = 1;
    private int status = LOGIN_SUCCESS;
    public int getStatus() {
        return status;
    }
}
