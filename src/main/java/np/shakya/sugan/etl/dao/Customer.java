package np.shakya.sugan.etl.dao;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Created by sugan on 27/08/16.
 */
@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Address")
    private String address;

    public Customer() {
        // TODO
    }

    public Customer(String name, String address) {
        // TODO
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
