package com.ama.playground;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class OrderTest {
    private final Order order = new Order();

    @Test
    void shouldCalculateBasePrice() {
        double result = order.calculateDiscount(
                Order.CustomerType.STANDARD, 2, 50.0, false, false);
        assertThat(result).isEqualTo(100.0);
    }

    @Test
    void shouldApplyPremiumMembershipDiscountOver100() {
        double result = order.calculateDiscount(
                Order.CustomerType.PREMIUM, 3, 50.0, true, false);
        // 150 * 0.80 = 120
        assertThat(result).isEqualTo(120.0);
    }

    @Test
    void shouldApplyPremiumMembershipDiscountUnder100() {
        double result = order.calculateDiscount(
                Order.CustomerType.PREMIUM, 1, 50.0, true, false);
        // 50 * 0.90 = 45
        assertThat(result).isEqualTo(45.0);
    }

    @Test
    void shouldApplyStandardMembershipDiscount() {
        double result = order.calculateDiscount(
                Order.CustomerType.STANDARD, 2, 50.0, true, false);
        // 100 * 0.95 = 95
        assertThat(result).isEqualTo(95.0);
    }

    @Test
    void shouldApplyStudentDiscount() {
        double result = order.calculateDiscount(
                Order.CustomerType.STANDARD, 2, 50.0, false, true);
        // 100 - 5 = 95
        assertThat(result).isEqualTo(95.0);
    }

    @Test
    void shouldApplyBothDiscounts() {
        double result = order.calculateDiscount(
                Order.CustomerType.PREMIUM, 3, 50.0, true, true);
        // 150 * 0.80 = 120 - 5 = 115
        assertThat(result).isEqualTo(115.0);
    }

    @Test
    void shouldThrowExceptionForNullCustomerType() {
        assertThatThrownBy(() -> order.calculateDiscount(
                null, 2, 50.0, false, false))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void shouldThrowExceptionForInvalidQuantity() {
        assertThatThrownBy(() -> order.calculateDiscount(
                Order.CustomerType.STANDARD, 0, 50.0, false, false))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void shouldThrowExceptionForInvalidUnitPrice() {
        assertThatThrownBy(() -> order.calculateDiscount(
                Order.CustomerType.STANDARD, 2, -1.0, false, false))
                .isInstanceOf(IllegalArgumentException.class);
    }
}