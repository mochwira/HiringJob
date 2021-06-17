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
@Table(name = "tbl_job")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblJob.findAll", query = "SELECT t FROM TblJob t"),
    @NamedQuery(name = "TblJob.findByJobId", query = "SELECT t FROM TblJob t WHERE t.jobId = :jobId"),
    @NamedQuery(name = "TblJob.findByNamaJob", query = "SELECT t FROM TblJob t WHERE t.namaJob = :namaJob"),
    @NamedQuery(name = "TblJob.findByKriteriaJob", query = "SELECT t FROM TblJob t WHERE t.kriteriaJob = :kriteriaJob"),
    @NamedQuery(name = "TblJob.findByDeskripsiJob", query = "SELECT t FROM TblJob t WHERE t.deskripsiJob = :deskripsiJob")})
public class TblJob implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "job_id")
    private Integer jobId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nama_job")
    private String namaJob;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "kriteria_job")
    private String kriteriaJob;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "deskripsi_job")
    private String deskripsiJob;

    public TblJob() {
    }

    public TblJob(Integer jobId) {
        this.jobId = jobId;
    }

    public TblJob(Integer jobId, String namaJob, String kriteriaJob, String deskripsiJob) {
        this.jobId = jobId;
        this.namaJob = namaJob;
        this.kriteriaJob = kriteriaJob;
        this.deskripsiJob = deskripsiJob;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getNamaJob() {
        return namaJob;
    }

    public void setNamaJob(String namaJob) {
        this.namaJob = namaJob;
    }

    public String getKriteriaJob() {
        return kriteriaJob;
    }

    public void setKriteriaJob(String kriteriaJob) {
        this.kriteriaJob = kriteriaJob;
    }

    public String getDeskripsiJob() {
        return deskripsiJob;
    }

    public void setDeskripsiJob(String deskripsiJob) {
        this.deskripsiJob = deskripsiJob;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobId != null ? jobId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblJob)) {
            return false;
        }
        TblJob other = (TblJob) object;
        if ((this.jobId == null && other.jobId != null) || (this.jobId != null && !this.jobId.equals(other.jobId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hiring.jobs.entity.TblJob[ jobId=" + jobId + " ]";
    }
    
}
