package com.kazale.pontointeligente.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@EnableJpaRepositories
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class PontoInteligenteApplicationTests {

	@Test
	public void contextLoads() {
	}

}
