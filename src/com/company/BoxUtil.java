package com.company;

public class BoxUtil {
    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        T element = src.get();
        dest.put(element);
    }

    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        T element = src.get();
        if (element.isFresh()) {
            dest.put(element);
        }
    }


    public static <T> void printElementFromTwoBoxes(final Box<Box<T>> box) {
        Box<T> inBox = box.get();
        System.out.println(inBox.get());

    }

    public static <T> void printElementFromBoxes(final Box<T> box) {
        T element = box.get();
        if (element instanceof Box) {
            BoxUtil.printElementFromBoxes((Box<?>) element);
        } else {
            System.out.println(element);
        }

    }


}
