package ventevoiture.service;

import org.springframework.stereotype.Service;
import ventevoiture.entites.Utilisateur;
import ventevoiture.repository.UtilisateurRepository;

import java.util.Optional;

@Service
public class UtilisateurService {
    private UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public Utilisateur getById(int id){
        Optional<Utilisateur> user = this.utilisateurRepository.findById(id);
        if(user.isPresent())
        {
            return user.get();
        }
        return null;
    }
}
