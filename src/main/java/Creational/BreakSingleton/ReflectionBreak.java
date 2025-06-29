package Creational.BreakSingleton;

import java.lang.reflect.Constructor;
/*
Reflection: Reflection can be caused to destroy singleton property of the singleton class, as shown in the following example:*/
class Singleton {

    private static volatile Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
/*
Reflection: Reflection can be caused to destroy singleton property of the singleton class, as shown in the following example:*/

public class ReflectionBreak {
    public static void main(String[] args) {
        Singleton ins1 = Singleton.getInstance();
        Singleton ins2 = null;

        try {
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                ins2 = (Singleton) constructor.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("First code " + ins1.hashCode());

        System.out.println("Second code " + ins2.hashCode());
    }
}
