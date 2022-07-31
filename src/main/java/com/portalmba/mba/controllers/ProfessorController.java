package com.portalmba.mba.controllers;

import com.portalmba.mba.models.Professor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProfessorController {

    @GetMapping("/listarProfessores")
    public String listaProfessores(Model model){
        String nome = "Jonathan";
        String email = "jonathan.tecsantos@gmail.com";
        String disciplina = "Computação em Nuvem";
        Professor professor = new Professor(nome, email, disciplina);

        String nome2 = "John";
        String email2 = "John@gmail.com";
        String disciplina2 = "Arte da traquinagem";
        Professor professor2 = new Professor(nome2, email2, disciplina2);

        List<Professor> professores = Arrays.asList(professor, professor2);
        model.addAttribute("professores", professores);
        return "listaProfessores";
    }

    @GetMapping("/cadastrarProfessor")
    public String cadastroProfessor(Model model){
        return "cadastroProfessor";

    }
}
