package Task;

public class Tester extends Worker {
    public Tester(String name, String lastName) {
        super(name, lastName, "Tester");
    }

    @Override
    public void goToWork() {
        super.goToWork();
        System.out.println("Presentation of the program to the customer");
    }

    @Override
    public void goToVacation(int days) {
        super.goToVacation(days);
        System.out.println("Went on vacation");
    }
}
