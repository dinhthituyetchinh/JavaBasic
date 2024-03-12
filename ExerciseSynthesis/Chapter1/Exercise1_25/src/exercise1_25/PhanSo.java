/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_25;

/**
 *
 * @author Tuyet Chinh
 */
public class PhanSo {
    public int tuSo, mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public void nhapPS()
    {
        System.out.println("Moi ban nhap tu so: ");
        tuSo = Scan.scanner.nextInt();
        do
        {
            System.out.println("Moi ban nhap mau so: ");
            mauSo = Scan.scanner.nextInt();
            if(mauSo == 0)
            {
                System.out.println("Mẫu số phải khác 0!");
            }
        }while(mauSo == 0);
    }
    
    public void hienThiPS()
    {
        if(tuSo == 0 || mauSo == 1)
        {
            System.out.println("Phân số: "+tuSo);
        }
        else
        {
            System.out.println("Phân số: "+tuSo+"/"+mauSo);
 
        }
    }
    
    public void nghichDao()
    {
        int temp = tuSo;
        tuSo = mauSo;
        mauSo = temp;
    }
   
    public PhanSo giaTriNDPhanSo(PhanSo ps)
    {
        int temp = ps.tuSo;
        ps.tuSo = ps.mauSo;
        ps.mauSo = temp;
        return ps;
    }
    public double giaTriThuc()
    {
        return tuSo / mauSo;
    }
    
    public PhanSo congPS(PhanSo b)
    {
        PhanSo a = new PhanSo();
        a.tuSo = ((tuSo * b.mauSo) + (b.tuSo * mauSo));
        a.mauSo = mauSo * b.mauSo;
        return a;
    }
    
    public PhanSo truPS(PhanSo b)
    {
        PhanSo a = new PhanSo();
        a.tuSo = ((tuSo * b.mauSo) - (b.tuSo * mauSo));
        a.mauSo = mauSo * b.mauSo;
        return a;
    }
    
    public PhanSo tichPS(PhanSo b)
    {
        PhanSo a = new PhanSo();
        a.tuSo = tuSo * b.tuSo;
        a.mauSo = mauSo * b.mauSo;
        return a;
    }
    
    public PhanSo thuongPS(PhanSo b)
    {
        PhanSo a = new PhanSo();
        a.giaTriNDPhanSo(b);
        return a;
    }
    
     public PhanSo cong(int a)
    {
        PhanSo kq = new PhanSo();
        
        kq.tuSo = a * this.mauSo;
        kq.mauSo = this.mauSo;
        
        return congPS(kq);
    }
     
     public PhanSo tru(int a)
    {
        PhanSo kq = new PhanSo();
        
        kq.tuSo = a * this.mauSo;
        kq.mauSo = this.mauSo;
        
        return truPS(kq);
    }
    
     public PhanSo nhan(int a)
    {
        PhanSo kq = new PhanSo();
        
        kq.tuSo = a;
        kq.mauSo = 1;
        
        return tichPS(kq);
    }
     
     public PhanSo chia(int a)
    {
        PhanSo kq = new PhanSo();
        
        kq.tuSo = a;
        kq.mauSo = 1;
        
        return thuongPS(kq);
    }
     
     
}
