package ventevoiture.service;

import org.springframework.stereotype.Service;
import ventevoiture.entites.Marque;
import ventevoiture.repository.MarqueRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MarqueService {
    private MarqueRepository marqueRepository;

    public MarqueService(MarqueRepository marqueRepository) {
        this.marqueRepository = marqueRepository;
    }

    public void creer(Marque marque){
        this.marqueRepository.save(marque);
    }

    public List<Marque> getAll(){
        return this.marqueRepository.findAll();
    }

    public Marque getById(int id){
        Optional<Marque> optionalMarque=this.marqueRepository.findById(id);
        if(optionalMarque.isPresent()){
            return optionalMarque.get();
        }
        return null;
    }
}
