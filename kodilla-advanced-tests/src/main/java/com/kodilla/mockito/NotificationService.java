package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;

import java.lang.ref.Cleaner;
import java.util.*;

public class NotificationService {

    private Set<Client> clients = new HashSet<>();

    public void addSubscriber(Client client){
        this.clients.add(client);
    }
    public void sendNotification(Notification notification){
        this.clients.forEach(client ->  client.receive(notification));
    }

    public void removeSubscriber(Client client) {
        this.clients.remove(client);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationService that = (NotificationService) o;
        return Objects.equals(clients, that.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clients);
    }

}
