package ventevoiture.controlleur;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ventevoiture.entites.Model;
import ventevoiture.service.MarqueService;
import ventevoiture.service.ModelService;

import java.util.List;

@RestController
@RequestMapping(path = "model")
public class ModelController {
    private ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(path = "insert")
    public void creer(@RequestBody Model model){
        this.modelService.creer(model);
    }
    @GetMapping(path = "get")
    public List<Model> getAll(){
        return this.modelService.getAll();
    }

    @GetMapping(path = "getByMarque/{id}")
    public List<Model> getAll(@PathVariable int id){
        return this.modelService.getAllByMarque(id);
    }
}
