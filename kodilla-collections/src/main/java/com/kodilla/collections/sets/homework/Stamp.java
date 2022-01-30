package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampSize;
    private String stamping;

    public Stamp(String stampName, String stampSize, String stamping) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.stamping = stamping;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampSize() {
        return stampSize;
    }

    public String getStamping() {
        return stamping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(stampName, stamp.stampName)
                && Objects.equals(stampSize, stamp.stampSize)
                && Objects.equals(stamping, stamp.stamping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, stamping);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize='" + stampSize + '\'' +
                ", stamping='" + stamping + '\'' +
                '}';
    }
}
