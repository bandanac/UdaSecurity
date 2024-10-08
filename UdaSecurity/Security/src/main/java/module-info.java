module Security {
    requires java.desktop;
    requires com.google.gson;
    requires com.google.common;
    requires java.prefs;
    requires Image;
    requires com.miglayout.swing;
    opens org.example.data to com.google.gson;
}