package com.tothon.layarperak.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Backdrop implements Parcelable {

    @SerializedName("aspect_ratio")
    private Double aspectRatio;

    @SerializedName("file_path")
    private String filePath;

    @SerializedName("height")
    private Integer height;

    @SerializedName("width")
    private Integer width;

    @SerializedName("iso_639_1")
    private Object iso6391;

    @SerializedName("vote_average")
    private double voteAverage;

    @SerializedName("vote_count")
    private Integer voteCount;

    public Backdrop() {
    }

    protected Backdrop(Parcel in) {
        if (in.readByte() == 0) {
            aspectRatio = null;
        } else {
            aspectRatio = in.readDouble();
        }
        filePath = in.readString();
        if (in.readByte() == 0) {
            height = null;
        } else {
            height = in.readInt();
        }
        if (in.readByte() == 0) {
            width = null;
        } else {
            width = in.readInt();
        }
        voteAverage = in.readDouble();
        if (in.readByte() == 0) {
            voteCount = null;
        } else {
            voteCount = in.readInt();
        }
    }

    public static final Creator<Backdrop> CREATOR = new Creator<Backdrop>() {
        @Override
        public Backdrop createFromParcel(Parcel in) {
            return new Backdrop(in);
        }

        @Override
        public Backdrop[] newArray(int size) {
            return new Backdrop[size];
        }
    };

    public Double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Object getIso6391() {
        return iso6391;
    }

    public void setIso6391(Object iso6391) {
        this.iso6391 = iso6391;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (aspectRatio == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(aspectRatio);
        }
        dest.writeString(filePath);
        if (height == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(height);
        }
        if (width == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(width);
        }
        dest.writeDouble(voteAverage);
        if (voteCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(voteCount);
        }
    }
}