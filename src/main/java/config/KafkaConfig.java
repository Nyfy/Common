package config;

public class KafkaConfig {
    public static String BOOTSTRAP_SERVER = "";
    
    public static String SCYLLA_GROUP_ID = "scylla";
    
    public static String DISPLAY_SOURCE_TOPIC = "Displays-Raw";
    public static String DISPLAY_SINK_TOPIC = "Displays-Processed";
    public static String DISPLAY_REJECTED_TOPIC = "Displays-Rejected";
    public static String DISPLAY_DEDUP_TOPIC = "Displays-Dedup";
}
