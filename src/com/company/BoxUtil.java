package com.company;

public class BoxUtil {
    public static <T> void copyFromBoxToBox(Box<T> src, Box<? super T> dest) {
        T element = src.get();
        dest.put(element);
    }

    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(Box<T> src, Box<? super T> dest) {
        T element = src.get();
        if (element.isFresh()) {
            dest.put(element);
        }
    }


    public static <T> void printElementFromTwoBoxes(Box<Box<T>> box) {
        Box<T> inner_box = box.get();
        System.out.println(inner_box.get());

    }

    public static <T> void printElementFromBoxes(Box<T> box) {
        T element = box.get();
        if (element instanceof Box) {
            BoxUtil.printElementFromBoxes((Box<?>) element);
        } else {
            System.out.println(element);
        }

    }


}
