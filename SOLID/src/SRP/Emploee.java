package SRP;

import java.util.Date;

public class Emploee {

    private String name;
    private Date dob;
    
    public Emploee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
    }
    
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
    
    
}

