package com.Gebeya.FairFlow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "beneficiary")
public class Beneficiary {
    @Id
    private Long id;

}
