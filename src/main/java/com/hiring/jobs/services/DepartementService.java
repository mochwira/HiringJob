/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiring.jobs.services;

import com.hiring.jobs.entity.TblDepartement;
import com.hiring.jobs.interfaces.DepartementInterface;
import com.hiring.jobs.repository.DepartementRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MELLA
 */
@Service
public class DepartementService implements DepartementInterface{
    
    @Autowired
    private DepartementRepository departementRepository;
    

    @Override
    public Iterable<TblDepartement> getAll() {
        return departementRepository.findAll();
    }

    @Override
    public Optional<TblDepartement> getById(Integer id) {
       return departementRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
       departementRepository.deleteById(id);
    }

    @Override
    public void save(TblDepartement departement) {
        departementRepository.save(departement);
    }

    @Override
    public Iterable<TblDepartement> getDepartementStatusActive() {
        return departementRepository.getDepartementStatusActive();
    }
    
}
