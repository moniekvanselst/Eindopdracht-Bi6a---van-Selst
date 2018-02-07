package virus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author van Selst
 * @data 30-01-2018
 */
public class VirusGUI extends javax.swing.JFrame {

    /**
     * Maakt een nieuwe form VirusGUI
     */
    public VirusGUI() {
        initComponents();
    }

    /**
     *
     * Hier word de GUI vormgegeven en alle elementen in de GUI worden gemaakt
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        fileLabel = new javax.swing.JLabel();
        fileTextField = new javax.swing.JTextField();
        searchbutton = new javax.swing.JButton();
        clasLabel = new javax.swing.JLabel();
        clasDropdown = new javax.swing.JComboBox<>();
        hostLabel = new javax.swing.JLabel();
        Host1Dropdown = new javax.swing.JComboBox<>();
        Host2Dropdown = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lijst1Text = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        lijst2Text = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        overlapText = new javax.swing.JTextArea();
        lijst1Label = new javax.swing.JLabel();
        lijst2Label = new javax.swing.JLabel();
        overlapLabel = new javax.swing.JLabel();
        IDSort = new javax.swing.JRadioButton();
        clasSort = new javax.swing.JRadioButton();
        hostsSort = new javax.swing.JRadioButton();
        sorteerLabel = new javax.swing.JLabel();
        openButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileLabel.setText("file of URL");

        fileTextField.setText("file");
        fileTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileTextFieldActionPerformed(evt);
            }
        });

        searchbutton.setText("zoek");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });

        clasLabel.setText("viral clasivication");

        clasDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Allen", "ssDNA", "dsDNA", "ssRNA", "dsRNA", "Retro", "Anderen" }));

        hostLabel.setText("host ID");

        Host1Dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        Host1Dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Host1DropdownActionPerformed(evt);
            }
        });

        Host2Dropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        Host2Dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Host2DropdownActionPerformed(evt);
            }
        });

        lijst1Text.setColumns(20);
        lijst1Text.setRows(5);
        jScrollPane1.setViewportView(lijst1Text);

        lijst2Text.setColumns(20);
        lijst2Text.setRows(5);
        jScrollPane2.setViewportView(lijst2Text);

        overlapText.setColumns(20);
        overlapText.setRows(5);
        jScrollPane3.setViewportView(overlapText);

        lijst1Label.setText("viruslijst");

        lijst2Label.setText("viruslijst");

        overlapLabel.setText("overeenkomst");

        buttonGroup1.add(IDSort);
        IDSort.setSelected(true);
        IDSort.setText("ID");
        IDSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDSortActionPerformed(evt);
            }
        });

        buttonGroup1.add(clasSort);
        clasSort.setText("classificatie");
        clasSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clasSortActionPerformed(evt);
            }
        });

        buttonGroup1.add(hostsSort);
        hostsSort.setText("aantal hosts");
        hostsSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostsSortActionPerformed(evt);
            }
        });

        sorteerLabel.setText("sortering");

        openButton.setText("open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(hostLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lijst1Label)
                                    .addComponent(clasDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Host1Dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lijst2Label)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Host2Dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(openButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hostsSort)
                            .addComponent(sorteerLabel)
                            .addComponent(IDSort)
                            .addComponent(clasSort))
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(overlapLabel)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(clasLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchbutton)
                            .addComponent(fileLabel)
                            .addComponent(fileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(openButton))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Host1Dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hostLabel)
                            .addComponent(Host2Dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(clasDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lijst1Label)
                    .addComponent(lijst2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(sorteerLabel)
                        .addGap(4, 4, 4)
                        .addComponent(IDSort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clasSort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hostsSort))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(overlapLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Als op de zoek knop word geklikt kan je een bestand uit je folders
     * aanklikken en word de URL in de file textfield gezet.
     *
     * @param evt
     */
    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        try {
            int reply;
            File selectedFile;
            fileChooser = new JFileChooser();
            reply = fileChooser.showOpenDialog(this);
            if (reply == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                fileTextField.setText(selectedFile.getAbsolutePath());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchbuttonActionPerformed

    /**
     * Als een item uit het dropdown menu van host 2 word gekozen word word
     * VirlusLogica.makeHost(keuze dropdown host 2, keuze dropdown clas, huidige
     * setlijst) Weergeeft virus id van deze host in het textField. Roept
     * setOverlapText() aan.
     *
     * @param evt
     */
    private void Host2DropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Host2DropdownActionPerformed
        lijst2Text.setText("");
        VirusLogica.makeHost(Host2Dropdown.getSelectedItem().toString(), clasDropdown.getSelectedItem().toString(), VirusLogica.setHost2);
        for (Virus virus : VirusLogica.setHost2) {
            String virusID = Long.toString(virus.getID());
            lijst2Text.append(virusID + "\n");
        }
        setOverlapText();
    }//GEN-LAST:event_Host2DropdownActionPerformed

    /**
     * word aangeroepen als er op de open button geklikt word. Opend en leest
     * bestand, geetf de regels door aan VirusLogica.inladen(regel gesplit op
     * tab). Disables open button.
     *
     * @param evt
     */
    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        try {
            inFile = new BufferedReader(new FileReader(fileTextField.getText()));
            String line;
            boolean eersteRegel = true;
            while ((line = inFile.readLine()) != null) {
                if (!eersteRegel) {
                    String[] info = line.split("\t", -1);
                    if (info[7].equals("") || info[0] == null || info[7] == null || info[0].equals("")) {
                    } else {
                        VirusLogica.inladen(info);
                    }
                }
                eersteRegel = false;
            }
            inFile.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "File Error: " + e.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        setHostDropdown();
        openButton.setEnabled(false);
    }//GEN-LAST:event_openButtonActionPerformed

    /**
     * Als een item uit het dropdown menu van host 1 word gekozen word word
     * VirlusLogica.makeHost(keuze dropdown host 1, keuze dropdown clas, huidige
     * setlijst) Weergeeft virus id van deze host in het textField. Roept
     * setOverlapText() aan.
     *
     * @param evt
     */
    private void Host1DropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Host1DropdownActionPerformed
        lijst1Text.setText("");
        VirusLogica.makeHost(Host1Dropdown.getSelectedItem().toString(), clasDropdown.getSelectedItem().toString(), VirusLogica.setHost1);
        for (Virus virus : VirusLogica.setHost1) {
            String virusID = Long.toString(virus.getID());
            lijst1Text.append(virusID + "\n");
        }
        setOverlapText();
    }//GEN-LAST:event_Host1DropdownActionPerformed

    /**
     * Zet de items in de ArrayList in de text velden.
     */
    private void setText() {
        lijst1Text.setText("");
        lijst2Text.setText("");
        overlapText.setText("");
        for (Virus virus : VirusLogica.lijstHost1) {
            String virusID = Long.toString(virus.getID());
            lijst1Text.append(virusID + "\n");
        }
        for (Virus virus : VirusLogica.lijstHost2) {
            String virusID = Long.toString(virus.getID());
            lijst2Text.append(virusID + "\n");
        }
        for (Virus virus : VirusLogica.lijstOverlap) {
            String virusID = Long.toString(virus.getID());
            overlapText.append(virusID + "\n");
        }
    }

    /**
     * Als de radio button ID word aangeklikt word getSorted() en daarna
     * setText() aangeroepen
     *
     * @param evt
     */
    private void IDSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDSortActionPerformed
        VirusLogica.getSorted("ID");
        setText();
    }//GEN-LAST:event_IDSortActionPerformed
    /**
     * Als de radio button classificatie word aangeklikt word getSorted() en
     * daarna setText() aangeroepen
     *
     * @param evt
     */
    private void clasSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clasSortActionPerformed
        VirusLogica.getSorted("clas");
        setText();
    }//GEN-LAST:event_clasSortActionPerformed
    /**
     * Als de radio button aantal hosts word aangeklikt word getSorted() en
     * daarna setText() aangeroepen
     *
     * @param evt
     */
    private void hostsSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostsSortActionPerformed
        VirusLogica.getSorted("aantal hosts");
        setText();
    }//GEN-LAST:event_hostsSortActionPerformed

    private void fileTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileTextFieldActionPerformed

    /**
     * Word aangeroepen door de actionprefornd van de open button. Zet de items
     * van setOverlap in het overlap textveld.
     */
    private void setOverlapText() {
        overlapText.setText("");
        for (Virus virus : VirusLogica.setOverlap) {
            String virusID = Long.toString(virus.getID());
            overlapText.append(virusID + "\n");
        }
    }

    /**
     * Word aangeroepen door VirusLogica.inladen(). Maakt de dropdown menus voor
     * bijde hosts.
     */
    private void setHostDropdown() {
        Set<String> keys = VirusLogica.hostsName.keySet();
        for (String key : keys) {
            Host1Dropdown.addItem(key);
            Host2Dropdown.addItem(key);
        }
    }

    /**
     * Zet de GUI zichtbaar
     *
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
            java.util.logging.Logger.getLogger(VirusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VirusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VirusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VirusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VirusGUI().setVisible(true);
            }
        });
    }

    private BufferedReader inFile;
    private JFileChooser fileChooser;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Host1Dropdown;
    private javax.swing.JComboBox<String> Host2Dropdown;
    private javax.swing.JRadioButton IDSort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> clasDropdown;
    private javax.swing.JLabel clasLabel;
    private javax.swing.JRadioButton clasSort;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JTextField fileTextField;
    private javax.swing.JLabel hostLabel;
    private javax.swing.JRadioButton hostsSort;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lijst1Label;
    private javax.swing.JTextArea lijst1Text;
    private javax.swing.JLabel lijst2Label;
    private javax.swing.JTextArea lijst2Text;
    private javax.swing.JButton openButton;
    private javax.swing.JLabel overlapLabel;
    javax.swing.JTextArea overlapText;
    private javax.swing.JButton searchbutton;
    private javax.swing.JLabel sorteerLabel;
    // End of variables declaration//GEN-END:variables
}
