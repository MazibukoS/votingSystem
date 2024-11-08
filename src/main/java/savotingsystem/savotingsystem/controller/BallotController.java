package savotingsystem.savotingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import savotingsystem.savotingsystem.model.Ballot;
import savotingsystem.savotingsystem.service.BallotService;

@RestController
public class BallotController {

    private final BallotService ballotService;

    @Autowired
    public BallotController(BallotService ballotService) {
        this.ballotService = ballotService;
    }

    @GetMapping("/ballots/{ballotType}")
    public List<Ballot> getBallotsByType(@PathVariable String ballotType) {
        return ballotService.getBallotsByType(ballotType);
    }
}