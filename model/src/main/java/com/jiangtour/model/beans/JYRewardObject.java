package com.jiangtour.model.beans;

/**
 * @author husky
 */
public class JYRewardObject extends JYObject {

    private String title;
    private String detail;
    private long amount;
    private int type;
    private int subtype;
    private int state;
    private int substate;

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

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSubtype() {
        return subtype;
    }

    public void setSubtype(int subtype) {
        this.subtype = subtype;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getSubstate() {
        return substate;
    }

    public void setSubstate(int substate) {
        this.substate = substate;
    }
}
