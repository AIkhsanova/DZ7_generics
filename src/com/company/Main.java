package com.company;

public class Main {

    public static void main(final String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        Fruit fruit = new Fruit();
        Box<Apple> appleBox = new Box<>();

        BoxUtil.copyFreshFruitFromBoxToBox(appleBox, fruitBox);
        //BoxUtil.copyFromBoxToBox(appleBox, fruitBox);
        System.out.println(fruitBox.get());

        fruitBox.put(fruit);


        Apple apple = new Apple();
        apple.setFresh(true);
        appleBox.put(apple);

        BoxUtil.copyFreshFruitFromBoxToBox(appleBox, fruitBox);
        System.out.println(fruitBox.get());

        Box<Box<Fruit>> box = new Box<>();

        box.put(fruitBox);

        Box<Box<Box<Fruit>>> bigBox = new Box<>();
        bigBox.put(box);
        BoxUtil.printElementFromTwoBoxes(bigBox);
        BoxUtil.printElementFromBoxes(bigBox);
        BoxUtil.printElementFromBoxes(fruitBox);
        System.out.println(apple.isFresh());
    }
}
