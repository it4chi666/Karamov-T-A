import java.util.ArrayList;
import java.util.List;
class VideoFolder implements VideoComponent {
    private final String name;
    private final List<VideoComponent> components;

    public VideoFolder(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public void add(VideoComponent component) {
        components.add(component);
    }

    @Override
    public void remove(VideoComponent component) {
        components.remove(component);
    }

    @Override
    public void play() {
        // Оставим этот метод пустым, так как для папки нет действия "воспроизвести"
    }

    @Override
    public void displayContents() {
        System.out.println("содержимое папки '" + name + "':");
        for (VideoComponent component : components) {
            component.displayContents();
        }
    }

    public String getName() {
        return name;
    }

    public List<VideoComponent> getComponents() {
        return components;
    }
}
