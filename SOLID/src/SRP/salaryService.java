package SRP;

public class salaryService {
    private int baseSalary;
    private Emploee employee;

    // Конструктор
    public salaryService(int baseSalary, Emploee employee) {
        this.baseSalary = baseSalary;
        this.employee = employee;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
}
