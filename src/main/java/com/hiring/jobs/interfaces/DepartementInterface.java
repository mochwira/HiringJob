/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiring.jobs.interfaces;

import com.hiring.jobs.entity.TblApplicationStatus;
import com.hiring.jobs.entity.TblDepartement;
import com.hiring.jobs.entity.TblRole;
import java.util.Optional;

/**
 *
 * @author mocha
 */
public interface DepartementInterface {
    void save(TblDepartement departement);
    Iterable<TblDepartement> getDepartementActive();
    public Optional<TblDepartement> getDepartementById(Integer departementId);
}