package bo.subscriber;

import bo.item.Item;

public class SMSSubscriber implements Subscriber{
    private final String phoneNo;

    public SMSSubscriber(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public void notify(Item item) {
        sendSMS(item);
    }

    private void sendSMS(Item item) {

    }
}
