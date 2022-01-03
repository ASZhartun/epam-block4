package simplestClassesAndObjects.task01;

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setFirst(15);
        test1.setSecond(12);
        test1.printVars();
        System.out.println("Sum: " + test1.sum());
        System.out.println("Max value: " + test1.getMaxOfVars());
    }
}
