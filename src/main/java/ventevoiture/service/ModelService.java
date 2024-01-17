package ventevoiture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ventevoiture.entites.Marque;
import ventevoiture.entites.Model;
import ventevoiture.repository.ModelRepository;

import java.util.List;

@Service
public class ModelService {
    private ModelRepository modelRepository;
    private MarqueService marqueService;

    public ModelService(ModelRepository modelRepository, MarqueService marqueService) {
        this.modelRepository = modelRepository;
        this.marqueService = marqueService;
    }

    public void creer(Model model){
        this.modelRepository.save(model);
    }

    public List<Model> getAll(){
        return this.modelRepository.findAll();
    }

    public List<Model> getAllByMarque(int id){
        Marque marque=this.marqueService.getById(id);
        return this.modelRepository.findModelByMarque(marque);
    }
}
