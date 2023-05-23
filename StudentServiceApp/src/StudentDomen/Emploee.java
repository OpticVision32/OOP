package StudentDomen;

public class Emploee extends user{
    private int empId;

    public Emploee(String firstName, String secondName, int age, int empId) {
        super(firstName, secondName, age);
        this.empId = empId;
    }
}
