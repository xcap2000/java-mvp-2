/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpediem.mvp2.login;

/**
 *
 * @author carlos
 */
public interface LoginView {

    public void showLoginPanel();

    public void showLoginError();

    public void hideLogin();

    public void showLoggedIn();
    
    public String getUser();
    
    public String getPassword();

    public void setVisible(boolean b);
    
}
