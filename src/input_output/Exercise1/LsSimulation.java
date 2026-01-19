import java.io.File;
import java.util.Scanner;

public class LsSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String path = sc.nextLine();

        File dir = new File(path);

        // Check if path exists and is a directory
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }

        File[] files = dir.listFiles();

        if (files == null) {
            System.out.println("Empty directory or access denied.");
            return;
        }

        for (File f : files) {

            // Full path
            System.out.print(f.getAbsolutePath() + " ");

            // Type
            if (f.isDirectory()) {
                System.out.print("<DIR> ");
            } else {
                System.out.print("<FILE> ");
            }

            // Permissions
            String permissions = "";

            permissions += f.canRead() ? "r" : "-";
            permissions += f.canWrite() ? "w" : "-";
            permissions += f.isHidden() ? "h" : "-";

            System.out.println(permissions);
        }

        sc.close();
    }
}
