package ventevoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ventevoiture.entites.Energie;

public interface EnergieRepository extends JpaRepository<Energie,Integer> {
}
