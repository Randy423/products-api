package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Products")
public class ProductController {

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id){
        return new Product(id, "Laptop", 999.99);

    }
    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product){
        System.out.println(product);
        return product;
    }

    public String deleteProductById(@PathVariable Long id){
        return "product with ID: " + id + "has been deleted successfully";
    }
}
