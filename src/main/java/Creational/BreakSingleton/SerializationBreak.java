package Creational.BreakSingleton;

import Creational.Singleton;

import java.io.*;

class SingletonSerialization   implements Serializable {

    // public instance initialized
    // when loading the class
    public static SingletonSerialization instance = new SingletonSerialization();

    private SingletonSerialization()
    {
        // private constructor
    }
}


/*
Serialization:- Serialization can also cause breakage of singleton property of singleton classes. Serialization is used to convert an object of a byte stream and save in a file or send it over a network.
Suppose you serialize an object of a singleton class. Then if you de-serialize that object it will create a new instance and hence break the singleton pattern.
*/

public class SerializationBreak {
    public static void main(String[] args) {
        try {
            SingletonSerialization instance1 = SingletonSerialization.instance;
            ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("file.txt"));
            oo.writeObject(instance1);
            oo.close();

            ObjectInput oi = new ObjectInputStream(new FileInputStream("file.txt"));

            SingletonSerialization instance2 = (SingletonSerialization) oi.readObject();
            oi.close();


            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
