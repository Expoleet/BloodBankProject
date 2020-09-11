package blood;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfGState;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pdf {

    public static void main(String[] args) {
        
    }
    public  void PDF(){
        Connection con;
        ResultSet rs;
        Statement st;
       String str= "रमण";
        int i = 0;
        try {
          
            con = DriverManager.getConnection("jdbc:mysql://192.168.64.2/a", "root", "");
            st = con.createStatement();
            String sql = "select pid from donor ;";

            rs = st.executeQuery(sql);
            while (rs.next()) {
                i = rs.getInt("pid");
            }

            System.out.println("ddd   " + i);

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            // String name ="Raman";
            Document doc = new Document();
            try {
                PdfWriter.getInstance(doc, new FileOutputStream("Certificate.pdf"));
            } catch (DocumentException ex) {
                Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
            }
            doc.open();
            try {
                //   doc.add(new Paragraph(name));
                Image image = Image.getInstance("image1.jpg");

                image.setAlignment(15);
                try {

                    doc.add(image);
                } catch (DocumentException ex) {
                    Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {

                    PdfGState gs1 = new PdfGState();
                    gs1.setFillOpacity(0.5f);
                    //Font f;
                    //f = new Font(FontFamily.HELVETICA, 30);
                    //Phrase p = new Phrase("My watermark (text)", f);
                    Paragraph para = new Paragraph();
                   // String str = "Kaushal";

                    para.add("                                                                                                                           ");
                    para.add("                                                                                                                           ");
                    para.add("                                                                                                                           ");
                    para.add("                                                                                                                           ");
                    para.add("                                                                                                                           ");
                    para.add("                                                                                                                           ");
                    para.add("                                                                                                                           ");
                    para.add("                                                                                                                           ");
                    para.add("                                                                                                                           ");
                    para.add("                                                                  " + str+" (76522"+i+")");

                    para.setAlignment(10);
                    doc.add(para);
                    //  doc.add(p);

                } catch (DocumentException ex) {
                    Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (BadElementException ex) {
                Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
            }
            // doc.add(Image.getInstance());
            doc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
