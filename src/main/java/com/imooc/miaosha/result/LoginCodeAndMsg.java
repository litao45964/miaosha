package com.imooc.miaosha.result;

/**
 *
 * 登陆模块
 */
public class LoginCodeAndMsg extends CodeMsg{


    private LoginCodeAndMsg(int code,String msg){
       //调用父类构造函数
       super(code,msg);
    }

    //登录模块 5002XX
    public static CodeMsg SESSION_ERROR = new LoginCodeAndMsg(500210, "Session不存在或者已经失效");
    public static CodeMsg PASSWORD_EMPTY = new LoginCodeAndMsg(500211, "登录密码不能为空");
    public static CodeMsg MOBILE_EMPTY = new LoginCodeAndMsg(500212, "手机号不能为空");
    public static CodeMsg MOBILE_ERROR = new LoginCodeAndMsg(500213, "手机号格式错误");
    public static CodeMsg MOBILE_NOT_EXIST = new LoginCodeAndMsg(500214, "手机号不存在");
    public static CodeMsg PASSWORD_ERROR = new LoginCodeAndMsg(500215, "密码错误");
}
