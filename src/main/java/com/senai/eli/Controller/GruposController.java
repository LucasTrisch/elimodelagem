package com.senai.eli.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.senai.eli.Model.Grupos;
import com.senai.eli.Repository.GruposRepository;



@Controller
public class GruposController {

    @Autowired
    private GruposRepository er;
    
    @GetMapping("/grupos/criar")
    public String criar(){
        return "grupos/criar";
    }

    @PostMapping("/grupos/criar")
    public String criar(Grupos ev){
        er.save(ev);
        return "redirect:/grupos";
    }

    @GetMapping("/grupos")
    public String listar(Model view){
        List<Grupos> listaGrupos = er.findAll();

        view.addAttribute("listaGrupossNoFront", listaGrupos);

        return "grupos/listar";
    }

    @GetMapping("/grupos/alterar/{id}")
    public String alterar(@PathVariable Long id, Model model) {
        Grupos grupos;
        grupos = er.findById(id).orElseThrow();

        model.addAttribute("grupos", grupos);
        return "grupos/alterar";
    }    

    @PostMapping("/grupos/alterar/{id}")
    public String alterar(@PathVariable Long id, Grupos ev) {
        ev.setId(id);

        er.save(ev);
        
        return "redirect:/grupos";
    }
    

}
