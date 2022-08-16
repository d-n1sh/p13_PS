package sg.edu.rp.c346.id21012612.dataps;

public class Traffic {

 private String timestamp;
 private String camera_id;

    public Traffic(String timestamp, String camera_id) {
        this.timestamp = timestamp;
        this.camera_id = camera_id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getCameraid() {
        return camera_id;
    }

    public void setCameraid(String camera_id) {
        this.camera_id = camera_id;
    }

    @Override
    public String toString() {
        return "Traffic{" +
                "timestamp='" + timestamp + '\'' +
                ", camera_id='" + camera_id + '\'' +
                '}';
    }
}
