package de.medieninformatik.prog3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(7);

	    MyList<Integer> myList = new MyList<>(myArrayList);
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);

        Serilize<Integer> serilize = new Serilize<>(arrayList);
        Serilize<Integer> serilize2 = new Serilize<>(myList);

        serilize.write("testList");
        serilize2.write("testArrayList");

        System.out.println(serilize.read("testList"));
        System.out.println(serilize2.read("testArrayList"));
    }
}
