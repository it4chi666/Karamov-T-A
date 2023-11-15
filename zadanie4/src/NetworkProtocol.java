interface NetworkProtocol {
    void connect(String host, int port);
    void send(String data);
    void disconnect();
}