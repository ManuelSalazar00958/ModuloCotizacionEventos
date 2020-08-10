/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author andres
 */
@Entity
@Table(name = "portafolio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Portafolio.findAll", query = "SELECT p FROM Portafolio p")
    , @NamedQuery(name = "Portafolio.findByIdPortafolio", query = "SELECT p FROM Portafolio p WHERE p.idPortafolio = :idPortafolio")})
public class Portafolio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPortafolio")
    private Integer idPortafolio;
    @JoinColumn(name = "Servicos_id", referencedColumnName = "idServicios")
    @ManyToOne(optional = false)
    private Servicios servicosid;
    @JoinColumn(name = "Stock_id", referencedColumnName = "idStock")
    @ManyToOne(optional = false)
    private Stock stockid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "portafolioid")
    private Collection<Eventos> eventosCollection;

    public Portafolio() {
    }

    public Portafolio(Integer idPortafolio) {
        this.idPortafolio = idPortafolio;
    }

    public Integer getIdPortafolio() {
        return idPortafolio;
    }

    public void setIdPortafolio(Integer idPortafolio) {
        this.idPortafolio = idPortafolio;
    }

    public Servicios getServicosid() {
        return servicosid;
    }

    public void setServicosid(Servicios servicosid) {
        this.servicosid = servicosid;
    }

    public Stock getStockid() {
        return stockid;
    }

    public void setStockid(Stock stockid) {
        this.stockid = stockid;
    }

    @XmlTransient
    public Collection<Eventos> getEventosCollection() {
        return eventosCollection;
    }

    public void setEventosCollection(Collection<Eventos> eventosCollection) {
        this.eventosCollection = eventosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPortafolio != null ? idPortafolio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Portafolio)) {
            return false;
        }
        Portafolio other = (Portafolio) object;
        if ((this.idPortafolio == null && other.idPortafolio != null) || (this.idPortafolio != null && !this.idPortafolio.equals(other.idPortafolio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Portafolio[ idPortafolio=" + idPortafolio + " ]";
    }
    
}
