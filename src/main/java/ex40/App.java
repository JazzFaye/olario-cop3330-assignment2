/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex40;

import java.util.*;

public class App {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Map<String, String>> records;
        System.out.print("Enter a search string: ");
        String search = sc.nextLine();
        records = Emp_records();
        System.out.print("\nResults: \n\n");
        String output = """
                    First Name      |    Last Name      |     Position      | Separation Date
                --------------------|-------------------|-------------------|-----------------
                """;
        for (int i = 0; i < records.size(); i++) {
            String row = (GetTitles(records, i, search));
            if (row.length() > 0){
                output += row;
            }
        }
        System.out.println(output);
    }

    public static String GetTitles(List<Map<String, String>> employee, int i, String search) {
        Map<String, String> title = employee.get(i);
        String first_name = title.get("First Name").toLowerCase();
        String last_name = title.get("Last Name").toLowerCase();
        if (first_name.contains(search.toLowerCase()) || last_name.contains(search.toLowerCase())) {
            return title.get("First Name") + title.get("Last Name") + title.get("Position") + title.get("Separation Date") + "\n";
        } else return "";
    }

    public static List<Map<String, String>> Emp_records() {
        List<Map<String, String>> emp_records = new ArrayList<>();
        //HashMap for emp1
        Map<String, String> EMP1 = new HashMap<>();
        EMP1.put("First Name", "Jacquelyn   \t\t|");
        EMP1.put("Last Name", " Jackson  \t\t\t|");
        EMP1.put("Position", " DBA   \t\t\t|");
        EMP1.put("Separation Date", "");
        emp_records.add(EMP1);
        //HashMap for emp2
        Map<String, String> EMP2 = new HashMap<>();
        EMP2.put("First Name", "Jake  \t\t\t\t|");
        EMP2.put("Last Name", " Jacobson   \t\t|");
        EMP2.put("Position", " Programmer \t\t|");
        EMP2.put("Separation Date", "");
        emp_records.add(EMP2);
        //HashMap for emp3
        Map<String, String> EMP3 = new HashMap<>();
        EMP3.put("First Name", "John  \t\t\t\t|");
        EMP3.put("Last Name", " Johnson   \t\t|");
        EMP3.put("Position", " Manager \t\t\t|");
        EMP3.put("Separation Date", " 2016-12-31");
        emp_records.add(EMP3);
        //HashMap for emp4
        Map<String, String> EMP4 = new HashMap<>();
        EMP4.put("First Name", "Michaela  \t\t\t|");
        EMP4.put("Last Name", " Michaelson \t\t|");
        EMP4.put("Position", " District Manager  |");
        EMP4.put("Separation Date", " 2015-12-19");
        emp_records.add(EMP4);
        //HashMap for emp5
        Map<String, String> EMP5 = new HashMap<>();
        EMP5.put("First Name", "Sally \t\t\t\t|");
        EMP5.put("Last Name", " Weber  \t\t\t|");
        EMP5.put("Position", " Web Developer\t\t|");
        EMP5.put("Separation Date", " 2015-12-18");
        emp_records.add(EMP5);
        //Hashmap for rmp6
        Map<String, String> EMP6 = new HashMap<>();
        EMP6.put("First Name", "Tou   \t\t\t\t|");
        EMP6.put("Last Name", "Xiong  \t\t\t|");
        EMP6.put("Position", " Software Engineer |");
        EMP6.put("Separation Date", " 2016-10-05");
        emp_records.add(EMP6);
        return emp_records;
    }
}