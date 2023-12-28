/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise02;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Tuyet Chinh
 */
public class DSThiSinh
{
    public List<ThiSinh> lst = new ArrayList<ThiSinh>();
    
    public List<ThiSinh> getListTS()
    {
        return lst;
    }
    public void setListTS(List<ThiSinh> value)
    {
        lst = value;
    }
    
    public DSThiSinh()
    {
        
    }
    public void NhapDS(int n)
    {
        ThiSinh ts = new ThiSinh();
        for(int i = 0; i < n; i++)
        {     
            ts = new ThiSinh();
            ts.Nhap();
            lst.add(ts);
            
        }
        ts.s.close();
    }   
    
    public void XuatDS()
    {
        for(ThiSinh ts: lst)
        {
            ts.Xuat();
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

            NodeList nodeList = document.getElementsByTagName("ThiSinh");

            for (int temp = 0; temp < nodeList.getLength(); temp++)
            {
                
                Node node = nodeList.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE)
                {
                    ThiSinh ts = new ThiSinh();
                    ts.setSbd(node.getChildNodes().item(1).getTextContent());
                    ts.setTen(node.getChildNodes().item(3).getTextContent());
                    ts.setNamSinh(Integer.parseInt(node.getChildNodes().item(5).getTextContent()));
                    ts.setDiemToan(Double.parseDouble(node.getChildNodes().item(7).getTextContent()));
                    ts.setDiemVan(Double.parseDouble(node.getChildNodes().item(9).getTextContent()));
                    ts.setDiemNgoaiNgu(Double.parseDouble(node.getChildNodes().item(11).getTextContent()));
                    lst.add(ts);
                    
                }
            }
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
