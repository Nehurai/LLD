package Observable;
import Observer.NotificationAlertObserver;
public interface StocksObservable {
    public void addObserver(NotificationAlertObserver observer);
    public void removeObserver(NotificationAlertObserver observer);
    public void notifyObservers();
    public void setStockCount(int newStockAdded);  
    public int getStockCount();
}
