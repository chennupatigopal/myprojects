package com.server.obj;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * It's a vo class
 * @author gplchn
 *
 */
@XmlRootElement(name = "Account")
public class Account {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}