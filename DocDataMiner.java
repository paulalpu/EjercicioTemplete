
public class DocDataMiner extends DataMiner {

    @Override
    protected void openFile(String path) {
        System.out.println("Abriendo archivo DOC: " + path);
    }

    @Override
    protected Object extractData(String file) {
        System.out.println("Extrayendo datos del DOC...");
        return "Datos DOC";
    }

    @Override
    protected Object parseData(Object rawData) {
        System.out.println("Parseando datos del DOC...");
        return "Datos DOC parseados";
    }

    @Override
    protected void closeFile(Object file) {
        System.out.println("Cerrando archivo DOC...");
    }
} 
