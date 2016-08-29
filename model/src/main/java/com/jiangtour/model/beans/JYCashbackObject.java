package com.jiangtour.model.beans;

/**
 * @author husky
 */
public class JYCashbackObject extends JYObject {
    private JYUserObject user;
    private int type;
    private int subtype;
    private double amount;
    private String statements;

    public JYUserObject getUser() {
        return user;
    }

    public void setUser(JYUserObject user) {
        this.user = user;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatements() {
        return statements;
    }

    public void setStatements(String statements) {
        this.statements = statements;
    }
}
