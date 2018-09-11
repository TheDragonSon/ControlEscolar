package com.escuela.organizacion.Control.Escolar.controllers;

import com.escuela.organizacion.Control.Escolar.dao.IadministrativoDao;
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
import java.util.List;
import java.util.Map;


@Controller
public class administrativoController {
    @Autowired
    private IusuariosDao usuarioDao;

    @Autowired
    private IadministrativoDao administrativoDao;

    @RequestMapping(value = "/form")
    public String crear(Map<String, Object> model) {
        usuario Usuario = new usuario();
        model.put("Usuario", Usuario);
        model.put("titulo", "Formulario");
        return "form";
    }

    @RequestMapping(value = "/registrovalido")
    public String validar(Map<String, Object> model) {
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


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String login(usuario Usuario, Map<String, Object> model) {
        if (!usuarioDao.login(Usuario.getClave(), Usuario.getContrasenia()).isEmpty()) {
            System.out.println(usuarioDao.login(Usuario.getClave(), Usuario.getContrasenia()));
            List lista = usuarioDao.login(Usuario.getClave(), Usuario.getContrasenia());
            String letra = lista.get(0).toString().substring(0, 1);

            if (letra.equals("M")) {
                return "redirect:maestro";
            } else if (letra.equals("A")) {
                return "redirect:maestroAux";
            } else if(letra.equals("K")){
                return "redirect:admin";
            }
            else {
                return "redirect:/";
            }


        } else {
            return "redirect:/";
        }
    }
}
