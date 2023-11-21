import java.util.ArrayList;
import java.util.List;

class SettingsCaretaker {
    private final List<SettingsMemento> mementos = new ArrayList<>();

    public void addMemento(SettingsMemento memento) {
        mementos.add(memento);
    }

    public SettingsMemento getMemento(int index) {
        return mementos.get(index);
    }

    public List<SettingsMemento> getMementos() {
        return mementos;
    }
}