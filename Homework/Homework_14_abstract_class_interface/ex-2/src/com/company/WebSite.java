package com.company;

public class WebSite extends BaseEntity {
    protected String url;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
@Override
    public String toString() {
        return getId() + " Our site is: " + getUrl();
    }
}
