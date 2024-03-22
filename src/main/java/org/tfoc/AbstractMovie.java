package org.tfoc;


import lombok.Getter;

@Getter
public abstract class AbstractMovie {

    private String title;

    private static final Integer BASIC_POINTS = 1;

    public AbstractMovie(String title) {

        this.title = title;
    }

    abstract double calculateRentalCost(int daysRented);

    int calculateRentalFrequentRenderPoints(int daysRented){

        return BASIC_POINTS;
    }

}
