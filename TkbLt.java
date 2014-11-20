/***********************************************************************
 * Module:  TkbLt.java
 * Author:  VietKOR
 * Purpose: Defines the Class TkbLt
 ***********************************************************************/

import java.util.*;

/** @pdOid fa6de052-7041-4fbd-92f8-c016b7e124d9 */
public class TkbLt {
   /** @pdOid 63b949cd-c464-45aa-a91f-1e9b039b5e12 */
   public java.lang.String maTKBLt;
   /** @pdOid d71ea336-d393-4ab0-a751-c37f900f86c7 */
   public double soTiet;
   /** @pdOid 9bb5dd18-39d2-4c58-b8e7-4ef2ec8671ba */
   public double tietBD;
   
   /** @pdRoleInfo migr=no name=LopHoc assc=relationship4 mult=0..1 side=A */
   public LopHoc lopHoc;
   /** @pdRoleInfo migr=no name=PhongHoc assc=relationship5 mult=0..1 side=A */
   public PhongHoc phongHoc;
   /** @pdRoleInfo migr=no name=GiaoVien assc=relationship8 mult=0..1 side=A */
   public GiaoVien giaoVien;
   
   
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
            oldLopHoc.removeTkbLt(this);
         }
         if (newLopHoc != null)
         {
            this.lopHoc = newLopHoc;
            this.lopHoc.addTkbLt(this);
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
            oldPhongHoc.removeTkbLt(this);
         }
         if (newPhongHoc != null)
         {
            this.phongHoc = newPhongHoc;
            this.phongHoc.addTkbLt(this);
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
            oldGiaoVien.removeTkbLt(this);
         }
         if (newGiaoVien != null)
         {
            this.giaoVien = newGiaoVien;
            this.giaoVien.addTkbLt(this);
         }
      }
   }

}