package de.medieninformatik.prog3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    MyList<Integer> myList = new MyList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(7);

        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);

        Serilize<Integer> serilize = new Serilize<>(arrayList);
        Serilize<Integer> serilize2 = new Serilize<>(myList);

        serilize.write();
        serilize2.write();

        System.out.println(serilize.read("testList"));
        System.out.println(serilize2.read("testArrayList"));
    }
}
