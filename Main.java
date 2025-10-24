import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE MINERÍA DE DATOS ===");
        System.out.println("Formatos disponibles: DOC, CSV, PDF");
        System.out.print("Ingresa el tipo de archivo que deseas procesar: ");
        String tipo = sc.nextLine().trim().toLowerCase();

        DataMiner miner = null;

        switch (tipo) {
            case "doc":
                miner = new DocDataMiner();
                break;
            case "csv":
                miner = new CSVDataMiner();
                break;
            case "pdf":
                miner = new PDFDataMiner();
                break;
            default:
                System.out.println("❌ Tipo de archivo no reconocido.");
                System.exit(0);
        }

        System.out.print("📁 Ingresa el nombre del archivo (ejemplo: data.doc): ");
        String nombreArchivo = sc.nextLine().trim();

        System.out.println("\n--- Iniciando proceso ---");
        miner.mine(nombreArchivo);

        System.out.println("\n✅ Proceso finalizado exitosamente.");
        sc.close();
    }
}  

