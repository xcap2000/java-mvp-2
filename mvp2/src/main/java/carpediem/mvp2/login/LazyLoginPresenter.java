/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpediem.mvp2.login;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

/**
 *
 * @author carlos
 */
public class LazyLoginPresenter implements LoginPresenter {

    private final Provider<LoginPresenter> provider;

    @Inject
    public LazyLoginPresenter(@Named("Default") Provider<LoginPresenter> provider) {
        this.provider = provider;
    }

    @Override
    public void initialize() {
        provider.get().initialize();
    }

    @Override
    public void login() {
        provider.get().login();                
    }
    
}
