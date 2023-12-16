package tr.com.subasi.guideassistant.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

import static tr.com.subasi.guideassistant.common.constant.CommonConstant.*;

@Data
@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
public abstract class BaseEntity extends IdEntity {

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

