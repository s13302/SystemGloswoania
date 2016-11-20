package pl.hackngo.esn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hackngo.esn.entity.Session;
import pl.hackngo.esn.repository.SessionRepository;

import java.util.Collection;

/**
 * Created by rpi on 20.11.16.
 */
@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    public Collection<Session> loadAll() {
        return sessionRepository.findAll();
    }

    public Session loadById(Long id) {
        return sessionRepository.findById(id);
    }

    public Session loadByQr(String qr) {
        return sessionRepository.findByQr(qr);
    }

    public Session save(Session session) {
        session.setId(null);
        return sessionRepository.save(session);
    }

    public Session update(Long id, Session session) {
        Session dbSession = loadById(id);
        dbSession.setNazwa(session.getNazwa());
        dbSession.setKworum(session.getKworum());
        dbSession.setQr(session.getQr());
        dbSession.setStartDate(session.getStartDate());
        return sessionRepository.save(dbSession);
    }

}
