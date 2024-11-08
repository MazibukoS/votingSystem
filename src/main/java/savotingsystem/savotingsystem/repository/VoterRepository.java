package savotingsystem.savotingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import savotingsystem.savotingsystem.model.Voter;

@Repository
public interface VoterRepository extends JpaRepository<Voter, Integer>{

    //register/insert voter record
      Voter insert(Voter voter);
      
    //verify/update voter record
}
