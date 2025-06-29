package Creational.BreakSingleton;

import java.io.*;

class PreventSingleton implements Serializable {

    public static final PreventSingleton instance = new PreventSingleton();

    private PreventSingleton() {
    }

    protected Object readResolve() {
        return instance;
    }
}

/*Overcome serialization issue:- To overcome this issue, we have to implement the method readResolve() method.*/
public class PreventSingletonSerialization {
    public static void main(String[] args) {
        try {
            PreventSingleton instance1 = PreventSingleton.instance;
            ObjectOutput out = new ObjectOutputStream(
                    new FileOutputStream("file.text"));

            out.writeObject(instance1);
            out.close();

            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
            PreventSingleton instance2  = (PreventSingleton) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- "  + instance1.hashCode());
            System.out.println("instance2 hashCode:- "  + instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
