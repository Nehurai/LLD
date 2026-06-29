package Observer;
import Observable.StocksObservable;
public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StocksObservable observable;
    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail(emailId, "Product is in stock hurry Up!");
    }
    private void sendEmail(String emailId, String message) {
        System.out.println("Email sent to " + emailId + ": " + message);
    }
}
