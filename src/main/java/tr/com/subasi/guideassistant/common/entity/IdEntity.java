package tr.com.subasi.guideassistant.common.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import static tr.com.subasi.guideassistant.common.constant.CommonConstant.COLUMN_ID;
import static tr.com.subasi.guideassistant.common.constant.SequenceGeneratorConstant.*;

@Data
@MappedSuperclass
public abstract class IdEntity {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_GENERATOR)
    @GenericGenerator(name = SEQUENCE_GENERATOR, strategy = SEQUENCE_STRATEGY, parameters = {
            @Parameter(name = SequenceStyleGenerator.CONFIG_SEQUENCE_PER_ENTITY_SUFFIX, value = SequenceStyleGenerator.DEF_SEQUENCE_SUFFIX),
            @Parameter(name = SequenceStyleGenerator.INITIAL_PARAM, value = SequenceStyleGenerator.DEFAULT_INITIAL_VALUE + ""),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = DEFAULT_INCREMENT_SIZE),
            @Parameter(name = SequenceStyleGenerator.OPT_PARAM, value = POOLED_LO)
    })
    @Column(name = COLUMN_ID, updatable = false)
    private Long id;

}

