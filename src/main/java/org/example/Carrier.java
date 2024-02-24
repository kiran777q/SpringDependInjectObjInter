package org.example;

public class Carrier {

    private String name;
    Service service;


    public void setName(String name) {
        this.name = name;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void callTheService(){
        service.callService(name);
    }
}
