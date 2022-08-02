package com.portalmba.mba.controllers;

import com.portalmba.mba.dtos.ProfessorDto;
import com.portalmba.mba.models.Professor;
import com.portalmba.mba.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
@RequestMapping("professor")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/listar")
    public ModelAndView listaProfessores(){
        //List<Professor> professores = Arrays.asList(professor, professor2);

        List<Professor> professores = professorRepository.findAll();
        ModelAndView mv = new ModelAndView("professor/listaProfessores");
        mv.addObject("professores", professores);
        return mv;
    }

    @GetMapping("/cadastrar")
    public String formularioDeCadastro(){
        return "professor/formularioDeCadastroProfessor";
    }

    @PostMapping("/novo")
    public String cadastroProfessor(ProfessorDto professorDto){

        Professor professor = professorDto.toProfessor();
        professorRepository.save(professor);
        return "professor/formularioDeCadastroProfessor";
    }


}
