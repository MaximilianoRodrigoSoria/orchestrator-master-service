package ar.com.example.graphql;



import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

	public String echoTest() {
		return "Api found OK!!! ";
	}



}
