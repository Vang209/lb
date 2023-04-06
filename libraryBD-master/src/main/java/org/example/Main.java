package org.example;

import org.example.model.DatabaseConnection;
import org.example.repository.ClientRepository;
import org.example.repository.DatabaseRepository;
import org.example.view.ClientView;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.UUID;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

        DatabaseRepository.ReadDatabase();
        ClientView clientView = new ClientView();
        System.out.println(ClientRepository.clients.get(1).getUuid());
        clientView.LoginClient();
//
//        UUID uuid = UUID.randomUUID();
//        System.out.println(uuid);

    }
}