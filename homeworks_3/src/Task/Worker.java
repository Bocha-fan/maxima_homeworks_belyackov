package Task;

public class Worker {
    private String name;
    private String lastName;
    private String profession;

    public Worker(String name, String lastName, String profession) {
        this.name = name;
        this.lastName = lastName;
        this.profession = profession;
    }

    public void goToWork(){
        System.out.println(getName()+ " " + getLastName() + "Worker:"+ getProfession() );
    }
    public void goToVacation(int days){
        System.out.println(name + " " + lastName + " Goes on vacation for " + days + " Day(s) ");
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getProfession() {
        return profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
