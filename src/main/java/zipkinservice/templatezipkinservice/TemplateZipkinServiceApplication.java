package zipkinservice.templatezipkinservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class TemplateZipkinServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateZipkinServiceApplication.class, args);
	}
}
