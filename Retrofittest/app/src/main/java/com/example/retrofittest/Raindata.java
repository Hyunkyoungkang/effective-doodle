package com.example.retrofittest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Raindata {

    @SerializedName("철도운영기관명")
    @Expose
    private String organ;
    @SerializedName("선명")
    @Expose
    private String Line;
    @SerializedName("역명")
    @Expose
    private String station;
    @SerializedName("지상지하구분")
    @Expose
    private String ground ;
    @SerializedName("역층")
    @Expose
    private int floors;
    @SerializedName("상세위치")
    @Expose
    private String location;
    @SerializedName("전화번호")
    @Expose
    private String Phonenumber;

    public void setLine(String line) {
        Line = line;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getLine() {
        return Line;
    }

    public String getStation() {
        return station;
    }

    public String getGround() {
        return ground;
    }

    public int getFloors() {
        return floors;
    }

    public String getLocation() {
        return location;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public void Setorgan(){
        this.organ = organ;
    }
    public String Getorgan(){
        return organ;
    }

    @Override
    public String toString() {
            return "PostResult{" +
                    "  상세위치=" + location +
                    ", 선명=" + Line +
                    ", 역명='" + station + '\'' +
                    ", 역층='" + floors + '\'' +
                    ", 전화번호='" + Phonenumber + '\'' +
                    ", 지상지하구분='" + ground + '\'' +
                    ", 철도운영기관명='" + organ + '\'' +
                    '}';
        }
}
