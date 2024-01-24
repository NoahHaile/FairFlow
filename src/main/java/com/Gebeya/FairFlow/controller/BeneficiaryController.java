package com.Gebeya.FairFlow.controller;

import com.Gebeya.FairFlow.model.Beneficiary;
import com.Gebeya.FairFlow.model.dto.BeneficiaryDto;
import com.Gebeya.FairFlow.service.BeneficiaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/beneficiary")
@RequiredArgsConstructor
public class BeneficiaryController {
    private final BeneficiaryService beneficiaryService;
    @PostMapping("/create")
    public ResponseEntity<Optional<Beneficiary>> agentAddBeneficiary(@RequestBody BeneficiaryDto beneficiary) {
        return ResponseEntity.ok(beneficiaryService.createBeneficiary(beneficiary));
    }

    @PutMapping("/edit")
    public ResponseEntity<Optional<Beneficiary>> agentUpdateBeneficiary(@RequestBody BeneficiaryDto beneficiaryDto) {
        return ResponseEntity.ok(beneficiaryService.updateBeneficiary(beneficiaryDto));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Beneficiary>> getAllBeneficiary() {
        return ResponseEntity.ok(beneficiaryService.getAllBeneficiary());
    }
}
