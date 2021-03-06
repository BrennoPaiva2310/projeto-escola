package br.com.castgroup.escola.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.castgroup.escola.service.DBService;

@Configuration
@Profile("test")
public class TestConfiguration {
	@Autowired
	private DBService dbservice;
	
	
	@Bean//Função para instanciar base de dados
	public void instanciaBaseDeDados() {
		this.dbservice.instanciaBaseDeDados();
	}

}
