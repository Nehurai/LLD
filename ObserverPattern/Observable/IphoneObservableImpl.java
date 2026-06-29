package Observable;
import java.util.ArrayList;
import java.util.List;
import Observer.NotificationAlertObserver;
public class IphoneObservableImpl implements StocksObservable {
    private int stockCount;
    private List<NotificationAlertObserver> observerList = new ArrayList<>();
    
    public IphoneObservableImpl() {
        this.stockCount = 0;
        this.observerList = new ArrayList<>();
    }
    
    @Override
    public void addObserver(NotificationAlertObserver observer) {
        observerList.add(observer);
    }
    
    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }
    
    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }
    
    public void setStockCount(int newStockAdded) {
        this.stockCount += newStockAdded;
        notifyObservers();
    }
    
    public int getStockCount() {
        return stockCount;
    }
}
