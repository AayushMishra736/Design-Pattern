package Creational;
/*     Single Instance: Singleton ensures that only one instance of the class exists throughout the application.
        Global Access: Provide a global point of access to that instance.
        Lazy or Eager Initialization: Support creating the instance either when needed (lazy) or when the class is loaded (eager).
        Thread Safety: Implement mechanisms to prevent multiple threads from creating separate instances simultaneously.
        Private Constructor: Restrict direct instantiation by making the constructor private, forcing the use of the access point*/


/*Method 1 - Classic Implementation || Make getInstance() static to implement Singleton Method Design Pattern*/
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
/*
Note: Singleton obj is not created until we need it and call the getInstance() method. This is called lazy instantiation. The main problem with the above method is that it is not thread-safe.
        Consider the following execution sequence.*/


/*Method 2 || Make getInstance() synchronized to implement Singleton Method Design Pattern*/
/*public class ThreadSafeSingleton*/
class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    private static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

}

/*Method 3 - Eager Instantiation || Static initializer based implementation of singleton design pattern*/
/*public class EagerInstantiation*/
class EagerInstantiationSingleton {

    private static EagerInstantiationSingleton instantiationSingleton = new EagerInstantiationSingleton();

    private EagerInstantiationSingleton() {

    }

    public static EagerInstantiationSingleton getInstance() {
        return instantiationSingleton;
    }
}

/*Method 4 - Most Efficient || Use “Double Checked Locking” to implement singleton design pattern
 */
class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton() {

    }

    public static DoubleCheckLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }

}









