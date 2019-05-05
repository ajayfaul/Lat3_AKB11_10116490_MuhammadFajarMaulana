package com.morningstar.mfajarm_app.model;

public class FriendListModel {
    private int imageSource;
    private String friendName;

    public FriendListModel(int imageSource, String friendName) {
        this.imageSource = imageSource;
        this.friendName = friendName;
    }

    public int getImageSource() {
        return imageSource;
    }

    public String getFriendName() {
        return friendName;
    }
}
