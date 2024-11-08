package savotingsystem.savotingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import savotingsystem.savotingsystem.model.Ballot;

@Repository
public interface BallotRepository extends JpaRepository<Ballot, Integer>{

    List<Ballot> findByBallotType(String ballotType);
    
}
