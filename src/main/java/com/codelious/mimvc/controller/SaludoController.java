package com.codelious.mimvc.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class SaludoController {
 
 @RequestMapping("/saludar")
 public ModelAndView saludar(){
   
  String mensaje = "Hola Mundo Maravilloso";
  return new ModelAndView("saludo", "mensaje", mensaje);
   
 }
}