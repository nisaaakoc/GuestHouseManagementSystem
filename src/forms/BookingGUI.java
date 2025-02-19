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
public class BookingGUI extends javax.swing.JFrame {

    /**
     * Creates new form BookingGUI
     */
    public BookingGUI() {
        initComponents();
        showBooking();
        setLocationRelativeTo(null);
    }

    Connection connection = null;
    ResultSet resultSet = null;
    Statement statement = null;
    DbHelper dbHelper = new DbHelper();

    private void showBooking() {
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select * From guesthouse.booking");
            tblBook.setModel(DbUtils.resultSetToTableModel(resultSet));
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
        txtBookId = new javax.swing.JTextField();
        cmbDay = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtRoomId = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtGuestName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBook = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        cmbMoon = new javax.swing.JComboBox<>();
        txtYear = new javax.swing.JTextField();
        txtGuestPhone = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

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
        lblRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRoomMouseClicked(evt);
            }
        });

        lblRoomIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bed.png"))); // NOI18N
        lblRoomIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRoomIconMouseClicked(evt);
            }
        });

        lblBook.setBackground(new java.awt.Color(51, 51, 51));
        lblBook.setFont(new java.awt.Font("Sitka Subheading", 3, 22)); // NOI18N
        lblBook.setForeground(new java.awt.Color(0, 0, 0));
        lblBook.setText("Booking");

        lblBookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/time.png"))); // NOI18N

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
        jLabel14.setText("Book Rooms");

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

        txtBookId.setBackground(new java.awt.Color(255, 255, 255));
        txtBookId.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        txtBookId.setForeground(new java.awt.Color(102, 102, 102));
        txtBookId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBookId.setSelectionColor(new java.awt.Color(255, 255, 255));

        cmbDay.setBackground(new java.awt.Color(255, 255, 255));
        cmbDay.setEditable(true);
        cmbDay.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        cmbDay.setForeground(new java.awt.Color(102, 102, 102));
        cmbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbDay.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel15.setFont(new java.awt.Font("Sitka Subheading", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Booking Id");

        txtRoomId.setBackground(new java.awt.Color(255, 255, 255));
        txtRoomId.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        txtRoomId.setForeground(new java.awt.Color(102, 102, 102));
        txtRoomId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtRoomId.setSelectionColor(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Sitka Subheading", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Room Id");

        txtGuestName.setBackground(new java.awt.Color(255, 255, 255));
        txtGuestName.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        txtGuestName.setForeground(new java.awt.Color(102, 102, 102));
        txtGuestName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtGuestName.setSelectionColor(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Sitka Subheading", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Guest Name");

        jLabel18.setFont(new java.awt.Font("Sitka Subheading", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Guest Phone");

        tblBook.setBackground(new java.awt.Color(255, 255, 255));
        tblBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking Id", "Room Id", "Guest Name", "Guest Phone", "Booking Date"
            }
        ));
        tblBook.setGridColor(new java.awt.Color(0, 102, 204));
        tblBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBook);

        btnDelete.setBackground(new java.awt.Color(153, 153, 187));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        cmbMoon.setBackground(new java.awt.Color(255, 255, 255));
        cmbMoon.setEditable(true);
        cmbMoon.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        cmbMoon.setForeground(new java.awt.Color(102, 102, 102));
        cmbMoon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cmbMoon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtYear.setEditable(false);
        txtYear.setBackground(new java.awt.Color(255, 255, 255));
        txtYear.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        txtYear.setForeground(new java.awt.Color(102, 102, 102));
        txtYear.setText("Year: ");
        txtYear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtYear.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtGuestPhone.setBackground(new java.awt.Color(255, 255, 255));
        txtGuestPhone.setFont(new java.awt.Font("Sitka Subheading", 3, 14)); // NOI18N
        txtGuestPhone.setForeground(new java.awt.Color(102, 102, 102));
        txtGuestPhone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtGuestPhone.setSelectionColor(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Sitka Subheading", 3, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Booking Date");

        btnUpdate.setBackground(new java.awt.Color(153, 153, 187));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(51, 51, 51));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/date.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(153, 153, 187));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add (1).png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
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
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRoomId, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGuestPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbMoon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtYear))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnUpdate)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRoomId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGuestPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMoon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void lblCustIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustIconMouseClicked
        new CustomersGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCustIconMouseClicked

    private void lblCustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCustMouseClicked
        new CustomersGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblCustMouseClicked
    
    
    private void tblBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBookMouseClicked
        // Tabloda seçilen satırın indeksini al
        int selectedRow = tblBook.getSelectedRow();

        if (selectedRow != -1) {
            // Seçilen satırdaki verileri al
            String bookId = tblBook.getValueAt(selectedRow, 0).toString();
            String roomId = tblBook.getValueAt(selectedRow, 1).toString();
            String guestName = tblBook.getValueAt(selectedRow, 2).toString();
            String guestPhone = tblBook.getValueAt(selectedRow, 3).toString();
            String bookDate = tblBook.getValueAt(selectedRow, 4).toString();
            
            String[] dateParts = bookDate.split("-");
            
            // Ayı sayısal olarak alıyoruz (örneğin: 1, 2, 3, ..., 12)
            int monthIndex = Integer.parseInt(dateParts[1]);

            // Eğer geçersiz bir ay ise
            if (monthIndex < 1 || monthIndex > 12) {
                JOptionPane.showMessageDialog(this, "Invalid month value.");
                return;
            }
            
            String[] months = {"January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};
            
            // Verileri form alanlarına doldur
            txtBookId.setText(bookId);
            txtRoomId.setText(roomId);
            txtGuestName.setText(guestName);
            txtGuestPhone.setText(guestPhone);
            cmbDay.setSelectedItem(dateParts[2]); // Gün
            cmbMoon.setSelectedItem(months[monthIndex-1]); // Ay
            txtYear.setText(dateParts[0]); // Yıl
        }
    }//GEN-LAST:event_tblBookMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // JTable üzerinde seçilen satırı al
        int selectedRow = tblBook.getSelectedRow();

        // Eğer hiç satır seçilmemişse uyarı mesajı ver
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a customer to delete.");
            return; // Eğer satır seçilmemişse işlemi durdur
        }

        // JTable'dan seçilen satırdaki cust_id'yi al
        String bookId = tblBook.getValueAt(selectedRow, 0).toString();

        // SQL DELETE sorgusu
        String sqlDelete = "DELETE FROM booking WHERE booking_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sqlDelete)) {
            // Sorguya kullanıcıdan alınan cust_id'yi ekle
            pstmt.setString(1, bookId);

            // Sorguyu çalıştır
            int rowsAffected = pstmt.executeUpdate();

            // Silme işleminin başarılı olup olmadığını kontrol et
            if (rowsAffected > 0) {
                showBooking();
                JOptionPane.showMessageDialog(null, "Book deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Book with ID " + bookId + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // Kullanıcıdan alınan verileri kontrol et
        String bookId = txtBookId.getText().trim();
        String roomId = txtRoomId.getText().trim();
        String guestName = txtGuestName.getText().trim();
        String guestPhone = txtGuestPhone.getText().trim();
        String day = cmbDay.getSelectedItem().toString().trim();
        String month = cmbMoon.getSelectedItem().toString().trim();
        String year = txtYear.getText().trim();

        // Verilerin eksik olup olmadığını kontrol et
        if (bookId.isEmpty() || roomId.isEmpty() || guestName.isEmpty() || guestPhone.isEmpty() || day.isEmpty() || month.isEmpty() || year.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Data. Please fill all fields.");
            return; // Eğer eksik veri varsa işlemi durdur
        }

        String bookingDate = "";  // bookingDate'i burada tanımlayın

        // Ay adlarını sayıya dönüştürme
        String[] months = {"January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};
        int monthIndex = -1;
        for (int i = 0; i < months.length; i++) {
            if (month.equalsIgnoreCase(months[i])) {
                monthIndex = i + 1; // Ay adını numaraya dönüştür
                break;
            }
        }

        // Eğer geçerli bir ay bulunduysa, tarihi düzgün formatta oluştur
        if (monthIndex != -1) {
            bookingDate = year + "-" + String.format("%02d", monthIndex) + "-" + String.format("%02d", Integer.parseInt(day));
        } else {
            JOptionPane.showMessageDialog(this, "Invalid month name.");
            return;  // Hatalı ay varsa işlemi sonlandır
        }

        // SQL UPDATE sorgusu
        String sqlUpdate = "UPDATE booking SET room_id = ?, guest_name = ?, guest_phone = ?, booking_date = ? WHERE booking_id = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sqlUpdate)) {
            // Güncelleme sorgusuna parametreleri ekle
            pstmt.setString(1, roomId);       // Oda ID
            pstmt.setString(2, guestName);   // Misafir Adı
            pstmt.setString(3, guestPhone);  // Misafir Telefonu
            pstmt.setString(4, bookingDate); // Tarih
            pstmt.setString(5, bookId);      // Rezervasyon ID (WHERE koşulu)

            int rowsAffected = pstmt.executeUpdate(); // Sorguyu çalıştır

            // Başarı durumunu kontrol et
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Book updated successfully!");
                showBooking(); // Rezervasyon listesini güncelle
            } else {
                JOptionPane.showMessageDialog(this, "Error updating book.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // Kullanıcıdan alınan verileri kontrol et
        String bookId = txtBookId.getText().trim();
        String roomId = txtRoomId.getText().trim();
        String guestName = txtGuestName.getText().trim();
        String guestPhone = txtGuestPhone.getText().trim();
        String day = cmbDay.getSelectedItem().toString().trim();
        String month = cmbMoon.getSelectedItem().toString().trim();
        String year = txtYear.getText().trim();

        // Verilerin eksik olup olmadığını kontrol et
        if (bookId.isEmpty() || roomId.isEmpty() || guestName.isEmpty() || guestPhone.isEmpty() || day.isEmpty() || month.isEmpty() || year.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Data. Please fill all fields.");
            return; // Eğer eksik veri varsa işlemi durdur
        }

        String bookingDate = "";  // Tarihi burada tanımlayın

        // Ay adlarını sayıya dönüştürme
        String[] months = {"January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};
        int monthIndex = -1;
        for (int i = 0; i < months.length; i++) {
            if (month.equalsIgnoreCase(months[i])) {
                monthIndex = i + 1;
                break;
            }
        }

        // Eğer geçerli bir ay bulunduysa, tarihi düzgün formatta oluştur
        if (monthIndex != -1) {
            bookingDate = year + "-" + String.format("%02d", monthIndex) + "-" + String.format("%02d", Integer.parseInt(day));
        } else {
            JOptionPane.showMessageDialog(this, "Invalid month name.");
            return; // Hatalı ay varsa işlemi sonlandır
        }

        // SQL INSERT sorgusu
        String sqlInsert = "INSERT INTO booking (booking_id, room_id, guest_name, guest_phone, booking_date) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(sqlInsert)) {
            // Sorguya parametreleri ekle
            pstmt.setString(1, bookId);
            pstmt.setString(2, roomId);
            pstmt.setString(3, guestName);
            pstmt.setString(4, guestPhone);
            pstmt.setString(5, bookingDate);

            int rowsAffected = pstmt.executeUpdate(); // Sorguyu çalıştır

            // Başarı durumunu kontrol et
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Booking added successfully!");
                showBooking(); // Tablodaki rezervasyonları güncelle
            } else {
                JOptionPane.showMessageDialog(this, "Error adding booking.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void lblRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRoomMouseClicked
        new RoomsGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblRoomMouseClicked

    private void lblRoomIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRoomIconMouseClicked
        new RoomsGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblRoomIconMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        new LoginGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitIconMouseClicked
        new LoginGUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblExitIconMouseClicked

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
            java.util.logging.Logger.getLogger(BookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbDay;
    private javax.swing.JComboBox<String> cmbMoon;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JTable tblBook;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtGuestName;
    private javax.swing.JTextField txtGuestPhone;
    private javax.swing.JTextField txtRoomId;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
