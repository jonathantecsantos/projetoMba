package com.portalmba.mba.controllers;

import com.portalmba.mba.models.Professor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProfessorController {

    @GetMapping("/cadastrarProfessor")
    public String cadastroProfessor(Model model){
        String nome = "Jonathan";
        String email = "jonathan.tecsantos@gmail.com";
        String disciplina = "Computação em Nuvem";
        Professor professor = new Professor(nome, email, disciplina);

        List<Professor> professores = Arrays.asList(professor, professor, professor);
        model.addAttribute("professores", professores);
        return "cadastroProfessor";
    }
}
