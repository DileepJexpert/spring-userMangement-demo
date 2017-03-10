package com.sample.userMangement.persistence.model;

import java.util.HashSet;
import java.util.Set;

public class Group {
	private long id;
    private String name;
 
    private Set<User> users = new HashSet<User>();
 
    public Group(String name) {
        this.name = name;
    }
 
    public void addUser(User user) {
        this.users.add(user);
    }
}
