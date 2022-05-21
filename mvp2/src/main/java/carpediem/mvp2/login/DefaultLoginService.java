/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpediem.mvp2.login;

import carpediem.mvp2.login.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class DefaultLoginService implements LoginService {
    
    private final List<User> users;

    public DefaultLoginService() {
        users = new ArrayList<User>(){{
            add(new User("admin", "admin"));
        }};
    }

    @Override
    public boolean login(String user, String password) {
        return users
                .stream()
                .anyMatch(u -> u.getUser().equals(user) && u.getPassword().equals(password));
    }
    
}
