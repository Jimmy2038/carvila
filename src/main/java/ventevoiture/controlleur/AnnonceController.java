package ventevoiture.controlleur;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ventevoiture.entites.Annonce;
import ventevoiture.service.AnnonceService;

import java.util.List;

@RestController
@RequestMapping(path = "annonce")
public class AnnonceController {
    private AnnonceService annonceService;

    public AnnonceController(AnnonceService annonceService) {
        this.annonceService = annonceService;
    }

    @GetMapping(path = "getAll")
    public List<Annonce> all()
    {
        return this.annonceService.getAll();
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(path = "insert")
    public void cree(@RequestBody Annonce annonce)
    {
        this.annonceService.create(annonce);
    }

    @GetMapping(path = "getAllByUser/{idUser}")
    public List<Annonce> allByUser(@PathVariable int idUser)
    {
        return this.annonceService.getAllByUser(idUser);
    }

    @GetMapping(path = "getByIdAnnonce/{id}")
    public Annonce getByIdAnnonce(@PathVariable int id)
    {
        return this.annonceService.getById(id);
    }

}

