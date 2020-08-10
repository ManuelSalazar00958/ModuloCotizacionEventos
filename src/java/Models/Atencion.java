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
@Table(name = "atencion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atencion.findAll", query = "SELECT a FROM Atencion a")
    , @NamedQuery(name = "Atencion.findByIdAtencion", query = "SELECT a FROM Atencion a WHERE a.idAtencion = :idAtencion")})
public class Atencion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAtencion")
    private Integer idAtencion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "atencionid")
    private Collection<Reservacion> reservacionCollection;
    @JoinColumn(name = "Registro_id", referencedColumnName = "idRegistro")
    @ManyToOne(optional = false)
    private Registro registroid;

    public Atencion() {
    }

    public Atencion(Integer idAtencion) {
        this.idAtencion = idAtencion;
    }

    public Integer getIdAtencion() {
        return idAtencion;
    }

    public void setIdAtencion(Integer idAtencion) {
        this.idAtencion = idAtencion;
    }

    @XmlTransient
    public Collection<Reservacion> getReservacionCollection() {
        return reservacionCollection;
    }

    public void setReservacionCollection(Collection<Reservacion> reservacionCollection) {
        this.reservacionCollection = reservacionCollection;
    }

    public Registro getRegistroid() {
        return registroid;
    }

    public void setRegistroid(Registro registroid) {
        this.registroid = registroid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAtencion != null ? idAtencion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atencion)) {
            return false;
        }
        Atencion other = (Atencion) object;
        if ((this.idAtencion == null && other.idAtencion != null) || (this.idAtencion != null && !this.idAtencion.equals(other.idAtencion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Atencion[ idAtencion=" + idAtencion + " ]";
    }
    
}
