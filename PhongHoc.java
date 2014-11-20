/***********************************************************************
 * Module:  PhongHoc.java
 * Author:  VietKOR
 * Purpose: Defines the Class PhongHoc
 ***********************************************************************/

import java.util.*;

/** @pdOid 29f85194-6f51-433b-9ffe-2ae5ba44cdbc */
public class PhongHoc {
   /** @pdOid 99aee4f0-4edf-4195-8c32-8ca2ce310de7 */
   public java.lang.String maPhong;
   /** @pdOid c71aeed3-5367-4016-b452-9c9b0dcfd11c */
   public java.lang.String tenPhong;
   
   /** @pdRoleInfo migr=no name=TkbLt assc=relationship5 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TkbLt> tkbLt;
   /** @pdRoleInfo migr=no name=TkbTh assc=relationship9 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<TkbTh> tkbTh;
   
   
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
         newTkbLt.setPhongHoc(this);      
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
            oldTkbLt.setPhongHoc((PhongHoc)null);
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
            oldTkbLt.setPhongHoc((PhongHoc)null);
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
         newTkbTh.setPhongHoc(this);      
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
            oldTkbTh.setPhongHoc((PhongHoc)null);
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
            oldTkbTh.setPhongHoc((PhongHoc)null);
         }
      }
   }

}