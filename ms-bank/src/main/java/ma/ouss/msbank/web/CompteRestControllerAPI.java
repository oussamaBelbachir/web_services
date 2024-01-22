package ma.ouss.msbank.web;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import ma.ouss.msbank.entities.Compte;
import ma.ouss.msbank.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/banque")
public class CompteRestControllerAPI {

    @Autowired
    private CompteRepository compteRepository;


    @GetMapping(path = "/comptes")
    public List<Compte> compteList(){

        return compteRepository.findAll();
    }

    @GetMapping(path = "/comptes/{id}")
    public Compte getOne(@PathVariable Long id){
        return compteRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "/comptes")
    public Compte save(@RequestBody  Compte compte){
        return compteRepository.save(compte);
    }

}
