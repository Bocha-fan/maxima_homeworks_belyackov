package Task;

public class Programmer extends Worker {

    public Programmer(String name, String lastName) {
        super(name, lastName,"Programmer");
    }

    @Override
    public void goToWork() {
        super.goToWork();
        System.out.println("I'm developing a new web service");
    }

    @Override
    public void goToVacation(int days) {
        super.goToVacation(days);
        System.out.println("Took the weekend to decompress my brain!");
    }
}
