package com.Gebeya.FairFlow.service;

import com.Gebeya.FairFlow.model.Beneficiary;
import com.Gebeya.FairFlow.model.dto.BeneficiaryDto;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BeneficiaryService {
    public Optional<Beneficiary> createBeneficiary(BeneficiaryDto beneficiaryDto){
        return Optional.empty();
    }

    public List<Beneficiary> getAllBeneficiary(){
        return List.of();
    }

    public Optional<Beneficiary> updateBeneficiary(Long beneficiaryId, BeneficiaryDto beneficiaryDto){
        return Optional.empty();
    }

    public Optional<List<Beneficiary>> getAllBeneficiaries() {
        return Optional.empty();
    }
}
