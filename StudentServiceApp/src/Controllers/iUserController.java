package Controllers;

import StudentDomen.user;

public interface iUserController<T extends user> {
    void create(String firstName, String secondName, int age);
}
