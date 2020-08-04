package ar.com.example.models.client;

;
import ar.com.example.models.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="${feing.client.product.target}")
public interface ProductFeingClient {
	
	@GetMapping("/product/find-all")
	public List<Product> findAll();

	@GetMapping("/product/find-by-id/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id);
	
	@PostMapping("/save")
	public ResponseEntity<Product> save(@RequestBody Product product) throws Exception;	
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Product> edit(@RequestBody Product product, @PathVariable Long id) throws Exception;
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) throws Exception;
	
}
