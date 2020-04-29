import java.lang.reflect.*;

public class AssistantDecoder {
    private Class c;
    private Assistant a;

    AssistantDecoder(Assistant assistant) {
        c = assistant.getClass();
        a = assistant;
    }

    public void addPersonToRecommendations(String name) throws Exception {
        Method m = c.getDeclaredMethod("addPersonToRecommendations", String.class);
        m.setAccessible(true);
        m.invoke(a, name);
    }

    public int getSalary() throws Exception {
        Field f = c.getDeclaredField("salary");
        f.setAccessible(true);
        return f.getInt(a);
    }
}