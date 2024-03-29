package com.Gebeya.FairFlow.model.dto;

import com.Gebeya.FairFlow.model.enums.Gender;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BeneficiaryDto {
    String firstName;
    String lastName;
    Gender gender;

    String phoneNumber;
    byte[] fingerprintData;

    String location;

}
