/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiring.jobs.interfaces;

import com.hiring.jobs.entity.TblDepartement;
import java.util.Optional;

/**
 *
 * @author MELLA
 */
public interface DepartementInterface {
   Iterable<TblDepartement> getAll(); 
    Optional<TblDepartement> getById(Integer id);
    void deleteById(Integer id);
    void save(TblDepartement departement);
    Iterable<TblDepartement> getDepartementStatusActive(); 
}
