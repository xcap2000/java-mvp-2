/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpediem.mvp2.login;

import com.google.inject.Inject;

/**
 *
 * @author carlos
 */
public class DefaultLoginPresenter implements LoginPresenter {

    private final LoginView view;
    private final LoginService service;

    @Inject
    public DefaultLoginPresenter(LoginView view, LoginService service) {
        this.view = view;
        this.service = service;
    }

    @Override
    public void initialize() {
        view.showLoginPanel();
    }

    @Override
    public void login() {
        
        var user = view.getUser();
        var pass = view.getPassword();
        
        var succeeded = service.login(user, pass);
        
        if (succeeded) {
            view.hideLogin();
            view.showLoggedIn();
        } else {
            view.showLoginError();
        }
        
    }
    
}
