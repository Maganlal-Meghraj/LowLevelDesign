package bo.subscriber;

import bo.item.Item;

public abstract class PushNotificationSubscriber implements Subscriber {

    private final String deviceId;

    protected PushNotificationSubscriber(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void notify(Item item) {
        sendPushNotification(item);
    }

    protected abstract void sendPushNotification(Item item);
}
