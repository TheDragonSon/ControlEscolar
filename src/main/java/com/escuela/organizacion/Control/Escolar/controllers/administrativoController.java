package com.escuela.organizacion.Control.Escolar.controllers;

import com.escuela.organizacion.Control.Escolar.dao.IusuariosDao;
import com.escuela.organizacion.Control.Escolar.entity.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;
import java.util.Map;


@Controller
public class administrativoController {
    @Autowired
    private IusuariosDao usuarioDao;

    @RequestMapping(value = "/form")
    public String crear(Map<String, Object> model) {
        usuario Usuario = new usuario();
        model.put("Usuario", Usuario);
        model.put("titulo", "Formulario");
        return "form";
    }
    @RequestMapping(value = "/registrovalido")
    public String validar (Map<String, Object> model) {
        return "registrovalido";
    }

    /*
        @RequestMapping(value = "/form", method = RequestMethod.POST)
        public String guardar( usuario Usuario) {
            usuarioDao.save(Usuario);

            return "redirect:form";
        }
    */
    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String guardar(@Valid usuario Usuario, BindingResult result, Model model, SessionStatus status) {

        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario de Cliente");
            return "form";
        }

        usuarioDao.save(Usuario);
        status.setComplete();
        return "redirect:registrovalido";
    }
}
