/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_30;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author Tuyet Chinh
 */
public class DanhSachMonHoc {
    List <MonHoc> dsMH = new ArrayList();

    public DanhSachMonHoc() {
    }
    
    
    public void xuatDS()
    {
        for(MonHoc mh: dsMH)
        {
            mh.xuat();
        }
    }
    public void docFile(String file)
    {
    
        try
        {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(file);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputStream);
            
            NodeList nodeList = document.getElementsByTagName("MH");
            
            for (int i = 0; i < nodeList.getLength(); i++)
            {
                MonHoc mh;
                Element node = (Element) nodeList.item(i);
                String loai = node.getElementsByTagName("Loai").item(0).getTextContent();
                String ma = node.getElementsByTagName("Ma").item(0).getTextContent();
                String ten = node.getElementsByTagName("Ten").item(0).getTextContent();
                int tinChi = Integer.parseInt(node.getElementsByTagName("SoTc").item(0).getTextContent());

                switch (loai)
                {
                    case "DiemLT" ->
                    {
                        double tl = Double.parseDouble(node.getElementsByTagName("DiemTL").item(0).getTextContent());
                        double gk = Double.parseDouble(node.getElementsByTagName("DiemGK").item(0).getTextContent());
                        double ck = Double.parseDouble(node.getElementsByTagName("DiemCK").item(0).getTextContent());

                        mh = new MonLyThuyet(ma, ten, tinChi, tl, gk, ck);

                    }
                    case "DiemTH" ->
                    {
                        double l1 = Double.parseDouble(node.getElementsByTagName("DiemKT1").item(0).getTextContent());
                        double l2 = Double.parseDouble(node.getElementsByTagName("DiemKT2").item(0).getTextContent());
                        double l3 = Double.parseDouble(node.getElementsByTagName("DiemKT3").item(0).getTextContent());
                        double l4 = Double.parseDouble(node.getElementsByTagName("DiemKT4").item(0).getTextContent());

                        mh = new MonThucHanh(ma, ten, tinChi, l1, l2, l3, l4);
                    }                   
                    default ->
                    {
                        double gvhd = Double.parseDouble(node.getElementsByTagName("DiemGVHD").item(0).getTextContent());
                        double gvpb = Double.parseDouble(node.getElementsByTagName("DiemGVPB").item(0).getTextContent());

                        mh = new MonDoAn(ma, ten, tinChi, gvhd, gvpb);

                    }
                }
                dsMH.add(mh);
            }   
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
    }
    public double diemTichLuy()
    {
        return dsMH.stream().mapToDouble(mh -> mh.diemTB()).average().orElse(0.0);
    }

}
