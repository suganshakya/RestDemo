package np.shakya.sugan.etl.dao;

import javax.persistence.*;

import org.joda.time.DateTime;

/**
 * Created by sugan on 27/08/16.
 */
@Entity
@Table(name = "ORDER")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;

    @Column(name = "RequestTime")
    private DateTime requestTime;

    @Column(name = "ValidityEndTime")
    private DateTime validityEndTime;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Customer customer;

    public Order(){
        // TODO
    }

    public Order(DateTime requestTime, DateTime validityEndTime, Product product, Customer customer) {
        this.requestTime = requestTime;
        this.validityEndTime = validityEndTime;
        this.product = product;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DateTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(DateTime requestTime) {
        this.requestTime = requestTime;
    }

    public DateTime getValidityEndTime() {
        return validityEndTime;
    }

    public void setValidityEndTime(DateTime validityEndTime) {
        this.validityEndTime = validityEndTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCustomer(Customer customer) {
        this.customer= customer;

    }
}
