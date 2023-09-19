package bo.station;

import bo.item.Item;
import bo.subscriber.Subscriber;

import java.util.Set;

public class WeatherStation implements Station {

    private final Set<Subscriber> subscribers;
    private Item item;
    public WeatherStation(Set<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public void update(Item item) {
        this.item = item;
    }

    @Override
    public void emit() {
        for(Subscriber subscriber: subscribers) {
            subscriber.notify(item.clone());
        }
    }

    @Override
    public boolean addSubscriber(Subscriber subscriber) {
        return subscribers.add(subscriber);
    }

    @Override
    public boolean removeSubscriber(Subscriber subscriber) {
        return subscribers.remove(subscriber);
    }
}
