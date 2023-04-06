package org.example.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class Client implements Serializable {


    UUID uuid = UUID.randomUUID();

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    int id;

    public String getNameClient() {return nameClient;}
    public String nameClient;
    public UUID getUuid(){return uuid;}
    public void setUuid(UUID uuid) {this.uuid = uuid;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(nameClient, client.nameClient);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameClient, uuid);
    }

    public Client(UUID uuid, String nameClient){
        this.nameClient=nameClient;
        this.uuid=uuid;
    }
    public Client(int id,UUID uuid, String nameClient){
        this.nameClient=nameClient;
        this.uuid=uuid;
        this.id=id;
    }

    public static String getClientNameForMyBooks() {
        return clientNameForMyBooks;
    }

    public static void setClientNameForMyBooks(String clientNameForMyBooks) {
        Client.clientNameForMyBooks = clientNameForMyBooks;
    }

    public static Client addClient(String nameClient){
        UUID uuid = UUID.randomUUID();
        Client client = new Client(UUID.randomUUID(), nameClient);
        return client;
    }

    private static String clientNameForMyBooks;
}
