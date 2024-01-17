package ventevoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ventevoiture.entites.Marque;
import ventevoiture.entites.Model;

import java.util.List;

public interface ModelRepository extends JpaRepository<Model,Integer> {
    List<Model> findModelByMarque(Marque marque);
}
