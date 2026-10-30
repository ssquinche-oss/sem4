package samantha.com.sem3ssq

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.GenerationType
import jakarta.persistence.Table

@Entity
@Table(name = "product")
class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    var id: Int? = null
    var nombre: String? = null
    var descripcion: String? = null
    var precio: Double? = null
}