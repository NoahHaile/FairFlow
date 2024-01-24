package com.Gebeya.FairFlow.controller;

import com.Gebeya.FairFlow.model.Beneficiary;
import com.Gebeya.FairFlow.model.dto.BeneficiaryDto;
import com.Gebeya.FairFlow.service.BeneficiaryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/beneficiary")
@RequiredArgsConstructor
@Tag(name = "beneficiary", description = "")
public class BeneficiaryController {
    private final BeneficiaryService beneficiaryService;
    @PostMapping("/create")
    @Operation(summary = "create beneficiary", description = "agent add beneficiary")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully add beneficiary"),
            @ApiResponse(responseCode = "404", description = "Beneficiary is not valid")
    })
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
