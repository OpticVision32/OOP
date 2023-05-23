package StudentDomen;

public class Teacher extends user {
    private int teacherId;
    private String level;
    public Teacher(String firstName, String secondName, int age, int teacherId, String level) {
        super(firstName, secondName, age);
        this.teacherId = teacherId;
        this.level = level;
    }
    
    
}
