package projectargus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
import java.io.OutputStream;
import org.json.JSONObject;

public class AdminHome extends javax.swing.JFrame {

    private User user;
    
    public AdminHome() {
        initComponents();
    }
    
    public AdminHome(User user){
        this.user = user;
        initComponents();
        
        UserNameLable.setText(user.getUserName());
        UserTypeLable.setText(user.getUserType());
        UserIdLable.setText(user.getUserId());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserNameLable = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserTypeLable = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UserIdLable = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        CreateMsgLable = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NewUserNameTextField = new javax.swing.JTextField();
        NewUserIdTextField = new javax.swing.JTextField();
        NewUserAddressTextField = new javax.swing.JTextField();
        NewUserTelephoneTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        NewUserTypeComboBox = new javax.swing.JComboBox<>();
        CreateNewUserButton = new javax.swing.JButton();
        ClearAllNewUserButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        ViewIdSearchTextField = new javax.swing.JTextField();
        ViewUserSearchButton = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        ViewUserNameLable = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        ViewUserIdLable = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        ViewUserTypeLable = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        ViewUserAddressLable = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        ViewUserTelephoneLable = new javax.swing.JLabel();
        ViewMsgLable = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        UpdateUserNameTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        UpdateUserTypeComboBox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        UpdateUserAddressTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        UpdateUserTelephoneTextField = new javax.swing.JTextField();
        UpdateUserButton = new javax.swing.JButton();
        UpdateSerachIdTextField = new javax.swing.JTextField();
        UpdateSearchButton = new javax.swing.JButton();
        UpdateClearAllButton = new javax.swing.JButton();
        UpdateMsgLable = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        DeleteSearchTextField = new javax.swing.JTextField();
        DeleteSearchButton = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        DeleteUserNameLabel = new javax.swing.JLabel();
        DeleteUserIdLabel = new javax.swing.JLabel();
        DeleteUserTypeLabel = new javax.swing.JLabel();
        DeleteUserTelephoneLabel = new javax.swing.JLabel();
        DeleteUserAddressLabel = new javax.swing.JLabel();
        DeleteUserButton = new javax.swing.JButton();
        DeleteMsgLable = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        LoginButton11 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel10 = new javax.swing.JPanel();
        jTextField23 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        LoginButton12 = new javax.swing.JButton();
        jList2 = new javax.swing.JList<>();
        jPanel11 = new javax.swing.JPanel();
        jTextField24 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        LoginButton13 = new javax.swing.JButton();
        jList3 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project Argus");
        setPreferredSize(new java.awt.Dimension(1156, 665));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(201, 34, 42));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 640));

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 586));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectargus/Logo-Argus 80x80.png"))); // NOI18N
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Admin :");

        UserNameLable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        UserNameLable.setText("Manuja Dewmina");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("User Type :");

        UserTypeLable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        UserTypeLable.setText("Supervisor");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("User ID :");

        UserIdLable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        UserIdLable.setText("admin123");

        jTabbedPane1.setBackground(new java.awt.Color(201, 34, 42));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jTabbedPane2.setBackground(new java.awt.Color(201, 34, 42));
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        CreateMsgLable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        CreateMsgLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("User ID        :");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setText("User Type   :");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setText("Address      :");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setText("Telephone  :");

        NewUserNameTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        NewUserNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NewUserIdTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        NewUserIdTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NewUserAddressTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        NewUserAddressTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NewUserTelephoneTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        NewUserTelephoneTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("ADD NEW USER");

        NewUserTypeComboBox.setBackground(new java.awt.Color(254, 254, 254));
        NewUserTypeComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        NewUserTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        NewUserTypeComboBox.setBorder(null);

        CreateNewUserButton.setBackground(new java.awt.Color(201, 34, 42));
        CreateNewUserButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        CreateNewUserButton.setForeground(new java.awt.Color(255, 255, 255));
        CreateNewUserButton.setText("Create User");
        CreateNewUserButton.setBorder(null);
        CreateNewUserButton.setFocusPainted(false);
        CreateNewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewUserButtonActionPerformed(evt);
            }
        });

        ClearAllNewUserButton.setBackground(new java.awt.Color(201, 34, 42));
        ClearAllNewUserButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ClearAllNewUserButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearAllNewUserButton.setText("Clear All");
        ClearAllNewUserButton.setBorder(null);
        ClearAllNewUserButton.setFocusPainted(false);
        ClearAllNewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearAllNewUserButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel13.setText("User Name :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NewUserTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(NewUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NewUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(NewUserAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CreateMsgLable, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NewUserTelephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(151, 151, 151)
                        .addComponent(ClearAllNewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(473, 473, 473))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(CreateNewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(458, 458, 458))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NewUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(ClearAllNewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NewUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewUserTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(NewUserAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewUserTelephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addComponent(CreateNewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 32, Short.MAX_VALUE)
                .addComponent(CreateMsgLable)
                .addGap(70, 70, 70))
        );

        jTabbedPane2.addTab("Add new User", jPanel5);

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel29.setText("VIEW USER DETAILS");

        ViewIdSearchTextField.setBackground(new java.awt.Color(204, 204, 204));
        ViewIdSearchTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ViewIdSearchTextField.setText("Search using User ID");

        ViewUserSearchButton.setBackground(new java.awt.Color(201, 34, 42));
        ViewUserSearchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ViewUserSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewUserSearchButton.setText("Search");
        ViewUserSearchButton.setBorder(null);
        ViewUserSearchButton.setFocusPainted(false);
        ViewUserSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewUserSearchButtonActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel30.setText("User Name :");

        ViewUserNameLable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ViewUserNameLable.setText("N/A");

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel32.setText("User ID        :");

        ViewUserIdLable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ViewUserIdLable.setText("N/A");

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel34.setText("User Type   :");

        ViewUserTypeLable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ViewUserTypeLable.setText("N/A");

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel36.setText("Address      :");

        ViewUserAddressLable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ViewUserAddressLable.setText("N/A");

        jLabel38.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel38.setText("Telephone  :");

        ViewUserTelephoneLable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ViewUserTelephoneLable.setText("N/A");

        ViewMsgLable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ViewMsgLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(469, 469, 469))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(ViewIdSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ViewUserSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel36)
                                .addComponent(jLabel34)
                                .addComponent(jLabel38))
                            .addComponent(jLabel32))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ViewUserIdLable)
                            .addComponent(ViewUserNameLable)
                            .addComponent(ViewUserTypeLable)
                            .addComponent(ViewUserTelephoneLable)
                            .addComponent(ViewUserAddressLable)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(ViewMsgLable, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel29)
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ViewIdSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewUserSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(ViewUserNameLable))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ViewUserIdLable))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(ViewUserTypeLable))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(ViewUserAddressLable))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(ViewUserTelephoneLable))
                .addGap(31, 31, 31)
                .addComponent(ViewMsgLable)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("View User Details", jPanel6);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("UPDATE USER DETAILS");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setText("User Name :");

        UpdateUserNameTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        UpdateUserNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel14.setText("User Type   :");

        UpdateUserTypeComboBox.setBackground(new java.awt.Color(254, 254, 254));
        UpdateUserTypeComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        UpdateUserTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        UpdateUserTypeComboBox.setBorder(null);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel15.setText("Address      :");

        UpdateUserAddressTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        UpdateUserAddressTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel16.setText("Telephone  :");

        UpdateUserTelephoneTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        UpdateUserTelephoneTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        UpdateUserButton.setBackground(new java.awt.Color(201, 34, 42));
        UpdateUserButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        UpdateUserButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateUserButton.setText("Update User");
        UpdateUserButton.setBorder(null);
        UpdateUserButton.setFocusPainted(false);
        UpdateUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateUserButtonActionPerformed(evt);
            }
        });

        UpdateSerachIdTextField.setBackground(new java.awt.Color(204, 204, 204));
        UpdateSerachIdTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        UpdateSerachIdTextField.setText("Search using User ID");

        UpdateSearchButton.setBackground(new java.awt.Color(201, 34, 42));
        UpdateSearchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        UpdateSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateSearchButton.setText("Search");
        UpdateSearchButton.setBorder(null);
        UpdateSearchButton.setFocusPainted(false);
        UpdateSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateSearchButtonActionPerformed(evt);
            }
        });

        UpdateClearAllButton.setBackground(new java.awt.Color(201, 34, 42));
        UpdateClearAllButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        UpdateClearAllButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateClearAllButton.setText("Clear All");
        UpdateClearAllButton.setBorder(null);
        UpdateClearAllButton.setFocusPainted(false);
        UpdateClearAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateClearAllButtonActionPerformed(evt);
            }
        });

        UpdateMsgLable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        UpdateMsgLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(UpdateSerachIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateClearAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdateUserTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateUserAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(UpdateUserTelephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(UpdateUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(38, 38, 38)
                        .addComponent(UpdateUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(287, 287, 287))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(UpdateMsgLable, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel12)
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UpdateSerachIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateClearAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateUserTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(UpdateUserAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateUserTelephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(26, 26, 26)
                .addComponent(UpdateUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateMsgLable)
                .addGap(30, 30, 30))
        );

        jTabbedPane2.addTab("Update User Details", jPanel7);

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setText("DELETE USER");

        DeleteSearchTextField.setBackground(new java.awt.Color(204, 204, 204));
        DeleteSearchTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        DeleteSearchTextField.setText("Search using User ID");

        DeleteSearchButton.setBackground(new java.awt.Color(201, 34, 42));
        DeleteSearchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        DeleteSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteSearchButton.setText("Search");
        DeleteSearchButton.setBorder(null);
        DeleteSearchButton.setFocusPainted(false);
        DeleteSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSearchButtonActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel19.setText("Telephone  :");

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel20.setText("Address      :");

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel21.setText("User Type   :");

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel22.setText("User ID        :");

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel23.setText("User Name :");

        DeleteUserNameLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        DeleteUserNameLabel.setText("N/A");

        DeleteUserIdLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        DeleteUserIdLabel.setText("N/A");

        DeleteUserTypeLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        DeleteUserTypeLabel.setText("N/A");

        DeleteUserTelephoneLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        DeleteUserTelephoneLabel.setText("N/A");

        DeleteUserAddressLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        DeleteUserAddressLabel.setText("N/A");

        DeleteUserButton.setBackground(new java.awt.Color(201, 34, 42));
        DeleteUserButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        DeleteUserButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteUserButton.setText("Delete User");
        DeleteUserButton.setBorder(null);
        DeleteUserButton.setFocusPainted(false);
        DeleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserButtonActionPerformed(evt);
            }
        });

        DeleteMsgLable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        DeleteMsgLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteMsgLable, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(DeleteSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel20)
                                .addComponent(jLabel21)
                                .addComponent(jLabel19))
                            .addComponent(jLabel22))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeleteUserIdLabel)
                            .addComponent(DeleteUserNameLabel)
                            .addComponent(DeleteUserTypeLabel)
                            .addComponent(DeleteUserTelephoneLabel)
                            .addComponent(DeleteUserAddressLabel)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel18))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(DeleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DeleteSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(DeleteUserNameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DeleteUserIdLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(DeleteUserTypeLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(DeleteUserAddressLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(DeleteUserTelephoneLabel))
                .addGap(18, 18, 18)
                .addComponent(DeleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteMsgLable)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Delete Users", jPanel8);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("User Management", jPanel3);

        jTabbedPane3.setBackground(new java.awt.Color(201, 34, 42));
        jTabbedPane3.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel44.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel44.setText("VIEW USER LOGS");

        jTextField22.setBackground(new java.awt.Color(204, 204, 204));
        jTextField22.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField22.setText("Search using User ID");
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        LoginButton11.setBackground(new java.awt.Color(201, 34, 42));
        LoginButton11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        LoginButton11.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton11.setText("Search");
        LoginButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton11ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LoginButton11))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel44))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jTabbedPane3.addTab("View User Logs", jPanel9);

        jTextField23.setBackground(new java.awt.Color(204, 204, 204));
        jTextField23.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField23.setText("Search using Date : dd/mm/yyyy");
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel62.setText("VIEW DAILY LOGS");

        LoginButton12.setBackground(new java.awt.Color(201, 34, 42));
        LoginButton12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        LoginButton12.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton12.setText("Search");
        LoginButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton12ActionPerformed(evt);
            }
        });

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LoginButton12))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel62))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jList2, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel62)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jList2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("View Daily Logs", jPanel10);

        jTextField24.setBackground(new java.awt.Color(204, 204, 204));
        jTextField24.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTextField24.setText("Search using Package ID");
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel63.setText("VIEW PACKAGE LOGS");

        LoginButton13.setBackground(new java.awt.Color(201, 34, 42));
        LoginButton13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        LoginButton13.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton13.setText("Search");
        LoginButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton13ActionPerformed(evt);
            }
        });

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed", "12/05/2024             Package No: TRU123T          User ID: USER345    13:43:23 - 13:55:12    Completed" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LoginButton13))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel63))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jList3, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel63)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jList3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("View Package Logs", jPanel11);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Log Management", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserNameLable))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserTypeLable))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserIdLable)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(UserNameLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(UserTypeLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(UserIdLable))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateNewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewUserButtonActionPerformed
        String newUserName = (String) NewUserNameTextField.getText();
        String newUserId = (String) NewUserIdTextField.getText();
        String newUserType = (String) NewUserTypeComboBox.getSelectedItem();
        String newUserAddress = (String) NewUserAddressTextField.getText();
        String newUserTelephone = (String) NewUserTelephoneTextField.getText();
        
        if (newUserName.isEmpty() || newUserId.isEmpty() || newUserType.isEmpty() || newUserAddress.isEmpty() || newUserTelephone.isEmpty()) {
            CreateMsgLable.setText("Error : Input all details to create user");
        } else {
            String apiUrl = "http://localhost:8002/api/User";

            try{
                URL url = new URL(apiUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json; utf-8");
                conn.setRequestProperty("Accept", "application/json");
                conn.setDoOutput(true);

                JSONObject jsonInput = new JSONObject();
                jsonInput.put("userId", newUserId);
                jsonInput.put("userName", newUserName);
                jsonInput.put("userType", newUserType);
                jsonInput.put("userAddress", newUserAddress);
                jsonInput.put("userTelephone", newUserTelephone);

                try(OutputStream os = conn.getOutputStream()) {
                    byte[] input = jsonInput.toString().getBytes("utf-8");
                    os.write(input, 0, input.length);           
                }

                int responseCode = conn.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    try(BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                        StringBuilder response = new StringBuilder();
                        String responseLine = null;
                        while ((responseLine = br.readLine()) != null) {
                            response.append(responseLine.trim());
                        }
                        System.out.println(response.toString());
                        CreateMsgLable.setText("User Created successfully");
                    }
                } else {
                    System.out.println("User Not Created");
                    CreateMsgLable.setText("User Not Created");    
                }
                conn.disconnect();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_CreateNewUserButtonActionPerformed

    private void UpdateUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateUserButtonActionPerformed
        String updateUserName = (String) UpdateUserNameTextField.getText();
        String updateUserId = (String) UpdateSerachIdTextField.getText();
        String updateUserType = (String) UpdateUserTypeComboBox.getSelectedItem();
        String updateUserAddress = (String) UpdateUserAddressTextField.getText();
        String updateUserTelephone = (String) UpdateUserTelephoneTextField.getText();
        
        if (updateUserName.isEmpty() || updateUserId.isEmpty() || updateUserType.isEmpty() || updateUserAddress.isEmpty() || updateUserTelephone.isEmpty()) {
            UpdateMsgLable.setText("Error : Input all details to update user");
        } else {
        
            String apiUrl = "http://localhost:8002/api/User/"+ updateUserId;

            try{
                URL url = new URL(apiUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("PUT");
                conn.setRequestProperty("Content-Type", "application/json; utf-8");
                conn.setRequestProperty("Accept", "application/json");
                conn.setDoOutput(true);

                JSONObject jsonInput = new JSONObject();
                jsonInput.put("userId", updateUserId);
                jsonInput.put("userName", updateUserName);
                jsonInput.put("userType", updateUserType);
                jsonInput.put("userAddress", updateUserAddress);
                jsonInput.put("userTelephone", updateUserTelephone);

                try(OutputStream os = conn.getOutputStream()) {
                    byte[] input = jsonInput.toString().getBytes("utf-8");
                    os.write(input, 0, input.length);           
                }

                int responseCode = conn.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    try(BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                        StringBuilder response = new StringBuilder();
                        String responseLine = null;
                        while ((responseLine = br.readLine()) != null) {
                            response.append(responseLine.trim());
                        }
                        System.out.println(response.toString());
                        UpdateMsgLable.setText("User Updated successfully");
                    }
                } else {
                    System.out.println("User Not Updated");
                    UpdateMsgLable.setText("User Not Updated");    
                }
                conn.disconnect();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpdateUserButtonActionPerformed

    private void UpdateSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateSearchButtonActionPerformed
        String searchUserId = (String) UpdateSerachIdTextField.getText();
        
        if(searchUserId.isEmpty()){
            UpdateMsgLable.setText("Enter User ID to search");
        } else {
            String apiUrl = "http://localhost:8002/api/User/userid/" + searchUserId;

            try{
                URL url = new URL(apiUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                
                int responseCode = conn.getResponseCode();
                if (responseCode == 200) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String inputLine;
                    StringBuilder content = new StringBuilder();

                    while ((inputLine = in.readLine()) != null) {
                        content.append(inputLine);
                    }
                    in.close();
                    conn.disconnect();

                    Gson gson = new Gson();
                    User user = gson.fromJson(content.toString(), User.class);

                    UpdateUserNameTextField.setText(user.getUserName());
                    UpdateUserTypeComboBox.setSelectedItem(user.getUserType());
                    UpdateUserAddressTextField.setText(user.getUserAddress());
                    UpdateUserTelephoneTextField.setText(user.getUserTelephone());
                } else {
                    UpdateMsgLable.setText("User Id Invalid");
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpdateSearchButtonActionPerformed

    private void DeleteSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSearchButtonActionPerformed
        String searchUserId = (String) DeleteSearchTextField.getText();
        
        if(searchUserId.isEmpty()){
            DeleteMsgLable.setText("Enter User ID to search");
        } else {
            String apiUrl = "http://localhost:8002/api/User/userid/" + searchUserId;

            try{
                URL url = new URL(apiUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                
                int responseCode = conn.getResponseCode();
                if (responseCode == 200) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String inputLine;
                    StringBuilder content = new StringBuilder();

                    while ((inputLine = in.readLine()) != null) {
                        content.append(inputLine);
                    }
                    in.close();
                    conn.disconnect();

                    Gson gson = new Gson();
                    User user = gson.fromJson(content.toString(), User.class);

                    DeleteUserNameLabel.setText(user.getUserName());
                    DeleteUserIdLabel.setText(user.getUserId());
                    DeleteUserTypeLabel.setText(user.getUserType());
                    DeleteUserAddressLabel.setText(user.getUserAddress());
                    DeleteUserTelephoneLabel.setText(user.getUserTelephone());
                } else {
                    DeleteMsgLable.setText("User Id Invalid");
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteSearchButtonActionPerformed

    private void ViewUserSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewUserSearchButtonActionPerformed
        String searchUserId = (String) ViewIdSearchTextField.getText();
        
        if(searchUserId.isEmpty()){
            ViewMsgLable.setText("Enter User ID to search");
        } else {
            String apiUrl = "http://localhost:8002/api/User/userid/" + searchUserId;

            try{
                URL url = new URL(apiUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                
                int responseCode = conn.getResponseCode();
                if (responseCode == 200) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String inputLine;
                    StringBuilder content = new StringBuilder();

                    while ((inputLine = in.readLine()) != null) {
                        content.append(inputLine);
                    }
                    in.close();
                    conn.disconnect();

                    Gson gson = new Gson();
                    User user = gson.fromJson(content.toString(), User.class);

                    ViewUserNameLable.setText(user.getUserName());
                    ViewUserIdLable.setText(user.getUserId());
                    ViewUserTypeLable.setText(user.getUserType());
                    ViewUserAddressLable.setText(user.getUserAddress());
                    ViewUserTelephoneLable.setText(user.getUserTelephone());
                } else {
                    ViewMsgLable.setText("User Id Invalid");
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }  
    }//GEN-LAST:event_ViewUserSearchButtonActionPerformed

    private void DeleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserButtonActionPerformed
        String deleteUserId = (String) DeleteUserIdLabel.getText();
        
        if(deleteUserId.isEmpty()){
            DeleteMsgLable.setText("Enter User ID to search");
        } else {
            String apiUrl = "http://localhost:8002/api/User/" + deleteUserId;

            try{
                URL url = new URL(apiUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("DELETE");
                
                int responseCode = conn.getResponseCode();
                if (responseCode == 200) {
                    DeleteMsgLable.setText("User deleted successfully");
                } else {
                    DeleteMsgLable.setText("Failed to delete user.");
                }
                conn.disconnect();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteUserButtonActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void LoginButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButton11ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void LoginButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButton12ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void LoginButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginButton13ActionPerformed

    private void ClearAllNewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearAllNewUserButtonActionPerformed
        NewUserNameTextField.setText("");
        NewUserIdTextField.setText("");
        NewUserTypeComboBox.setSelectedItem("Admin");
        NewUserAddressTextField.setText("");
        NewUserTelephoneTextField.setText("");
        CreateMsgLable.setText("");
    }//GEN-LAST:event_ClearAllNewUserButtonActionPerformed

    private void UpdateClearAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateClearAllButtonActionPerformed
        UpdateSerachIdTextField.setText("Search using User ID");
        UpdateUserNameTextField.setText("");
        UpdateUserTypeComboBox.setSelectedItem("Admin");
        UpdateUserAddressTextField.setText("");
        UpdateUserTelephoneTextField.setText("");
        UpdateMsgLable.setText("");
    }//GEN-LAST:event_UpdateClearAllButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearAllNewUserButton;
    private javax.swing.JLabel CreateMsgLable;
    private javax.swing.JButton CreateNewUserButton;
    private javax.swing.JLabel DeleteMsgLable;
    private javax.swing.JButton DeleteSearchButton;
    private javax.swing.JTextField DeleteSearchTextField;
    private javax.swing.JLabel DeleteUserAddressLabel;
    private javax.swing.JButton DeleteUserButton;
    private javax.swing.JLabel DeleteUserIdLabel;
    private javax.swing.JLabel DeleteUserNameLabel;
    private javax.swing.JLabel DeleteUserTelephoneLabel;
    private javax.swing.JLabel DeleteUserTypeLabel;
    private javax.swing.JButton LoginButton11;
    private javax.swing.JButton LoginButton12;
    private javax.swing.JButton LoginButton13;
    private javax.swing.JTextField NewUserAddressTextField;
    private javax.swing.JTextField NewUserIdTextField;
    private javax.swing.JTextField NewUserNameTextField;
    private javax.swing.JTextField NewUserTelephoneTextField;
    private javax.swing.JComboBox<String> NewUserTypeComboBox;
    private javax.swing.JButton UpdateClearAllButton;
    private javax.swing.JLabel UpdateMsgLable;
    private javax.swing.JButton UpdateSearchButton;
    private javax.swing.JTextField UpdateSerachIdTextField;
    private javax.swing.JTextField UpdateUserAddressTextField;
    private javax.swing.JButton UpdateUserButton;
    private javax.swing.JTextField UpdateUserNameTextField;
    private javax.swing.JTextField UpdateUserTelephoneTextField;
    private javax.swing.JComboBox<String> UpdateUserTypeComboBox;
    private javax.swing.JLabel UserIdLable;
    private javax.swing.JLabel UserNameLable;
    private javax.swing.JLabel UserTypeLable;
    private javax.swing.JTextField ViewIdSearchTextField;
    private javax.swing.JLabel ViewMsgLable;
    private javax.swing.JLabel ViewUserAddressLable;
    private javax.swing.JLabel ViewUserIdLable;
    private javax.swing.JLabel ViewUserNameLable;
    private javax.swing.JButton ViewUserSearchButton;
    private javax.swing.JLabel ViewUserTelephoneLable;
    private javax.swing.JLabel ViewUserTypeLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    // End of variables declaration//GEN-END:variables
}
