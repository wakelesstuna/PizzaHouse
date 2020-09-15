
/**
 * Created by Oscar Forss
 * Date: 2020-09-11
 * Time: 23:02
 * Project: PizzaHouse
 * Copyright: MIT
 * <p>
 * Use to create a new user
 */
public class CreateUser {

    private String userName;
    private String passWord;

    public CreateUser() {

    }
    /**
     * Sets the username and password
     * for the new user
     * @param userName username
     * @param passWord password
     */
    public CreateUser(String userName, String passWord) {
        setUserName(userName);
        setPassWord(passWord);
    }


    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

}


