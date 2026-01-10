package base.oopconcept;

/**
 * This is a "partially finished" blueprint.
 * 		Use it when classes share the same identity.
 *
 * An abstract class cannot be instantiated directly.
 * It provides a common base for related subclasses.
 */
abstract class BasePhone {
    // 1. Concrete method: All phones power on the same way
    public void powerOn() {
        System.out.println("Displaying logo... Phone is ON.");
    }

    // 2. Abstract method: Different phones have different calling logic
    public abstract void makeCall();
}

class SamsungPhone extends BasePhone {
    @Override
    public void makeCall() {
        System.out.println("Samsung: Dialing via Android OS...");
    }
}

class ApplePhone extends BasePhone {
    @Override
    public void makeCall() {
        System.out.println("Apple: Dialing via iOS...");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        // BasePhone phone = new BasePhone(); // This would cause a compile error

        BasePhone mySamsung = new SamsungPhone();
        BasePhone myApple = new ApplePhone();

        mySamsung.powerOn(); // Shared behavior
        mySamsung.makeCall(); // Specific behavior

        myApple.powerOn();   // Shared behavior
        myApple.makeCall();  // Specific behavior
    }
}