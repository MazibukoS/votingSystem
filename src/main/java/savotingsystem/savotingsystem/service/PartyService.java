package savotingsystem.savotingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import savotingsystem.savotingsystem.model.Party;
import savotingsystem.savotingsystem.repository.PartyRepository;

import java.util.List;

@Service
public class PartyService {

    private final PartyRepository partyRepository;

    @Autowired
    public PartyService(PartyRepository partyRepository) {
        this.partyRepository = partyRepository;
    }

    // Method to fetch all parties from the database
    public List<Party> getAllParties() {
        return partyRepository.findAll();
    }
}
