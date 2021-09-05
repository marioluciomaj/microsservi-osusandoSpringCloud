package one.digitalinnocation.experts.productcatalog.Controller;


import lombok.Getter;

import lombok.Setter;
import one.digitalinnocation.experts.productcatalog.model.Product;
import one.digitalinnocation.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "Product")
@Getter
@Setter
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody  Product product) {
       return productRepository.save(product);

    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET )
    Optional <Product> findbyId(@PathVariable Integer id ) {
        return productRepository.findAllById(id);

    }
}




