package com.jiangtour.model.beans;

import java.util.List;
import io.realm.annotations.RealmClass;

/**
 * @author husky
 */
@RealmClass
public class JYOrderObject extends JYObject {
    private int state;
    private int substate;
    private List<JYProductObject> product;

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

    public List<JYProductObject> getProduct() {
        return product;
    }

    public void setProduct(List<JYProductObject> product) {
        this.product = product;
    }
}
