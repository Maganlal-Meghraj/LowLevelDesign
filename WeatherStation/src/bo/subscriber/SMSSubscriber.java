package bo.subscriber;

import bo.item.Item;

public abstract class SMSSubscriber implements Subscriber{
    private final String phoneNo;

    protected SMSSubscriber(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public void notify(Item item) {
        sendSMS(item);
    }

    protected abstract void sendSMS(Item item);
}
