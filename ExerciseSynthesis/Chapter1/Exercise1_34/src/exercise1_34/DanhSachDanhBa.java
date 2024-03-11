/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_34;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
public class DanhSachDanhBa {
    List<QuanLyDanhBa> dsDB = new ArrayList<QuanLyDanhBa>();

    public DanhSachDanhBa() {
    }
    
    public void nhapDS(int n)
    {
        for(int i = 0; i < n; i++)
        {
            QuanLyDanhBa danhBa = new QuanLyDanhBa();
            danhBa.nhapDanhBa();
            dsDB.add(danhBa);
        }
    }
    
    public void xuatDS()
    {
        for(QuanLyDanhBa danhBa : dsDB)
        {
            danhBa.xuatDanhBa();
        }
    }
    
   public void docFile(String file)
   {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(file);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(inputStream);
            
            
            NodeList nodeList = doc.getElementsByTagName("DanhBa");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element node = (Element) nodeList.item(i);
                QuanLyDanhBa danhBa = new QuanLyDanhBa();
                danhBa.setTen(node.getElementsByTagName("Ten").item(0).getTextContent());
                danhBa.setPhone(node.getElementsByTagName("Phone").item(0).getTextContent());
                
                dsDB.add(danhBa);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
   
   
   public void ghiFile(String filePath)
   {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))
        {
            for (QuanLyDanhBa danhBa : dsDB)
            {
                // Ghi thông tin của mỗi danh bạ vào file, mỗi dòng tương ứng với một danh bạ
                writer.write("Tên: " + danhBa.getTen() + ", Phone: " + danhBa.getPhone());
                writer.newLine(); // Thêm dòng mới sau mỗi dữ liệu
            }
            System.out.println("Dữ liệu đã được ghi thành công!");
        } catch (IOException e)
        {
            e.printStackTrace();
        }
   }
}
