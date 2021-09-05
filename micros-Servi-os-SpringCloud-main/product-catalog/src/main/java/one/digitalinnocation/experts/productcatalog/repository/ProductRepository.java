package one.digitalinnocation.experts.productcatalog.repository;

import one.digitalinnocation.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    Optional<Product> findAllById(Integer id);
}
