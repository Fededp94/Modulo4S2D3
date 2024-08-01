import java.time.LocalDate;
import java.util.List;

public class Product {
    private Long id;
    private String name;
    private String category;
    private Double price;

}

public class Order {
    private Long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

}

public class Customer {
    private Long id;
    private String name;
    private Integer tier;

}

