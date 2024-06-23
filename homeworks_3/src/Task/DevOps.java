package Task;

public class DevOps extends Worker {
    public DevOps(String name, String lastName) {
        super(name, lastName,"DevOps");
    }

    @Override
    public void goToWork() {
        super.goToWork();
        System.out.println("I am engaged in the development and administration of continuous process integration!");
    }

    @Override
    public void goToVacation(int days) {
        super.goToVacation(days);
        System.out.println("Fuck this Work, I'm at the party in a blast!!!!!");
    }
}

