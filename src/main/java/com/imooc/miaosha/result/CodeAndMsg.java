package com.imooc.miaosha.result;

public class CodeAndMsg {
    private String msg;
    private String code;

    public static CodeAndMsg success=new CodeAndMsg("000000","处理成功");
    public static CodeAndMsg login_fail=new CodeAndMsg("100001","登陆失败");
    public static CodeAndMsg login_succ=new CodeAndMsg("100000","登陆成功");


    public CodeAndMsg(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
