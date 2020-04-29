import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.lang.reflect.*;

class JSONWriter {
    private Object o;

    public JSONWriter(Object o) {
        this.o = o;
    }

    public String mapToJSON(Map<String, String> jsonFieldMap) {
        String jsonString = jsonFieldMap
            .entrySet()
            .stream()
            .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
            .collect(Collectors.joining(","));

        return "{" + jsonString + "}";
    }

    public String toString(){
        Map<String, String> jsonFieldMap = new TreeMap<>();
        // TODO:
        // Untuk setiap field di kelas o, periksa apakah memiliki anotasi dengan
        // field.isAnnotationPresent(JSONField.class).
        // Jika ada, tambahkan entry ke jsonFieldMap dengan <key,value> =
        //   key = nama field
        //   value = nilai dari field
        // ...lengkapi di sini
        Class c = o.getClass();
        Field[] f = c.getDeclaredFields();
        for (Field e : f) {
            e.setAccessible(true);
            if (e.isAnnotationPresent(JSONField.class)) {
                try {
                    Object v = e.get(o);
                    jsonFieldMap.put(e.getName(), v.toString());
                } catch (Exception E) {
                    continue;
                }
            }
        }
        return mapToJSON(jsonFieldMap);
    }
}