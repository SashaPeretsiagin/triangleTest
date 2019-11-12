package com.bsu.peretsiagin;

public class TriangleVerifyer {
    public boolean triangle(double firstSide, double secondSide, double thirdSide) {
        if (firstSide<=0 || secondSide<=0 || thirdSide<=0) {
            throw new IllegalArgumentException("The side is less than zero");
        }
        return firstSide + secondSide > thirdSide
                && firstSide + thirdSide > secondSide
                && thirdSide + secondSide > firstSide;
    }
}
