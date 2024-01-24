package com.Gebeya.FairFlow.controller;

import com.Gebeya.FairFlow.model.dto.BeneficiaryDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/beneficiaries")
public class BeneficiaryController {

    @PostMapping("/register")
    public ResponseEntity<Void> registerBeneficiary(@RequestBody BeneficiaryDto beneficiaryDto) {
        // No actual registration logic, just return OK status
        return ResponseEntity.ok().build();
    }


    @PutMapping("/update/{beneficiaryId}")
    public ResponseEntity<Void> updateBeneficiary(
            @PathVariable Long beneficiaryId,
            @RequestBody BeneficiaryDto beneficiaryDto) {
        // No actual update logic, just return OK status
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{beneficiaryId}")
    public ResponseEntity<Void> deleteBeneficiary(@PathVariable Long beneficiaryId) {
        // No actual deletion logic, just return OK status
        return ResponseEntity.ok().build();
    }
}
