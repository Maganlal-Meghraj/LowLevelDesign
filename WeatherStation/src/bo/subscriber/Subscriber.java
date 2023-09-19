package bo.subscriber;

import bo.item.Item;

public interface Subscriber {
    void notify(Item item);
}
