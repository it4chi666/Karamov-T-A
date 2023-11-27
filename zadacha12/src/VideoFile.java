class VideoFile implements VideoComponent {
    private final String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void play() {
    }

    @Override
    public void add(VideoComponent component) {
    }

    @Override
    public void remove(VideoComponent component) {
    }

    @Override
    public void displayContents() {
        System.out.println("файл: " + name);
    }
}