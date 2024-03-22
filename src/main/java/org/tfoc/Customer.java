package org.tfoc;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Customer {

    private String name;
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

        for (Rental rental : rentals) {
            double thisAmount = rental.calculateRentalCost();
            frequentRenterPoints += rental.calculateRentalFrequentRenderPoints();
            totalAmount += thisAmount;

            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(thisAmount).append("\n");
        }

        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");

        return result.toString();
    }

}
