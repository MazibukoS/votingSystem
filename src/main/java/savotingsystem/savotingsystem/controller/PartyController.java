package savotingsystem.savotingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import savotingsystem.savotingsystem.model.Party;
import savotingsystem.savotingsystem.service.PartyService;

import java.util.List;

@RestController
public class PartyController {

    private final PartyService partyService;

    @Autowired
    public PartyController(PartyService partyService) {
        this.partyService = partyService;
    }

    @GetMapping("/parties")
    public List<Party> getAllParties() {
        return partyService.getAllParties();
    }
}
