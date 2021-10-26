package org.springcore.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Sample {
    String samplename;
    String type;

    public String getSamplename() {
        return samplename;
    }

    public void setSamplename(String samplename) {
        this.samplename = samplename;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @PostConstruct
    public void start(){
        System.out.println("Starting PostConstruct");
    }


    @PreDestroy
    public void end(){
        System.out.println("Ending preDestroy");
    }

    @Override
    public String toString() {
        return "Sample{" +
                "samplename='" + samplename + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
