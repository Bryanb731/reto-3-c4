package reto_3.reto.repositorio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reto_3.reto.model.Product;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    @Autowired
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll() {
        return productCrudRepository.findAll();
    }

    public Optional<Product> getProduct(String reference) {
        return productCrudRepository.findById(reference);
    }

    public Product create(Product product) {
        return productCrudRepository.save(product);
    }

    public void update(Product product) {
        productCrudRepository.save(product);
    }

    public void delete(Product product) {
        productCrudRepository.delete(product);
    }
}
