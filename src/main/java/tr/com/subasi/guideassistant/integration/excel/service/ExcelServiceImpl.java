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

@Component
public class ExcelServiceImpl implements ExcelService {

    @Override
    public List<TripCustomerExcelModel> uploadTripCustomer(MultipartFile file) throws IOException {
        List<TripCustomerExcelModel> modelList = new ArrayList<>();

        // Excel dosyasını okumak için bir Workbook nesnesi oluştur
        Workbook workbook = WorkbookFactory.create(file.getInputStream());

        // İlk sayfayı al, eğer birden fazla sayfa varsa buradaki işlemi tekrarlayabilirsiniz
        Sheet sheet = workbook.getSheetAt(0);

        // Başlık satırını al
        Row headerRow = sheet.getRow(0);

        // Başlık satırındaki sütun sayısını al
        int colCount = headerRow.getPhysicalNumberOfCells();

        // Başlık satırındaki sütun isimlerini saklayacak bir dizi oluştur
        String[] columnNames = new String[colCount];
        for (int i = 0; i < colCount; i++)
            columnNames[i] = headerRow.getCell(i).getStringCellValue();

        // Veri satırlarını işle
        Iterator<Row> rowIterator = sheet.iterator();
        // İlk satır başlık olduğu için atla
        rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            TripCustomerExcelModel model = new TripCustomerExcelModel();

            // Her bir sütunu TripCustomerExcelModel modeline eşle
            for (int i = 0; i < colCount; i++) {
                Cell cell = row.getCell(i);

                switch (EnumTripCustomerExcelHeader.valueOf(columnNames[i])) {
                    case NAME:
                        model.setName(cell.getStringCellValue());
                        break;
                    case USER_NAME:
                        model.setUserName(cell.getStringCellValue());
                        break;
                    case PHONE_NUMBER:
                        model.setPhoneNumber(cell.getStringCellValue());
                        break;
                    case EMAIL:
                        model.setEmail(cell.getStringCellValue());
                        break;
                }
            }
            modelList.add(model);
        }

        workbook.close();
        return modelList;
    }
}
