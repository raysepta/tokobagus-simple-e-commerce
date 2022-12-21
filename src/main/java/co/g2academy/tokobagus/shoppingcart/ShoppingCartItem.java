package co.g2academy.tokobagus.shoppingcart;

import co.g2academy.tokobagus.model.Product;

import javax.persistence.*;

@Entity
@Table(name = "t_shopping_cart_item")
public class ShoppingCartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer price;
    @Column(nullable = false)
    private Integer quantity;
    @ManyToOne
    @JoinColumn(nullable = false, name = "id_product")
    private Product product;
    @ManyToOne
    @JoinColumn(nullable = false, name = "id_shopping_cart")
    private ShoppingCart cart;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }
}
