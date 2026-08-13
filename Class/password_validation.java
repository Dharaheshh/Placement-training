package Class;

public class password_validation {
    public static void main(String[] args) {
        //ask user to enter password
        //password must be at least 8 characters long
        //throw custom exception if password is invalid
        //else print "Password is valid"
        String password = "Dharaheshh@123";
        try {
            validatePassword(password);
            System.out.println("Password is valid");
        } catch (invalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void validatePassword(String password) throws invalidPasswordException {
        if (password.length() < 8) {
            throw new invalidPasswordException("Password must be at least 8 characters long");
        }
        else{
            System.out.println("Password is valid");
        }
    }
}


class invalidPasswordException extends Exception {
    public invalidPasswordException(String message) {
        super(message);
    }
}
