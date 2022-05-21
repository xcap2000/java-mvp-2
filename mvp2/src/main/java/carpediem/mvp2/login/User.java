/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpediem.mvp2.login;

/**
 *
 * @author carlos
 */
public class User {

    private final String user;

    private final String password;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
    
}
