package crud.crud.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public long id;
  public String product;
  public String description;
  public String price;
  public String quantity;
  
  public User() {
  }

  public User(long id, String product, String description, String price, String quantity) {
    this.id = id;
    this.product = product;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", product=" + product + ", description=" + description + ", price=" + price
        + ", quantity=" + quantity + "]";
  }

  
  
}
