module Image {
    requires java.desktop;
    requires software.amazon.awssdk.auth;
    requires org.slf4j;
    requires software.amazon.awssdk.core;
    requires software.amazon.awssdk.services.rekognition;
    requires software.amazon.awssdk.regions;
    exports org.example.service;
}