package lesson8;

public interface C extends A,B {
    static final int a = 111;

    abstract int pleaseGiveMeYourMoney();


    @Override
    default int hereItIs() {
        return A.super.hereItIs();
    }


    static int heItIs(){
        return 2;
    }
}
