package slim.vo.subscription;
// Generated 16 Feb, 2012 1:59:06 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Subscription generated by hbm2java
 */
@XmlRootElement
@Entity
@Table(name="subscription"
    ,catalog="slim"
)
public class Subscription  implements java.io.Serializable {


    private SubscriptionId id;
    private String sourcews;

    public Subscription() {
    }

    public Subscription(SubscriptionId id) {
       this.id = id;
    }
   
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="source", column=@Column(name="source", nullable=false, length=200) ), 
        @AttributeOverride(name="target", column=@Column(name="target", nullable=false, length=200) ) } )
    public SubscriptionId getId() {
        return this.id;
    }


    
    public void setId(SubscriptionId id) {
        this.id = id;
    }

    @Column(name="sourcews", nullable=false, length=200)
    public String getSourcews() {
        return sourcews;
    }

    public void setSourcews(String sourcews) {
        this.sourcews = sourcews;
    }

}


