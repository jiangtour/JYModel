package com.jiangtour.model.beans;

import java.util.List;

/**
 * @author husky
 */
public class JYPostObject extends JYObject {
    private JYUserObject user;
    private String title;
    private String detail;
    private String content;
    private List<JYImageObject> images;
    private int readCount;
    private int commentCount;
    private boolean liked;
    private int likeCount;
    private int shareCount;
    private List<JYCommentObject> comments;

    public JYUserObject getUser() {
        return user;
    }

    public void setUser(JYUserObject user) {
        this.user = user;
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

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

    public List<JYCommentObject> getComments() {
        return comments;
    }

    public void setComments(List<JYCommentObject> comments) {
        this.comments = comments;
    }
}
