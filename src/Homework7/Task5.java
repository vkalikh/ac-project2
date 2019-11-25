package Homework7;

import java.io.*;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static java.lang.System.out;

public class Task5 {
    public static void main(String[] args) {
        //String filename = "C:\\Users\\Viktoryia.Kalikh\\Desktop\\automation_classes\\file.txt";


        String dirname = "C:\\Users\\Viktoryia.Kalikh\\Desktop\\automation_classes\\Task5";
        File dir = new File(dirname);
        Scanner in = new Scanner(System.in);
        String content;
        if (dir.mkdir()) {
            for (int i = 1; i <= 3; i++) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(dirname + "\\file" + i + ".txt"))) {
                    out.println("Enter a file" + i + " content:");
                    content = in.nextLine();
                    bw.write(content);
                } catch (IOException e) {
                    out.println(e.getMessage());
                }
            }
        } else {
            out.println("Can't create directory");
            System.exit(0);
        }

        try {
            File[] check = dir.listFiles();
            FileOutputStream fot = new FileOutputStream("C:\\Users\\Viktoryia.Kalikh\\Desktop\\automation_classes\\Task5\\Task5.zip");
            ZipOutputStream zos = new ZipOutputStream(fot);
            for (File s : check) {
                if (s.isFile()) {
                    zos.putNextEntry(new ZipEntry(s.getName()));
                    FileInputStream ins = new FileInputStream(s);
                    byte[] buffer = new byte[ins.available()];
                    ins.read(buffer);
                    zos.write(buffer);
                    ins.close();
                }
            }
            zos.close();
            fot.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        out.println("Enter new file name:");
        content = in.nextLine();
        File newdir = new File("C:\\Users\\Viktoryia.Kalikh\\Desktop\\automation_classes\\" + content);
        if (!dir.renameTo(newdir)) {
            out.println("Something goes wrong!!!");
        }


        File[] list = newdir.listFiles();
        out.println("\nDirectory contains:");
        for (int i = 0; i < list.length; i++) {
            out.println(list[i]);
        }
    }


 /*   private static void writeZip(File list, ZipOutputStream zos) throws IOException {

        for (File s : list.listFiles()) {
            zos.putNextEntry(new ZipEntry(s.getName()));
            FileInputStream in = new FileInputStream(s);
            byte[] buffer = new byte[in.available()];
            in.read(buffer);
            zos.write(buffer);
        }
    }*/
}