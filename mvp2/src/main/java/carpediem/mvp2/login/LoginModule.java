/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpediem.mvp2.login;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

/**
 *
 * @author carlos
 */
public class LoginModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(LoginView.class).to(DefaultLoginView.class).in(Singleton.class);
    bind(LoginService.class).to(DefaultLoginService.class).in(Singleton.class);
    bind(LoginPresenter.class).annotatedWith(Names.named("Default")).to(DefaultLoginPresenter.class).in(Singleton.class);
    bind(LoginPresenter.class).to(LazyLoginPresenter.class).in(Singleton.class);
  }
}
