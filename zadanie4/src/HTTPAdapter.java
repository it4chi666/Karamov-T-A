class HTTPAdapter implements NetworkProtocol {
    private HTTPProtocol httpProtocol = new HTTPProtocol();

    @Override
    public void connect(String host, int port) {
        System.out.println("Подключен к HTTP серверу по адресу " + host + ":" + port);
    }

    @Override
    public void send(String data) {
        httpProtocol.httpRequest("http://" + data, "HTTP данные");
    }

    @Override
    public void disconnect() {
        System.out.println("Отключен от HTTP сервера");
    }
}