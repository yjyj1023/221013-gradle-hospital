package org.example;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private Integer emergencyRoom; // snake camel
    private String name; // snake camel
    private String subdivision; // snake camel

    public Hospital(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public Hospital(String id) {
        this.id = id.replaceAll("\"","");

    }

    public String getSqlInsertQuery(){
        String sql = String.format("INSERT INTO `hospital`.`seoul_hospital`\n" +
                "(`id`,\n" + "`address`,\n" + "`district`,\n" + "`category`,\n" + "`emergency_room`,\n" + "`name`,\n" + "`subdivision`)\n" +
                "VALUES\n" + "(\"%s\",\n" + "\"%s\",\n" + "\"%s\",\n" + "\"%s\",\n" + "%d,\n" + "\"%s\",\n" + "\"%s\");",
                this.id, this.address, this.district, this.category, this.emergencyRoom, this.name, this.subdivision);
        return sql;
    }
    public String getTupleString(){
        String sql = String.format(
                "(\"%s\", \"%s\", \"%s\",\"%s\",\n" +
                "%d,\n" +
                "\"%s\",\n" +
                "\"%s\");",this.id, this.address, this.district, this.category, this.emergencyRoom, this.name, this.subdivision);
        return sql;
    }

    public Hospital(String id, String address, String category, Integer emergencyRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;
        String[] splitted = this.address.split(" ");
        this.district = String.format("%s %s", splitted[0], splitted[1]);
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivision = subdivision;
    }

    public String getId() {
        return id;
    }
    public String getAddress() {
        return address;
    }
    public String getDistrict() {
        return district;
    }
    public String getCategory() {
        return category;
    }
    public int getEmergencyRoom() {
        return emergencyRoom;
    }
    public String getName() {
return name;
    }
    public String getSubdivision() {
        return subdivision;
    }

}