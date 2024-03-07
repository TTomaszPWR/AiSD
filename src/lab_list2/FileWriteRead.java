package lab_list2;

import java.io.*;

public class FileWriteRead {
    public static void write(Worker[] workers){
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("workers.dat"))) {
            // Zapisz liczbę pracowników
            outputStream.writeInt(workers.length);
            // Zapisz każdego pracownika oddzielnie
            for (Worker worker : workers) {
                outputStream.writeObject(worker);
            }
            System.out.println("Dane pracowników zostały zapisane do pliku.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Worker[] read(){
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("workers.dat"))) {
            // Odczytaj liczbę pracowników
            int numWorkers = inputStream.readInt();
            Worker[] readWorkers = new Worker[numWorkers];
            // Odczytaj każdego pracownika oddzielnie
            for (int i = 0; i < numWorkers; i++) {
                readWorkers[i] = (Worker) inputStream.readObject();
            }
            System.out.println("Dane pracowników zostały odczytane z pliku:");
            return readWorkers; // Zwróć tablicę pracowników
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
