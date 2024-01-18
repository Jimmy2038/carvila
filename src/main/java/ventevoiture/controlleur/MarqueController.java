package ventevoiture.controlleur;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ventevoiture.entites.Marque;
import ventevoiture.service.MarqueService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "marque")
public class MarqueController {

    private MarqueService marqueService;

    public MarqueController(MarqueService marqueService) {
        this.marqueService = marqueService;
    }

    @PostMapping(path = "insert")
    public void creer(@RequestBody Marque marque){
        this.marqueService.creer(marque);
    }

    @GetMapping(path="ge",produces = APPLICATION_JSON_VALUE)
    public List<Marque> getALl(){
        return marqueService.getAll();
    }

    @GetMapping(path="get/{id}",produces = APPLICATION_JSON_VALUE)
    public Marque get(@PathVariable int id){
        return marqueService.getById(id);
    }



}
