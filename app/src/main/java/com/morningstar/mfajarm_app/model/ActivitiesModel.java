package com.morningstar.mfajarm_app.model;

/*
 * Nama  : Muhammad Fajar Maulana
 * NIM   : 10116490
 * Kelas : AKB11
 * 1 Mei 2019
 *
 *
 * */

public class ActivitiesModel {
        private String activityName, activityTime;

        public ActivitiesModel( String judulaktifitas, String waktuaktifitas){
            activityName = judulaktifitas;
            activityTime = waktuaktifitas;
        }

    public String getActivityName() {
        return activityName;
    }

    public String getActivityTime(){
        return activityTime;
    }
}
