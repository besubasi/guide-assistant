package tr.com.subasi.guideassistant.app.filecontent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.subasi.guideassistant.app.filecontent.entity.FileContentEntity;
import tr.com.subasi.guideassistant.app.filecontent.model.FileContentSearchModel;
import tr.com.subasi.guideassistant.common.model.Page;

import java.util.List;

@Repository
public interface FileContentRepository extends JpaRepository<FileContentEntity, Long> {

    List<FileContentEntity> getList(FileContentSearchModel searchModel);

    Page<FileContentEntity> getPage(FileContentSearchModel searchModel);

}