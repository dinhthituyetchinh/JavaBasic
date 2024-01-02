/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

/**
 *
 * @author Tuyet Chinh
 */
public class Common 
{
    public String formatEmail(String _FullName)
    {
        //Nguyễn Văn An
        String[] arr = _FullName.split(" "); 
        int lastIndex = arr.length - 1;
        String result = arr[lastIndex];
        for(int i = 0; i < lastIndex; i ++)
        {
            result += arr[i].substring(0, 1);
        }
        return result.toLowerCase()+"@vingroup.com";
    }
}
