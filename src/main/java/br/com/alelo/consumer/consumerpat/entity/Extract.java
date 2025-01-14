package br.com.alelo.consumer.consumerpat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Extract extends BaseEntity {

    private String establishmentName;

    private String productDescription;

    private LocalDateTime dateBuy;

    private BigDecimal purchaseValue;

    private BigDecimal value;

    @ManyToOne(fetch = FetchType.LAZY)
    private Card card;
}
