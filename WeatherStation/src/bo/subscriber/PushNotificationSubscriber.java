package bo.subscriber;

import bo.item.Item;

public class PushNotificationSubscriber implements Subscriber {

    private final String deviceId;

    public PushNotificationSubscriber(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void notify(Item item) {
        sendPushNotification(item);
    }

    private void sendPushNotification(Item item) {

    }
}
