package Creational.BreakSingleton;

class Upperclass implements Cloneable {


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class PreventCloning extends Upperclass {

    public static PreventCloning instance = new PreventCloning();

    private PreventCloning() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }


}
/* Overcome Cloning issue: To overcome this issue, override clone() method and throw an exception from clone method that is CloneNotSupportedException.
 Now, whenever user will try to create clone of singleton object, it will throw an exception and hence our class remains singleton.
*/

public class PreventCloningBreak {
    public static void main(String[] args) throws CloneNotSupportedException {
        PreventCloning instance1 = PreventCloning.instance;
        PreventCloning instance2 = (PreventCloning) instance1.clone();
        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                + instance2.hashCode());
    }
}
