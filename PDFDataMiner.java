public class PDFDataMiner extends DataMiner {

    @Override
    protected void openFile(String path) {
        System.out.println("Abriendo archivo PDF: " + path);
    }

    @Override
    protected Object extractData(String file) {
        System.out.println("Extrayendo datos del PDF...");
        return "Datos PDF";
    }

    @Override
    protected Object parseData(Object rawData) {
        System.out.println("Parseando datos del PDF...");
        return "Datos PDF parseados";
    }

    @Override
    protected void closeFile(Object file) {
        System.out.println("Cerrando archivo PDF...");
    }
} 