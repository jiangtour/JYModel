package com.jiangtour.model.beans;

/**
 * @author husky
 */
public class JYAddressObject extends JYObject {
    private String name;
    private String phone;
    private boolean defaulted;
    private JYLocationObject location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isDefaulted() {
        return defaulted;
    }

    public void setDefaulted(boolean defaulted) {
        this.defaulted = defaulted;
    }

    public JYLocationObject getLocation() {
        return location;
    }

    public void setLocation(JYLocationObject location) {
        this.location = location;
    }
}
