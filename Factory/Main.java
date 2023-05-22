public class Main {
    public static void main(String[] args) {

        Mobile smartphone = MobileFacory.phoneName("iphone");
        smartphone.createMobile();

        Mobile smartphone2 = MobileFacory.phoneName("oneplus");
        smartphone2.createMobile();

        Mobile smartphone3 = MobileFacory.phoneName("realme");
        smartphone3.createMobile();

    }
}
