package com.jiangtour.model.beans;

/**
 * @author husky
 */
public class JYObject{
    private String objectId;
    private String userId;
    private int index;
    private long atCreatrion;
    private long atUpdation;
    private String description;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public long getAtCreatrion() {
        return atCreatrion;
    }

    public void setAtCreatrion(long atCreatrion) {
        this.atCreatrion = atCreatrion;
    }

    public long getAtUpdation() {
        return atUpdation;
    }

    public void setAtUpdation(long atUpdation) {
        this.atUpdation = atUpdation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
