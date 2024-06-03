package projectargus;
import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Properties;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class EmployeeHome extends javax.swing.JFrame {
    private User user;
    private String userID;
    Webcam webcam;
    Boolean isRunning = false;
    private String track_and_count_system_endpoint;
    
    public EmployeeHome() {
        initComponents();
        loadConfig();
    }

    public EmployeeHome(User user) {
        initComponents();
        loadConfig();
        webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(640,480));
        
        UserNameLable.setText(user.getUserName());
        UserPositionLable.setText(user.getUserType());
        UserIdLable.setText(user.getUserId());
        userID = user.getUserId();
    }
    
    private void loadConfig() {
        Properties prop = new Properties();
        try (FileInputStream input = new FileInputStream("config.properties")) {
            prop.load(input);
            track_and_count_system_endpoint = prop.getProperty("track_and_count_system_endpoint");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void stopWebcam() {
        if(isRunning){
            isRunning = false;
            webcam.close();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserNameLable = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserPositionLable = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UserIdLable = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BoxIdTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ItemTypeTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        LogIdTextField = new javax.swing.JTextField();
        Strat = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        UserMsgLable = new javax.swing.JLabel();
        Camfeed = new javax.swing.JLabel();
        LogOutLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(201, 34, 42));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 600));

        jPanel3.setPreferredSize(new java.awt.Dimension(1088, 586));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectargus/Logo-Argus 80x80.png"))); // NOI18N
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Employee Name :");

        UserNameLable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        UserNameLable.setText("Hansa Hettiarachchi");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Position :");

        UserPositionLable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        UserPositionLable.setText("Employee");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Employee ID :");

        UserIdLable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        UserIdLable.setText("emp123");

        jPanel4.setPreferredSize(new java.awt.Dimension(1076, 486));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setText("Box ID : ");

        BoxIdTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Item Type :");

        ItemTypeTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setText("Log ID :");

        LogIdTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        Strat.setBackground(new java.awt.Color(0, 255, 0));
        Strat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Strat.setText("START");
        Strat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StratActionPerformed(evt);
            }
        });

        Stop.setBackground(new java.awt.Color(255, 0, 0));
        Stop.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Stop.setText("STOP");
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });

        UserMsgLable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        UserMsgLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Strat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(LogIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(ItemTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(BoxIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(UserMsgLable, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BoxIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ItemTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(UserMsgLable)
                .addGap(61, 61, 61)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Strat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        Camfeed.setBackground(new java.awt.Color(204, 255, 255));
        Camfeed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Camfeed.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Camfeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Camfeed, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        LogOutLable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        LogOutLable.setForeground(new java.awt.Color(0, 0, 204));
        LogOutLable.setText("Log Out");
        LogOutLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutLableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserIdLable))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(UserNameLable))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(UserPositionLable)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LogOutLable))))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(UserNameLable))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(UserPositionLable)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(LogOutLable)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(UserIdLable))))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1129, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StratActionPerformed
        String logId = (String) LogIdTextField.getText();
        String boxId = (String) BoxIdTextField.getText();
        String itemType = (String) ItemTypeTextField.getText();
        
        if(logId.isEmpty() || boxId.isEmpty() || itemType.isEmpty()) {
            UserMsgLable.setText("Error : Input all details to start");
        } else {
            UserMsgLable.setText("");
            startWebcamWithData(logId, boxId, itemType);
        }
    }//GEN-LAST:event_StratActionPerformed

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActionPerformed
        String logId = (String) LogIdTextField.getText();
        String boxId = (String) BoxIdTextField.getText();
        String itemType = (String) ItemTypeTextField.getText();
        
        if(logId.isEmpty() || boxId.isEmpty() || itemType.isEmpty()) {
            UserMsgLable.setText("Error : Input all details to start");
        } else {
            stopWebcam();
        
            String apiUrl = track_and_count_system_endpoint ;
            try {
                URL url = new URL(apiUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json; utf-8");
                conn.setRequestProperty("Accept", "application/json");
                conn.setDoOutput(true);

                JSONObject jsonInput = new JSONObject();
                jsonInput.put("Action", "Stop");
                jsonInput.put("LogId", logId);
                jsonInput.put("BoxId", boxId);
                jsonInput.put("ItemType", itemType);
                jsonInput.put("UserId", userID);

                try(OutputStream os = conn.getOutputStream()) {
                    byte[] input = jsonInput.toString().getBytes("utf-8");
                    os.write(input, 0, input.length);           
                }

                int responseCode = conn.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    UserMsgLable.setText("Video capturing stop");
                } else {
                    UserMsgLable.setText("Error while stop video capturing");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }    
    }//GEN-LAST:event_StopActionPerformed

    private void LogOutLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutLableMouseClicked
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogOutLableMouseClicked

    private void startWebcamWithData(String logId, String boxId, String itemType) {
        sendMetadata(logId, boxId, itemType);
        if(!isRunning){
            isRunning = true;
            webcam.open();
            new VideoFeedTaker(logId, boxId, itemType).start();
        }
    }
    
    private void sendMetadata(String logId, String boxId, String itemType) {
        String apiUrl = track_and_count_system_endpoint ;
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);

            JSONObject jsonInput = new JSONObject();
            jsonInput.put("Action", "Start");
            jsonInput.put("LogId", logId);
            jsonInput.put("BoxId", boxId);
            jsonInput.put("ItemType", itemType);
            jsonInput.put("UserId", userID);

            try(OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInput.toString().getBytes("utf-8");
                os.write(input, 0, input.length);           
            }

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                UserMsgLable.setText("Video is capturing....");
            } else {
                UserMsgLable.setText("Error while video capturing");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    class VideoFeedTaker extends Thread {
        private String logId, boxId, itemType;

        public VideoFeedTaker(String logId, String boxId, String itemType) {
            this.logId = logId;
            this.boxId = boxId;
            this.itemType = itemType;
        }

        @Override
        public void run() {
            while (isRunning) {
                try {
                    Image image = webcam.getImage();
                    Camfeed.setIcon(new ImageIcon(image));
                    Thread.sleep(100);
                } catch (Exception ex) {
                    Logger.getLogger(EmployeeHome.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BoxIdTextField;
    private javax.swing.JLabel Camfeed;
    private javax.swing.JTextField ItemTypeTextField;
    private javax.swing.JTextField LogIdTextField;
    private javax.swing.JLabel LogOutLable;
    private javax.swing.JButton Stop;
    private javax.swing.JButton Strat;
    private javax.swing.JLabel UserIdLable;
    private javax.swing.JLabel UserMsgLable;
    private javax.swing.JLabel UserNameLable;
    private javax.swing.JLabel UserPositionLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
