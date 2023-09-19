package bo.subscriber;

import bo.item.Item;

public abstract class EmailSubscriber implements Subscriber {

    private final String maidId;

    protected EmailSubscriber(String maidId) {
        this.maidId = maidId;
    }

    @Override
    public void notify(Item item) {
        sendMail(item);
    }

    protected abstract void sendMail(Item item);
}
