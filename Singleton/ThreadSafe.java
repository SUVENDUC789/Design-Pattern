public class ThreadSafe {
    private static ThreadSafe e;

    private ThreadSafe() {
    }

    // Just object initilization
    // public synchronized static ThreadSafe getObjectSysn() {

    // if (e == null) {
    // e = new ThreadSafe();
    // }
    // return e;
    // }

    // Supose you have multiple line of code
    public static ThreadSafe getObjectSysn() {
        // code ...
        // code ...
        // code ...
        if (e == null) {
            synchronized (ThreadSafe.class) {
                e = new ThreadSafe();
            }
        }
        // code ...
        // code ...
        // code ...
        return e;
    }
}
