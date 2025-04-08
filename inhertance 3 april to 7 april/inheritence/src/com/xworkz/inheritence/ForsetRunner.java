package com.xworkz.inheritence;

public class ForsetRunner {  public static void main(String[] args) {
    System.out.println("=== Parent class object ===");
    Forest forest = new Forest();
    forest.aspect1();
    forest.aspect2();
    forest.aspect3();
    forest.aspect4();
    forest.aspect5();

    System.out.println("\n=== Child class object with parent reference ===");
    Forest amazonAsForest = new Amazon();
    amazonAsForest.aspect1();
    amazonAsForest.aspect2();
    amazonAsForest.aspect3();
    amazonAsForest.aspect4();
    amazonAsForest.aspect5();

    System.out.println("\n=== Child class object ===");
    Amazon amazon = new Amazon();
    amazon.aspect1();
    amazon.aspect2();
    amazon.aspect3();
    amazon.aspect4();
    amazon.aspect5();
    amazon.uniqueAspect(); // Child-specific method
    if (amazonAsForest instanceof Amazon) {
        Amazon downcastedAmazon = (Amazon) amazonAsForest;
        downcastedAmazon.uniqueAspect();
    } else {
        System.out.println("Downcasting not possible");
    }
}}
