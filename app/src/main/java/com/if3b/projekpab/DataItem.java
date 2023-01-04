package com.if3b.projekpab;

import java.util.ArrayList;

public class DataItem {
    public static String data [][] = new String[][]{
            {"Mixue PSX Mall", "", "https://lh5.googleusercontent.com/p/AF1QipM9L_FIWL_uH70W_5rdmzbjsQUNW5p0fjyjQG3M=w408-h306-k-no"},
            {"Mixue PTC", " ", "https://lh5.googleusercontent.com/p/AF1QipMIcZMrvgub6fHKsT5Cut3TRJ1B1w9L6hUKHd9_=w408-h306-k-no"},
            {"Mixue PIM", " ", "https://lh5.googleusercontent.com/p/AF1QipMRTlDeS4i7Pcs_DoGFDuLotyGXQ39YQ8EkGf4=w203-h270-k-no"},
            {"Mixue Mayor Ruslan", "", "https://lh5.googleusercontent.com/p/AF1QipPtFO6v-vRC9FlFuJyvlnjBde2Gdej1yUJn9GWX=w203-h270-k-no"},
            {"Mixue Celentang", "", "https://lh5.googleusercontent.com/p/AF1QipNius8_wV193J-cssX6VZhMLO-QzJfwaJVUNWS1=w600-h988-p-k-no"},
            {"Mixue GOLF", "", "https://lh5.googleusercontent.com/p/AF1QipP_3mo4W6or-EfAYGT-7mK21grHNid-hBnX-2Pv=w203-h360-k-no"},
            {"Mixue Kapt A Rivai", "", "https://lh5.googleusercontent.com/p/AF1QipPSCpRfLcCmAHlCMUTbCBR-Rx36Yx1vjWv0Hr5z=w203-h152-k-no"},
            {"Mixue Bukit Unsri", "", "https://lh5.googleusercontent.com/p/AF1QipOvssjF61JeiU1ZlxfNkxBJrWOhJEUw6ULwcKU=w203-h270-k-no"},
            {"Mixue Wongkito Sekip", "", "https://lh5.googleusercontent.com/p/AF1QipPQJwF8RJrLdknV7fC7JkNtsYBRKw_VGO2ty8Zk=w203-h270-k-no"},
            {"Mixue Sako Kenten", "", "https://lh5.googleusercontent.com/p/AF1QipO8xZuHv1IksGJ0hfLpQ9yCgU_z3Fjm7dFQluey=w203-h114-k-no"}
    };

    public static ArrayList<ModeMixue> ambilDataMixue() {
        ArrayList<ModeMixue> dataAlamat = new ArrayList<>();
        for (String[] varData : data) {
            ModeMixue model = new ModeMixue();
            model.setNama(varData[0]);
            model.setTentang(varData[1]);
            model.setFoto(varData[2]);
            dataAlamat.add(model);
        }

        return dataAlamat;
    }
}
