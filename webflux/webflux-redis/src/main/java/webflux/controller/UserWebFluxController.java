package webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import webflux.domain.User;

import java.util.concurrent.TimeUnit;

/**
 * @Author: xinput
 * @Date: 2019-02-22 14:59
 * @Versioin: 1.0.0
 * @Description:
 */
@RestController
@RequestMapping(value = "/users")
public class UserWebFluxController {

    @Autowired
    private RedisTemplate redisTemplate;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Mono<User> findUserById(@PathVariable("id") String id) {
        String key = "user_" + id;
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        boolean hasKey = redisTemplate.hasKey(key);
        User user = operations.get(key);

        if (!hasKey) {
            return Mono.create(monoSink -> monoSink.success(null));
        }
        return Mono.create(monoSink -> monoSink.success(user));
    }

    @RequestMapping(method = RequestMethod.POST)
    public Mono<User> saveUser(@RequestBody User user) {
        String key = "user_" + user.getId();
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        operations.set(key, user, 60, TimeUnit.SECONDS);

        return Mono.create(monoSink -> monoSink.success(user));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Mono<String> deleteUser(@PathVariable("id") String id) {
        String key = "user_" + id;
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            redisTemplate.delete(key);
        }
        return Mono.create(monoSink -> monoSink.success(id));
    }

}
