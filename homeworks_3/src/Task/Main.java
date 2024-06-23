package Task;

import javafx.concurrent.WorkerStateEvent;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = {
          new Programmer("Igor", "Dovlatov "),
          new Tester("Dina", "Petrova "),
          new SysAdmin("Kostya", "Drugov "),
          new DevOps("Andrey", "Kuris "),
        };
        for (Worker worker : workers) {
            System.out.println("---***---***---***---***---***---***---***---***---***---***---***---***---***---");
            worker.goToWork();
            System.out.println("---***---***---***---***---***---***---***---***---***---***---***---***---***---");
            worker.goToVacation(14);
        }
    }
}
