package com.jiangtour.model.beans;

import java.util.List;

/**
 * @author husky
 */
public class JYCommentObject extends JYObject {
    private String content;
    private List<JYImageObject> images;
    private JYUserObject user;
    private JYUserObject atUser;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<JYImageObject> getImages() {
        return images;
    }

    public void setImages(List<JYImageObject> images) {
        this.images = images;
    }

    public JYUserObject getUser() {
        return user;
    }

    public void setUser(JYUserObject user) {
        this.user = user;
    }

    public JYUserObject getAtUser() {
        return atUser;
    }

    public void setAtUser(JYUserObject atUser) {
        this.atUser = atUser;
    }
}
