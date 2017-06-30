package io.egen.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Reading {

     @Id
    @Column(columnDefinition = "VARCHAR(36)")
     private String id;
    private String vin;
    private float latitude;
    private float langitute;
    private String timestamp;
    private float flueVolume;
    private float speed;
    private int engineHP;
    private boolean checkEngineLightOn;
    private boolean EngineCoolantLow;
    private int engineRPM;

    @OneToOne
   private Tire tires;

    public Reading(){
        this.id = UUID.randomUUID().toString();
    }


    public Tire getTires() {
        return tires;
    }

    public void setTires(Tire tires) {
        this.tires = tires;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLangitute() {
        return langitute;
    }

    public void setLangitute(float langitute) {
        this.langitute = langitute;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public float getFlueVolume() {
        return flueVolume;
    }

    public void setFlueVolume(float flueVolume) {
        this.flueVolume = flueVolume;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getEngineHP() {
        return engineHP;
    }

    public void setEngineHP(int engineHP) {
        this.engineHP = engineHP;
    }

    public boolean isCheckEngineLightOn() {
        return checkEngineLightOn;
    }

    public void setCheckEngineLightOn(boolean checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    public boolean isEngineCoolantLow() {
        return EngineCoolantLow;
    }

    public void setEngineCoolantLow(boolean engineCoolantLow) {
        EngineCoolantLow = engineCoolantLow;
    }

    public int getEngineRPM() {
        return engineRPM;
    }

    public void setEngineRPM(int engineRPM) {
        this.engineRPM = engineRPM;
    }


    @Override
    public String toString() {
        return "Reading{" +
                "vin='" + vin + '\'' +
                ", latitude=" + latitude +
                ", langitute=" + langitute +
                ", timestamp='" + timestamp + '\'' +
                ", flueVolume=" + flueVolume +
                ", speed=" + speed +
                ", engineHP=" + engineHP +
                ", checkEngineLightOn=" + checkEngineLightOn +
                ", EngineCoolantLow=" + EngineCoolantLow +
                ", engineRPM=" + engineRPM +
                ", tire=" + tires +
                '}';
    }
}
