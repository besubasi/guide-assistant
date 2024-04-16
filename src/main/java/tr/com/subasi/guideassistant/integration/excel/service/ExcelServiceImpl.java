package tr.com.subasi.guideassistant.integration.excel.service;

import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import tr.com.subasi.guideassistant.integration.excel.enums.EnumTripCustomerExcelHeader;
import tr.com.subasi.guideassistant.integration.excel.model.TripCustomerExcelModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Component
public class ExcelServiceImpl implements ExcelService {

    @Override
    public List<TripCustomerExcelModel> uploadTripCustomer(MultipartFile file) throws IOException {
        List<TripCustomerExcelModel> modelList = new ArrayList<>();

        Workbook workbook = WorkbookFactory.create(file.getInputStream());
        Sheet sheet = workbook.getSheetAt(0);
        Row headerRow = sheet.getRow(0);
        int colCount = headerRow.getPhysicalNumberOfCells();
        String[] columnNames = new String[colCount];
        for (int i = 0; i < colCount; i++)
            columnNames[i] = headerRow.getCell(i).getStringCellValue();

        Iterator<Row> rowIterator = sheet.iterator();
        // İlk satır başlık olduğu için atla
        rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            TripCustomerExcelModel model = new TripCustomerExcelModel();

            for (int i = 0; i < colCount; i++) {
                Cell cell = row.getCell(i);
                String cellValue = cell.getStringCellValue();
                switch (EnumTripCustomerExcelHeader.valueOf(columnNames[i])) {
                    case NAME:
                        model.setName(cellValue);
                        break;
                    case PHONE_NUMBER:
                        model.setPhoneNumber(cellValue);
                        break;
                    case EMAIL:
                        model.setEmail(cellValue);
                        break;
                    case PRICING_TYPE_CODE:
                        model.setPricingTypeCode(cellValue);
                        break;
                    case RELATION_LINE_NUMBER:
                        Optional.ofNullable(cellValue).ifPresent(relationLineNumber->model.setRelationLineNumber(Integer.valueOf(relationLineNumber)));
                        break;
                }
            }
            modelList.add(model);
        }

        workbook.close();
        return modelList;
    }
}
