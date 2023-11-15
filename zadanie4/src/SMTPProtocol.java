class SMTPProtocol {
    public void sendEmail(String recipient, String subject, String body) {
        System.out.println("Отправка письма по адресу " + recipient + " с: " + subject + " тело: " + body);
    }
}