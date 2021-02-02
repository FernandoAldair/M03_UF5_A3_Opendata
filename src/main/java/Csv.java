import Model.Nacimientos;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Csv {
    public static final String PATH = "https://opendata-ajuntament.barcelona.cat/data/dataset/cb293930-f483-4457-bf57-50a68e9b01b3/resource/b9fb3662-78a8-4607-9456-b91e01a64d25/download/2015_naixements_lloc-de-naixement.csv";
    private Iterator<Nacimientos> csvIterator;
    List<Nacimientos> desgracias = new ArrayList<>();



    public void lista() {

        URL url = null;

        try {
            url = new URL(PATH);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = null;
        CSVReader reader = null;


        try {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            reader = new CSVReader(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        CsvToBean<Nacimientos> nacimientosCsvToBean = new CsvToBeanBuilder(reader)
                .withType(Nacimientos.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        csvIterator = nacimientosCsvToBean.iterator();

        while(csvIterator.hasNext()) {
            Nacimientos nacimientos = csvIterator.next();
            desgracias.add(nacimientos);
        }

    }
}


