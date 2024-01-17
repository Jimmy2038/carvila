package ventevoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ventevoiture.entites.Annonce;
import ventevoiture.entites.Utilisateur;

import java.util.List;

public interface AnnonceRepository extends JpaRepository<Annonce,Integer> {
    List<Annonce> findAnnonceByUtilisateur(Utilisateur utilisateur);
}
