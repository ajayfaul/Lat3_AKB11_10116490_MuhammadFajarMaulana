package com.morningstar.mfajarm_app.model;

/*
 * Nama  : Muhammad Fajar Maulana
 * NIM   : 10116490
 * Kelas : AKB11
 * 1 Mei 2019
 *
 *
 * */

public class ScreenModel {

    String Title,Description;
    int ScreenImg;

    public ScreenModel(String title, String description, int screenImg) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }
}
