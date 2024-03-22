package org.tfoc;

public class ChildrenMovie extends AbstractMovie{

    private static final Double DEFAULT_COST = 1.5;

    private static final Double EXTRA_COST = 1.5;

    private static final Integer DAYS_CAP = 3;


    public ChildrenMovie(String title){
        super(title);
    }

    @Override
    double calculateRentalCost(int daysRented) {

        double cost = DEFAULT_COST;
        if (daysRented > DAYS_CAP) {
            cost += (daysRented - DAYS_CAP) * EXTRA_COST;
        }
        return cost;
    }
}
