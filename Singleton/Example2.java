public class Example2 {
    
    // This is the eager way

    private static Example2 e = new Example2();

    public static Example2 getObjectEagerWay() {
        return e;
    }

}
