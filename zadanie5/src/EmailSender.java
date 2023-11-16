import java.util.ArrayList;
import java.util.List;

class EmailSender implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private List<String> emailHistory = new ArrayList<>();
    private String emailStatus;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(emailStatus);
        }
    }

    public void sendEmail(String recipientEmail, String emailContent) {
        // Здесь логика отправки письма (имитация)
        emailStatus = Math.random() > 0.5 ? "Письмо отправлено успешно " + recipientEmail : "Не удалось отправить письмо " + recipientEmail; //представление реализации 
        emailHistory.add("Получатель: " + recipientEmail + " | Содержание: " + emailContent + " | Статус: " + emailStatus);
        notifyObservers();
    }

    public void printEmailHistory() {
        if (emailHistory.isEmpty()) {
            System.out.println("Нет отправленных писем");
        } else {
            System.out.println("История отправки писем:");
            for (String email : emailHistory) {
                System.out.println(email);
            }
        }
    }
}