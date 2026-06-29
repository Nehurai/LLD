import Observable.IphoneObservableImpl;
import Observable.StocksObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservableImpl();
        NotificationAlertObserver mobileObserver = new MobileAlertObserverImpl("1234567890", iphoneStockObservable);
        NotificationAlertObserver emailObserver = new EmailAlertObserverImpl("user@example.com", iphoneStockObservable);
        iphoneStockObservable.addObserver(mobileObserver);
        iphoneStockObservable.addObserver(emailObserver);
        iphoneStockObservable.setStockCount(10);

        iphoneStockObservable.setStockCount(10);
    }
}
