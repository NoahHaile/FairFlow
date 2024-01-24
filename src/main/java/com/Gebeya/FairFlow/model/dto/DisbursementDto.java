package com.Gebeya.FairFlow.model.dto;
import com.Gebeya.FairFlow.model.enums.Gender;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class DisbursementDto {
    double money;
    String Message;
}