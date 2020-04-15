package com.kk.build2;

/*
@author kzj
@date 2020/4/15 - 14:34
*/

public class Product {

    //有默认值
    private String BuildX = "X";
    private String BuildY = "Y";
    private String BuildZ = "Z";

    public String getBuildX() {
        return BuildX;
    }

    public void setBuildX(String buildX) {
        BuildX = buildX;
    }

    public String getBuildY() {
        return BuildY;
    }

    public void setBuildY(String buildY) {
        BuildY = buildY;
    }

    public String getBuildZ() {
        return BuildZ;
    }

    public void setBuildZ(String buildZ) {
        BuildZ = buildZ;
    }

    @Override
    public String toString() {
        return "Product{" +
                "BuildX='" + BuildX + '\'' +
                ", BuildY='" + BuildY + '\'' +
                ", BuildZ='" + BuildZ + '\'' +
                '}';
    }
}
