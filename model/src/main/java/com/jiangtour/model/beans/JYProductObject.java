package com.jiangtour.model.beans;

import java.util.List;

/**
 * @author husky
 */
public class JYProductObject extends JYObject {
    private String title;
    private String detail;
    private String thumbnail;
    private List<JYImageObject> images;
    private String url;
    private int state;
    private int substate;
    private List<JYIntegerObject> characteristics;
    private List<JYProductCategoryObject> categories;

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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<JYImageObject> getImages() {
        return images;
    }

    public void setImages(List<JYImageObject> images) {
        this.images = images;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public List<JYIntegerObject> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<JYIntegerObject> characteristics) {
        this.characteristics = characteristics;
    }

    public List<JYProductCategoryObject> getCategories() {
        return categories;
    }

    public void setCategories(List<JYProductCategoryObject> categories) {
        this.categories = categories;
    }
}
