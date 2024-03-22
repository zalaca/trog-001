package org.tfoc;

public class NewReleaseMovie extends AbstractMovie{

    private static final Double DEFAULT_COST = 3.0;

    private static final Integer EXTRA_POINTS = 1;

    public NewReleaseMovie(String title){
        super(title);
    }

    @Override
    double calculateRentalCost(int daysRented) {
        return daysRented * DEFAULT_COST;
    }

    @Override
    int calculateRentalFrequentRenderPoints(int daysRented) {
        int base = super.calculateRentalFrequentRenderPoints(daysRented);
        return daysRented > 1 ? base + EXTRA_POINTS : base;
    }
}
