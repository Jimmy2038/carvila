package ventevoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ventevoiture.entites.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {

}
