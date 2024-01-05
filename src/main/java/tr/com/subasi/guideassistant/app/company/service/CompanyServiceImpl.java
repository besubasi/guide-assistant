package tr.com.subasi.guideassistant.app.company.service;

import org.springframework.stereotype.Service;
import tr.com.subasi.guideassistant.app.company.converter.CompanyConverter;
import tr.com.subasi.guideassistant.app.company.entity.CompanyEntity;
import tr.com.subasi.guideassistant.app.company.model.CompanyModel;
import tr.com.subasi.guideassistant.app.company.model.CompanySearchModel;
import tr.com.subasi.guideassistant.app.company.repository.CompanyRepository;
import tr.com.subasi.guideassistant.common.service.BaseServiceImpl;

@Service
public class CompanyServiceImpl extends BaseServiceImpl<CompanyModel, CompanySearchModel, CompanyEntity, CompanyRepository, CompanyConverter> implements CompanyService {
    public CompanyServiceImpl(CompanyRepository repository, CompanyConverter converter) {
        super(repository, converter);
    }
}
