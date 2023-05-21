// package Singleton;

public class Example {

    private static Example e;

    private Example() {
    }

    public static Example getObject() {
        if (e == null) {
            e = new Example();
        }
        return e;
    }

}

/*
 * 1 - Private Constructor
 * 2 - create private static object
 * 3 - public method
 */
