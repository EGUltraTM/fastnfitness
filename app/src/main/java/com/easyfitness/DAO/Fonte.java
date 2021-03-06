package com.easyfitness.DAO;

import java.util.Date;

/* DataBase Object */
public class Fonte {
    // Notez que l'identifiant est un long
    private long id;
    private Date mDate;
    private String mMachine;
    private int mSerie;
    private int mRepetition;
    private float mPoids;
    private int mUnit;
    private String mNote;
    private Profile mProfile;
    private long mMachineKey;
    private String mTime; // Time in HH:MM:SS

    /*
       * Fonte(Date pDate, String pMachine, int pSerie, int pRepetition, int pPoids, Profile pProfile)
       */
    public Fonte(Date pDate, String pMachine, int pSerie, int pRepetition, float pPoids, Profile pProfile, int pUnit, String pNote, long pMachineKey, String pTime) {
        super();
        this.mDate = pDate;
        this.mMachine = pMachine;
        this.mSerie = pSerie;
        this.mRepetition = pRepetition;
        this.mPoids = pPoids;
        this.mUnit = pUnit;
        this.mNote = pNote;
        this.mProfile = pProfile;
        this.mMachineKey = pMachineKey;
        this.mTime = pTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return mDate;
    }

    public String getMachine() {
        return mMachine;
    }

    public void setMachine(String machine) {
        this.mMachine = machine;
    }

    public int getSerie() {
        return mSerie;
    }

    public int getRepetition() {
        return mRepetition;
    }

    public float getPoids() {
        return mPoids;
    }

    public Profile getProfil() {
        return mProfile;
    }

    public long getProfilKey() {
        return mProfile.getId();
    }

    public int getUnit() {
        return mUnit;
    }

    public String getNote() {
        return mNote;
    }

    public long getMachineKey() {
        return mMachineKey;
    }

    public void setMachineKey(long id) {
        this.mMachineKey = id;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String pTime) {
        this.mTime = pTime;
    }

}