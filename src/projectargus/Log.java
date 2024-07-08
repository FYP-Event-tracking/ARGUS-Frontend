package projectargus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Log {
    private String logId;
    private String boxId;
    private String itemType;
    private String userId;
    private int totalCount;
    private String startTime;
    private String endTime;
    private String fullLogFile;
    
    @Override
    public String toString() {
        LocalDateTime startTimeC = LocalDateTime.parse(startTime);
//        startTimeC = startTimeC.plusHours(5).plusMinutes(30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedStartTime = startTimeC.format(formatter);
        return formattedStartTime.replace("T", " ") + "       LogId : " + logId + "      BoxId : " + boxId + "      ItemType : " + itemType + "     UserId : " + userId + "       TotalCount : " + totalCount;
    }

    public String getLogId() { return logId; }
    public void setLogId(String logId) { this.logId = logId; }
    public String getBoxId() { return boxId; }
    public void setBoxId(String boxId) { this.boxId = boxId; }
    public String getItemType() { return itemType; }
    public void setItemType(String itemType) { this.itemType = itemType; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public int getTotalCount() { return totalCount; }
    public void setTotalCount(int totalCount) { this.totalCount = totalCount; }
    public String getStartTime() { return startTime; }
    public void setStartTime(String startTime) { this.startTime = startTime; }
    public String getEndTime() { return endTime; }
    public void setEndTime(String endTime) { this.endTime = endTime; }
    public String getFullLogFile() { return fullLogFile; }
    public void setFullLogFile(String fullLogFile) { this.fullLogFile = fullLogFile; }
}
