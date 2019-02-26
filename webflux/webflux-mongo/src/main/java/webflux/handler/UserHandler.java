package webflux.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import webflux.dao.UserRepository;
import webflux.domain.User;

/**
 * @Author: xinput
 * @Date: 2019-02-22 14:59
 * @Versioin: 1.0.0
 * @Description: Mono : 实现发布者，并返回 0 或 1 个元素，即单对象
 * Flux : 实现发布者，并返回 N 个元素，即List列表对象
 * 使用Flux 和 Mono 是非阻塞写法，相当于回调方式。
 */
@Component
public class UserHandler {

    private final UserRepository userRepository;

    @Autowired
    public UserHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<User> save(User user) {
        return userRepository.save(user);
    }

    public Mono<User> findUserById(String id) {
        return userRepository.findById(id);
    }

    public Flux<User> findAllUser() {
        return userRepository.findAll();
    }

    public Mono<User> modifyUser(User user) {
        return userRepository.save(user);
    }

    public Mono<String> deleteUser(String id) {
        userRepository.deleteById(id);
        return Mono.create(cityMonoSink -> cityMonoSink.success(id));
    }
}
