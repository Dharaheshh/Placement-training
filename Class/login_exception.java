package Class;

public class login_exception {
    public static void main(String[] args) {
        login l = new login("admin", "password");
        try {
            l.login("admin", "password");
            l.login("user", "pass");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class login {
    String username;
    String password;
    public login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    void login(String username, String password) throws Exception {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login successful");
        } else {
            throw new Exception("Invalid username or password");
        }
    }
}