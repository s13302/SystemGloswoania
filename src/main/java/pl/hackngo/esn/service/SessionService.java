package pl.hackngo.esn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hackngo.esn.repository.SessionRepository;

/**
 * Created by rpi on 20.11.16.
 */
@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

}
