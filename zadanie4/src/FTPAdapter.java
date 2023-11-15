class FTPAdapter implements NetworkProtocol {
    private FTPProtocol ftpProtocol = new FTPProtocol();

    @Override
    public void connect(String host, int port) {
        System.out.println("Подключен к FTP серверу по адресу " + host + ":" + port);
    }

    @Override
    public void send(String data) {
        ftpProtocol.ftpRequest(data, "Данные по FTP");
    }

    @Override
    public void disconnect() {
        System.out.println("Отключен от FTP-сервера");
    }
}