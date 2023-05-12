package StudentDomen;

public class Teacher extends user {
    private String predmet;

    public Teacher (String firstName, String secondName, int age, String predmet) {
        super(firstName, secondName, age);
        this.predmet = predmet;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
}
