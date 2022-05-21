/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpediem.mvp2.login.PresenterFacts;

import carpediem.mvp2.login.LoginService;
import carpediem.mvp2.login.DefaultLoginPresenter;
import carpediem.mvp2.login.LoginPresenter;
import carpediem.mvp2.login.LoginView;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.mock;

/**
 *
 * @author carlos
 */
public abstract class BaseFacts {
    
    protected LoginView view;
    protected LoginService service;
    protected LoginPresenter presenter;
    
    @BeforeEach
    public void setUp() {
        view = mock(LoginView.class);
        service = mock(LoginService.class);
        presenter = new DefaultLoginPresenter(view, service);
    }
    
}
