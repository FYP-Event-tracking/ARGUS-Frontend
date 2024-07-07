
package projectargus;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogDetails extends javax.swing.JFrame {

    private String logId;
    private String log_service_endpoint = "http://localhost:8007/log/api/";
    
    public LogDetails() {
        initComponents();   
    }
    
    public LogDetails(String logId) {
        this.logId = logId;
        initComponents();
//        loadConfig();
        getLogData();
    }
    
//    private void loadConfig() {
//        Properties prop = new Properties();
//        try (FileInputStream input = new FileInputStream("config.properties")) {
//            prop.load(input);
//            log_service_endpoint = prop.getProperty("log_service_endpoint");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
    
    private void getLogData(){
        String apiUrl = log_service_endpoint + "Log/logid/" + logId;

        try {
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
                Log log = gson.fromJson(content.toString(), Log.class);

                if (log == null) {
                    FullLogTextArea.setText("Error gathering Log");
                } else {
                    LogIdLable.setText(logId);
                    BoxIdLable.setText(log.getBoxId());
                    UserIdLable.setText(log.getUserId());
                    ItemTypeLable.setText(log.getItemType());
                    
                    LocalDateTime startTime = LocalDateTime.parse(log.getStartTime());
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    String formattedStartTime = startTime.format(formatter);
                    StartTimeLable.setText(formattedStartTime.replace("T", " "));
                    
                    LocalDateTime endTime = LocalDateTime.parse(log.getEndTime());
                    String formattedEndTime = endTime.format(formatter);
                    EndTimeLable.setText(formattedEndTime.replace("T", " "));
                    
                    TotalCountLable.setText(String.valueOf(log.getTotalCount()));
                    String fullLog = log.getFullLogFile().replace("\n", System.lineSeparator());
                    FullLogTextArea.setText(fullLog);
                }

            } else {
                FullLogTextArea.setText("Error gathering Log");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LogIdLable = new javax.swing.JLabel();
        BoxIdLable = new javax.swing.JLabel();
        ItemTypeLable = new javax.swing.JLabel();
        UserIdLable = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TotalCountLable = new javax.swing.JLabel();
        StartTimeLable = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        EndTimeLable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FullLogTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Project Argus - Log Details");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Log ID :");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Box ID :");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Item Type :");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("User ID :");

        LogIdLable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LogIdLable.setText("N/A");

        BoxIdLable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BoxIdLable.setText("N/A");

        ItemTypeLable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ItemTypeLable.setText("N/A");

        UserIdLable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        UserIdLable.setText("N/A");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Total Count :");

        TotalCountLable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        TotalCountLable.setForeground(new java.awt.Color(255, 0, 0));
        TotalCountLable.setText("N/A");

        StartTimeLable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        StartTimeLable.setText("N/A");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setText("Start Time :");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setText("End Time :");

        EndTimeLable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        EndTimeLable.setText("N/A");

        FullLogTextArea.setColumns(20);
        FullLogTextArea.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        FullLogTextArea.setRows(5);
        FullLogTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        FullLogTextArea.setEnabled(false);
        jScrollPane1.setViewportView(FullLogTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ItemTypeLable))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LogIdLable))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BoxIdLable)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EndTimeLable))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(StartTimeLable))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TotalCountLable)))
                        .addGap(337, 337, 337))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserIdLable)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(LogIdLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(BoxIdLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ItemTypeLable)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TotalCountLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(StartTimeLable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(EndTimeLable))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(UserIdLable))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BoxIdLable;
    private javax.swing.JLabel EndTimeLable;
    private javax.swing.JTextArea FullLogTextArea;
    private javax.swing.JLabel ItemTypeLable;
    private javax.swing.JLabel LogIdLable;
    private javax.swing.JLabel StartTimeLable;
    private javax.swing.JLabel TotalCountLable;
    private javax.swing.JLabel UserIdLable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
