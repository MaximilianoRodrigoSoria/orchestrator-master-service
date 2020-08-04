#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.graphql;

import ${package}.models.client.ProductFeingClient;
import ${package}.models.pojo.Product;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductGraphQL implements GraphQLQueryResolver {

    private ProductFeingClient productFeingClient;

    public Product getProduct(Long id){
        Product product = productFeingClient.findById(id).getBody();
        return  product;
    }



    @Autowired
    public void setProductFeingClient(ProductFeingClient productFeingClient){
        this.productFeingClient = productFeingClient;
    }
}
