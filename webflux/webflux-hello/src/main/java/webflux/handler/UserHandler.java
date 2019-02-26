package webflux.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @Author: xinput
 * @Date: 2019-02-22 10:55
 * @Versioin: 1.0.0
 * @Description:
 */
@Component
public class UserHandler {

    public Mono<ServerResponse> helloUser(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello, Xinput"));
    }
}
