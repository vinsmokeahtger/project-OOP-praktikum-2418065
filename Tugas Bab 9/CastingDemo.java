/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Erlanha_Trans;

/**
 *
 * @author MyBook Hype AMD
 */
import javax.swing.JOptionPane;

public class CastingDemo {

    public static void demoCasting() {

        String hasil = "";

        // ======================
        // UPCASTING
        // ======================

        Bus busVIP = new VIP(
                "Erlanha_Trans",
                "Jakarta",
                250000);

        Bus busExecutive = new Executive(
                "Erlanha_Trans",
                "Surabaya",
                300000);

        hasil += "===== UPCASTING =====\n\n";

        hasil += busVIP.tampilkanInfo();
        hasil += "\n\n";

        hasil += busExecutive.tampilkanInfo();

        // ======================
        // DOWNCASTING
        // ======================

        hasil += "\n\n===== DOWNCASTING =====\n\n";

        if(busVIP instanceof VIP){

            VIP vip = (VIP) busVIP;

            hasil += "Jenis Bus : VIP\n";
            hasil += "Fasilitas : "
                    + vip.getFasilitas()
                    + "\n\n";
        }

        if(busExecutive instanceof Executive){

            Executive ex =
                    (Executive) busExecutive;

            hasil += "Jenis Bus : Executive\n";
            hasil += "Fasilitas : "
                    + ex.getFasilitas();
        }

        JOptionPane.showMessageDialog(
                null,
                hasil,
                "Demo Polymorphism Casting",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
