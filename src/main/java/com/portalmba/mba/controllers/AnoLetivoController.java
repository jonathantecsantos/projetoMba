package com.portalmba.mba.controllers;

import com.portalmba.mba.dtos.AnoLetivoDto;
import com.portalmba.mba.models.AnoLetivo;
import com.portalmba.mba.repositories.AnoLetivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("anoLetivo")
public class AnoLetivoController {

    @Autowired
    private AnoLetivoRepository anoLetivoRepository;

    @GetMapping("/listar")
    public ModelAndView anoLetivo(){
        List<AnoLetivo> anos = anoLetivoRepository.findAll();
        ModelAndView mv = new ModelAndView("anoLetivo/listarAnosLetivos");
        mv.addObject("anos",anos);
        return mv;
    }

    @GetMapping("/cadastrar")
    public String cadastrar (){
        return "anoLetivo/formularioDeCadastroAnoLetivo";
    }

    @PostMapping("/novo")
    public String cadastrarAnoLetivo(AnoLetivoDto anoLetivoDto){
        AnoLetivo anoLetivo = anoLetivoDto.toAnoLetivo();
        anoLetivoRepository.save(anoLetivo);
        return "anoLetivo/formularioDeCadastroAnoLetivo";
    }

}
