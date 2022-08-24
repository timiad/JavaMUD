package org.donkMUD;
import java.util.List;

public class Account {

    public String Login;
    public String Password;
    public List<String> Characters;

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public List<String> getCharacters() {
        return Characters;
    }

    public void setCharacters(List<String> characters) {
        Characters = characters;
    }

    public Account(){

    }

}
