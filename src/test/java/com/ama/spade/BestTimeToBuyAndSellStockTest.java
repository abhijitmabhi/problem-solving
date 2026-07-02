package com.ama.spade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {
    private final BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    public void shouldReturnMaxProfit() {
        int[] prices = {4,2,6,1,10,1};

        assertEquals(9, bestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    public void shouldReturnZeroWhenNoProfit() {
        int[] prices = {6,3,1};

        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenInputIsNullOrEmpty() {
        assertThrows(IllegalArgumentException.class, () -> bestTimeToBuyAndSellStock.maxProfit(null));
    }

}