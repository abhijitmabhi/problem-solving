package com.ama.Y2026;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Soring {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByLastDigitOnly(new int[]{50, 6, 2, 80, 1})));

        Car BMW = new Car("BMW", 40000);
        Car Audi = new Car("Audi", 3500);
        Car Tesla = new Car("Tesla", 60000);

        var carList = new ArrayList<>(List.of(BMW, Audi, Tesla));

        carList.sort(Comparator.comparing(Car::getPrice).reversed());

        System.out.println(carList);

    }

    public static int[] reverseSort(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static int[] sortByLastDigitOnly(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparing(k1 -> k1 % 10))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

class Car {
    String name;
    int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return name + ":" + price;
    }
}
