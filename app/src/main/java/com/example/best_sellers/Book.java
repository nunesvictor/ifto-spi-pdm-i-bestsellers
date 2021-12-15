package com.example.best_sellers;

public class Book {
    private int cover;
    private String title;
    private String author;
    private String publisher;
    private int lastWeekPosition;
    private int weeksOnList;
    private String synopsis;
    private Double price;

    public Book() {

    }

    public Book(int cover, String title, String author, String publisher, int lastWeekPosition, int weeksOnList, String synopsis, Double price) {
        this.cover = cover;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.lastWeekPosition = lastWeekPosition;
        this.weeksOnList = weeksOnList;
        this.synopsis = synopsis;
        this.price = price;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getLastWeekPosition() {
        return lastWeekPosition;
    }

    public void setLastWeekPosition(int lastWeekPosition) {
        this.lastWeekPosition = lastWeekPosition;
    }

    public int getWeeksOnList() {
        return weeksOnList;
    }

    public void setWeeksOnList(int weeksOnList) {
        this.weeksOnList = weeksOnList;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
