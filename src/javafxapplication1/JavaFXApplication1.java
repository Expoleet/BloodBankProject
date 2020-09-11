package javafxapplication1;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

class FTPUploader {

    FTPClient ftp = null;
    public static String ad;

    public FTPUploader(String host, String user, String pwd) throws Exception {
        ftp = new FTPClient();
        ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
        int reply;
        ftp.connect(host);
        reply = ftp.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)) {
            ftp.disconnect();
            throw new Exception("Exception in connecting to FTP Server");
        }
        ftp.login(user, pwd);
        ftp.setFileType(FTP.BINARY_FILE_TYPE);
        ftp.enterLocalPassiveMode();
    }

    /*
        public FTPUploader() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }*/
    public void uploadFile(String localFileFullName, String fileName, String hostDir)
            throws Exception {
        try (InputStream input = new FileInputStream(new File(localFileFullName))) {
            this.ftp.storeFile(hostDir + fileName, input);
        }
    }

    public void disconnect() throws IOException {
        if (this.ftp.isConnected()) {
            this.ftp.logout(); // do nothing as file is already saved to server
            this.ftp.disconnect();
        }
    }

    /*public static void main(String[] args) throws Exception {
        //addr add = new addr();
        
        
        
        System.out.println("Start");
        FTPUploader ftpUploader = new FTPUploader("ftp.epizy.com", "epiz_21013659", "r05hr05h");
        // FTPUploader ftpp =new FTPUploader();
        //FTP server path is relative. So if FTP account HOME directory is "/home/pankaj/public_html/" and you need to upload
        // files to "/home/pankaj/public_html/wp-content/uploads/image2/", you should pass directory parameter as "/wp-content/uploads/image2/"
        //homeblood.dname.getText();
        String addr="E:/rana.txt";
        String filename="rana";
        String uploadaddr="/htdocs/uploads/";
        String full=""+uploadaddr+""+filename+".txt";
        ftpUploader.ad=full;
        ftpUploader.uploadFile(addr, filename ,uploadaddr );
        ftpUploader.disconnect();
        System.out.println("Done");
        }*/
}

public class JavaFXApplication1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        //FTPUploader ftpp = new FTPUploader();
        //String webb =ad;
        try {
//            FTPUploader ftpUploader = new FTPUploader("ftp.epizy.com", "epiz_21013659", "r05hr05h");
//        ß∂    String addr = "/Users/harmeshrana/Desktop/BloodBankProject/BloodBankProject/Certificate.pdf";
//            String filename = "r4.pdf";
//            String uploadaddr = "/htdocs/uploads/";
//            String s = "uploads/";
//            String full = "http://www.technicalleet.blog/" + s + "" + filename;
//            //ftpUploader.ad=full;
//            ftpUploader.uploadFile(addr, filename, uploadaddr);
//            ftpUploader.disconnect();
String full="35 chutiya hahi";
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            String myWeb = full;
            int width = 300;
            int height = 300;
            BufferedImage bufferedImage = null;
            try {
                BitMatrix byteMatrix = qrCodeWriter.encode(myWeb, BarcodeFormat.QR_CODE, width, height);
                bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                bufferedImage.createGraphics();

                Graphics2D graphics = (Graphics2D) bufferedImage.getGraphics();
                graphics.setColor(Color.WHITE);
                graphics.fillRect(0, 0, width, height);
                graphics.setColor(Color.BLACK);

                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        if (byteMatrix.get(i, j)) {
                            graphics.fillRect(i, j, 1, 1);
                        }
                    }
                }
                System.out.println("Success...");
            } catch (WriterException ex) {
                Logger.getLogger(JavaFXApplication1.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageView qrView = new ImageView();
            qrView.setImage(SwingFXUtils.toFXImage(bufferedImage, null));

            StackPane root = new StackPane();
            root.getChildren().add(qrView);

            Scene scene = new Scene(root, 350, 350);

            primaryStage.setTitle("Scan This QR Code");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        //FTPUploader ftp =new FTPUploader();
        launch(args);
        /*   FTPUploader ftp = new FTPUploader();
     String webb = ftp.ad;
        System.out.println(webb);*/

    }

    public void start(Class<JavaFXApplication1> aClass) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
