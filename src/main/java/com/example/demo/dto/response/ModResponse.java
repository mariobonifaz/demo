package com.example.demo.dto.response;

public class ModResponse {

    private Long id;
    private String namew;
    private String weapon;
    private String mission;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamew() {
        return namew;
    }

    public void setNamew(String namew) {
        this.namew = namew;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
}
