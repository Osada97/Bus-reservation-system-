/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INFT;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author OzKA
 */
@Entity
@Table(name = "addbus", catalog = "create_login", schema = "")
@NamedQueries({
    @NamedQuery(name = "Addbus.findAll", query = "SELECT a FROM Addbus a")
    , @NamedQuery(name = "Addbus.findByBusname", query = "SELECT a FROM Addbus a WHERE a.busname = :busname")
    , @NamedQuery(name = "Addbus.findByBustype", query = "SELECT a FROM Addbus a WHERE a.bustype = :bustype")
    , @NamedQuery(name = "Addbus.findByStarpoint", query = "SELECT a FROM Addbus a WHERE a.starpoint = :starpoint")
    , @NamedQuery(name = "Addbus.findByStarttime", query = "SELECT a FROM Addbus a WHERE a.starttime = :starttime")
    , @NamedQuery(name = "Addbus.findByBusreginum", query = "SELECT a FROM Addbus a WHERE a.busreginum = :busreginum")
    , @NamedQuery(name = "Addbus.findByMaxseats", query = "SELECT a FROM Addbus a WHERE a.maxseats = :maxseats")
    , @NamedQuery(name = "Addbus.findByArivalpoint", query = "SELECT a FROM Addbus a WHERE a.arivalpoint = :arivalpoint")
    , @NamedQuery(name = "Addbus.findByArivaltime", query = "SELECT a FROM Addbus a WHERE a.arivaltime = :arivaltime")})
public class Addbus implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "busname")
    private String busname;
    @Basic(optional = false)
    @Column(name = "bustype")
    private String bustype;
    @Basic(optional = false)
    @Column(name = "starpoint")
    private String starpoint;
    @Basic(optional = false)
    @Column(name = "starttime")
    private String starttime;
    @Id
    @Basic(optional = false)
    @Column(name = "busreginum")
    private String busreginum;
    @Basic(optional = false)
    @Column(name = "maxseats")
    private String maxseats;
    @Basic(optional = false)
    @Column(name = "arivalpoint")
    private String arivalpoint;
    @Basic(optional = false)
    @Column(name = "arivaltime")
    private String arivaltime;

    public Addbus() {
    }

    public Addbus(String busreginum) {
        this.busreginum = busreginum;
    }

    public Addbus(String busreginum, String busname, String bustype, String starpoint, String starttime, String maxseats, String arivalpoint, String arivaltime) {
        this.busreginum = busreginum;
        this.busname = busname;
        this.bustype = bustype;
        this.starpoint = starpoint;
        this.starttime = starttime;
        this.maxseats = maxseats;
        this.arivalpoint = arivalpoint;
        this.arivaltime = arivaltime;
    }

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        String oldBusname = this.busname;
        this.busname = busname;
        changeSupport.firePropertyChange("busname", oldBusname, busname);
    }

    public String getBustype() {
        return bustype;
    }

    public void setBustype(String bustype) {
        String oldBustype = this.bustype;
        this.bustype = bustype;
        changeSupport.firePropertyChange("bustype", oldBustype, bustype);
    }

    public String getStarpoint() {
        return starpoint;
    }

    public void setStarpoint(String starpoint) {
        String oldStarpoint = this.starpoint;
        this.starpoint = starpoint;
        changeSupport.firePropertyChange("starpoint", oldStarpoint, starpoint);
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        String oldStarttime = this.starttime;
        this.starttime = starttime;
        changeSupport.firePropertyChange("starttime", oldStarttime, starttime);
    }

    public String getBusreginum() {
        return busreginum;
    }

    public void setBusreginum(String busreginum) {
        String oldBusreginum = this.busreginum;
        this.busreginum = busreginum;
        changeSupport.firePropertyChange("busreginum", oldBusreginum, busreginum);
    }

    public String getMaxseats() {
        return maxseats;
    }

    public void setMaxseats(String maxseats) {
        String oldMaxseats = this.maxseats;
        this.maxseats = maxseats;
        changeSupport.firePropertyChange("maxseats", oldMaxseats, maxseats);
    }

    public String getArivalpoint() {
        return arivalpoint;
    }

    public void setArivalpoint(String arivalpoint) {
        String oldArivalpoint = this.arivalpoint;
        this.arivalpoint = arivalpoint;
        changeSupport.firePropertyChange("arivalpoint", oldArivalpoint, arivalpoint);
    }

    public String getArivaltime() {
        return arivaltime;
    }

    public void setArivaltime(String arivaltime) {
        String oldArivaltime = this.arivaltime;
        this.arivaltime = arivaltime;
        changeSupport.firePropertyChange("arivaltime", oldArivaltime, arivaltime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (busreginum != null ? busreginum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addbus)) {
            return false;
        }
        Addbus other = (Addbus) object;
        if ((this.busreginum == null && other.busreginum != null) || (this.busreginum != null && !this.busreginum.equals(other.busreginum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "INFT.Addbus[ busreginum=" + busreginum + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
