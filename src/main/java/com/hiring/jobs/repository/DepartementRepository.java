/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiring.jobs.repository;

import com.hiring.jobs.entity.TblDepartement;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author MELLA
 */
public interface DepartementRepository extends CrudRepository<TblDepartement, Integer>{
    @Query(value = "SELECT * FROM TblDepartement WHERE departement_id.status = 1", nativeQuery = true)
    Iterable <TblDepartement> getDepartementStatusActive();

    
}
