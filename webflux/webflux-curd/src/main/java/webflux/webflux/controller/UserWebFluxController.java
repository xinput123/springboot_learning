package webflux.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import webflux.domain.User;
import webflux.handler.UserHandler;

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
    private UserHandler userHandler;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Mono<User> findUserById(@PathVariable("id") String id) {
        return userHandler.findUserById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Flux<User> findAllUser() {
        return userHandler.findAllUser();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Mono<String> saveUser(@RequestBody User user) {
        return userHandler.save(user);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Mono<String> modifyUser(@RequestBody User user) {
        return userHandler.modifyUser(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Mono<String> deleteUser(@PathVariable("id") String id) {
        return userHandler.deleteUser(id);
    }

}
