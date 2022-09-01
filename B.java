package lesson8;

public interface B {
    int willYouGiveMeYourMoney();

    default int hereItIs() {
        return 3;
    }

    int justTakeIt();
}
