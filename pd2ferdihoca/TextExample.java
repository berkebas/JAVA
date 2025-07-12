package pd2ferdihoca;

import java.util.List;

import javax.swing.*;
import javax.swing.event.*;

// Tek bir sütunu seçmek istersem nasıl seçerim ÖDEV

public class TextExample {
    public static void main(String[] args) {
        // Tablo verisi - ücretler güncellendi
        String[][] data = {
                { "1", "Ahmet", "50000" },
                { "2", "John", "55000" },
                { "3", "Salih", "70000" }
        };

        // Sütun başlıkları
        String[] coulmn = { "ID", "NAME", "SALARY" };

        // JTable oluşturma
        JTable table = new JTable(data, coulmn);
        table.setCellSelectionEnabled(true); // Hücre seçimine izin ver
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Tek hücre seçimi

        // Hücre seçimi olay dinleyicisi ekleme (lambda)
        table.getSelectionModel().addListSelectionListener(e -> {
            int row = table.getSelectedRow();
            int col = table.getSelectedColumn();
            System.out.println("Selected: " + table.getValueAt(row, col));
        });

        // Pencere oluşturma
        JFrame frame = new JFrame("Table Example");
        frame.add(new JScrollPane(table));
        // Tabloyu kaydırma çubuğu ile ekle
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
