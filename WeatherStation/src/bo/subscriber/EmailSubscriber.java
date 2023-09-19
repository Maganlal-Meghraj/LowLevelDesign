package bo.subscriber;

import bo.item.Item;

public class EmailSubscriber implements Subscriber {

    private final String maidId;

    public EmailSubscriber(String maidId) {
        this.maidId = maidId;
    }

    @Override
    public void notify(Item item) {
        sendMail(item);
    }

    private void sendMail(Item item) {

    }
}
