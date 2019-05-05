package com.morningstar.mfajarm_app.model;


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
