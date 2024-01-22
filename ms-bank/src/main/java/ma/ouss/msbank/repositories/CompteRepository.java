package ma.ouss.msbank.repositories;

import ma.ouss.msbank.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {
}
