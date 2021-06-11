/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiring.jobs.controller;




import com.hiring.jobs.entity.TblDepartement;
import com.hiring.jobs.services.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author MELLA
 */
@Controller
@RequestMapping
public class DepartementController {
    
 
    @Autowired
    private DepartementService departementService;
    
    
    @GetMapping("/departement")
    public String getDepartementStatus (Model model){
        Iterable<TblDepartement> departementStatus = this.departementService.getDepartementStatusActive();
        model.addAttribute("status", departementStatus);

        TblDepartement departementCrud = new TblDepartement();

        model.addAttribute("addApplicationStatusCrud", departementCrud);        
        model.addAttribute("editApplicationStatusCrud", departementCrud);
        model.addAttribute("removeApplicationStatusCrud", departementCrud);
        
        return "index.html";
    }
    
//    @GetMapping("/departement")
//    public String getRole (Model departementModel){
//       Iterable<TblDepartement> dep = departement.findAll();
//       departementModel.addAttribute("departement", dep);
//
//        TblDepartement depart = new TblDepartement();
//        departementModel.addAttribute("add", depart);        
//        departementModel.addAttribute("edit", depart);
//        departementModel.addAttribute("remove", depart);
//        
//        
//        System.out.println(("add"));
//        System.out.println(departement);
//        return "product/v_page_product_category"; 
//    }
    
    
    
}
        
//    @GetMapping("/departement")
//    public String getDepartement() {
//        
//        
//        Iterable<TblDepartement> departements = departement.findAll();
//        //for(departement d = d.deprtement_id, d.departement_name, d.departmenet_status )
//        System.out.println(departements.toString());
//        return "index.html";
//        
//    }
//    @GetMapping("/testdepartement")
//    public String getTest() {
//
//        //Iterable<TblDepartement> departements = departement.findAll();
//        //System.out.println(departements.toString());
//        return "index.html";
//
//    }

//}
