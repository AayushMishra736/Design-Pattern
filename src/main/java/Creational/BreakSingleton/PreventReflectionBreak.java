package Creational.BreakSingleton;

import java.lang.reflect.Constructor;

enum SingletonClass {
    INSTANCE;
}

/*Overcome reflection issue: To overcome issues raised by reflection, enums are used because java ensures internally that the
enum value is instantiated only once. Since java Enums are globally accessible, they can be used for singletons. Its only drawback is that it is not flexible i.e it does not allow lazy initialization.*/

public class PreventReflectionBreak {
    public static void main(String[] args) {
        SingletonClass sin1 = SingletonClass.INSTANCE;
        System.out.println(" First instance " + sin1.hashCode());
        try {
            Constructor[] constructors = SingletonClass.class.getDeclaredConstructors();

            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                SingletonClass sin2 = (SingletonClass) constructor.newInstance();
                System.out.println(" Second instance " + sin2.hashCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
