package samantha.com.sem3ssq

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Controller("/product")
@RestController
class ProductController {
    @Autowired
    private lateinit var productService: ProductService

    @GetMapping()
    fun obtenerProductos(): List<Product>{
        return productService.Productos()
    }
}