class GameSettings {
    private String graphicsSettings;

    public void setGraphicsSettings(String settings) {
        this.graphicsSettings = settings;
    }

    public String getGraphicsSettings() {
        return graphicsSettings;
    }
    public SettingsMemento createMemento() {
        return new SettingsMemento(graphicsSettings);
    }

    public void restoreFromMemento(SettingsMemento memento) {
        this.graphicsSettings = memento.getGraphicsSettings();
    }
}