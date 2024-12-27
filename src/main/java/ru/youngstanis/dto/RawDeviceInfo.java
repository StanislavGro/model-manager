package ru.youngstanis.dto;

public class RawDeviceInfo {
    private String series;
    private String model;
    private String prefixSN;
    private String sysObjId;
    private String deviceType;

    @Override
    public String toString() {
        return "RawDeviceInfo{" +
                "series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", prefixSN='" + prefixSN + '\'' +
                ", sysObjId='" + sysObjId + '\'' +
                ", deviceType='" + deviceType + '\'' +
                '}';
    }
}
