package samantha.com.sem3ssq

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService {
    @Autowired
    private lateinit var productRepository: ProductRepository

    fun listar(): List<Product>{
        return productRepository.findAll()
    }
}