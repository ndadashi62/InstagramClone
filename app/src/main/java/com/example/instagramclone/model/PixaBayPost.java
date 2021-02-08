package com.example.instagramclone.model;

import com.google.gson.annotations.SerializedName;

public class PixaBayPost {
    private int id;
    private String webformatURL;
    @SerializedName("user")
    private String userName;
    private String tags;
    private int likes;
    private int views;
    private int comments;
    private  String userImageURL ;

    @Override
    public String toString() {
        return "PixaBayPost{" +
                "id=" + id +
                ", webformatURL='" + webformatURL + '\'' +
                ", userName='" + userName + '\'' +
                ", tags='" + tags + '\'' +
                ", likes=" + likes +
                ", views=" + views +
                ", comments=" + comments +
                ", userImageURL='" + userImageURL + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWebformatURL() {
        return webformatURL;
    }

    public void setWebformatURL(String webformatURL) {
        this.webformatURL = webformatURL;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String getUserImageURL() {
        return userImageURL;
    }

    public void setUserImageURL(String userImageURL) {
        this.userImageURL = userImageURL;
    }

}
