package de.medieninformatik.prog3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serilize<T> {

    List<T> list;

    public Serilize(List<T> list) {
        this.list = list;

    }

    public void write() {
        if (list instanceof Serializable) {
            serialize(list, "testList");
        } else {
            ArrayList<T> arrayList = new ArrayList<T>();
            arrayList.addAll(list);
            serialize(arrayList, "testArrayList");
        }
    }

    public List<T> read(String filename) {
        try
        {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            List<T> read = (List<T>) o;
            ois.close();
            fis.close();

            return read;
        }
        catch (IOException | ClassNotFoundException ioe)
        {
            ioe.printStackTrace();
        }
        return null;
    }

    private void serialize(List<T> list, String filename) {
        try
        {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
