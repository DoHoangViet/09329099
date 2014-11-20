/***********************************************************************
 * Module:  GiaoVien.java
 * Author:  VietKOR
 * Purpose: Defines the Class GiaoVien
 ***********************************************************************/

import java.util.*;

/** @pdOid 13be1829-cc85-4655-9768-ef08a30216a1 */
public class GiaoVien {
   /** @pdOid 0fa52a9a-1874-4bf3-938f-898c6d05874c */
   public java.lang.String maGV;
   /** @pdOid 9c40a041-6dcc-43d2-a751-618ca1a82928 */
   public java.lang.String tenGV;
   /** @pdOid 96d6f5c7-3e87-4b58-a128-58a633c3badf */
   public java.lang.String email;
   /** @pdOid 345d2161-4952-4abb-abd0-68fddbf487b3 */
   public int sdt;
   
   /** @pdRoleInfo migr=no name=TkbLt assc=relationship8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TkbLt> tkbLt;
   /** @pdRoleInfo migr=no name=TkbTh assc=relationship7 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TkbTh> tkbTh;
   /** @pdRoleInfo migr=no name=MonHoc assc=chiTiet coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<MonHoc> Relationship_10;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<TkbLt> getTkbLt() {
      if (tkbLt == null)
         tkbLt = new java.util.HashSet<TkbLt>();
      return tkbLt;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTkbLt() {
      if (tkbLt == null)
         tkbLt = new java.util.HashSet<TkbLt>();
      return tkbLt.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTkbLt */
   public void setTkbLt(java.util.Collection<TkbLt> newTkbLt) {
      removeAllTkbLt();
      for (java.util.Iterator iter = newTkbLt.iterator(); iter.hasNext();)
         addTkbLt((TkbLt)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTkbLt */
   public void addTkbLt(TkbLt newTkbLt) {
      if (newTkbLt == null)
         return;
      if (this.tkbLt == null)
         this.tkbLt = new java.util.HashSet<TkbLt>();
      if (!this.tkbLt.contains(newTkbLt))
      {
         this.tkbLt.add(newTkbLt);
         newTkbLt.setGiaoVien(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTkbLt */
   public void removeTkbLt(TkbLt oldTkbLt) {
      if (oldTkbLt == null)
         return;
      if (this.tkbLt != null)
         if (this.tkbLt.contains(oldTkbLt))
         {
            this.tkbLt.remove(oldTkbLt);
            oldTkbLt.setGiaoVien((GiaoVien)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTkbLt() {
      if (tkbLt != null)
      {
         TkbLt oldTkbLt;
         for (java.util.Iterator iter = getIteratorTkbLt(); iter.hasNext();)
         {
            oldTkbLt = (TkbLt)iter.next();
            iter.remove();
            oldTkbLt.setGiaoVien((GiaoVien)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<TkbTh> getTkbTh() {
      if (tkbTh == null)
         tkbTh = new java.util.HashSet<TkbTh>();
      return tkbTh;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTkbTh() {
      if (tkbTh == null)
         tkbTh = new java.util.HashSet<TkbTh>();
      return tkbTh.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTkbTh */
   public void setTkbTh(java.util.Collection<TkbTh> newTkbTh) {
      removeAllTkbTh();
      for (java.util.Iterator iter = newTkbTh.iterator(); iter.hasNext();)
         addTkbTh((TkbTh)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTkbTh */
   public void addTkbTh(TkbTh newTkbTh) {
      if (newTkbTh == null)
         return;
      if (this.tkbTh == null)
         this.tkbTh = new java.util.HashSet<TkbTh>();
      if (!this.tkbTh.contains(newTkbTh))
      {
         this.tkbTh.add(newTkbTh);
         newTkbTh.setGiaoVien(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTkbTh */
   public void removeTkbTh(TkbTh oldTkbTh) {
      if (oldTkbTh == null)
         return;
      if (this.tkbTh != null)
         if (this.tkbTh.contains(oldTkbTh))
         {
            this.tkbTh.remove(oldTkbTh);
            oldTkbTh.setGiaoVien((GiaoVien)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTkbTh() {
      if (tkbTh != null)
      {
         TkbTh oldTkbTh;
         for (java.util.Iterator iter = getIteratorTkbTh(); iter.hasNext();)
         {
            oldTkbTh = (TkbTh)iter.next();
            iter.remove();
            oldTkbTh.setGiaoVien((GiaoVien)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<MonHoc> getRelationship_10() {
      if (Relationship_10 == null)
         Relationship_10 = new java.util.HashSet<MonHoc>();
      return Relationship_10;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRelationship_10() {
      if (Relationship_10 == null)
         Relationship_10 = new java.util.HashSet<MonHoc>();
      return Relationship_10.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRelationship_10 */
   public void setRelationship_10(java.util.Collection<MonHoc> newRelationship_10) {
      removeAllRelationship_10();
      for (java.util.Iterator iter = newRelationship_10.iterator(); iter.hasNext();)
         addRelationship_10((MonHoc)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMonHoc */
   public void addRelationship_10(MonHoc newMonHoc) {
      if (newMonHoc == null)
         return;
      if (this.Relationship_10 == null)
         this.Relationship_10 = new java.util.HashSet<MonHoc>();
      if (!this.Relationship_10.contains(newMonHoc))
      {
         this.Relationship_10.add(newMonHoc);
         newMonHoc.addRelationship_10(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldMonHoc */
   public void removeRelationship_10(MonHoc oldMonHoc) {
      if (oldMonHoc == null)
         return;
      if (this.Relationship_10 != null)
         if (this.Relationship_10.contains(oldMonHoc))
         {
            this.Relationship_10.remove(oldMonHoc);
            oldMonHoc.removeRelationship_10(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRelationship_10() {
      if (Relationship_10 != null)
      {
         MonHoc oldMonHoc;
         for (java.util.Iterator iter = getIteratorRelationship_10(); iter.hasNext();)
         {
            oldMonHoc = (MonHoc)iter.next();
            iter.remove();
            oldMonHoc.removeRelationship_10(this);
         }
      }
   }

}