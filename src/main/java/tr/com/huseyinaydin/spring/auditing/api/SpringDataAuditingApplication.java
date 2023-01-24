package tr.com.huseyinaydin.spring.auditing.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Boot JPA Auditing
 * 
 */

@SpringBootApplication
@EnableJpaAuditing
public class SpringDataAuditingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataAuditingApplication.class, args);
	}
}
