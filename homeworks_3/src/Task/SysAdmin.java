package Task;

public class SysAdmin extends Worker {

    public SysAdmin(String name, String lastName) {
        super(name, lastName,"SysAdmin");
    }

    @Override
    public void goToWork() {
        super.goToWork();
        System.out.println("Restoring a Linux server");
    }

    @Override
    public void goToVacation(int days) {
        super.goToVacation(days);
        System.out.println("Let's go to the Sonar party!");
    }
}
