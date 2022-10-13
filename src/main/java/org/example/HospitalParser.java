package org.example;


public class HospitalParser implements Parser<Hospital>{
    @Override
    public Hospital parse(String str) {
        str = str.replaceAll("\"", "");
        String[] splitted = str.split(",");

        //String id, String address, String category, Integer emergencyRoom, String name, String subdivision
        return new Hospital(splitted[0], splitted[1],splitted[2],Integer.parseInt(splitted[6]),splitted[10],splitted[10]);
    }
}