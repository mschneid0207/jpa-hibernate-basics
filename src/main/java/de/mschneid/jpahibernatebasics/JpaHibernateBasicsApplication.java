package de.mschneid.jpahibernatebasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JpaHibernateBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateBasicsApplication.class, args);
	}
}
