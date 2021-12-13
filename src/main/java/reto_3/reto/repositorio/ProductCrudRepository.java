package reto_3.reto.repositorio;

import reto_3.reto.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product, String> {
    
}
