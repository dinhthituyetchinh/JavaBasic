/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_31;


import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.InputStream;
/**
 *
 * @author Tuyet Chinh
 */
public class DSBatDongSan {
    private List<BatDongSan> dsbds = new ArrayList<>();

    public DSBatDongSan()
    {

    }

    public void docFile(String file)
    {
    
        try
        {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(file);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputStream);
            
            NodeList nodeList = document.getElementsByTagName("BDS");
            
            for (int i = 0; i < nodeList.getLength(); i++)
            {
                BatDongSan batDongSan;
                Element node = (Element) nodeList.item(i);
                String loai = node.getElementsByTagName("Loai").item(0).getTextContent();
                String ma = node.getElementsByTagName("Ma").item(0).getTextContent();
                float dai = Float.parseFloat(node.getElementsByTagName("Dai").item(0).getTextContent());
                float rong = Float.parseFloat(node.getElementsByTagName("Rong").item(0).getTextContent());

                switch (loai)
                {
                    case "DatTrong" -> batDongSan = new DatTrong(ma, dai, rong);
                    case "NhaO" ->
                    {
                        int lau = Integer.parseInt(node.getElementsByTagName("SoLau").item(0).getTextContent());
                        batDongSan = new NhaO(ma, dai, rong, lau);
                    }
                    case "KhachSan" -> {
                        int sao = Integer.parseInt(node.getElementsByTagName("SoSao").item(0).getTextContent());
                        batDongSan = new KhachSan(ma, dai, rong, sao);
                    }
                    default -> batDongSan = new BietThu(ma, dai, rong);
                }
                dsbds.add(batDongSan);
            }
   
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
    }

    public void xuatDSBDS() {
        for (BatDongSan batDongSan : dsbds) {
            batDongSan.xuat();
        }
    }

    public double tongGiaTriBDS() {
        return dsbds.stream().mapToDouble(BatDongSan::giaTri).sum();
    }

    public double tinhTongGiaTri() {
        double tong = 0;
        for (BatDongSan bds : dsbds) {
            tong += bds.giaTri();
        }
        return tong;
    }

    public double tongPhiKD() {
        double tong = 0;
        for (BatDongSan bds : dsbds) {
            if (bds instanceof PhiKinhDoanh) {
                PhiKinhDoanh t = (PhiKinhDoanh) bds;
                tong += t.phiKinhDoanh();
            }
        }
        return tong;
    }
}
