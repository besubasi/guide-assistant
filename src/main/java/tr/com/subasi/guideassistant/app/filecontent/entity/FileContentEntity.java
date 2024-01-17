package tr.com.subasi.guideassistant.app.filecontent.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import tr.com.subasi.guideassistant.common.entity.BaseEntity;


import static tr.com.subasi.guideassistant.app.filecontent.constant.FileContentConstant.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(schema = SCHEMA_GUIDE, name = TABLE_NAME)
public class FileContentEntity extends BaseEntity {

    @NotNull
    @Column(name = COLUMN_CONTENT)
    private byte[] content;

    @Column(name = COLUMN_SMALL_CONTENT)
    private byte[] smallContent;

    @Column(name = COLUMN_DESCRIPTION)
    private String description;

    @Column(name = COLUMN_TYPE)
    private String type;

}