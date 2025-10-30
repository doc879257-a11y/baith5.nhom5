import java.util.HashMap;
import java.util.Map;
public class khosach {
    private Map<String, String> vitrisach = new HashMap<>();

    private static khosach instance = new khosach();

    private khosach() {}

    public static khosach getInstance() {
        return instance;
    }
    public void themCapNhatViTri(String ma, String vitri) {
        vitrisach.put(ma.toLowerCase(), vitri);
    }
    public String getViTri(String ma) {
        return vitrisach.get(ma.toLowerCase());
    }

    public boolean xoaViTri(String ma) {
        return vitrisach.remove(ma.toLowerCase()) != null;
    }
}