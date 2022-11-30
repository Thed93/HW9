package LoginAndPassword;

import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;
public class User {
    private final String login;
    private final String password;

    public User(String login, String password) throws WrongLoginException, WrongPasswordException {
        if (login.isEmpty() || login.isBlank() || login.length() > 20 || login == null ) {
            throw new WrongLoginException("Логин введен некорректно");
        } else {
            this.login = login;
        }
        if (password.isEmpty() || login.isBlank() || login.length() > 20 || login == null) {
            throw new WrongPasswordException("Пароль введен некорректно");
        } else {
            this.password = password;
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
