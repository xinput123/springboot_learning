package webflux.dao;

import org.springframework.stereotype.Repository;
import util.object.ObjectId;
import webflux.domain.User;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Author: xinput
 * @Date: 2019-02-22 14:56
 * @Versioin: 1.0.0
 * @Description:
 */
@Repository
public class UserRepository {

    /**
     * 数据存放在这里
     */
    private ConcurrentMap<String, User> repository = new ConcurrentHashMap<>();

    public String save(User user) {
        String id = ObjectId.stringId();
        user.setId(id);
        repository.put(id, user);
        return id;
    }

    public Collection<User> findAll() {
        return repository.values();
    }


    public User findUserById(String id) {
        return repository.get(id);
    }

    public String updateUser(User user) {
        repository.put(user.getId(), user);
        return user.getId();
    }

    public String deleteUser(String id) {
        repository.remove(id);
        return id;
    }
}
