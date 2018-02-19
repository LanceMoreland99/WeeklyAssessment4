package com.company.Question_2;

public class House {

    private String streetName;
    private String whosHouse;
    private String whereHouseIs;

    public House(String streetName, String whosHouse, String whereHouseIs) {
        this.streetName = streetName;
        this.whosHouse = whosHouse;
        this.whereHouseIs = whereHouseIs;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getWhosHouse() {
        return whosHouse;
    }

    public void setWhosHouse(String whosHouse) {
        this.whosHouse = whosHouse;
    }

    public String getWhereHouseIs() {
        return whereHouseIs;
    }

    public void setWhereHouseIs(String whereHouseIs) {
        this.whereHouseIs = whereHouseIs;
    }
}
