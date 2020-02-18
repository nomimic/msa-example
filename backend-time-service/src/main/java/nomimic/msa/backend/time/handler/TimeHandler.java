package nomimic.msa.backend.time.handler;

import nomimic.msa.backend.time.data.Time;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.ZonedDateTime;

@Component
public class TimeHandler {

	public Mono<ServerResponse> getCurrentTime(ServerRequest request) {
		return ServerResponse.ok()
				.body(Mono.just(new Time(ZonedDateTime.now())), Time.class);
	}
}
