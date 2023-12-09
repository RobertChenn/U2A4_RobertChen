/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u2a4_robertchen;

/**
 *
 * @author 335091559
 */
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import javax.swing.ButtonGroup;
public class GroceryStore extends javax.swing.JFrame {

    /**
     * Creates new form GroceryStore
     */
    ArrayList<Item> items = new ArrayList();
    String[] options = {};
    String userInput, type, charO, charTw, charTh, charFo;
    Character char1, char2, char3, char4, char5, char6, char7, char8;
    int charFi, charSi, charSe, charE;
    public GroceryStore() {
        initComponents();
        ButtonGroup group = new ButtonGroup();
        group.add(skuType);
        group.add(nameType);
    }
    
    public void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inventory.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] options = line.split(",");
                
                Item item = new Item(options[0], options[1], options[2], Integer.parseInt(options[3]), Integer.parseInt(options[4]), 
                        Double.parseDouble(options[5]), Double.parseDouble(options[6]), Double.parseDouble(options[7]), 
                        Double.parseDouble(options[8]), Double.parseDouble(options[9]));
                list.setText(item.toString());
                items.add(item);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void writeToFile(Item item) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("inventory.txt"));
            writer.write(item.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JTextArea();
        skuPrompt = new javax.swing.JLabel();
        sku = new javax.swing.JTextField();
        namePrompt = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        categoryPrompt = new javax.swing.JLabel();
        category = new javax.swing.JTextField();
        quantityPrompt = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        minimumPrompt = new javax.swing.JLabel();
        minimum = new javax.swing.JTextField();
        vendorPricePrompt = new javax.swing.JLabel();
        vendorPrice = new javax.swing.JTextField();
        markupPercentagePrompt = new javax.swing.JLabel();
        markupPercentage = new javax.swing.JTextField();
        regularPricePrompt = new javax.swing.JLabel();
        regularPrice = new javax.swing.JTextField();
        discountPrompt = new javax.swing.JLabel();
        discount = new javax.swing.JTextField();
        currentPricePrompt = new javax.swing.JLabel();
        currentPrice = new javax.swing.JTextField();
        input = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        output = new javax.swing.JTextField();
        prompt = new javax.swing.JLabel();
        selectType = new javax.swing.JLabel();
        skuType = new javax.swing.JToggleButton();
        nameType = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        displayInventory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 51, 51));
        title.setText("Grocery Store Inventory");

        list.setEditable(false);
        list.setColumns(20);
        list.setRows(5);
        jScrollPane1.setViewportView(list);

        skuPrompt.setText("Stock Keeping Unit (SKU): ");

        namePrompt.setText("Name:");

        categoryPrompt.setText("Category:");

        quantityPrompt.setText("Quantity:");

        minimumPrompt.setText("Minimum:");

        vendorPricePrompt.setText("Vendor Price:");

        markupPercentagePrompt.setText("Markup Percentage:");

        regularPricePrompt.setText("Regular Price:");

        discountPrompt.setText("Discount Percentage:");

        currentPricePrompt.setText("Current Price:");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        prompt.setText("Enter a SKU/Name:");

        selectType.setText("Select a Type to Search:");

        skuType.setText("SKU");
        skuType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skuTypeActionPerformed(evt);
            }
        });

        nameType.setText("Name");
        nameType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTypeActionPerformed(evt);
            }
        });

        jButton1.setText("Add to Inventory");

        jButton2.setText("Save to File");

        displayInventory.setText("Display Inventory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(skuPrompt)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sku, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(namePrompt)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(quantityPrompt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(quantity))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(minimumPrompt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(minimum))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(categoryPrompt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(regularPricePrompt)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(regularPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(markupPercentagePrompt)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(markupPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(vendorPricePrompt)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(vendorPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(discountPrompt)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(currentPricePrompt)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(currentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(121, 121, 121))))
                            .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(selectType)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(skuType)
                                    .addGap(18, 18, 18)
                                    .addComponent(nameType)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(displayInventory))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(prompt)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(search))))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectType)
                    .addComponent(skuType)
                    .addComponent(nameType)
                    .addComponent(displayInventory))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search)
                    .addComponent(prompt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skuPrompt)
                    .addComponent(sku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendorPricePrompt)
                    .addComponent(vendorPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namePrompt)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markupPercentagePrompt)
                    .addComponent(markupPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryPrompt)
                    .addComponent(regularPricePrompt)
                    .addComponent(regularPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityPrompt)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discountPrompt)
                    .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minimumPrompt)
                    .addComponent(minimum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentPricePrompt)
                    .addComponent(currentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        userInput = input.getText();
        
        try {
            if (type.equals("sku")) {
                if (getChar(userInput)) {
                    
                }
            } else if (type.equals("name")) {
                
            }
        } catch(Exception e) {
            output.setText("Please make sure that you formatted the SKU/Name correctly");
        }
    }//GEN-LAST:event_searchActionPerformed

    private void skuTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skuTypeActionPerformed
        prompt.setText("Enter a SKU:");
        type = "sku";
    }//GEN-LAST:event_skuTypeActionPerformed

    private void nameTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTypeActionPerformed
        prompt.setText("Enter a Name:");
        type = "name";
    }//GEN-LAST:event_nameTypeActionPerformed
    // Gets the characters of the user input
    public boolean getChar(String input) {
//        char1 = input.charAt(0);
//        char2 = input.charAt(1);
//        char3 = input.charAt(2);
        char4 = input.charAt(3);
//        char5 = input.charAt(4);
//        char6 = input.charAt(5);
//        char7 = input.charAt(6);
//        char8 = input.charAt(7);
//        charO = Character.toString(char1).toUpperCase();
//        charTw = Character.toString(char2).toUpperCase();
//        charTh = Character.toString(char3).toUpperCase();
        charFo = Character.toString(char4).toUpperCase();
//        charFi = char5;
//        charSi = char6;
//        charSe = char7;
//        charE = char8;
        if (Character.isLetter(input.charAt(0)) && Character.isLetter(input.charAt(1)) &&
                Character.isLetter(input.charAt(2)) && charFo.equals("-") && 
                Character.isDigit(input.charAt(5)) && Character.isDigit(input.charAt(6)) && 
                Character.isDigit(input.charAt(7))) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GroceryStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GroceryStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GroceryStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GroceryStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GroceryStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField category;
    private javax.swing.JLabel categoryPrompt;
    private javax.swing.JTextField currentPrice;
    private javax.swing.JLabel currentPricePrompt;
    private javax.swing.JTextField discount;
    private javax.swing.JLabel discountPrompt;
    private javax.swing.JButton displayInventory;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea list;
    private javax.swing.JTextField markupPercentage;
    private javax.swing.JLabel markupPercentagePrompt;
    private javax.swing.JTextField minimum;
    private javax.swing.JLabel minimumPrompt;
    private javax.swing.JTextField name;
    private javax.swing.JLabel namePrompt;
    private javax.swing.JToggleButton nameType;
    private javax.swing.JTextField output;
    private javax.swing.JLabel prompt;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel quantityPrompt;
    private javax.swing.JTextField regularPrice;
    private javax.swing.JLabel regularPricePrompt;
    private javax.swing.JButton search;
    private javax.swing.JLabel selectType;
    private javax.swing.JTextField sku;
    private javax.swing.JLabel skuPrompt;
    private javax.swing.JToggleButton skuType;
    private javax.swing.JLabel title;
    private javax.swing.JTextField vendorPrice;
    private javax.swing.JLabel vendorPricePrompt;
    // End of variables declaration//GEN-END:variables
}
