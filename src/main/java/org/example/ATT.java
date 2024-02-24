package org.example;

public class ATT implements Service{
    private String name;
    private Service service;

    public void setName(String name) {
        this.name = name;
    }

    public void setService(Service service) {
        this.service = service;
    }
    public void callService(String name){
        System.out.println("Called Service name is "+name);
    }
}
