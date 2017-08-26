package com.shaishavgandhi.fastscrolling;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by shaishav.gandhi on 8/25/17.
 */

public class State implements Parcelable, Serializable {

    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.location);
    }

    public State(String name, String location) {
        this.name = name;
        this.location = location;
    }

    protected State(Parcel in) {
        this.name = in.readString();
        this.location = in.readString();
    }

    public static final Creator<State> CREATOR = new Creator<State>() {
        @Override
        public State createFromParcel(Parcel source) {
            return new State(source);
        }

        @Override
        public State[] newArray(int size) {
            return new State[size];
        }
    };
}
