package tr.com.subasi.guideassistant.app.account.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.BaseEntity;

import java.math.BigDecimal;

import static tr.com.subasi.guideassistant.app.account.constant.AccountConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
@SequenceGenerator(name = SEQUENCE_GENERATOR, sequenceName = TABLE_SEQ_NAME, allocationSize = 1)
@EqualsAndHashCode(callSuper = true)
public class AccountEntity extends BaseEntity {

    @NotNull
    @Column(name = COLUMN_USER_ID)
    private Long userId;

    @Column(name = COLUMN_NAME)
    private String name;

    @NotNull
    @Column(name = COLUMN_AMOUNT)
    private BigDecimal amount = BigDecimal.ZERO;

    @NotNull
    @Column(name = COLUMN_CURRENCY_ID)
    private Long currencyId;

}
