package com.okta.kotlin  
  
import org.springframework.data.repository.CrudRepository  
import org.springframework.data.rest.core.annotation.RepositoryRestResource  
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@CrossOrigin(origins = "http://localhost:8080")
@RepositoryRestResource(collectionResourceRel = "coffeeshops", path = "coffeeshops")
interface CoffeeShopRepository : CrudRepository<CoffeeShopModel, Long> {
}

