
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author nevfe
 */
public class RentForm extends javax.swing.JFrame {

    private final Gson gson;
    private String FilenameCar = "dataCars.json";
    private String FilenameCustomer = "dataCustomers.json";
        public void SaveLists() {
        try {
            writeCustomersToJSON();
            writeCarsToJSON();
        } catch (IOException | JsonIOException | JsonSyntaxException ex) {
        }
    }
    
    public void writeCustomersToJSON() throws IOException, JsonIOException {
        try ( FileWriter fileWriter = new FileWriter(FilenameCustomer)) {
            gson.toJson(MainForm.customerList, fileWriter);
        }
    }
    public void writeCarsToJSON() throws IOException, JsonIOException {
        try ( FileWriter fileWriter = new FileWriter(FilenameCar)) {
            gson.toJson(MainForm.carList, fileWriter);
        }
    }
    /**
     * Creates new form RentForm
     */
    String numPlate;

    public RentForm(String numPlate) {
        initComponents();
        gson = new GsonBuilder().setPrettyPrinting().create();
        UpdateTable();
        this.numPlate = numPlate;
        secilenPlakaLabel.setText(numPlate);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        secilenPlakaLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        baslangicTarihiTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        geriPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eslestirPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        bitisTarihiTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgMouseDragged(evt);
            }
        });
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(28, 31, 131));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kirala_________________");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(70, 181, 209));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setPreferredSize(new java.awt.Dimension(45, 45));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(28, 31, 131));
        jLabel2.setText("Se??ilen Ara?? Plakas?? :");

        secilenPlakaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        secilenPlakaLabel.setForeground(new java.awt.Color(70, 181, 209));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(28, 31, 131));
        jLabel3.setText("Ba??lang???? Tarihi :");

        baslangicTarihiTxt.setBackground(new java.awt.Color(255, 255, 255));
        baslangicTarihiTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        baslangicTarihiTxt.setForeground(new java.awt.Color(70, 181, 209));
        baslangicTarihiTxt.setBorder(null);
        baslangicTarihiTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jSeparator1.setBackground(new java.awt.Color(70, 181, 209));
        jSeparator1.setForeground(new java.awt.Color(70, 181, 209));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 1));

        jSeparator2.setBackground(new java.awt.Color(70, 181, 209));
        jSeparator2.setForeground(new java.awt.Color(70, 181, 209));
        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator2.setOpaque(true);
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 1));
        jSeparator2.setRequestFocusEnabled(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "??sim", "Soyisim", "T.C. Kimlik No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        geriPanel.setBackground(new java.awt.Color(70, 181, 209));
        geriPanel.setPreferredSize(new java.awt.Dimension(140, 60));
        geriPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                geriPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                geriPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                geriPanelMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_chevron_left_60px_2.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Geri");

        javax.swing.GroupLayout geriPanelLayout = new javax.swing.GroupLayout(geriPanel);
        geriPanel.setLayout(geriPanelLayout);
        geriPanelLayout.setHorizontalGroup(
            geriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geriPanelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        geriPanelLayout.setVerticalGroup(
            geriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        eslestirPanel.setBackground(new java.awt.Color(70, 181, 209));
        eslestirPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eslestirPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eslestirPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eslestirPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eslestirPanelMouseReleased(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_checked_checkbox_30px_1.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("E??le??tir");

        javax.swing.GroupLayout eslestirPanelLayout = new javax.swing.GroupLayout(eslestirPanel);
        eslestirPanel.setLayout(eslestirPanelLayout);
        eslestirPanelLayout.setHorizontalGroup(
            eslestirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eslestirPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        eslestirPanelLayout.setVerticalGroup(
            eslestirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eslestirPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eslestirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        jSeparator3.setBackground(new java.awt.Color(70, 181, 209));
        jSeparator3.setForeground(new java.awt.Color(70, 181, 209));
        jSeparator3.setOpaque(true);
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(28, 31, 131));
        jLabel7.setText("Biti?? Tarihi :");

        bitisTarihiTxt.setBackground(new java.awt.Color(255, 255, 255));
        bitisTarihiTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bitisTarihiTxt.setForeground(new java.awt.Color(70, 181, 209));
        bitisTarihiTxt.setBorder(null);
        bitisTarihiTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText(" ");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(geriPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eslestirPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(secilenPlakaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(baslangicTarihiTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bitisTarihiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(109, 109, 109))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(secilenPlakaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(baslangicTarihiTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(bitisTarihiTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addComponent(eslestirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(geriPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void UpdateTable() {
        DefaultTableModel tblModel1 = (DefaultTableModel) jTable1.getModel();
        for (Customer customer : MainForm.customerList) {
            if (customer.isAvailable()) {
                String data[] = {customer.getName(), customer.getSurname(), customer.getIdentity()};
                tblModel1.addRow(data);
            }
        }

    }

    private void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    private int mouseX, mouseY;
    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        highlightForeground(jLabel4);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        resetForeground(jLabel4);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        SaveLists();
        System.exit(0);
    }//GEN-LAST:event_jLabel4MousePressed

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_bgMousePressed

    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        setLocation(getX() + evt.getX() - mouseX, getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_bgMouseDragged

    private void eslestirPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eslestirPanelMouseExited
        resetColor(eslestirPanel);
    }//GEN-LAST:event_eslestirPanelMouseExited

    private void eslestirPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eslestirPanelMousePressed
        if (baslangicTarihiTxt.getText().equals("") || bitisTarihiTxt.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Eksik bilgi girilemez !", "Uyar??", 0);
        else
        try {
            DefaultTableModel tblModel1 = (DefaultTableModel) jTable1.getModel();
            int index = jTable1.getSelectedRow();
            String selectedID = tblModel1.getValueAt(index, 2).toString();
            for (Customer customer : MainForm.customerList) {
                if (customer.getIdentity().equals(selectedID)) {
                    customer.changeAvailability();
                    customer.setNumberPlate(numPlate);
                    customer.setDeadline(bitisTarihiTxt.getText());
                    customer.setStartDate(baslangicTarihiTxt.getText());

                    for (Car car : MainForm.carList) {
                        if (car.getNumberPlate().equals(numPlate)) {
                            car.changeAvailability();
                            car.setUser(customer.getName());
                            car.setUserID(customer.getIdentity());
                            car.setDeadline(bitisTarihiTxt.getText());
                            car.setStartDate(baslangicTarihiTxt.getText());
                            break;
                        }
                    }
                    break;
                }
            }

            new MainForm("MA").setVisible(true);
            close();
        } catch (Exception e) {
            jLabel8.setText("L??tfen m????teri se??iniz");
        }
    }//GEN-LAST:event_eslestirPanelMousePressed

    private void eslestirPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eslestirPanelMouseEntered
        highlightColor(eslestirPanel);
    }//GEN-LAST:event_eslestirPanelMouseEntered

    private void geriPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriPanelMouseEntered
        highlightColor(geriPanel);
    }//GEN-LAST:event_geriPanelMouseEntered

    private void geriPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriPanelMouseExited
        resetColor(geriPanel);
    }//GEN-LAST:event_geriPanelMouseExited

    private void geriPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriPanelMousePressed
        new MainForm("MA").setVisible(true);
        close();
    }//GEN-LAST:event_geriPanelMousePressed

    private void eslestirPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eslestirPanelMouseReleased
        jLabel8.setText(" ");
    }//GEN-LAST:event_eslestirPanelMouseReleased
    void highlightForeground(JLabel label) {
        label.setForeground(new java.awt.Color(28, 31, 131));
    }

    void resetForeground(JLabel label) {
        label.setForeground(new java.awt.Color(70, 181, 209));
    }

    void highlightColor(JPanel panel) {
        panel.setBackground(new Color(28, 31, 131));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(70, 181, 209));
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField baslangicTarihiTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField bitisTarihiTxt;
    private javax.swing.JPanel eslestirPanel;
    private javax.swing.JPanel geriPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel secilenPlakaLabel;
    // End of variables declaration//GEN-END:variables
}
