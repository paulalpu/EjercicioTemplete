public abstract class DataMiner {

    public void mine(String path) {
        openFile(path);
        Object file = extractData(path);
        Object rawData = parseData(file);
        analyzeData(rawData);
        sendReport("Análisis completado");
        closeFile(file);
    }

    protected abstract void openFile(String path);
    protected abstract Object extractData(String file);
    protected abstract Object parseData(Object rawData);
    protected abstract void closeFile(Object file);

    protected void analyzeData(Object data) {
        System.out.println("Analizando datos...");
    }

    protected void sendReport(String analysis) {
        System.out.println("Enviando reporte: " + analysis);
    }
}