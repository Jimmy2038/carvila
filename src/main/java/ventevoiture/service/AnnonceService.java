package ventevoiture.service;

import org.springframework.stereotype.Service;
import ventevoiture.entites.Annonce;
import ventevoiture.entites.Utilisateur;
import ventevoiture.repository.AnnonceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AnnonceService {
    private AnnonceRepository annonceRepository;

    private UtilisateurService utilisateurService;

    public AnnonceService(AnnonceRepository annonceRepository, UtilisateurService utilisateurService) {
        this.annonceRepository = annonceRepository;
        this.utilisateurService = utilisateurService;
    }

    public List<Annonce> getAll()
    {
        return this.annonceRepository.findAll();
    }

    public void create(Annonce annonce)
    {
        this.annonceRepository.save(annonce);
    }

    public List<Annonce> getAllByUser(int idUser)
    {
        Utilisateur personne = this.utilisateurService.getById(idUser);
        return this.annonceRepository.findAnnonceByUtilisateur(personne);
    }

    public Annonce getById(int id)
    {
        Optional<Annonce> optionalAnnonce = this.annonceRepository.findById(id);
        if (optionalAnnonce.isPresent())
        {
            return optionalAnnonce.get();
        }
        return null;
    }
}
