package blood;
import com.itextpdf.text.Element;
import java.io.FileOutputStream;

import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfAnnotation;
import com.itextpdf.text.pdf.PdfBorderArray;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfDestination;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

public class Pdfsignadd {

    public static void main(String[] args) {
        try{
////            Document document = new Document();
////            String str="/Users/harmeshrana/Downloads/high.pdf";
////        PdfWriter.getInstance(document, new FileOutputStream(str));
////        document.open();
////        Image img = Image.getInstance("sign.jpeg");
////       // document.add(new Paragraph("Sample 1: This is simple image demo."));
////        document.add(img);
////        document.close();
////        System.out.println("Done");
String dest="high.pdf";
String src="formal.pdf";
//
////PdfDocument pdfDoc = new PdfDocument(new PdfReader("formal.pdf"), new PdfWriter(str));
////        Document doc = new Document();
////       PdfReader pdfReader = new PdfReader("formal.pdf");
//         //PdfWriter.getInstance(pdfReader, new FileOutputStream(str));
//         PdfDocument pdfDoc = new PdfDocument(str); 
//         
//        
//          Image image = Image.getInstance("sign.jpeg");
//          
//
//                image.setAlignment(15);
//                PdfGState gs1 = new PdfGState();
//                    gs1.setFillOpacity(0.5f);
//                    Paragraph para = new Paragraph();
//                    para.add(image);
//                    para.setAlignment(10);
//                    doc.add(para);
//                    doc.close();


 PdfReader reader = new PdfReader(src);
    PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(dest));
   // document doc=new dcoument();
            
    Image img = Image.getInstance("sign.png");
    float x = 60;
    float y = 120;
    float w = img.getScaledWidth();
    float h = img.getScaledHeight();
    img.scalePercent(10, 20);
    img.setRotationDegrees(90);
    img.setAbsolutePosition(x, y);
    
    stamper.getOverContent(1).addImage(img);
            System.out.println(w);
            System.out.println(h);
            
    Rectangle linkLocation = new Rectangle(x, y, x + w, y + h);
    PdfDestination destination = new PdfDestination(PdfDestination.FIT);
    PdfAnnotation link = PdfAnnotation.createLink(stamper.getWriter(),
            linkLocation, PdfAnnotation.HIGHLIGHT_INVERT,
            reader.getNumberOfPages(), destination);
    link.setBorder(new PdfBorderArray(0, 0, 0));
    stamper.addAnnotation(link, 1);
          PdfContentByte canvas=stamper.getOverContent(1);
            ColumnText.showTextAligned(canvas, Element.ALIGN_LEFT, new Phrase("Diary no : /cse/06/02/2020"), x, 80, 0);
    stamper.close();
//    PdfReader pdfReader1 = new PdfReader("formal.pdf");
//    PdfStamper pds=new PdfStamper(pdfReader1,new FileOutputStream("formal1.pdf"));
//      pds.setRotateContents(false);

          //  pds.close();
   
 
        }
        catch(Exception e){
            System.out.println(e);
        
        }
        
    }
    
}
