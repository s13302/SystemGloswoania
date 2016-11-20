package pl.hackngo.esn.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import pl.hackngo.esn.entity.User;

/**
 * Created by rpi on 20.11.16.
 */

@Service
public class UserService extends UserDetailService {

    public User getLoggedUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return (User) auth.getPrincipal();
    }

}
