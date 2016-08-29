package com.jiangtour.model.beans;

import java.util.List;

/**
 * @author husky
 */
public class JYChainObject extends JYObject {
    private String superId;
    private String title;
    private String detail;
    private List<JYChainObject> children;

    public String getSuperId() {
        return superId;
    }

    public void setSuperId(String superId) {
        this.superId = superId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<JYChainObject> getChildren() {
        return children;
    }

    public void setChildren(List<JYChainObject> children) {
        this.children = children;
    }
}
