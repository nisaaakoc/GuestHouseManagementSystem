package forms;

import Helper.DbHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author nisaa
 */
public class RoomsGUI extends javax.swing.JFrame {

    public RoomsGUI() {
        initComponents();
        showRooms();
        setLocationRelativeTo(null);
    }
    
    Connection connection = null;
    ResultSet resultSet = null;
    Statement statement = null;
    DbHelper dbHelper = new DbHelper();

    private void showRooms() {
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select * From guesthouse.rooms");
            tblRoom.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCustIcon = new javax.swing.JLabel();
        lblGuest = new javax.swing.JLabel();
        lblRoom = new javax.swing.JLabel();
        lblRoomIcon = new javax.swing.JLabel();
        lblBook = new javax.swing.JLabel();
        lblBookIcon = new javax.swing.JLabel();
        lblGuestIcon = new javax.swing.JLabel();
        lblExitIcon = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblCust = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        cmbCost = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoom = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 187));

        lblCustIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        lblCustIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCustIconMouseClicked(evt);
            }
        });

        lblGuest.setBackground(new java.awt.Color(51, 51, 51));
        lblGuest.setFont(new java.awt.Font("Sitka Subheading", 3, 22)); // NOI18N
        lblGuest.setForeground(new java.awt.Color(0, 0, 0));
        lblGuest.setText("Guest House");

        lblRoom.setBackground(new java.awt.Color(51, 51, 51));
        lblRoom.setFont(new java.awt.Font("Sitka Subheading", 3, 22)); // NOI18N
        lblRoom.setForeground(new java.awt.Color(0, 0, 0));
        lblRoom.setText("Rooms");

        lblRoomIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bed.png"))); // NOI18N

        lblBook.setBackground(new java.awt.Color(51, 51, 51));
        lblBook.setFont(new java.awt.Font("Sitka Subheading", 3, 22)); // NOI18N
        lblBook.setForeground(new java.awt.Color(0, 0, 0));
        lblBook.setText("Booking");
        lblBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBookMouseClicked(evt);
            }
        });

        lblBookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/time.png"))); // NOI18N
        lblBookIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBookIconMouseClicked(evt);
            }
        });

        lblGuestIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N

        lblExitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit (1).png"))); // NOI18N
        lblExitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitIconMouseClicked(evt);
            }
        });

        lblExit.setBackground(new java.awt.Color(51, 51, 51));
        lblExit.setFont(new java.awt.Font("Sitka Subheading", 3, 20)); // NOI18N
        lblExit.setForeground(new java.awt.Color(0, 0, 0));
        lblExit.setText("Exit");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        lblCust.setBackground(new java.awt.Color(51, 51, 51));
        lblCust.setFont(new java.awt.Font("Sitka Subheading", 3, 22)); // NOI18N
        lblCust.setForeground(new java.awt.Color(0, 0, 0));
        lblCust.setText("Customers");
        lblCust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCustMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRoomIcon)
                                    .addComponent(lblCustIcon))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCust)
                                    .addComponent(lblRoom)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblBookIcon)
                                .addGap(12, 12, 12)
                                .addComponent(lblBook))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblGuestIcon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblGuest, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExitIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExit)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(lblGuestIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGuest)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblCustIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCust))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblRoomIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblRoom)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBookIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblBook)))
                .addGap(166, 166, 166)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblExit)
                    .addComponent(lblExitIcon))
                .addGap(10, 10, 10))
        );

        jPanel2.setBackground(new java.awt.Color(187, 187, 212));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Sitka Subheading", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Manage Rooms");

        jPanel3.setBackground(new java.awt.Color(153, 153, 175));

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setFont(new java.awt.Font("Sitka Subheading", 3, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Guest House Management System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );

        txtNum.setBackground(new java.awt.Color(255, 255, 255));
        txtNum.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        txtNum.setForeground(new java.awt.Color(102, 102, 102));
        txtNum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNum.setSelectionColor(new java.awt.Color(255, 255, 255));

        cmbCost.setBackground(new java.awt.Color(255, 255, 255));
        cmbCost.setEditable(true);
        cmbCost.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        cmbCost.setForeground(new java.awt.Color(102, 102, 102));
        cmbCost.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booked", "Free" }));
        cmbCost.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel15.setFont(new java.awt.Font("Sitka Subheading", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Room Number");

        txtType.setBackground(new java.awt.Color(255, 255, 255));
        txtType.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        txtType.setForeground(new java.awt.Color(102, 102, 102));
        txtType.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtType.setSelectionColor(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Sitka Subheading", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Room Type");

        txtPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtPrice.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(102, 102, 102));
        txtPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPrice.setSelectionColor(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Sitka Subheading", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Room Price");

        jLabel18.setFont(new java.awt.Font("Sitka Subheading", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Room Cost");

        tblRoom.setBackground(new java.awt.Color(255, 255, 255));
        tblRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Room Price", "Room Cost"
            }
        ));
        tblRoom.setGridColor(new java.awt.Color(0, 102, 204));
        tblRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRoomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRoom);

        btnAdd.setBackground(new java.awt.Color(153, 153, 187));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/key (1).png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 153, 187));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(153, 153, 187));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(51, 51, 51));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset-password.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(cmbCost, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel15)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(btnUpdate)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel14)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // Kullanıcıdan alınan verileri kontrol et
        String roomNum = txtNum.getText().trim();
        String roomType = txtType.getText().trim();
        String roomPrice = txtPrice.getText().trim();
        String roomCost = cmbCost.getSelectedItem().toString().trim();

        // Verilerin eksik olup olmadığını kontrol et
        if (roomNum.isEmpty() || roomType.isEmpty() || roomPrice.isEmpty() || roomCost.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Data. Please fill all fields.");
            return; // Eğer eksik veri varsa işlemi durdur
        }

        // SQL UPDATE sorgusu
        String sqlUpdate = "UPDATE rooms SET room_type = ?, room_price = ?, room_cost = ? WHERE room_number = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sqlUpdate)) {
            // Güncelleme sorgusuna parametreleri ekle
            pstmt.setString(1, roomType);
            pstmt.setString(2, roomPrice);
            pstmt.setString(3, roomCost);
            pstmt.setString(4, roomNum);

            int rowsAffected = pstmt.executeUpdate(); // Sorguyu çalıştır

            // Başarı durumunu kontrol et
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Room updated successfully!");
                showRooms();
            } else {
                JOptionPane.showMessageDialog(this, "Error updating room.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // JTable üzerinde seçilen satırı al
        int selectedRow = tblRoom.getSelectedRow();

        // Eğer hiç satır seçilmemişse uyarı mesajı ver
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a customer to delete.");
            return; // Eğer satır seçilmemişse işlemi durdur
        }

        // JTable'dan seçilen satırdaki cust_id'yi al
        String roomNum = tblRoom.getValueAt(selectedRow, 0).toString();  // 0, roomNum sütununun index'i

        // SQL DELETE sorgusu
        String sqlDelete = "DELETE FROM rooms WHERE room_number = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sqlDelete)) {
            // Sorguya kullanıcıdan alınan cust_id'yi ekle
            pstmt.setString(1, roomNum);

            // Sorguyu çalıştır
            int rowsAffected = pstmt.executeUpdate();

            // Silme işleminin başarılı olup olmadığını kontrol et
            if (rowsAffected > 0) {
                showRooms();
                JOptionPane.showMessageDialog(null, "Room deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Room with ID " + roomNum + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // Kullanıcıdan alınan verileri kontrol et
        String roomNum = txtNum.getText().trim();
        String roomType = txtType.getText().trim();
        String roomPrice = txtPrice.getText().trim();
        String roomCost = cmbCost.getSelectedItem().toString().trim();

        // Verilerin eksik olup olmadığını kontrol et
        if (roomNum.isEmpty() || roomType.isEmpty() || roomPrice.isEmpty() || roomCost.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Data. Please fill all fields.");
            return; // Eğer eksik veri varsa işlemi durdur
        }

        // Veritabanına ekleme işlemi (INSERT)
        String sqlInsert = "INSERT INTO rooms (room_number, room_type, room_price, room_cost) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(sqlInsert)) {
            // Kullanıcıdan alınan değerleri SQL sorgusuna yerleştir
            pstmt.setString(1, roomNum );
            pstmt.setString(2, roomType);
            pstmt.setString(3, roomPrice);
            pstmt.setString(4, roomCost);

            int rowsAffected = pstmt.executeUpdate();  // Sorguyu çalıştır

            // Başarı durumunu kontrol et
            if (rowsAffected > 0) {
                showRooms();
                JOptionPane.showMessageDialog(null, "Room added successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Error adding room.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void tblRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRoomMouseClicked
        // Tabloda seçilen satırın indeksini al
        int selectedRow = tblRoom.getSelectedRow();

        if (selectedRow != -1) {
            // Seçilen satırdaki verileri al
            String roomNum = tblRoom.getValueAt(selectedRow, 0).toString();
            String roomType = tblRoom.getValueAt(selectedRow, 1).toString();
            String roomPrice = tblRoom.getValueAt(selectedRow, 2).toString();
            String roomCost = tblRoom.getValueAt(selectedRow, 3).toString();

            // Verileri form alanlarına doldur
            txtNum.setText(roomNum);
            txtType.setText(roomType);
            txtPrice.setText(roomPrice);
            cmbCost.setSelectedItem(roomCost);
        }
    }//GEN-LAST:event_tblRoomMouseClicked

    private void lblCustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustMouseClicked
        new CustomersGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblCustMouseClicked

    private void lblCustIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustIconMouseClicked
        new CustomersGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCustIconMouseClicked

    private void lblBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookMouseClicked
        new BookingGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBookMouseClicked

    private void lblBookIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBookIconMouseClicked
        new BookingGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBookIconMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        new LoginGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitIconMouseClicked
        new LoginGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblExitIconMouseClicked
    
    
    
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
            java.util.logging.Logger.getLogger(RoomsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCost;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBook;
    private javax.swing.JLabel lblBookIcon;
    private javax.swing.JLabel lblCust;
    private javax.swing.JLabel lblCustIcon;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblExitIcon;
    private javax.swing.JLabel lblGuest;
    private javax.swing.JLabel lblGuestIcon;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblRoomIcon;
    private javax.swing.JTable tblRoom;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
