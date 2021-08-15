package mike.demo.redis.module.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mike.demo.redis.module.user.model.UserSession;

@Repository
public interface UserRepository extends CrudRepository<UserSession, String> {

}
