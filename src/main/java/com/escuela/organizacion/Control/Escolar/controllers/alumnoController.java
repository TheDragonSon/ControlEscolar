package com.escuela.organizacion.Control.Escolar.controllers;


import com.escuela.organizacion.Control.Escolar.dao.IalumnoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class alumnoController {

   @Autowired
   private IalumnoDao alumnoDao;

    @RequestMapping(value = "/lista", method = RequestMethod.GET)
    public String lista(Model model) {
        model.addAttribute("titulo", "Listado de alumnos");
        model.addAttribute("alumnos", alumnoDao.findAll());
        return "lista";
    }


    @RequestMapping(value = "/")
    public String index() {
        return "Index";
    }

    @RequestMapping(value = "/maestro")
    public String maestro() {
        return "maestro";
    }


    @RequestMapping(value = "/admin")
    public String admin() {
        return "admin";
    }
}
