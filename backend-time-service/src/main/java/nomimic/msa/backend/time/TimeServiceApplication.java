package nomimic.msa.backend.time;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TimeServiceApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder(TimeServiceApplication.class);

		applicationBuilder.web(WebApplicationType.REACTIVE)
				.build()
				.run(args);
	}
}
