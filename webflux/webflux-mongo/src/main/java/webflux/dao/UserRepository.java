package webflux.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import webflux.domain.User;

/**
 * @Author: xinput
 * @Date: 2019-02-22 14:56
 * @Versioin: 1.0.0
 * @Description:
 */
@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {

}
