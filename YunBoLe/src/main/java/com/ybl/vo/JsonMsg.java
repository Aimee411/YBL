package com.ybl.vo;

import lombok.Data;

/*
 * 统一返回
 * 通用的对象*/
@Data//自动添加get set方法的注解
public class JsonMsg {
    //状态码 200 404 500
    private int code;
    //提示信息
    private String msg;
    //数据
    private Object data;

    public JsonMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonMsg() {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public JsonMsg(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
