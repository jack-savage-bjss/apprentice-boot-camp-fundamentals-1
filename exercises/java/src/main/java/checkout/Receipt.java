package checkout;

public class Receipt {

    private String text = "";
    private int total;
    private int aCountdown = 3;
    private int bCountdown = 2;
    private int cCountdown = 4;
    private int dCountdown = 5;

    String text() {
        return text + "Total: " + total;
    }

    void scannedA() {
        text += "A: 50";
        if (--aCountdown == 0) {
            text += " - 20 (3 for 130)";
            total += 30;
        }
        else {
            total += 50;
        }
        text += "\n";
    }

    void scannedB() {
        text += "B: 30";
        if (--bCountdown == 0) {
            text += " - 15 (2 for 45)";
            total += 15;
        }
        else {
            total += 30;
        }
        text += "\n";
    }

    void scannedC() {
        text += "C: 20";
        if (--cCountdown == 0) {
            text += " - 10 (4 for 70)";
            total += 10;
        }
        else {
            total += 20;
        }
        text += "\n";
    }

    void scannedD() {
        text += "D: 15";
        if (--dCountdown == 0) {
            text += " - 15 (5 for 60)";
        }
        else {
            total += 15;
        }
        text += "\n";
    }

    public void scannedProduct(Product scannedProduct) {
        // Replace 'scannedA, scannedB, ...' methods here.
    }
}
