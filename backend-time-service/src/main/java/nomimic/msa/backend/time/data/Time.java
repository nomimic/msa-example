package nomimic.msa.backend.time.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;

public class Time {

	@JsonProperty(value = "timestamp")
	private String timestamp;

	public Time(ZonedDateTime zonedDateTime) {
		this.timestamp = zonedDateTime.toString();
	}
}
