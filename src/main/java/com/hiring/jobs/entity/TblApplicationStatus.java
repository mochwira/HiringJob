/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiring.jobs.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mocha
 */
@Entity
@Table(name = "tbl_application_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblApplicationStatus.findAll", query = "SELECT t FROM TblApplicationStatus t"),
    @NamedQuery(name = "TblApplicationStatus.findByStatusId", query = "SELECT t FROM TblApplicationStatus t WHERE t.statusId = :statusId"),
    @NamedQuery(name = "TblApplicationStatus.findByNamaStatus", query = "SELECT t FROM TblApplicationStatus t WHERE t.namaStatus = :namaStatus"),
    @NamedQuery(name = "TblApplicationStatus.findByDetailStatus", query = "SELECT t FROM TblApplicationStatus t WHERE t.detailStatus = :detailStatus")})
public class TblApplicationStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "status_id")
    private Integer statusId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nama_status")
    private String namaStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "detail_status")
    private boolean detailStatus;

    public TblApplicationStatus() {
    }

    public TblApplicationStatus(Integer statusId) {
        this.statusId = statusId;
    }

    public TblApplicationStatus(Integer statusId, String namaStatus, boolean detailStatus) {
        this.statusId = statusId;
        this.namaStatus = namaStatus;
        this.detailStatus = detailStatus;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getNamaStatus() {
        return namaStatus;
    }

    public void setNamaStatus(String namaStatus) {
        this.namaStatus = namaStatus;
    }

    public boolean getDetailStatus() {
        return detailStatus;
    }

    public void setDetailStatus(boolean detailStatus) {
        this.detailStatus = detailStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statusId != null ? statusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblApplicationStatus)) {
            return false;
        }
        TblApplicationStatus other = (TblApplicationStatus) object;
        if ((this.statusId == null && other.statusId != null) || (this.statusId != null && !this.statusId.equals(other.statusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hiring.jobs.entity.TblApplicationStatus[ statusId=" + statusId + " ]";
    }
    
}
