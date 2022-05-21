/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package carpediem.mvp2.login.ServiceFacts;

import carpediem.mvp2.login.ServiceFacts.BaseFacts;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author carlos
 */
public class TheLoginMethodTests extends BaseFacts {
    
    @Test
    public void doesNotLogInForInexistingUserAndPassword() {
        assertFalse(service.login("admin", "admin1"));
    }

    @Test
    public void logsInForExistingUserAndPassword() {
        assertTrue(service.login("admin", "admin"));
    }
}
