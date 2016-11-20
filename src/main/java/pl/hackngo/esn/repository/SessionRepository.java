package pl.hackngo.esn.repository;

import org.springframework.data.repository.Repository;
import pl.hackngo.esn.entity.Session;

/**
 * Created by rpi on 20.11.16.
 */
public interface SessionRepository extends Repository<Session, Long> {

    Session findById(Long id);

    Session findByQr(String qr);

}
