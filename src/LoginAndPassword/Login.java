package LoginAndPassword;

import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

public class Login {

    public static void confirmLiginAndPassword(String login, String password, String confirmPassword, User user) throws WrongLoginException, WrongPasswordException {
        if (login.equals(user.getLogin())){
            System.out.println("Логин введен корректно");
        } else {
            throw new WrongLoginException("Логин введен некорректно");
        }
        if (password.equals(user.getPassword())) {
            System.out.println("Пароль введен корректно");
        } else {
            throw new WrongPasswordException("Пароль введен некорректно");
        }
        if (confirmPassword.equals(password)){
            System.out.println("Подтверждение пароля прошло!");
        } else {
            throw new WrongPasswordException("Подтверждение пароля не прошло!");
        }
        System.out.println("Добро пожаловать " + user.getLogin() + "!");
    }
}
