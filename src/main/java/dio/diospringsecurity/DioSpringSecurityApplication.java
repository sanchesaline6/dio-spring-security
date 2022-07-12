package dio.diospringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DioSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioSpringSecurityApplication.class, args);
	}

}
