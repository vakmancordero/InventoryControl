package inventory.model;
// Generated 20-may-2017 0:21:57 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Transfer generated by hbm2java
 */
@Entity
@Table(name="transfer"
    ,catalog="kaizenso_inventory"
    , uniqueConstraints = @UniqueConstraint(columnNames="code") 
)
public class Transfer  implements java.io.Serializable {


     private Product product;
     private Store storeByFromStore;
     private Store storeByToStore;
     private String code;
     private Long quantity;
     private String description;
     private Date initialDate;
     private Date endDate;
     private String status;

    public Transfer() {
    }

	
    public Transfer(Product product, Store storeByFromStore, Store storeByToStore, String code, Date initialDate, Date endDate) {
        this.product = product;
        this.storeByFromStore = storeByFromStore;
        this.storeByToStore = storeByToStore;
        this.code = code;
        this.initialDate = initialDate;
        this.endDate = endDate;
    }
    public Transfer(Product product, Store storeByFromStore, Store storeByToStore, String code, Long quantity, String description, Date initialDate, Date endDate, String status) {
       this.product = product;
       this.storeByFromStore = storeByFromStore;
       this.storeByToStore = storeByToStore;
       this.code = code;
       this.quantity = quantity;
       this.description = description;
       this.initialDate = initialDate;
       this.endDate = endDate;
       this.status = status;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="id", column=@Column(name="id", nullable=false) ), 
        @AttributeOverride(name="fromStore", column=@Column(name="from_store", nullable=false) ), 
        @AttributeOverride(name="toStore", column=@Column(name="to_store", nullable=false) ), 
        @AttributeOverride(name="productId", column=@Column(name="product_id", nullable=false) ) } )

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_id", nullable=false, insertable=false, updatable=false)
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="from_store", nullable=false, insertable=false, updatable=false)
    public Store getStoreByFromStore() {
        return this.storeByFromStore;
    }
    
    public void setStoreByFromStore(Store storeByFromStore) {
        this.storeByFromStore = storeByFromStore;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="to_store", nullable=false, insertable=false, updatable=false)
    public Store getStoreByToStore() {
        return this.storeByToStore;
    }
    
    public void setStoreByToStore(Store storeByToStore) {
        this.storeByToStore = storeByToStore;
    }

    
    @Column(name="code", unique=true, nullable=false)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    
    @Column(name="quantity")
    public Long getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    
    @Column(name="description", length=65535)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="initial_date", nullable=false, length=19)
    public Date getInitialDate() {
        return this.initialDate;
    }
    
    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="end_date", nullable=false, length=19)
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    @Column(name="status", length=100)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


