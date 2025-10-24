
public class CSVDataMiner extends DataMiner {

    @Override
    protected void openFile(String path) {
        System.out.println("Abriendo archivo CSV: " + path);
    }

    @Override
    protected Object extractData(String file) {
        System.out.println("Extrayendo datos del CSV...");
        return "Datos CSV";
    }

    @Override
    protected Object parseData(Object rawData) {
        System.out.println("Parseando datos del CSV...");
        return "Datos CSV parseados";
    }

    @Override
    protected void closeFile(Object file) {
        System.out.println("Cerrando archivo CSV...");
    }
} 