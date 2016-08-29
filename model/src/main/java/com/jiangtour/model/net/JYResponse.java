package com.jiangtour.model.net;

import com.jiangtour.model.beans.JYPageObject;

/**
 * @author husky
 */
public class JYResponse {

    private int code;
    private String message;
    private String object;
    private String data;
    private JYPageObject page;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public JYPageObject getPage() {
        return page;
    }

    public void setPage(JYPageObject page) {
        this.page = page;
    }
}
