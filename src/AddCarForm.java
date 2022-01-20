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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author nevfe
 */
public class AddCarForm extends javax.swing.JFrame {

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
     * Creates new form AddCarForm
     */
    public AddCarForm() {
        initComponents();
        gson = new GsonBuilder().setPrettyPrinting().create();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

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

    private void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
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
        jLabel3 = new javax.swing.JLabel();
        aracPlakasiTxt = new javax.swing.JTextField();
        markaTxt = new javax.swing.JTextField();
        modelTxt = new javax.swing.JTextField();
        yilTxt = new javax.swing.JTextField();
        renkTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        geriPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eklePanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        yakitCB = new javax.swing.JComboBox<>();
        vitesCB = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

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
        jLabel1.setText("Araç Ekle_____________");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
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
        jLabel2.setText("Araç Plakası :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(28, 31, 131));
        jLabel3.setText("Marka :");

        aracPlakasiTxt.setBackground(new java.awt.Color(255, 255, 255));
        aracPlakasiTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        aracPlakasiTxt.setForeground(new java.awt.Color(70, 181, 209));
        aracPlakasiTxt.setBorder(null);
        aracPlakasiTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        markaTxt.setBackground(new java.awt.Color(255, 255, 255));
        markaTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        markaTxt.setForeground(new java.awt.Color(70, 181, 209));
        markaTxt.setBorder(null);
        markaTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        modelTxt.setBackground(new java.awt.Color(255, 255, 255));
        modelTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modelTxt.setForeground(new java.awt.Color(70, 181, 209));
        modelTxt.setBorder(null);
        modelTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        yilTxt.setBackground(new java.awt.Color(255, 255, 255));
        yilTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        yilTxt.setForeground(new java.awt.Color(70, 181, 209));
        yilTxt.setBorder(null);
        yilTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        renkTxt.setBackground(new java.awt.Color(255, 255, 255));
        renkTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        renkTxt.setForeground(new java.awt.Color(70, 181, 209));
        renkTxt.setBorder(null);
        renkTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jSeparator2.setBackground(new java.awt.Color(70, 181, 209));
        jSeparator2.setForeground(new java.awt.Color(70, 181, 209));
        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 1));
        jSeparator2.setOpaque(true);
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 1));
        jSeparator2.setRequestFocusEnabled(false);

        jSeparator1.setBackground(new java.awt.Color(70, 181, 209));
        jSeparator1.setForeground(new java.awt.Color(70, 181, 209));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 1));

        jSeparator4.setBackground(new java.awt.Color(70, 181, 209));
        jSeparator4.setForeground(new java.awt.Color(70, 181, 209));
        jSeparator4.setOpaque(true);
        jSeparator4.setPreferredSize(new java.awt.Dimension(50, 1));

        jSeparator5.setBackground(new java.awt.Color(70, 181, 209));
        jSeparator5.setForeground(new java.awt.Color(70, 181, 209));
        jSeparator5.setOpaque(true);
        jSeparator5.setPreferredSize(new java.awt.Dimension(50, 1));

        jSeparator6.setBackground(new java.awt.Color(70, 181, 209));
        jSeparator6.setForeground(new java.awt.Color(70, 181, 209));
        jSeparator6.setOpaque(true);
        jSeparator6.setPreferredSize(new java.awt.Dimension(50, 1));

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

        eklePanel.setBackground(new java.awt.Color(70, 181, 209));
        eklePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eklePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eklePanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eklePanelMousePressed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_checked_checkbox_30px_1.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Ekle");

        javax.swing.GroupLayout eklePanelLayout = new javax.swing.GroupLayout(eklePanel);
        eklePanel.setLayout(eklePanelLayout);
        eklePanelLayout.setHorizontalGroup(
            eklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eklePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        eklePanelLayout.setVerticalGroup(
            eklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eklePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eklePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(28, 31, 131));
        jLabel8.setText("Model :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(28, 31, 131));
        jLabel9.setText("Yıl :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(28, 31, 131));
        jLabel10.setText("Renk :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(28, 31, 131));
        jLabel11.setText("Yakıt Türü :");

        yakitCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasoline", "Diesel", "LPG", "Electric" }));
        yakitCB.setBorder(null);

        vitesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manuel", "Automatic" }));
        vitesCB.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(28, 31, 131));
        jLabel12.setText("Vites Türü :");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(geriPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eklePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 86, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(aracPlakasiTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(markaTxt)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(vitesCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, 162, Short.MAX_VALUE)
                                        .addComponent(yakitCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(renkTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(yilTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(modelTxt, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(141, 141, 141))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(aracPlakasiTxt))
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(markaTxt))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(modelTxt))
                .addGap(1, 1, 1)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(yilTxt))
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(renkTxt))
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(yakitCB))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(vitesCB))
                .addGap(38, 38, 38)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eklePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(geriPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_bgMousePressed

    private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
        setLocation(getX() + evt.getX() - mouseX, getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_bgMouseDragged
    boolean sameID() {
        boolean result = false;
        for (Car car : MainForm.carList) {
            if (aracPlakasiTxt.getText().equals(car.getNumberPlate())) {
                result = true;
                break;
            }
        }
        return result;
    }

    //Brand, Model, Year, Color, fuel, transmission, numberPlate
    private void eklePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eklePanelMousePressed
        if (markaTxt.getText().equals("")
                || modelTxt.getText().equals("")
                || yilTxt.getText().equals("")
                || renkTxt.getText().equals("")
                || aracPlakasiTxt.getText().equals(""))

            JOptionPane.showMessageDialog(this, "Eksik bilgi girilemez !", "Uyarı", 0);
        else if (sameID())
            JOptionPane.showMessageDialog(this, "Aynı plakaya sahip başka bir araba var !", "Uyarı", 0);
        else {
            Car car;
            switch (yakitCB.getSelectedItem().toString()) {
                case "Gasoline":
                    if (vitesCB.getSelectedItem().toString().equals("Manuel")) {
                        car = new Car(markaTxt.getText(), modelTxt.getText(), yilTxt.getText(), renkTxt.getText(), Fuels.Gasoline, Transmissions.Manuel, aracPlakasiTxt.getText());
                    } else {
                        car = new Car(markaTxt.getText(), modelTxt.getText(), yilTxt.getText(), renkTxt.getText(), Fuels.Gasoline, Transmissions.Automatic, aracPlakasiTxt.getText());
                    }
                    break;

                case "Diesel":
                    if (vitesCB.getSelectedItem().toString().equals("Manuel")) {
                        car = new Car(markaTxt.getText(), modelTxt.getText(), yilTxt.getText(), renkTxt.getText(), Fuels.Diesel, Transmissions.Manuel, aracPlakasiTxt.getText());
                    } else {
                        car = new Car(markaTxt.getText(), modelTxt.getText(), yilTxt.getText(), renkTxt.getText(), Fuels.Diesel, Transmissions.Automatic, aracPlakasiTxt.getText());
                    }
                    break;

                case "LPG":
                    if (vitesCB.getSelectedItem().toString().equals("Manuel")) {
                        car = new Car(markaTxt.getText(), modelTxt.getText(), yilTxt.getText(), renkTxt.getText(), Fuels.LPG, Transmissions.Manuel, aracPlakasiTxt.getText());
                    } else {
                        car = new Car(markaTxt.getText(), modelTxt.getText(), yilTxt.getText(), renkTxt.getText(), Fuels.LPG, Transmissions.Automatic, aracPlakasiTxt.getText());
                    }
                    break;

                case "Electric":
                    if (vitesCB.getSelectedItem().toString().equals("Manuel")) {
                        car = new Car(markaTxt.getText(), modelTxt.getText(), yilTxt.getText(), renkTxt.getText(), Fuels.Electric, Transmissions.Manuel, aracPlakasiTxt.getText());
                    } else {
                        car = new Car(markaTxt.getText(), modelTxt.getText(), yilTxt.getText(), renkTxt.getText(), Fuels.Electric, Transmissions.Automatic, aracPlakasiTxt.getText());
                    }
                    break;
                default:
                    car = new Car(markaTxt.getText(), modelTxt.getText(), yilTxt.getText(), renkTxt.getText(), Fuels.Gasoline, Transmissions.Manuel, aracPlakasiTxt.getText());
                    break;
            }
            new MainForm(car).setVisible(true);
            close();
        }
    }//GEN-LAST:event_eklePanelMousePressed

    private void eklePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eklePanelMouseExited
        resetColor(eklePanel);
    }//GEN-LAST:event_eklePanelMouseExited

    private void eklePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eklePanelMouseEntered
        highlightColor(eklePanel);
    }//GEN-LAST:event_eklePanelMouseEntered

    private void geriPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriPanelMousePressed
        new MainForm("A").setVisible(true);
        close();
    }//GEN-LAST:event_geriPanelMousePressed

    private void geriPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriPanelMouseExited
        resetColor(geriPanel);
    }//GEN-LAST:event_geriPanelMouseExited

    private void geriPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriPanelMouseEntered
        highlightColor(geriPanel);
    }//GEN-LAST:event_geriPanelMouseEntered

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        SaveLists();
        System.exit(0);
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        resetForeground(jLabel4);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        highlightForeground(jLabel4);
    }//GEN-LAST:event_jLabel4MouseEntered
    private int mouseX, mouseY;
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aracPlakasiTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel eklePanel;
    private javax.swing.JPanel geriPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField markaTxt;
    private javax.swing.JTextField modelTxt;
    private javax.swing.JTextField renkTxt;
    private javax.swing.JComboBox<String> vitesCB;
    private javax.swing.JComboBox<String> yakitCB;
    private javax.swing.JTextField yilTxt;
    // End of variables declaration//GEN-END:variables
}
