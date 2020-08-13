package com.comitit.light.model;

import javax.persistence.*;

@Entity
@Table(name = "light_entity")
public class LightEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private LightInfo lightInfo;
    private boolean isTurnedOn;

    public LightEntity() {
    }

    public LightEntity(LightInfo lightInfo, boolean isTurnedOn) {
        this.lightInfo = lightInfo;
        this.isTurnedOn = isTurnedOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LightInfo getLightInfo() {
        return lightInfo;
    }

    public void setLightInfo(LightInfo lightInfo) {
        this.lightInfo = lightInfo;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }
}
