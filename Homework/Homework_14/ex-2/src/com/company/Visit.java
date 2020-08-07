package com.company;

public class Visit extends BaseEntity {
    protected long id;
    protected long version;
    protected User user;
    protected WebSite site;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
//luam datele despre user din clasa User si le adaugam in aceasta clasa la visit
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
//luam datele din clasa webSite si le setam aici in aceasta clasa
    public WebSite getSite() {
        return site;
    }

    public void setSite(WebSite site) {
        this.site = site;
    }
@Override
    public String toString() {
        return getId() + " Our users is:  " + getUser() + " They visited this site:  " + getSite();
    }

}
