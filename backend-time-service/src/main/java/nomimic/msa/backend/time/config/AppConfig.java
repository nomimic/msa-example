package nomimic.msa.backend.time.config;

import nomimic.msa.backend.time.handler.TimeHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class AppConfig {

	private final TimeHandler timeHandler;

	public AppConfig(TimeHandler timeHandler) {
		this.timeHandler = timeHandler;
	}

	@Bean
	public RouterFunction<ServerResponse> routerFunction() {
		return RouterFunctions.route()
				.GET("/time",timeHandler::getCurrentTime)
				.build();
	}
}
