package org.springcore.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book implements InitializingBean, DisposableBean {
    private String bookname;
    private String pages;
    private String quality;
    private double cost;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Book Details");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("purchased book");
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", pages='" + pages + '\'' +
                ", quality='" + quality + '\'' +
                ", cost=" + cost +
                '}';
    }



}
