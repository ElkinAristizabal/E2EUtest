package utest.utils;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTxtCredentials {
    private static final String email = RandomGenerator.email();
    private static final String password = RandomGenerator.password();

    public static void createCredentialsFile() {

        try {
            // Nombre del archivo que deseas crear
            String fileName = "credentials.txt";

            // Obtiene la ubicación del directorio de trabajo actual
            String currentWorkingDirectory = System.getProperty("user.dir");

            System.out.println("currentWorkingDirectory = " + currentWorkingDirectory);

            // Ruta relativa desde el directorio de trabajo hasta la ubicación deseada
            String relativePath = "src/main/java/utest/userinterfaces";

            // Combina la ruta actual con la ruta relativa y el nombre del archivo
            String fullFilePath = currentWorkingDirectory + "/" + relativePath + "/" + fileName;

            // Crea un objeto FileWriter para el archivo
            FileWriter writer = new FileWriter(fullFilePath);

            // Escribe la primera línea en el archivo
            writer.write("email: " + email + ", password: " + password);

            // Cierra el objeto FileWriter
            writer.close();

            System.out.println("Archivo creado exitosamente en: " + fullFilePath);
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        createCredentialsFile();
    }
}
