package utilities;

import java.util.List;

public class Ders {
    public static void main(String[] args) {

    DatabaseUtils.createConnection();
    String query="Select * from public.jhi_user";
List<Object> allData=DatabaseUtils.getColumnData(query,"ssn");
    System.out.println(allData);
        List<String>columnnNames=DatabaseUtils.getColumnNames(query);
        System.out.println(columnnNames);
        for (int i = 0; i <columnnNames.size() ; i++) {
            List<Object>allDatz=DatabaseUtils.getColumnData(query, columnnNames.get(i));
            System.out.println(allDatz);
        }
    }}