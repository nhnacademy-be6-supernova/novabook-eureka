package store.novabook.eureka;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class EurekaApplicationTests {

	@Test
	void applicationStartsSuccessfully() {
		ConfigurableApplicationContext context = SpringApplication.run(EurekaApplication.class);

		assertNotNull(context, "Application context should not be null");
		assertNotNull(context.getBean(EurekaApplication.class), "EurekaApplication bean should be present");

		context.close();
	}
}
