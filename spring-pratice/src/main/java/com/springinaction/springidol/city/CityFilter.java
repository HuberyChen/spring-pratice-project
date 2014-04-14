package com.springinaction.springidol.city;

import java.util.List;

/**
 * @author hubery.chen
 */
public class CityFilter {

    private City bigCity;

    private List<City> bigCities;

    private List<String> cityNames;

    public List<String> getCityNames() {
        return cityNames;
    }

    public void setCityNames(List<String> cityNames) {
        this.cityNames = cityNames;
    }

    public City getBigCity() {
        return bigCity;
    }

    public void setBigCity(City bigCity) {
        this.bigCity = bigCity;
    }

    public List<City> getBigCities() {
        return bigCities;
    }

    public void setBigCities(List<City> bigCities) {
        this.bigCities = bigCities;
    }
}
