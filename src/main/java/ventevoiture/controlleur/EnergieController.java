package ventevoiture.controlleur;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ventevoiture.entites.Energie;
import ventevoiture.service.EnergieService;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "energie")
public class EnergieController {
    private EnergieService energieService;

    public EnergieController(EnergieService energieService) {
        this.energieService = energieService;
    }

    @PostMapping(path = "insert")
    public void insert(@RequestBody Energie energie){ this.energieService.insert(energie);}

    @ResponseStatus(NO_CONTENT)
    @PutMapping(path = "update/{id}", consumes = APPLICATION_JSON_VALUE)
    public void modifier(@PathVariable int id, @RequestBody Energie energie){
        this.energieService.update(id,energie);
    }

    @GetMapping(path = "getById/{id}")
    public Energie get(@PathVariable int id){
        return this.energieService.getById(id);
    }

    @GetMapping(path = "getAll")
    public Energie[] getAll(){
        return this.energieService.getAll();
    }
}
