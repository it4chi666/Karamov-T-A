class Android implements OS {
    @Override
    public void start() {
        System.out.println("Android разблокирован");
    }

    @Override
    public void shutdown() {
        System.out.println("Android заблокирован");
    }
}