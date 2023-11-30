import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, InterruptedException, CloneNotSupportedException {
        System.out.println("Hello world!");

        A a = new A();
        a.a= "Test";

        Object object = new Object();

        System.out.println(object);


        Object a1 = new A();

        System.out.println(a1);


        C c = new C("Test", "M", 10);

        Class<? extends C> aClass = c.getClass();

        Class<C> cClass = C.class;

        Constructor<?>[] constructors = aClass.getConstructors();


        C object1 = (C) constructors[0].newInstance("Test", "N", 10);

        System.out.println(object1.toString());
        //aClass.


        System.out.println(c);


        Integer test1 = Integer.valueOf(128);
        Integer test2 = Integer.valueOf(128);


        String s1 = "Test";
        String s2 = "Test";

        String s3 = new String("Test");
        //s3 = s3.intern();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println();
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));


        //System.out.println(test1 ==test2);


        C c1 = new C("Test1", "M", 11);
        C c2 = new C("Test1", "M", 11);


        //System.out.println(c1 == c2);


        //System.out.println(c1.equals(c2));

        //Thread.sleep(10000);

        Cat cat = new Cat("Test");
        Person test = new Person(10, 100, "test", cat);
        System.out.println(test);

        Object clone = test.clone();
        ((Person)clone).setName("AAAA");
        System.out.println(clone);


    }


    public static void maintest(A a) {
        System.out.println(a.testToString());
    }

//    public static void maintest(Object a) {
//        System.out.println();
//    }




}