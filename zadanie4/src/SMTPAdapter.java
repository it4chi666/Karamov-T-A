class SMTPAdapter implements NetworkProtocol {
    private SMTPProtocol smtpProtocol = new SMTPProtocol();

    @Override
    public void connect(String host, int port) {
        System.out.println("Подключен к SMTP серверу " + host + ":" + port);
    }

    @Override
    public void send(String data) {
        String[] parts = data.split(":");
        if (parts.length == 3) {
            smtpProtocol.sendEmail(parts[0], parts[1], parts[2]);
        } else {
            System.out.println("Неверный формат email");
        }
    }

    @Override
    public void disconnect() {
        System.out.println("Отключен от SMTP сервера");
    }
}
