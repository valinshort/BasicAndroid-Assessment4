package com.example.rodneytressler.week4assessment;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by rodneytressler on 12/17/17.
 */

public class Player implements Parcelable {

    private String PlayerName;
    private String PlayerTeam;
    private int PlayerNumber;

    // Generated Parcleable //
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.PlayerName);
        dest.writeString(this.PlayerTeam);
        dest.writeInt(this.PlayerNumber);
    }

    public Player() {
    }

    protected Player(Parcel in) {
        this.PlayerName = in.readString();
        this.PlayerTeam = in.readString();
        this.PlayerNumber = in.readInt();
    }

    public static final Parcelable.Creator<Player> CREATOR = new Parcelable.Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel source) {
            return new Player(source);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };
}
