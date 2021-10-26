package org.springcore.AutowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

    private Address address;

    public Emp() {
    }

    @Autowired
    public Emp(Address address) {
        System.out.println("Inside Contructor");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        System.out.println("Setting Value");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
