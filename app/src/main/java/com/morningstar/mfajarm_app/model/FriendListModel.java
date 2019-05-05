package com.morningstar.mfajarm_app.model;


/*
 * Nama  : Muhammad Fajar Maulana
 * NIM   : 10116490
 * Kelas : AKB11
 * 1 Mei 2019
 *
 *
 * */
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
