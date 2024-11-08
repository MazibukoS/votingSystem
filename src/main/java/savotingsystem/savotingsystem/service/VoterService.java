package savotingsystem.savotingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

import savotingsystem.savotingsystem.model.Voter;
import savotingsystem.savotingsystem.repository.VoterRepository;

public class VoterService {

    private final VoterRepository voterRepository;

    @Autowired
    public VoterService(VoterRepository voterRepository) {
        this.voterRepository = voterRepository;
    }

    // register voter
    public Voter registerVoter(Voter voter){

        Voter registeredVoter = voterRepository.insert(voter);

        
        return registeredVoter;
        
    }

    // send confirmation
    @Async
    private void sendRegistrationConfirmation(Voter registeredVoter){

    }

    // verify voter

}
