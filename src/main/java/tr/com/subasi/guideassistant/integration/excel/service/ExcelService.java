package tr.com.subasi.guideassistant.integration.excel.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import tr.com.subasi.guideassistant.integration.excel.model.TripCustomerExcelModel;

import java.io.IOException;
import java.util.List;

public interface ExcelService {

    List<TripCustomerExcelModel> uploadTripCustomer(@RequestParam("file") MultipartFile file) throws IOException;

}
