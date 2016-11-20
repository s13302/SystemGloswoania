package pl.hackngo.esn.repository;

import org.springframework.data.repository.Repository;
import pl.hackngo.esn.entity.Session;

import java.util.Collection;

/**
 * Created by rpi on 20.11.16.
 */
public interface SessionRepository extends Repository<Session, Long> {

    Collection<Session> findAll();

    Session findById(Long id);

    Session findByQr(String qr);

    Session save(Session session);

}
