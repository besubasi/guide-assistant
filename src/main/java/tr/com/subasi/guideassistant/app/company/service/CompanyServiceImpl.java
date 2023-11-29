package tr.com.subasi.guideassistant.app.company.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.company.entity.CompanyEntity;
import tr.com.subasi.guideassistant.app.company.mapper.CompanyMapper;
import tr.com.subasi.guideassistant.app.company.model.CompanyModel;
import tr.com.subasi.guideassistant.app.company.model.CompanySearchModel;
import tr.com.subasi.guideassistant.app.company.repository.CompanyRepository;
import tr.com.subasi.guideassistant.common.service.GenericServiceImpl;

@Service
public class CompanyServiceImpl extends GenericServiceImpl<CompanyModel, CompanySearchModel, CompanyEntity> implements tr.com.subasi.guideassistant.app.company.service.CompanyService {
    public CompanyServiceImpl(CompanyRepository repository, CompanyMapper mapper) {
        super(repository, mapper);
    }
}
