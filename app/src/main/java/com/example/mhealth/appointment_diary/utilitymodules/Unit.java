package com.example.mhealth.appointment_diary.utilitymodules;

public class Unit {

    private int id;
    private int service_id;
    private String unit_name;

    public Unit(int id, int service_id, String unit_name) {
        this.id = id;
        this.service_id = service_id;
        this.unit_name = unit_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }



    @Override
    public boolean equals(Object anotherObject) {
        if (!(anotherObject instanceof Unit)) {
            return false;
        }
        Unit f = (Unit) anotherObject;
        return (this.id == f.id);
    }
}
