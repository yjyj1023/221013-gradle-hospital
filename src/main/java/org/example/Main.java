package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        FileController<Hospital> hospitalFileController = new FileController<>(new HospitalParser());
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "C:\\Users\\lyj19\\git\\221013\\hospital\\src\\main\\java\\org\\example\\seoul_hospital.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        List<String> sqlStatements = new ArrayList<>();
        for (Hospital hospital : hospitals) {
            sqlStatements.add(hospital.getSqlInsertQuery());
            System.out.println(hospital.getSqlInsertQuery());
        }
        String sqlFilename = "seoul_hospital_insert.sql";
        hospitalFileController.createANewFile(sqlFilename);
        hospitalFileController.writeLines(sqlStatements, sqlFilename);
    }
}