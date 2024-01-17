package ventevoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ventevoiture.entites.Marque;

public interface MarqueRepository extends JpaRepository<Marque,Integer> {

}
