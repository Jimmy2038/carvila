package ventevoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ventevoiture.entites.Transmission;

public interface TransmissionRepository extends JpaRepository<Transmission ,Integer> {
}
