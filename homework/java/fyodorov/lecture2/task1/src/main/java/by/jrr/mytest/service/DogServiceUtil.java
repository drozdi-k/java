package by.jrr.mytest.service;
import by.jrr.mytest.bean.Dog;

public class DogServiceUtil {
    public static String bark (Dog dog){
        return dog.getName () + " BARK!";
    }
}
