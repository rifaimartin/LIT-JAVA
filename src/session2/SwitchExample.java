package session2;

public class SwitchExample {
    public static void main(String[] args) {
        int bulan = 6;
        String musim;

        switch (bulan) {
            case 12:
            case 1:
            case 2:
                musim = "Musim Hujan";
                break;
            case 3:
            case 4:
            case 5:
                musim = "Musim Peralihan ke Kemarau";
                break;
            case 6:
            case 7:
            case 8:
                musim = "Musim Kemarau";
                break;
            case 9:
            case 10:
            case 11:
                musim = "Musim Peralihan ke Hujan";
                break;
            default:
                musim = "Bulan tidak valid";
                break;
        }

        System.out.println("Bulan " + bulan + " adalah: " + musim);
    }
}
