package com.Grocery.App.model;


import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;


import java.util.List;

@Entity
@Table(name = "Order_Table_007")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long orderId;

  private String paymentDate;
  private String status;

  @OneToMany(fetch = FetchType.EAGER)
  private List<Product> productList;





  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }

  public List<Product> getProductList() {
    return productList;
  }

  public void setProductList(List<Product> productList) {
    this.productList = productList;
  }

  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
