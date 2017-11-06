package ch.epfl.sweng.dp2.solutions.ex6;

public class CapitalizedUser extends User {

    public CapitalizedUser(User user) {
        super(user.getUsername().toUpperCase());
    }
}
