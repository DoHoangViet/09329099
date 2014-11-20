/***********************************************************************
 * Module:  TkbTh.java
 * Author:  VietKOR
 * Purpose: Defines the Class TkbTh
 ***********************************************************************/

import java.util.*;

/** @pdOid 6bb5a39d-3269-4f48-b176-deb1041aef72 */
public class TkbTh {
   /** @pdOid a4ed7c5f-5e40-4986-b3e8-518de58ef15e */
   public java.lang.String maTKBTh;
   /** @pdOid 23db145d-7786-4836-898b-9c3cc0af386d */
   public double soTiet;
   /** @pdOid c4af10fc-8691-45dd-b5ce-8c02001117a2 */
   public double tietBD;
   
   /** @pdRoleInfo migr=no name=LopHoc assc=relationship3 mult=0..1 side=A */
   public LopHoc lopHoc;
   /** @pdRoleInfo migr=no name=GiaoVien assc=relationship7 mult=0..1 side=A */
   public GiaoVien giaoVien;
   /** @pdRoleInfo migr=no name=PhongHoc assc=relationship9 mult=0..1 side=A */
   public PhongHoc phongHoc;
   
   
   /** @pdGenerated default parent getter */
   public LopHoc getLopHoc() {
      return lopHoc;
   }
   
   /** @pdGenerated default parent setter
     * @param newLopHoc */
   public void setLopHoc(LopHoc newLopHoc) {
      if (this.lopHoc == null || !this.lopHoc.equals(newLopHoc))
      {
         if (this.lopHoc != null)
         {
            LopHoc oldLopHoc = this.lopHoc;
            this.lopHoc = null;
            oldLopHoc.removeTkbTh(this);
         }
         if (newLopHoc != null)
         {
            this.lopHoc = newLopHoc;
            this.lopHoc.addTkbTh(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public GiaoVien getGiaoVien() {
      return giaoVien;
   }
   
   /** @pdGenerated default parent setter
     * @param newGiaoVien */
   public void setGiaoVien(GiaoVien newGiaoVien) {
      if (this.giaoVien == null || !this.giaoVien.equals(newGiaoVien))
      {
         if (this.giaoVien != null)
         {
            GiaoVien oldGiaoVien = this.giaoVien;
            this.giaoVien = null;
            oldGiaoVien.removeTkbTh(this);
         }
         if (newGiaoVien != null)
         {
            this.giaoVien = newGiaoVien;
            this.giaoVien.addTkbTh(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public PhongHoc getPhongHoc() {
      return phongHoc;
   }
   
   /** @pdGenerated default parent setter
     * @param newPhongHoc */
   public void setPhongHoc(PhongHoc newPhongHoc) {
      if (this.phongHoc == null || !this.phongHoc.equals(newPhongHoc))
      {
         if (this.phongHoc != null)
         {
            PhongHoc oldPhongHoc = this.phongHoc;
            this.phongHoc = null;
            oldPhongHoc.removeTkbTh(this);
         }
         if (newPhongHoc != null)
         {
            this.phongHoc = newPhongHoc;
            this.phongHoc.addTkbTh(this);
         }
      }
   }

}