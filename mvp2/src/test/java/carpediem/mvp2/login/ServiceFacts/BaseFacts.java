/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpediem.mvp2.login.ServiceFacts;

import carpediem.mvp2.login.DefaultLoginService;
import carpediem.mvp2.login.LoginService;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author carlos
 */
public class BaseFacts {
    
    protected LoginService service;
    
    @BeforeEach
    public void setUp() {
        service = new DefaultLoginService();
    }
    
}
