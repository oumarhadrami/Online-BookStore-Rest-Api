package com.mohamed.hadramy.firstonlinebookstorespringboot.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.mohamed.hadramy.firstonlinebookstorespringboot.model.Book;
import com.mohamed.hadramy.firstonlinebookstorespringboot.model.BookCategory;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry corsRegistry) {
		
		config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream()
				.map(Type::getJavaType)
				.toArray(Class[]::new));
		corsRegistry.addMapping("/**")
			  .allowedOrigins("http://localhost:4200");
		
		
		
	}
	
}
