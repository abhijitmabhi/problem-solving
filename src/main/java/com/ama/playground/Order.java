package com.ama.playground;


public class Order {

    private double applyMembershipDiscount(CustomerType customerType, double totalPrice) {

        return switch (customerType) {
            case STANDARD -> totalPrice - (totalPrice * 0.05);
            case PREMIUM -> applyPremiumDiscount(totalPrice);
        };
    }

    private double applyPremiumDiscount(double totalPrice) {
        return totalPrice > 100 ? totalPrice - (totalPrice * 0.20) : totalPrice - (totalPrice * 0.10);
    }

    private double applyStudentDiscount(double totalPrice) {
        return totalPrice - 5;
    }

    private void validateInput(CustomerType customerType, int quantity, double unitPrice) {
        if (customerType == null) {
            throw new IllegalArgumentException("Invalid customer type");
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException("Invalid quantity");
        }

        if (unitPrice <= 0) {
            throw new IllegalArgumentException("Invalid unit price");
        }
    }

    public double calculateDiscount(CustomerType customerType, int quantity, double unitPrice,
                                    boolean hasMembership, boolean hasStudentDiscount) {

        validateInput(customerType, quantity, unitPrice);

        double totalPrice = quantity * unitPrice;

        if (hasMembership) {
            totalPrice = applyMembershipDiscount(customerType, totalPrice);
        }

        if (hasStudentDiscount) {
            totalPrice = applyStudentDiscount(totalPrice);
        }

        return totalPrice;
    }

    enum CustomerType {
        STANDARD, PREMIUM
    }

}