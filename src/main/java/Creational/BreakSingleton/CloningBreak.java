package Creational.BreakSingleton;


class Superclass implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}

class CloningSingleton extends Superclass {

    public static CloningSingleton instance = new CloningSingleton();

    private CloningSingleton() {

    }

}
/*
Cloning: Cloning is the concept to create duplicate objects. Using clone we can create copy of object.
        Suppose, we create clone of a singleton object, then it will create a copy that is there are two instances of a singleton class, hence the class is no more singleton.*/
public class CloningBreak {
    public static void main(String[] args) throws CloneNotSupportedException {

        CloningSingleton ins1 = CloningSingleton.instance;
        CloningSingleton ins2 = (CloningSingleton) ins1.clone();

        System.out.println("First object " + ins1.hashCode());

        System.out.println("Second object " + ins2.hashCode());
    }
}
