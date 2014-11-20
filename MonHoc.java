/***********************************************************************
 * Module:  MonHoc.java
 * Author:  VietKOR
 * Purpose: Defines the Class MonHoc
 ***********************************************************************/

import java.util.*;

/** @pdOid 86aaacda-a5d8-4255-84c4-4b96ea4fca48 */
public class MonHoc {
   /** @pdOid 6cdc7271-99fb-4528-9042-9ab060dbd5ce */
   public java.lang.String maMon;
   /** @pdOid 185aa94c-be31-4c52-b9db-908ac6a08929 */
   public java.lang.String tenMon;
   /** @pdOid ad1795a2-0d61-45eb-89c6-cda03673d154 */
   public double soTC;
   
   /** @pdRoleInfo migr=no name=GiaoVien assc=chiTiet coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<GiaoVien> Relationship_10;
   /** @pdRoleInfo migr=no name=LopHoc assc=relationship1 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<LopHoc> lopHoc;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<GiaoVien> getRelationship_10() {
      if (Relationship_10 == null)
         Relationship_10 = new java.util.HashSet<GiaoVien>();
      return Relationship_10;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRelationship_10() {
      if (Relationship_10 == null)
         Relationship_10 = new java.util.HashSet<GiaoVien>();
      return Relationship_10.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRelationship_10 */
   public void setRelationship_10(java.util.Collection<GiaoVien> newRelationship_10) {
      removeAllRelationship_10();
      for (java.util.Iterator iter = newRelationship_10.iterator(); iter.hasNext();)
         addRelationship_10((GiaoVien)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGiaoVien */
   public void addRelationship_10(GiaoVien newGiaoVien) {
      if (newGiaoVien == null)
         return;
      if (this.Relationship_10 == null)
         this.Relationship_10 = new java.util.HashSet<GiaoVien>();
      if (!this.Relationship_10.contains(newGiaoVien))
      {
         this.Relationship_10.add(newGiaoVien);
         newGiaoVien.addRelationship_10(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldGiaoVien */
   public void removeRelationship_10(GiaoVien oldGiaoVien) {
      if (oldGiaoVien == null)
         return;
      if (this.Relationship_10 != null)
         if (this.Relationship_10.contains(oldGiaoVien))
         {
            this.Relationship_10.remove(oldGiaoVien);
            oldGiaoVien.removeRelationship_10(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRelationship_10() {
      if (Relationship_10 != null)
      {
         GiaoVien oldGiaoVien;
         for (java.util.Iterator iter = getIteratorRelationship_10(); iter.hasNext();)
         {
            oldGiaoVien = (GiaoVien)iter.next();
            iter.remove();
            oldGiaoVien.removeRelationship_10(this);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<LopHoc> getLopHoc() {
      if (lopHoc == null)
         lopHoc = new java.util.HashSet<LopHoc>();
      return lopHoc;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorLopHoc() {
      if (lopHoc == null)
         lopHoc = new java.util.HashSet<LopHoc>();
      return lopHoc.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newLopHoc */
   public void setLopHoc(java.util.Collection<LopHoc> newLopHoc) {
      removeAllLopHoc();
      for (java.util.Iterator iter = newLopHoc.iterator(); iter.hasNext();)
         addLopHoc((LopHoc)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newLopHoc */
   public void addLopHoc(LopHoc newLopHoc) {
      if (newLopHoc == null)
         return;
      if (this.lopHoc == null)
         this.lopHoc = new java.util.HashSet<LopHoc>();
      if (!this.lopHoc.contains(newLopHoc))
      {
         this.lopHoc.add(newLopHoc);
         newLopHoc.setMonHoc(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldLopHoc */
   public void removeLopHoc(LopHoc oldLopHoc) {
      if (oldLopHoc == null)
         return;
      if (this.lopHoc != null)
         if (this.lopHoc.contains(oldLopHoc))
         {
            this.lopHoc.remove(oldLopHoc);
            oldLopHoc.setMonHoc((MonHoc)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllLopHoc() {
      if (lopHoc != null)
      {
         LopHoc oldLopHoc;
         for (java.util.Iterator iter = getIteratorLopHoc(); iter.hasNext();)
         {
            oldLopHoc = (LopHoc)iter.next();
            iter.remove();
            oldLopHoc.setMonHoc((MonHoc)null);
         }
      }
   }

}