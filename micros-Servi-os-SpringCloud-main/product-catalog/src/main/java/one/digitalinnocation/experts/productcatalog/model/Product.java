package one.digitalinnocation.experts.productcatalog.model;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;

@Getter
@Setter
@Builder
@AllArgsConstructor
@EqualsAndHashCode

@Document(indexName = "Product",type ="catalog" )
public class Product {

    @Id
    private Long id;
    private String name;
    private Integer amount;


}
