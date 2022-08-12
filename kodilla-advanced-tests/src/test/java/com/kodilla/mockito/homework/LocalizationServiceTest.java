package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LocalizationServiceTest {

    LocalizationService localizationService = new LocalizationService();
    Client client = Mockito.mock(Client.class);
    Client secondClient = Mockito.mock(Client.class);
    Client thirdClient = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    Localization localization = Mockito.mock(Localization.class);
    Localization secondLocalization = Mockito.mock(Localization.class);
    Localization thirdLocalization = Mockito.mock(Localization.class);


    @Test
    public void notSubscribedClientShouldNotReceiveNotificationForSelectedLocalization() {
        localizationService.sendNotificationToGroup(notification, localization);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void notSubscribedClientShouldNotReceiveNotificationForAllLocalizations() {
        localizationService.sendNotificationToAll(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void notificationShouldBeSentToAllClientsInSelectedLocalizations() {
        addSubscribersToLocalization(localization, client);
        addSubscribersToLocalization(localization, secondClient);
        addSubscribersToLocalization(localization, thirdClient);

        localizationService.sendNotificationToGroup(notification, localization);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);


    }

    @Test
    public void notificationShouldBeSentToAllClientsInAllLocalizations() {
        addSubscribersToLocalization(localization, client);
        addSubscribersToLocalization(localization, secondClient);
        addSubscribersToLocalization(localization, thirdClient);
        addSubscribersToLocalization(secondLocalization, thirdClient);
        addSubscribersToLocalization(thirdLocalization, secondClient);

        localizationService.sendNotificationToAll(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(2)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(2)).receive(notification);

    }

    @Test
    public void notificationShouldBeSentToAllClientsInGroup() {
        addSubscribersToLocalization(localization, client);
        addSubscribersToLocalization(localization, secondClient);
        addSubscribersToLocalization(localization, thirdClient);
        addSubscribersToLocalization(secondLocalization, thirdClient);
        addSubscribersToLocalization(thirdLocalization, secondClient);

        localizationService.sendNotificationToGroup(notification, localization);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);

    }

    @Test
    public void removedClientFromGroupShouldntReceiveNotification() {
        addSubscribersToLocalization(localization, secondClient);
        addSubscribersToLocalization(localization, thirdClient);
        addSubscribersToLocalization(secondLocalization, client);
        addSubscribersToLocalization(secondLocalization, thirdClient);
        addSubscribersToLocalization(thirdLocalization, secondClient);

        localizationService.removeClientFromLocalization(thirdClient, secondLocalization);
        localizationService.sendNotificationToGroup(notification, secondLocalization);
        Mockito.verify(thirdClient, Mockito.never()).receive(notification);
    }

    @Test
    public void removedClientFromGroupAShouldReceiveNotificationInGroupB() {
        addSubscribersToLocalization(localization, secondClient);
        addSubscribersToLocalization(localization, thirdClient);
        addSubscribersToLocalization(secondLocalization, client);
        addSubscribersToLocalization(secondLocalization, thirdClient);

        localizationService.removeClientFromLocalization(thirdClient, secondLocalization);
        localizationService.sendNotificationToGroup(notification, localization);
        localizationService.sendNotificationToGroup(notification, secondLocalization);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }

    
    @Test
    public void selectedClientShouldBeRemovedFromAllLocalizations() {
        addSubscribersToLocalization(localization, secondClient);
        addSubscribersToLocalization(localization, thirdClient);
        addSubscribersToLocalization(secondLocalization, client);
        addSubscribersToLocalization(secondLocalization, thirdClient);
        addSubscribersToLocalization(thirdLocalization, thirdClient);

        localizationService.removeClientFromAll(thirdClient);
        localizationService.sendNotificationToGroup(notification, localization);
        localizationService.sendNotificationToGroup(notification, secondLocalization);
        localizationService.sendNotificationToGroup(notification, thirdLocalization);
        Mockito.verify(thirdClient, Mockito.never()).receive(notification);
    }

    @Test
    void clientsShouldntReceiveNotificationForDeletedLocalization() {
        addSubscribersToLocalization(localization, secondClient);
        addSubscribersToLocalization(localization, thirdClient);
        addSubscribersToLocalization(secondLocalization, client);
        addSubscribersToLocalization(secondLocalization, thirdClient);
        addSubscribersToLocalization(thirdLocalization, thirdClient);

        localizationService.removeLocalization(localization);
        localizationService.sendNotificationToGroup(notification, localization);
        localizationService.sendNotificationToGroup(notification, secondLocalization);
        localizationService.sendNotificationToGroup(notification, thirdLocalization);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(2)).receive(notification);
        Mockito.verify(secondClient, Mockito.never()).receive(notification);
    }

    void addSubscribersToLocalization(Localization localization, Client client) {
        localizationService.addSubscriberToLocalization(localization, client);
    }






}