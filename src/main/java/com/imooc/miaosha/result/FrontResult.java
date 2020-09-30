package com.imooc.miaosha.result;

public class FrontResult<T> {
    private String msgCode;
    private String msg;
    private T t;

    public FrontResult(String msgCode, String msg, T t) {
        this.msgCode = msgCode;
        this.msg = msg;
        this.t = t;
    }


    /**
     * 泛型构造函数
     * @param t
     * <CodeAndMsg> 声明泛型
     */
    public FrontResult(T t) {
        this.t = t;
    }

    /**
     * 参数具体传CodeAndMsg
     * 泛型构造函数
     * @param
     */
    public <T> FrontResult(CodeAndMsg codeAndMsg) {
        this.msg=codeAndMsg.getMsg();
        this.msgCode=codeAndMsg.getCode();
    }

    /**
     * 参数具体传CodeAndMsg
     * 泛型构造函数
     * @param
     */

    /**
     * 参数具体传CodeAndMsg
     * 泛型构造函数
     * @param
     */



    /**
     * 成功时调用
     * 泛型方法
     * @param
     */
    public static <T> FrontResult<T> success(T t){
       return new FrontResult(t);
    }


    /**
     * <String> 起一个声明的作用，在使用时，可以指定据具体声明
     * @param codeAndMsg
     * @return
     */
    public static <String> FrontResult<String> error(CodeAndMsg codeAndMsg){
        return new FrontResult<String>(codeAndMsg);
    }

    /**
     * <CodeAndMsg> 起一个声明的作用，在使用时，可以指定据具体声明
     * FrontResult<CodeAndMsg> 才是真正的返回参数
     *
     * @param codeAndMsg
     * @param <CodeAndMsg>
     * @return
     */
    public static <CodeAndMsg> FrontResult<CodeAndMsg> error1(CodeAndMsg codeAndMsg){
        return new FrontResult<CodeAndMsg>(codeAndMsg);
    }
}
