package bo.station;

import bo.item.Item;
import bo.subscriber.Subscriber;

public interface Station {
    void update(Item item);
    void emit();
    boolean addSubscriber(Subscriber subscriber);
    boolean removeSubscriber(Subscriber subscriber);
}
