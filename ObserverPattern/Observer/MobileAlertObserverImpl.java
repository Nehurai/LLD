package Observer;
import Observable.StocksObservable;
public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String mobileNumber;
    StocksObservable observable;
    public MobileAlertObserverImpl(String mobileNumber, StocksObservable observable) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }
    
    @Override
    public void update() {
        sendSMS(mobileNumber, "Product is in stock hurry Up!");
    }
    private void sendSMS(String mobileNumber, String message) {
        System.out.println("SMS sent to " + mobileNumber + ": " + message);
    }
    
}
