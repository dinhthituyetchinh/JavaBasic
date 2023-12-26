/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.InputStream;
/**
 *
 * @author Tuyet Chinh
 */
public class DSGiaoVien
{
    List<GiaoVien> lst = new ArrayList<GiaoVien>();
    public List<GiaoVien> getListGV()
    {
        return lst;
    }
    public void setListGV( List<GiaoVien> value)
    {
        lst = value;
    }
    public DSGiaoVien()
    {
        
    }
    public void docFile(String file)
    {
         try {
//            File xmlFile = new File(file);
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(file);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(inputStream);

            NodeList nodeList = document.getElementsByTagName("GV");
            
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    GiaoVien gv = new GiaoVien();
                    gv.setTenGV(element.getElementsByTagName("HoTen").item(0).getTextContent());
                    gv.setSNhom(Integer.parseInt(element.getElementsByTagName("SoNhom").item(0).getTextContent()));

                    lst.add(gv);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Xử lý ngoại lệ theo yêu cầu cụ thể của bạn
        }
    }
    //Cách 1
    //    public int tongSoNhom()
    //    {
    //        int sum = 0;
    //        for(GiaoVien gv: lst)//tương đương foreach
    //        {
    //            sum += gv.getSNhom();
    //        }
    //        return sum;
    //    }
    //Cách 2
      public int tongSoNhom() {
        // Cần kiểm tra danh sách không rỗng trước khi sử dụng Stream API
        return lst.stream().mapToInt(GiaoVien::getSNhom).sum();
    }

    public void sapXepTheoTen() {
        // Sắp xếp danh sách theo tên GiaoVien
        lst.sort((gv1, gv2) -> gv1.getTenGV().compareTo(gv2.getTenGV()));
    }

    public void sapXepTheoNhom() {
        // Sắp xếp danh sách theo số nhóm giảm dần
        lst.sort((gv1, gv2) -> Integer.compare(gv2.getSNhom(), gv1.getSNhom()));
    }

    public List<GiaoVien> locSoNhom() {
        // Lọc danh sách các GiaoVien có số nhóm lớn hơn 1
        return lst.stream().filter(gv -> gv.getSNhom() > 1).toList();
    }
   
    
    public void xuatDS()
    {
        System.out.println("Danh sách giáo viên:");
        for(GiaoVien gv: lst)
        {
            gv.Xuat();
        }
    }
}
