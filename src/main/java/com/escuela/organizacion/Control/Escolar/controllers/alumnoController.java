package com.escuela.organizacion.Control.Escolar.controllers;


import com.escuela.organizacion.Control.Escolar.dao.IalumnoDao;
import com.escuela.organizacion.Control.Escolar.dao.IusuariosDao;
import com.escuela.organizacion.Control.Escolar.entity.alumno;
import com.escuela.organizacion.Control.Escolar.entity.maestro;
import com.escuela.organizacion.Control.Escolar.entity.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

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
    public String index(Map<String, Object> model) {
        usuario Usuario= new usuario();
        model.put("Usuario", Usuario);
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

    @RequestMapping(value = "/alumno")
    public String alumnno() {
        return "alumno";
    }

    @RequestMapping(value = "/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @RequestMapping(value = "/maestroAux")
    public String maestroAux( Map<String, Object> model ) {
        maestro Maestro = new maestro();
        model.put("Maestro",Maestro);
        return "maestroAux";
    }



    @RequestMapping(value = "/regalumno")
    public String regalumno( Map<String, Object> model ) {
        alumno Alumno = new alumno();
        model.put("Alumno",Alumno);
        return "regalumno";
    }



}
