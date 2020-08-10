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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author andres
 */
@Entity
@Table(name = "stock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stock.findAll", query = "SELECT s FROM Stock s")
    , @NamedQuery(name = "Stock.findByIdStock", query = "SELECT s FROM Stock s WHERE s.idStock = :idStock")
    , @NamedQuery(name = "Stock.findByDisponibilidad", query = "SELECT s FROM Stock s WHERE s.disponibilidad = :disponibilidad")})
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idStock")
    private Integer idStock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Disponibilidad")
    private boolean disponibilidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stockid")
    private Collection<Portafolio> portafolioCollection;
    @JoinColumn(name = "Productos_id", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto productosid;
    @JoinColumn(name = "Tipo_producto_id", referencedColumnName = "idTproducto")
    @ManyToOne(optional = false)
    private Tipoproducto tipoproductoid;

    public Stock() {
    }

    public Stock(Integer idStock) {
        this.idStock = idStock;
    }

    public Stock(Integer idStock, boolean disponibilidad) {
        this.idStock = idStock;
        this.disponibilidad = disponibilidad;
    }

    public Integer getIdStock() {
        return idStock;
    }

    public void setIdStock(Integer idStock) {
        this.idStock = idStock;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @XmlTransient
    public Collection<Portafolio> getPortafolioCollection() {
        return portafolioCollection;
    }

    public void setPortafolioCollection(Collection<Portafolio> portafolioCollection) {
        this.portafolioCollection = portafolioCollection;
    }

    public Producto getProductosid() {
        return productosid;
    }

    public void setProductosid(Producto productosid) {
        this.productosid = productosid;
    }

    public Tipoproducto getTipoproductoid() {
        return tipoproductoid;
    }

    public void setTipoproductoid(Tipoproducto tipoproductoid) {
        this.tipoproductoid = tipoproductoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStock != null ? idStock.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.idStock == null && other.idStock != null) || (this.idStock != null && !this.idStock.equals(other.idStock))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Stock[ idStock=" + idStock + " ]";
    }
    
}
