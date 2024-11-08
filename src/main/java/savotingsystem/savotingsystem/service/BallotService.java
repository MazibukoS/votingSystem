package savotingsystem.savotingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import savotingsystem.savotingsystem.model.Ballot;
import savotingsystem.savotingsystem.repository.BallotRepository;

@Service
public class BallotService {

    private final BallotRepository ballotRepository;

    @Autowired
    public BallotService(BallotRepository ballotRepository) {
        this.ballotRepository = ballotRepository;
    }

    public List<Ballot> getBallotsByType(String ballotType) {
        return ballotRepository.findByBallotType(ballotType);
    }

}
