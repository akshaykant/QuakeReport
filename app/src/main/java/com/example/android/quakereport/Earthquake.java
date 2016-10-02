package com.example.android.quakereport;

/**
 * Created by Akshay Kant on 02-10-2016.
 */

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;

    private String mUrl;

    public Earthquake(double mMagnitude, String mLocation, long mTimeInMilliseconds, String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mUrl = mUrl;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public void setTimeInMilliseconds(long mTimeInMilliseconds) {
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
