package savotingsystem.savotingsystem.repository;

import savotingsystem.savotingsystem.model.Party;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PartyRepository extends JpaRepository<Party, Integer> {

    // Method to fetch all parties
    List<Party> findAll();
}
