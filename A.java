package lesson8;

public interface A {
    int giveMeYourMoney();

    default int hereItIs() {
        return 1;
    }

    int justTakeIt();
}
