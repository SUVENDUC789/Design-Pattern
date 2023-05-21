// package Singleton;

public class Driver {

    public static void main(String[] args) {

        // Lazy way
        Example e1 = Example.getObject();
        Example e2 = Example.getObject();

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        // Eager way
        System.out.println(Example2.getObjectEagerWay().hashCode());
        System.out.println(Example2.getObjectEagerWay().hashCode());

        // Threadsafe Lazy technic
        System.out.println(ThreadSafe.getObjectSysn().hashCode());
        System.out.println(ThreadSafe.getObjectSysn().hashCode());

    }
}