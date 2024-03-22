package org.tfoc;

import lombok.Getter;

/**
 * The rental class represents a customer renting a movie.
 */
@Getter
public class Rental {

    private AbstractMovie movie;
    private int daysRented;

    public Rental(AbstractMovie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }


    public double calculateRentalCost(){

        return movie.calculateRentalCost(daysRented);
    }

    public int calculateRentalFrequentRenderPoints() {

        return movie.calculateRentalFrequentRenderPoints(daysRented);
    }

}
