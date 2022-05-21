/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package carpediem.mvp2.login.PresenterFacts;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author carlos
 */
public class TheLoginMethodTests extends BaseFacts {
    
    @Test
    public void showsErrorMessage() {
        var user = "John";
        var pass = "1234";
        when(view.getUser()).thenReturn(user);
        when(view.getPassword()).thenReturn(pass);
        when(service.login(user, pass)).thenReturn(false);
        presenter.login();
        verify(view).getUser();
        verify(view).getPassword();
        verify(service).login(user, pass);
        verify(view).showLoginError();
    }

    @Test
    public void logsInTheUser() {
        var user = "John";
        var pass = "1234";
        when(view.getUser()).thenReturn(user);
        when(view.getPassword()).thenReturn(pass);
        when(service.login(user, pass)).thenReturn(true);
        presenter.login();
        verify(view).getUser();
        verify(view).getPassword();
        verify(service).login(user, pass);
        verify(view).hideLogin();
        verify(view).showLoggedIn();
    }
    
}
