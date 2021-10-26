package org.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    private Address add;

    public Emp() {
    }

    public Emp(Address address) {
        System.out.println("Inside Contructor");
        this.add = address;
    }

    public Address getAddress() {
        return add;
    }

    @Autowired
    @Qualifier("add")
    public void setAddress(Address address) {
        System.out.println("Setting Value");
        this.add = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + add +
                '}';
    }
}
