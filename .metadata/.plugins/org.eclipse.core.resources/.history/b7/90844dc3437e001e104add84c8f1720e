package interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import objects.Deltager;

@Repository

public interface DeltagerRepo extends JpaRepository<Deltager, String> {
    Deltager findByMobil(String mobil);

    List<Deltager> findAll(); // This method retrieves all Deltager entities
}