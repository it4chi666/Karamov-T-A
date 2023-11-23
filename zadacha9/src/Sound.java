class Sound {
    private String soundName;
    private byte[] soundData;

    public Sound(String soundName, byte[] soundData) {
        this.soundName = soundName;
        this.soundData = soundData;
    }

    public String getSoundName() {
        return soundName;
    }

    public byte[] getSoundData() {
        return soundData;
    }

}