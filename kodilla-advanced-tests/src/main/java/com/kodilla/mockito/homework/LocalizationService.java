package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;

import java.util.*;

public class LocalizationService {

    private Map<Localization, Set<Client>> notificationsList = new HashMap<>();

    public void addSubscriberToLocalization(Localization localization, Client client){
        if(notificationsList.containsKey(localization)){
            for (Map.Entry<Localization, Set<Client>> entry : this.notificationsList.entrySet()) {
                if(entry.getKey().equals(localization)) entry.getValue().add(client);
            }
        } else {
            Set<Client> clients = new HashSet<>();
            clients.add(client);
            this.notificationsList.put(localization, clients);
        }
    }

    public void sendNotificationToGroup(Notification notification, Localization localization){
        for (Map.Entry<Localization, Set<Client>> entry : this.notificationsList.entrySet()) {
            if(entry.getKey().equals(localization))
                for(Client client: entry.getValue()) {
                    client.receive(notification);
                }
        }
    }

    public void sendNotificationToAll(Notification notification){
        for (Map.Entry<Localization, Set<Client>> entry : this.notificationsList.entrySet()) {
            for(Client client: entry.getValue()) {
                client.receive(notification);
            }
        }
    }

    public void removeClientFromLocalization(Client client, Localization localization){
        for (Map.Entry<Localization, Set<Client>> entry : this.notificationsList.entrySet()) {
            if(entry.getKey().equals(localization))
                for(Client c: entry.getValue()) {
                    entry.getValue().remove(client);
                    break;
                }
            }
    }

    public void removeClientFromAll(Client client) {
        for (Map.Entry<Localization, Set<Client>> entry : this.notificationsList.entrySet()) {
            for(Client c: entry.getValue()) {
                if(c.equals(client)){
                    entry.getValue().remove(client);
                    break;
                }
            }
        }
    }

    public void removeLocalization(Localization localization){
        for (Map.Entry<Localization, Set<Client>> entry : this.notificationsList.entrySet()) {
            if (entry.getKey().equals(localization)) {
                this.notificationsList.remove(localization);
                break;
            }
        }
    }

}
