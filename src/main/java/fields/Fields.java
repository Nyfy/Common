package fields;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fields {
    public static String DISPLAY = "Display";
    public static String TELEVISION = "Television";
    public static String MONITOR = "Monitor";

    public static String BRAND = "Brand";
    private HashMap<String, String[]> BRAND_VALUES;
    public static String SCREEN_SIZE = "ScreenSize";
    private HashMap<String,String[]> SCREEN_SIZE_VALUES;
    public static String RESOLUTION = "Resolution";
    private HashMap<String,String[]> RESOLUTION_VALUES;
    public static String RESPONSE_TIME = "ResponseTime";
    private HashMap<String,String[]> RESPONSE_TIME_VALUES;
    public static String REFRESH_RATE = "RefreshRate";
    private HashMap<String,String[]> REFRESH_RATE_VALUES;
    public static String PANEL_TYPE = "PanelType";
    private HashMap<String,String[]> PANEL_TYPE_VALUES;
    public static String ADAPTIVE_SYNC = "AdaptiveSync";
    private HashMap<String,String[]> ADAPTIVE_SYNC_VALUES;
    public static String VGA = "VGA";
    private HashMap<String,String[]> VGA_VALUES;
    public static String DVI = "DVI";
    private HashMap<String,String[]> DVI_VALUES;
    public static String HDMI = "HDMI";
    private HashMap<String,String[]> HDMI_VALUES;
    public static String DISPLAY_PORT = "DisplayPort";
    private HashMap<String,String[]> DISPLAY_PORT_VALUES;
    public static String VESA_MOUNT = "VesaMount";
    private HashMap<String,String[]> VESA_MOUNT_VALUES;
    public static String ASPECT_RATIO = "AspectRatio";
    private HashMap<String,String[]> ASPECT_RATIO_VALUES;
    public static String PIXEL_PITCH = "PixelPitch";
    private HashMap<String,String[]> PIXEL_PITCH_VALUES;
    public static String PIXEL_DENSITY = "PixelDensity";
    private HashMap<String,String[]> PIXEL_DENSITY_VALUES;
    public static String BRIGHTNESS = "Brightness";
    private HashMap<String,String[]> BRIGHTNESS_VALUES;
    public static String REMOVABLE_STAND = "RemovableStand";
    private HashMap<String, String[]> REMOVABLE_STAND_VALUES;
    public static String HEIGHT_ADJUSTMENT = "HeightAdjustment";
    private HashMap<String, String[]> HEIGHT_ADJUSTMENT_VALUES;
    public static String PIVOT_ADJUSTMENT = "PivotAdjustment";
    private HashMap<String, String[]> PIVOT_ADJUSTMENT_VALUES;
    public static String SWIVEL_ADJUSTMENT = "SwivelAdjustment";
    private HashMap<String, String[]> SWIVEL_ADJUSTMENT_VALUES;
    public static String LEFT_SWIVEL = "LeftSwivel";
    private HashMap<String, String[]> LEFT_SWIVEL_VALUES;
    public static String RIGHT_SWIVEL = "RightSwivel";
    private HashMap<String, String[]> RIGHT_SWIVEL_VALUES;
    public static String TILT_ADJUSTMENT = "TiltAdjustment";
    private HashMap<String, String[]> TILT_ADJUSTMENT_VALUES;
    public static String FORWARD_TILT = "ForwardTilt";
    private HashMap<String, String[]> FORWARD_TILT_VALUES;
    public static String BACKWARD_TILT = "BackwardTilt";
    private HashMap<String, String[]> BACKWARD_TILT_VALUES;
    public static String CURVATURE = "Curvature";
    private HashMap<String, String[]> CURVATURE_VALUES;
    public static String DISPLAY_AREA = "DisplayArea";
    private HashMap<String, String[]> DISPLAY_AREA_VALUES;
    public static String STATIC_CONTRAST = "ContrastRatio";
    private HashMap<String, String[]> STATIC_CONTRAST_VALUES;
    public static String DYNAMIC_CONTRAST = "ContrastRatio";
    private HashMap<String, String[]> DYNAMIC_CONTRAST_VALUES;
    
    private List<String> CONNECTOR_FIELDS;
    private List<String> ERGONOMIC_FIELDS;
    private Map<String, String> ERGONOMIC_ADJUSTMENTS;
    private Map<String,List<String>> CATEGORIZED_FIELDS;
    
    public static String CATEGORY = "Category";
    public static String FOUNDTIME = "FoundTime";
    public static String URL = "URL";
    public static String MODEL = "ModelNumber";
    public static String PRICE = "Price";
    public static String CONNECTORS = "Connectors";
    public static String ERGONOMICS = "Ergonomics";
    public static String CONTRAST = "Contrast";
    
    public static String FIND_TAG = "FIND_MATCH";
    
    private static Map<String, HashMap<String, String[]>> FIELD_VALUES;
    
    public Fields() {
        FIELD_VALUES = new HashMap<String,HashMap<String,String[]>>();
        defineValueMaps();
        defineCategorizedFields();
        defineErgonomicAdjustments();
    }
    
    public Map<String, HashMap<String, String[]>> getFieldValues() {
        return FIELD_VALUES;
    }
    
    public Map<String,List<String>> getCategorizedFields() {
        return CATEGORIZED_FIELDS;
    }
    
    public Map<String, String> getErgonomicAdjustments() {
        return ERGONOMIC_ADJUSTMENTS;
    }
    
    private void defineErgonomicAdjustments() {
        Map<String, String> ergonomicAdjustments = new HashMap<String, String>();
        
        ergonomicAdjustments.put("tilt", TILT_ADJUSTMENT);
        ergonomicAdjustments.put("height", HEIGHT_ADJUSTMENT);
        ergonomicAdjustments.put("pivot", PIVOT_ADJUSTMENT);
        ergonomicAdjustments.put("swivel", SWIVEL_ADJUSTMENT);
        
        ERGONOMIC_ADJUSTMENTS = ergonomicAdjustments;
    }
    
    private void defineCategorizedFields() {
        CONNECTOR_FIELDS = new ArrayList<String>();
        CONNECTOR_FIELDS.add(VGA);
        CONNECTOR_FIELDS.add(DVI);
        CONNECTOR_FIELDS.add(HDMI);
        CONNECTOR_FIELDS.add(DISPLAY_PORT);
        
        ERGONOMIC_FIELDS = new ArrayList<String>();
        ERGONOMIC_FIELDS.add(VESA_MOUNT);
        ERGONOMIC_FIELDS.add(REMOVABLE_STAND);
        ERGONOMIC_FIELDS.add(HEIGHT_ADJUSTMENT);
        ERGONOMIC_FIELDS.add(PIVOT_ADJUSTMENT);
        ERGONOMIC_FIELDS.add(SWIVEL_ADJUSTMENT);
        ERGONOMIC_FIELDS.add(TILT_ADJUSTMENT);
        ERGONOMIC_FIELDS.add(FORWARD_TILT);
        ERGONOMIC_FIELDS.add(BACKWARD_TILT);
        ERGONOMIC_FIELDS.add(LEFT_SWIVEL);
        ERGONOMIC_FIELDS.add(RIGHT_SWIVEL);
        
        CATEGORIZED_FIELDS = new HashMap<String,List<String>>();
        CATEGORIZED_FIELDS.put("Connectivity", CONNECTOR_FIELDS);
        CATEGORIZED_FIELDS.put("Ergonomics", ERGONOMIC_FIELDS);
    }
    
    private void defineValueMaps() {
        BRAND_VALUES = new HashMap<String,String[]>();
        BRAND_VALUES.put("3M", new String[] {"3m"});
        BRAND_VALUES.put("Acer America", new String[] {"acer"});
        BRAND_VALUES.put("AG Neovo", new String[] {"ag\\s?neovo"});
        BRAND_VALUES.put("AOC Monitors", new String[] {"aoc"});
        BRAND_VALUES.put("Asus", new String[] {"asus"});
        BRAND_VALUES.put("AVUE", new String[] {"avue"});
        BRAND_VALUES.put("Bang & Olufsen", new String[] {"bang.*olufsen"});
        BRAND_VALUES.put("BenQ", new String[] {"ben.?q"});
        BRAND_VALUES.put("Bosch", new String[] {"bosch"});
        BRAND_VALUES.put("BOYO", new String[] {"boyo"});
        BRAND_VALUES.put("Brondell", new String[] {"brondell"});
        BRAND_VALUES.put("Computer Security Products", new String[] {"computer security products"});
        BRAND_VALUES.put("Dell", new String[] {"dell"});
        BRAND_VALUES.put("DHP", new String[] {"dhp"});
        BRAND_VALUES.put("DoubleSight", new String[] {"double\\s?sight"});
        BRAND_VALUES.put("Eizo", new String[] {"eizo"});
        BRAND_VALUES.put("Elo Touch Solutions", new String[] {"elo\\s?touch\\s?solutions"});
        BRAND_VALUES.put("Envision", new String[] {"envision"});
        BRAND_VALUES.put("Fujitsu", new String[] {"fujitsu"});
        BRAND_VALUES.put("GeChic", new String[] {"gechic"});
        BRAND_VALUES.put("Grundig", new String[] {"grundig"});
        BRAND_VALUES.put("Geekbuying", new String[] {"geek\\s?buying"});
        BRAND_VALUES.put("GVision", new String[] {"gvision"});
        BRAND_VALUES.put("Hanns-G", new String[] {"hanns.?g"});
        BRAND_VALUES.put("Hannspree", new String[] {"hannspree"});
        BRAND_VALUES.put("Hisense", new String[] {"hisense"});
        BRAND_VALUES.put("Hitachi", new String[] {"hitachi"});
        BRAND_VALUES.put("HP", new String[] {"hp"});
        BRAND_VALUES.put("Iiyama", new String[] {"iiyama"});
        BRAND_VALUES.put("InFocus", new String[] {"infocus"});
        BRAND_VALUES.put("Insignia", new String[] {"insignia"});
        BRAND_VALUES.put("JVC", new String[] {"jvc"});
        BRAND_VALUES.put("LeEco", new String[] {"leeco"});
        BRAND_VALUES.put("Lenovo", new String[] {"lenovo"});
        BRAND_VALUES.put("LG", new String[] {"lg"});
        BRAND_VALUES.put("Loewe", new String[] {"loewe"});
        BRAND_VALUES.put("Lilliput", new String[] {"lilliput"});
        BRAND_VALUES.put("Metz", new String[] {"metz"});
        BRAND_VALUES.put("MIMO", new String[] {"mimo"});
        BRAND_VALUES.put("Monoprice", new String[] {"monoprice"});
        BRAND_VALUES.put("MSI", new String[] {"msi"});
        BRAND_VALUES.put("NEC", new String[] {"nec"});
        BRAND_VALUES.put("Nixeus", new String[] {"nixeus"});
        BRAND_VALUES.put("Omnihil", new String[] {"omnihil"});
        BRAND_VALUES.put("Orion", new String[] {"orion"});
        BRAND_VALUES.put("Panasonic", new String[] {"panasonic"});
        BRAND_VALUES.put("Philips", new String[] {"philips"});
        BRAND_VALUES.put("Pixio", new String[] {"pixio"});
        BRAND_VALUES.put("Planar", new String[] {"planar"});
        BRAND_VALUES.put("Raspberry Pi", new String[] {"raspberry"});
        BRAND_VALUES.put("RCA", new String[] {"rca"});
        BRAND_VALUES.put("Samsung", new String[] {"samsung"});
        BRAND_VALUES.put("Sceptre", new String[] {"sceptre"});
        BRAND_VALUES.put("Skyworth", new String[] {"sky.?worth"});
        BRAND_VALUES.put("Sharp", new String[] {"sharp"});
        BRAND_VALUES.put("Sony", new String[] {"sony"});
        BRAND_VALUES.put("Shenzen DNS Industries", new String[] {"shenzen"});
        BRAND_VALUES.put("Szbizlink", new String[] {"szbizlink"});
        BRAND_VALUES.put("TCL", new String[] {"tcl"});
        BRAND_VALUES.put("Telefunken", new String[] {"telefunken"});
        BRAND_VALUES.put("Thomson", new String[] {"thomson"});
        BRAND_VALUES.put("Toshiba", new String[] {"toshiba"});
        BRAND_VALUES.put("TouchSystems", new String[] {"touch\\s?systems"});
        BRAND_VALUES.put("Tyco", new String[] {"tyco"});
        BRAND_VALUES.put("Vestel", new String[] {"vestel"});
        BRAND_VALUES.put("V7", new String[] {"v7"});
        BRAND_VALUES.put("Viewera", new String[] {"viewera"});
        BRAND_VALUES.put("ViewSonic", new String[] {"view\\s?sonic"});
        BRAND_VALUES.put("Vizio", new String[] {"vizio"});
        BRAND_VALUES.put("Vizta", new String[] {"vizta"});
        BRAND_VALUES.put("Wasabi Mango", new String[] {"wasabi.mango"});
        BRAND_VALUES.put("Xiaomi", new String[] {"xiaomi"});
        FIELD_VALUES.put(BRAND, BRAND_VALUES);
        
        SCREEN_SIZE_VALUES = new HashMap<String,String[]>();
        SCREEN_SIZE_VALUES.put(FIND_TAG, new String[] {"^\\D*(\\d\\d\\.\\d|\\d\\d)\\D*$"});
        FIELD_VALUES.put(SCREEN_SIZE, SCREEN_SIZE_VALUES);
        
        RESOLUTION_VALUES = new HashMap<String,String[]>();
        RESOLUTION_VALUES.put("800x600", new String[] {"800.*600"});
        RESOLUTION_VALUES.put("1024x600", new String[] {"1024.*600"});
        RESOLUTION_VALUES.put("1024x768", new String[] {"1024.*768"});
        RESOLUTION_VALUES.put("1280x1024", new String[] {"1280.*1024"});
        RESOLUTION_VALUES.put("1366x768", new String[] {"1366.*768"});
        RESOLUTION_VALUES.put("1440x900", new String[] {"1440.*900"});
        RESOLUTION_VALUES.put("1536x2048", new String[] {"1536.*2048"});
        RESOLUTION_VALUES.put("1600x900", new String[] {"1600.*900"});
        RESOLUTION_VALUES.put("1600x1200", new String[] {"1600.*1200"});
        RESOLUTION_VALUES.put("1680x1050", new String[] {"1680.*1050"});
        RESOLUTION_VALUES.put("1920x1080", new String[] {"1920.*1080"});
        RESOLUTION_VALUES.put("1920x1200", new String[] {"1920.*1200"});
        RESOLUTION_VALUES.put("2560x1080", new String[] {"2560.*1080"});
        RESOLUTION_VALUES.put("2560x1440", new String[] {"2560.*1440"});
        RESOLUTION_VALUES.put("2560x1600", new String[] {"2560.*1600"});
        RESOLUTION_VALUES.put("3440x1440", new String[] {"3440.*1440"});
        RESOLUTION_VALUES.put("3840x1600", new String[] {"3840.*1600"});
        RESOLUTION_VALUES.put("3840x2160", new String[] {"3840.*2160"});
        RESOLUTION_VALUES.put("4096x2160", new String[] {"4096.*2160"});
        RESOLUTION_VALUES.put("5120x2880", new String[] {"5120.*2880"});
        FIELD_VALUES.put(RESOLUTION, RESOLUTION_VALUES);
        
        RESPONSE_TIME_VALUES = new HashMap<String,String[]>();
        RESPONSE_TIME_VALUES.put(FIND_TAG, new String[] {"^\\D*(\\d{1,3})\\D*$",});
        FIELD_VALUES.put(RESPONSE_TIME, RESPONSE_TIME_VALUES);
        
        REFRESH_RATE_VALUES = new HashMap<String,String[]>();
        REFRESH_RATE_VALUES.put(FIND_TAG, new String[] {"^\\D*(\\d{1,3})\\D*$","^\\D*\\d{2,3}\\D+(\\d{2,3})\\D*$"});
        FIELD_VALUES.put(REFRESH_RATE, REFRESH_RATE_VALUES);
        
        PANEL_TYPE_VALUES = new HashMap<String,String[]>();
        PANEL_TYPE_VALUES.put("IPS", new String[] {"ips"});
        PANEL_TYPE_VALUES.put("AH-IPS", new String[] {"ah.?ips"});
        PANEL_TYPE_VALUES.put("TN", new String[] {"tn"});
        PANEL_TYPE_VALUES.put("A-MVA", new String[] {"a.?mva"});
        PANEL_TYPE_VALUES.put("TFT", new String[] {"tft"});
        PANEL_TYPE_VALUES.put("AHVA", new String[] {"ahva"});
        PANEL_TYPE_VALUES.put("PLS", new String[] {"pls"});
        PANEL_TYPE_VALUES.put("PVA", new String[] {"pva"});
        PANEL_TYPE_VALUES.put("VA", new String[] {"va"});
        PANEL_TYPE_VALUES.put("MVA", new String[] {"mva"});
        FIELD_VALUES.put(PANEL_TYPE, PANEL_TYPE_VALUES);
        
        ADAPTIVE_SYNC_VALUES = new HashMap<String,String[]>();
        ADAPTIVE_SYNC_VALUES.put("G-Sync", new String[] {"g.?sync","nvidia"});
        ADAPTIVE_SYNC_VALUES.put("FreeSync", new String[] {"free.?sync","amd"});
        FIELD_VALUES.put(ADAPTIVE_SYNC, ADAPTIVE_SYNC_VALUES);
        
        VGA_VALUES = new HashMap<String,String[]>();
        VGA_VALUES.put(FIND_TAG, new String[] {"^\\D*(\\d)\\D*$","^\\D*(\\d)\\D*vga\\D*\\d\\.\\d\\D*$"});
        VGA_VALUES.put("true", new String[] {"yes","true"});
        VGA_VALUES.put("false", new String[] {"no","false"});
        FIELD_VALUES.put(VGA, VGA_VALUES);
        
        DVI_VALUES = new HashMap<String,String[]>();
        DVI_VALUES.put(FIND_TAG, new String[] {"^\\D*(\\d)\\D*$","^\\D*(\\d)\\D*dvi\\D*\\d\\.\\d\\D*$"});
        DVI_VALUES.put("true", new String[] {"yes","true"});
        DVI_VALUES.put("false", new String[] {"no","false"});
        FIELD_VALUES.put(DVI, DVI_VALUES);
        
        HDMI_VALUES = new HashMap<String,String[]>();
        HDMI_VALUES.put(FIND_TAG, new String[] {"^\\D*(\\d)\\D*$","^\\D*(\\d)\\D*hdmi\\D*\\d\\.\\d\\D*$"});
        HDMI_VALUES.put("true", new String[] {"yes","true"});
        HDMI_VALUES.put("false", new String[] {"no","false"});
        FIELD_VALUES.put(HDMI, HDMI_VALUES);
        
        DISPLAY_PORT_VALUES = new HashMap<String,String[]>();
        DISPLAY_PORT_VALUES.put(FIND_TAG, new String[] {"^\\D*(\\d)\\D*$","^\\D*(\\d)\\D*displayport\\D*\\d\\.\\d\\D*$"});
        DISPLAY_PORT_VALUES.put("true", new String[] {"yes","true"});
        DISPLAY_PORT_VALUES.put("false", new String[] {"no","false"});
        FIELD_VALUES.put(DISPLAY_PORT, DISPLAY_PORT_VALUES);
        
        VESA_MOUNT_VALUES = new HashMap<String,String[]>();
        VESA_MOUNT_VALUES.put(Fields.FIND_TAG, new String[] {"^\\D*(\\d{1,3})\\D+(\\d{1,3})\\D*$"});
        VESA_MOUNT_VALUES.put("true", new String[] {"yes","true"});
        VESA_MOUNT_VALUES.put("false", new String[] {"no","false"});
        FIELD_VALUES.put(VESA_MOUNT, VESA_MOUNT_VALUES);
        
        ASPECT_RATIO_VALUES = new HashMap<String,String[]>();
        ASPECT_RATIO_VALUES.put(FIND_TAG, new String[] {"^\\D*([\\.\\d]+:[\\.\\d]+)\\D*$","^\\D*[\\.\\d]+:[\\.\\d]+\\D+([\\.\\d]+:[\\.\\d]+)\\D*$","^\\D*[\\.\\d]+:[\\.\\d]+\\D+[\\.\\d]+:[\\.\\d]+\\D+([\\.\\d]+:[\\.\\d]+)\\D*$"});
        FIELD_VALUES.put(ASPECT_RATIO, ASPECT_RATIO_VALUES);
        
        PIXEL_PITCH_VALUES = new HashMap<String,String[]>();
        PIXEL_PITCH_VALUES.put(FIND_TAG, new String[] {"^\\D*([\\.\\d]+)\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D+[\\.\\d]+\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D+[\\.\\d]+\\D+[\\.\\d]+\\D*$"});
        FIELD_VALUES.put(PIXEL_PITCH, PIXEL_PITCH_VALUES);
        
        PIXEL_DENSITY_VALUES = new HashMap<String,String[]>();
        PIXEL_DENSITY_VALUES.put(FIND_TAG, new String[] {"^\\D*([\\.\\d]+)\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D+[\\.\\d]+\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D+[\\.\\d]+\\D+[\\.\\d]+\\D*$"});
        FIELD_VALUES.put(PIXEL_DENSITY, PIXEL_DENSITY_VALUES);
        
        BRIGHTNESS_VALUES = new HashMap<String,String[]>();
        BRIGHTNESS_VALUES.put(FIND_TAG, new String[] {"^\\D*([\\.\\d]+)\\D+?\\d?\\D*$","^\\D*([\\.\\d]+)\\D+?\\d?\\D+[\\.\\d]+\\D+?\\d?\\D*$","^\\D*([\\.\\d]+)\\D+?\\d?\\D+[\\.\\d]+\\D+?\\d?\\D+[\\.\\d]+\\D+?\\d?\\D*$","^\\D*([\\.\\d]+)\\D+?\\d?\\D+[\\.\\d]+\\D+?\\d?\\D+[\\.\\d]+\\D+?\\d?\\D+[\\.\\d]+\\D+?\\d?\\D*$"});
        FIELD_VALUES.put(BRIGHTNESS, BRIGHTNESS_VALUES);
        
        REMOVABLE_STAND_VALUES = new HashMap<String,String[]>();
        REMOVABLE_STAND_VALUES.put("true", new String[] {"yes","true"});
        REMOVABLE_STAND_VALUES.put("false", new String[] {"no","false"});
        FIELD_VALUES.put(REMOVABLE_STAND, REMOVABLE_STAND_VALUES);
        
        HEIGHT_ADJUSTMENT_VALUES = new HashMap<String,String[]>();
        HEIGHT_ADJUSTMENT_VALUES.put(FIND_TAG, new String[] {"^\\D*([\\.\\d]+)\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D+[\\.\\d]+\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D+[\\.\\d]+\\D+[\\.\\d]+\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D+[\\.\\d]+\\D+[\\.\\d]+\\D+[\\.\\d]+\\D*$"});
        HEIGHT_ADJUSTMENT_VALUES.put("true", new String[] {"yes","true"});
        HEIGHT_ADJUSTMENT_VALUES.put("false", new String[] {"no","false"});
        FIELD_VALUES.put(HEIGHT_ADJUSTMENT, HEIGHT_ADJUSTMENT_VALUES);
        
        PIVOT_ADJUSTMENT_VALUES = new HashMap<String,String[]>();
        PIVOT_ADJUSTMENT_VALUES.put("true", new String[] {"yes","true"});
        PIVOT_ADJUSTMENT_VALUES.put("false", new String[] {"no","false"});
        FIELD_VALUES.put(PIVOT_ADJUSTMENT, PIVOT_ADJUSTMENT_VALUES);
        
        SWIVEL_ADJUSTMENT_VALUES = new HashMap<String,String[]>();
        SWIVEL_ADJUSTMENT_VALUES.put("true", new String[] {"yes","true"});
        SWIVEL_ADJUSTMENT_VALUES.put("false", new String[] {"no","false"});
        FIELD_VALUES.put(SWIVEL_ADJUSTMENT, SWIVEL_ADJUSTMENT_VALUES);
        
        LEFT_SWIVEL_VALUES = new HashMap<String,String[]>();
        LEFT_SWIVEL_VALUES.put(FIND_TAG, new String[] {"^\\D*(\\d{1,3})\\D*$",});
        FIELD_VALUES.put(LEFT_SWIVEL, LEFT_SWIVEL_VALUES);
        
        RIGHT_SWIVEL_VALUES = new HashMap<String,String[]>();
        RIGHT_SWIVEL_VALUES.put(FIND_TAG, new String[] {"^\\D*(\\d{1,3})\\D*$",});
        FIELD_VALUES.put(RIGHT_SWIVEL, RIGHT_SWIVEL_VALUES);
        
        TILT_ADJUSTMENT_VALUES = new HashMap<String,String[]>();
        TILT_ADJUSTMENT_VALUES.put("true", new String[] {"yes","true"});
        TILT_ADJUSTMENT_VALUES.put("false", new String[] {"no","false"});
        FIELD_VALUES.put(TILT_ADJUSTMENT, TILT_ADJUSTMENT_VALUES);
        
        FORWARD_TILT_VALUES = new HashMap<String,String[]>();
        FORWARD_TILT_VALUES.put(FIND_TAG, new String[] {"^\\D*(\\d{1,3})\\D*$",});
        FIELD_VALUES.put(FORWARD_TILT, FORWARD_TILT_VALUES);
        
        BACKWARD_TILT_VALUES = new HashMap<String,String[]>();
        BACKWARD_TILT_VALUES.put(FIND_TAG, new String[] {"^\\D*(\\d{1,3})\\D*$",});
        FIELD_VALUES.put(BACKWARD_TILT, BACKWARD_TILT_VALUES);
        
        CURVATURE_VALUES = new HashMap<String,String[]>();
        CURVATURE_VALUES.put(FIND_TAG, new String[] {"^\\D*([\\.\\d]+)\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D+[\\.\\d]+\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D+[\\.\\d]+\\D+[\\.\\d]+\\D*$","^\\D*([\\.\\d]+)\\D+[\\.\\d]+\\D+[\\.\\d]+\\D+[\\.\\d]+\\D+[\\.\\d]+\\D*$"});
        CURVATURE_VALUES.put("true", new String[] {"curved","yes","true"});
        CURVATURE_VALUES.put("false", new String[] {"no","false"});
        FIELD_VALUES.put(CURVATURE, CURVATURE_VALUES);
        
        DISPLAY_AREA_VALUES = new HashMap<String,String[]>();
        DISPLAY_AREA_VALUES.put(FIND_TAG, new String[] {"^\\D*([\\.\\d]+)\\D*$"});
        FIELD_VALUES.put(DISPLAY_AREA, DISPLAY_AREA_VALUES);
        
        STATIC_CONTRAST_VALUES = new HashMap<String,String[]>();
        STATIC_CONTRAST_VALUES.put(FIND_TAG, new String[] {"^\\D*([,\\.\\d]+:[,\\.\\d]+)\\D*$","^\\D*[,\\.\\d]+:[,\\.\\d]+\\D+([,\\.\\d]+:[,\\.\\d]+)\\D*$","^\\D*[,\\.\\d]+:[,\\.\\d]+\\D+[,\\.\\d]+:[,\\.\\d]+\\D+([,\\.\\d]+:[,\\.\\d]+)\\D*$"});
        FIELD_VALUES.put(STATIC_CONTRAST, STATIC_CONTRAST_VALUES);
        
        DYNAMIC_CONTRAST_VALUES = new HashMap<String,String[]>();
        DYNAMIC_CONTRAST_VALUES.put(FIND_TAG, new String[] {"^\\D*([,\\.\\d]+:[,\\.\\d]+)\\D*$","^\\D*[,\\.\\d]+:[,\\.\\d]+\\D+([,\\.\\d]+:[,\\.\\d]+)\\D*$","^\\D*[,\\.\\d]+:[,\\.\\d]+\\D+[,\\.\\d]+:[,\\.\\d]+\\D+([,\\.\\d]+:[,\\.\\d]+)\\D*$"});
        FIELD_VALUES.put(DYNAMIC_CONTRAST, DYNAMIC_CONTRAST_VALUES);
    }
}
