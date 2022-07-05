package br.com.castgroup.escola.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.castgroup.escola.service.DBService;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	private DBService dbService;
	
//	@Value("${}")
//	private String strategy;

}
