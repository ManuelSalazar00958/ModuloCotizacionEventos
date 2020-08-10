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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author andres
 */
@Entity
@Table(name = "tipoproducto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoproducto.findAll", query = "SELECT t FROM Tipoproducto t")
    , @NamedQuery(name = "Tipoproducto.findByIdTproducto", query = "SELECT t FROM Tipoproducto t WHERE t.idTproducto = :idTproducto")
    , @NamedQuery(name = "Tipoproducto.findByTipodeProducto", query = "SELECT t FROM Tipoproducto t WHERE t.tipodeProducto = :tipodeProducto")})
public class Tipoproducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTproducto")
    private Integer idTproducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Tipo_de_Producto")
    private String tipodeProducto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoproductoid")
    private Collection<Stock> stockCollection;

    public Tipoproducto() {
    }

    public Tipoproducto(Integer idTproducto) {
        this.idTproducto = idTproducto;
    }

    public Tipoproducto(Integer idTproducto, String tipodeProducto) {
        this.idTproducto = idTproducto;
        this.tipodeProducto = tipodeProducto;
    }

    public Integer getIdTproducto() {
        return idTproducto;
    }

    public void setIdTproducto(Integer idTproducto) {
        this.idTproducto = idTproducto;
    }

    public String getTipodeProducto() {
        return tipodeProducto;
    }

    public void setTipodeProducto(String tipodeProducto) {
        this.tipodeProducto = tipodeProducto;
    }

    @XmlTransient
    public Collection<Stock> getStockCollection() {
        return stockCollection;
    }

    public void setStockCollection(Collection<Stock> stockCollection) {
        this.stockCollection = stockCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTproducto != null ? idTproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoproducto)) {
            return false;
        }
        Tipoproducto other = (Tipoproducto) object;
        if ((this.idTproducto == null && other.idTproducto != null) || (this.idTproducto != null && !this.idTproducto.equals(other.idTproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Tipoproducto[ idTproducto=" + idTproducto + " ]";
    }
    
}
