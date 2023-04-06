package org.example.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Log{
    private int book_id;
    private int id;
    private int clientId;
    private String takeOrReturned;
    private LocalDate date;



    @Override
    public String toString() {
        return "Log{" +
                "book=" + book_id +
                ", clientId=" + clientId +
                ", takeOrReturned='" + takeOrReturned + '\'' +
                ", date=" + date +
                '}';
    }

    public Log(int book, int clientId, String takeOrReturned, LocalDate date){
        this.book_id = book;
        this.clientId = clientId;
        this.takeOrReturned = takeOrReturned;
        this.date = date;
    }
    public Log(int id, int book, int clientId, String takeOrReturned, LocalDate date){
        this.id = id;
        this.book_id = book;
        this.clientId = clientId;
        this.takeOrReturned = takeOrReturned;
        this.date = date;
    }

    public String getTakeOrReturned() {
        return takeOrReturned;
    }

    public void setTakeOrReturned(String takeOrReturned) {
        this.takeOrReturned = takeOrReturned;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getBook() {
        return book_id;
    }

    public void setBook(int book) {
        this.book_id = book;
    }

    public LocalDate getDate() {return date;}

    public void setDate(LocalDate date) {this.date = date;}
}
