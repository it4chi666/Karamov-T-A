import java.util.HashMap;
import java.util.Map;
class ResourceManager {
    private static ResourceManager instance;
    private Map<String, Object> resourceCache;

    private ResourceManager() {
        resourceCache = new HashMap<>();
    }

    public static synchronized ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }

    public void loadResource(String key, Object resource) {
        resourceCache.put(key, resource);
        System.out.println("Файл '" + key + "' загружен в кэш.");
    }

    public Object getResource(String key) {
        if (resourceCache.containsKey(key)) {
            System.out.println("Файл '" + key + "' найден в кэше.");
            return resourceCache.get(key);
        } else {
            System.out.println("Файл '" + key + "' отсутствует в кэше.");
            return null;
        }
    }
}