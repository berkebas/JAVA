package pd2ferdihoca;

import javax.swing.*;

public class TableExample2 {

    TableExample2(){
        JFrame frame = new JFrame("Table");

        String data [][] = {
            {"1","Ahmet","50000"},
            {"2", "John", "55000"},
            {"3", "Salih", "70000"}
        };

        String coulmn [] = {"NO", "NAME", "SALARY"};
        
        JTable table = new JTable(data, coulmn);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new TableExample2();
    }
}
