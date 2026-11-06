import org.xmldb.api.base.Collection;
import org.xmldb.api.modules.XQueryService;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.modules.XMLResource;

public class Consultas {

    public static void buscarPorAutor(Collection col, String autor) {
        try {
            XQueryService servicio = (XQueryService) col.getService("XQueryService", "1.0");

            String consulta =
                    "for $libro in /biblioteca/libro " +
                            "where $libro/autor = '" + autor + "' " +
                            "return $libro";

            ResourceSet resultado = servicio.query(consulta);
            ResourceIterator i = resultado.getIterator();

            while (i.hasMoreResources()) {
                System.out.println(i.nextResource().getContent());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void añadirLibro(Collection col) {
        try {
            XMLResource recurso = (XMLResource) col.createResource("libroNuevo.xml", "XMLResource");

            String xml =
                    "<libro id='10'>" +
                            "<titulo>Libro de prueba</titulo>" +
                            "<autor>Autor prueba</autor>" +
                            "<editorial>Editorial test</editorial>" +
                            "<fechaPublicacion>2024-01-01</fechaPublicacion>" +
                            "<genero>Ficción</genero>" +
                            "<descripcion>Libro añadido desde Java</descripcion>" +
                            "<contenido>Texto completo</contenido>" +
                            "</libro>";

            recurso.setContent(xml);
            col.storeResource(recurso);

            System.out.println("✅ Libro añadido");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void modificarLibro(Collection col) {
        try {
            XMLResource recurso = (XMLResource) col.getResource("libroNuevo.xml");

            String xml =
                    "<libro id='1'>" +
                            "<titulo>Modificado</titulo>" +
                            "<autor>Autor modificado</autor>" +
                            "<editorial>Editorial ejemplo</editorial>" +
                            "<fechaPublicacion>2024-01-01</fechaPublicacion>" +
                            "<genero>Drama</genero>" +
                            "<descripcion>Modificado</descripcion>" +
                            "<contenido>Nuevo contenido</contenido>" +
                            "</libro>";

            recurso.setContent(xml);
            col.storeResource(recurso);

            System.out.println("✏️ Libro modificado");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void eliminarLibro(Collection col) {
        try {
            XMLResource recurso = (XMLResource) col.getResource("libroNuevo.xml");
            col.removeResource(recurso);

            System.out.println("❌ Libro eliminado");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}