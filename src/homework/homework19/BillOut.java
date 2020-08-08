package homework.homework19;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class BillOut {
    static final Logger log = LogManager.getLogger(BillOut.class);

    private final String BILL_FILE_PATH = ".//src//homework//homework19//products.txt";
    private final String OUT_FILE_PATH = ".//src//homework//homework19//out.txt";

    List<BillItem> billList = new ArrayList<>();

    BillOut() {
        getBillList();
        writeBillOut();
    }

    private void getBillList() {
        log.info("Get bill list from file {}", BILL_FILE_PATH);
        try(Scanner sc = new Scanner(new File(BILL_FILE_PATH))) {
            sc.useDelimiter("\n");
            while(sc.hasNext()) {
                String name = sc.next();
                float count = sc.nextFloat();
                float price = sc.nextFloat();

                log.debug("Added Bill - name: {}, count: {}, price: {}", name, count, price);
                billList.add(new BillItem(name, count, price));
            }
        } catch(Exception ex) {
            System.out.println(ex.toString());
            log.error("Error when trying get bill list. Error: {}", ex.getStackTrace());
        }
    }

    private void writeBillOut() {
        log.info("Writen bill out.");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(OUT_FILE_PATH))) {
            float result = 0;
            Formatter formatter = new Formatter(bw);

            formatter.format("%-25s %-10s %-10s %-10s", "Наименование", "Кол-во", "Цена", "Стоимость");
            formatter.format("\n");
            for(BillItem bill : billList) {
                float rowCount = bill.getCount() * bill.getPrice();
                formatter.format("\n%-25s %-10.2f %-10.2f %-10.2f", bill.getName(), bill.getCount(), bill.getPrice(), rowCount);
                formatter.flush();
                result += rowCount;
            }
            formatter.format("\n");
            formatter.format("\n%-47s %.2f", "Итого:", result);
            log.debug("Successful.");
        } catch(Exception ex) {
            System.out.println(ex.getStackTrace());
            log.error("Error when out written. Error: {}", ex.getStackTrace());
        }
    }
}
