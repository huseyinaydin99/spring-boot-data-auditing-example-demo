package tr.com.huseyinaydin.spring.auditing.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Boot JPA Auditing
 * 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class InputRequest<T> {
	@JsonProperty(value = "userId", required = true)
	private String loggedInUser;
	private String timeZone;
	private T employee;
}
