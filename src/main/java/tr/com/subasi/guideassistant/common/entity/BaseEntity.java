package tr.com.subasi.guideassistant.common.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.id.enhanced.SequenceStyleGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

import static tr.com.subasi.guideassistant.common.constant.CommonConstant.*;

@Data
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_GENERATOR)
    @GenericGenerator(name = SEQUENCE_GENERATOR, strategy = SEQUENCE_STRATEGY, parameters = {
            @Parameter(name = SequenceStyleGenerator.INITIAL_PARAM, value = SequenceStyleGenerator.DEFAULT_INITIAL_VALUE + ""),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = SequenceStyleGenerator.DEFAULT_INCREMENT_SIZE + ""),
            @Parameter(name = SequenceStyleGenerator.OPT_PARAM, value = POOLED_LO)
    })
    @Column(name = COLUMN_ID, updatable = false)
    private Long id;

    @CreationTimestamp
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = COLUMN_CREATED_AT)
    private LocalDateTime createdAt;

    @NotBlank
    @CreatedBy
    @Column(name = COLUMN_CREATED_BY)
    private String createdBy;

    @UpdateTimestamp
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = COLUMN_UPDATED_AT)
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(name = COLUMN_UPDATED_BY)
    private String updatedBy;
}

