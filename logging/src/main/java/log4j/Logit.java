package log4j;

import sun.reflect.Reflection;

public class Logit {

    public void loghere(){
        System.out.println(Reflection.getCallerClass(2));

        System.out.println(Reflection.class.getSimpleName());
        System.out.println(Thread.currentThread().getStackTrace().getClass().getName());
    }
}
