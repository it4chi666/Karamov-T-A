class EmailSubscriber implements Observer {
    private String name;

    public EmailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String emailStatus) {
        System.out.println(name + " получено обновление: Статус письма - " + emailStatus);
    }
}