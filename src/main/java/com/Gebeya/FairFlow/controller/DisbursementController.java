package com.Gebeya.FairFlow.controller;
import com.Gebeya.FairFlow.model.dto.DisbursementDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/disbursements")
public class DisbursementController {

    @PostMapping("/initiate")
    public ResponseEntity<Void> initiateDisbursement(@RequestBody DisbursementDto disbursementDto) {
        // No actual disbursement initiation logic, just return OK status
        return ResponseEntity.ok().build();
    }

    @GetMapping("/status/{transactionId}")
    public ResponseEntity<Void> getDisbursementStatus(@PathVariable String transactionId) {
        // No actual disbursement status retrieval logic, just return OK status
        return ResponseEntity.ok().build();
    }

    @GetMapping("/history/{userId}")
    public ResponseEntity<Void> getDisbursementHistory(@PathVariable Long userId) {
        // No actual disbursement history retrieval logic, just return OK status
        return ResponseEntity.ok().build();
    }
}

