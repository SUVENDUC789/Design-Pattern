public class MobileFacory {
    private static Mobile e;

    public static Mobile phoneName(String name) {
        if (name.startsWith("iphone")) {
            return new IPhone();
        } else if (name.startsWith("oneplus")) {
            return new OnePlus();
        } else if (name.startsWith("realme")) {
            return new RealMe();
        }
        return e;
    }
}
