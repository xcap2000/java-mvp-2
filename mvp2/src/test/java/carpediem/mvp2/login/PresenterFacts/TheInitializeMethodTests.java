package carpediem.mvp2.login.PresenterFacts;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.verify;

/**
 *
 * @author carlos
 */
public class TheInitializeMethodTests extends BaseFacts {
    
    @Test
    public void initializesTheView() {
        presenter.initialize();
        verify(view).showLoginPanel();
    }
    
}
