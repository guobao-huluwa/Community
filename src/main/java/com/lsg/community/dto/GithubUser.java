package com.lsg.community.dto;

/**
 * 描述
 *
 * @outhor 李曙光
 * @time 2019-08-31  1:24
 */
public class GithubUser {
    private long id;
    private String name;
    private String bio;

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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
