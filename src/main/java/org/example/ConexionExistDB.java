import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.exist.xmldb.DatabaseImpl;

public class ConexionExistDB {

    public static Collection conectar() {
        try {
            Class cl = Class.forName("org.exist.xmldb.DatabaseImpl");
            Database database = (Database) cl.newInstance();
            DatabaseManager.registerDatabase(database);

            String uri = "xmldb:exist://localhost:8080/exist/xmlrpc/db/biblioteca";
            Collection col = DatabaseManager.getCollection(uri, "admin", "");

            if (col == null) {
                System.out.println("❌ No se pudo conectar");
            } else {
                System.out.println("✅ Conectado correctamente");
            }

            return col;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}