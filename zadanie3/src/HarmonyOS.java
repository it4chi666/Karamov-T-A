class HarmonyOS implements OS {
    @Override
    public void start() {
        System.out.println("HarmonyOS разблокирован");
    }

    @Override
    public void shutdown() {
        System.out.println("HarmonyOS заблокирован");
    }
}