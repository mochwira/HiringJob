/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiring.jobs.controller;

import com.hiring.jobs.entity.TblApplicationStatus;
import com.hiring.jobs.services.ApplicationStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author D
 */
@Controller
@RequestMapping
public class ApplicationStatusController {
    
    @Autowired
    private ApplicationStatusService appStatusService;
    
    @GetMapping("/status")
    public String getConsultattionStatus(Model model) {
        Iterable<TblApplicationStatus> applicationStatus = appStatusService.getApplicationStatusActive();
        model.addAttribute("status", applicationStatus);

        TblApplicationStatus applicationStatusCrud = new TblApplicationStatus();

        model.addAttribute("addApplicationStatusCrud", applicationStatusCrud);        
        model.addAttribute("editApplicationStatusCrud", applicationStatusCrud);
        model.addAttribute("removeApplicationStatusCrud", applicationStatusCrud);
        
        return "index.html";
//        return "application_status/v_page_consultationstatus.html";
    }
    
}
