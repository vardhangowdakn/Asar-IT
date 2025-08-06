class FileDownloader extends Thread {
    public void run() {
        System.out.println("Starting file download...");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Downloading " + i * 20 + "%");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Download interrupted.");
        }
        System.out.println("File download complete.");
    }
}

class VirusScanner implements Runnable {
    public void run() {
        System.out.println("Starting virus scan...");
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Scanning file " + i);
                Thread.sleep(1500); // simulate scanning delay
            }
        } catch (InterruptedException e) {
            System.out.println("Scan interrupted.");
        }
        System.out.println("Virus scan complete.");
    }
}

public class MultiThreadingTask {
    public static void main(String[] args) {
        FileDownloader downloadThread = new FileDownloader();
        Thread scanThread = new Thread(new VirusScanner());

        downloadThread.start();
        scanThread.start();
    }
}

// output

// Scanning file 1
// Downloading 40%
// Scanning file 2
// Downloading 60%
// Scanning file 3
// Downloading 80%
// Downloading 100%
// Virus scan complete.
// File download complete.
