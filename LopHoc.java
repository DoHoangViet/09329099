/***********************************************************************
 * Module:  LopHoc.java
 * Author:  VietKOR
 * Purpose: Defines the Class LopHoc
 ***********************************************************************/

import java.util.*;

/** @pdOid 5ffa4c8c-76e2-451a-a1c9-33c7b607af74 */
public class LopHoc {
   /** @pdOid 4458452d-3899-4557-be44-43935c80b9e2 */
   public java.lang.String maLop;
   /** @pdOid 3fb8481e-f62d-416b-ab9d-e3cc1bc91c38 */
   public java.lang.String tenLop;
   
   /** @pdRoleInfo migr=no name=TkbTh assc=relationship3 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TkbTh> tkbTh;
   /** @pdRoleInfo migr=no name=TkbLt assc=relationship4 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TkbLt> tkbLt;
   /** @pdRoleInfo migr=no name=MonHoc assc=relationship1 mult=0..1 side=A */
   public MonHoc monHoc;
   
   
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
         newTkbTh.setLopHoc(this);      
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
            oldTkbTh.setLopHoc((LopHoc)null);
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
            oldTkbTh.setLopHoc((LopHoc)null);
         }
      }
   }
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
         newTkbLt.setLopHoc(this);      
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
            oldTkbLt.setLopHoc((LopHoc)null);
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
            oldTkbLt.setLopHoc((LopHoc)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public MonHoc getMonHoc() {
      return monHoc;
   }
   
   /** @pdGenerated default parent setter
     * @param newMonHoc */
   public void setMonHoc(MonHoc newMonHoc) {
      if (this.monHoc == null || !this.monHoc.equals(newMonHoc))
      {
         if (this.monHoc != null)
         {
            MonHoc oldMonHoc = this.monHoc;
            this.monHoc = null;
            oldMonHoc.removeLopHoc(this);
         }
         if (newMonHoc != null)
         {
            this.monHoc = newMonHoc;
            this.monHoc.addLopHoc(this);
         }
      }
   }

}