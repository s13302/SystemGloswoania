package pl.hackngo.esn.repository;

import org.springframework.data.repository.Repository;
import pl.hackngo.esn.entity.User;

/**
 * Created by rpi on 19.11.16.
 */
public interface UserRepository extends Repository<User, Long> {

    User findUserByUsername(String username);

}
