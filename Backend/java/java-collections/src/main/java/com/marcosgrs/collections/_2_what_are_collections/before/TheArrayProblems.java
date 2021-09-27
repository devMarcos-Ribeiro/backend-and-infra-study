package com.marcosgrs.collections._2_what_are_collections.before;

import com.marcosgrs.collections.domain.Product;

import java.util.Arrays;

public class TheArrayProblems {

    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Product[] products = {door, floorPanel};

        System.out.println(Arrays.toString(products));
    }
}
