package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Mehmet Akif Tanisik
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String productName;
    private Double price;

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
