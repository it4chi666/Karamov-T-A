class IOS implements OS {
    @Override
    public void start() {
        System.out.println("iOS заблокирована");
    }

    @Override
    public void shutdown() {
        System.out.println("iOS разблокирована");
    }
}