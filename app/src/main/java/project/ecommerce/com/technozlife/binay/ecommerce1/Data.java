package project.ecommerce.com.technozlife.binay.ecommerce1;

import android.media.Image;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by Binay on 01/10/2016.
 */

public class Data {


    public static ArrayList<Information> getData() {


        ArrayList<Information> data = new ArrayList<>();

        int images[] = {


                R.drawable.biscuits,
                R.drawable.cocacola,
                R.drawable.dalmod,
                R.drawable.kurkure,
                R.drawable.gulcose,
                R.drawable.horlicks,
                R.drawable.papad,
                R.drawable.rechargencell,
                R.drawable.rechargentc,
                R.drawable.rice,
                R.drawable.rice1,
                R.drawable.soap,
                R.drawable.soap1,
                R.drawable.sugar,
                R.drawable.sugar1,
                R.drawable.waiwai,
                R.drawable.wheel
        };
    String name[] = {
           "Biscuit","Coca Cola","Dalmod","KurKure","Gulcose","Horlicks","Papad","Recharge Ncell","Recharge Ntc","Rice","Rice1","soap",
            "Soap1","Sugar","Sugar1","Wai Wai","Wheel",
    };

   for (int i = 0 ; i<images.length;i++ ){

     /*  Information newData = new Information();
       newData.ImageId = images[i];
       newData.ptitle = name[i];
       data.add(newData);*/
   }

    return data;
    }
}

 class Information{
     public String pId;
     public Image img;
     public String ImageId;
     public String ptitle, pCategory,pBrand, pPrice, pDescription,pKeyword;

     public Information(String pId, String imageId, String ptitle, String pCategory, String pBrand, String pPrice, String pDescription, String pKeyword) {
         this.pId = pId;
         ImageId = imageId;
         this.ptitle = ptitle;
         this.pCategory = pCategory;
         this.pBrand = pBrand;
         this.pPrice = pPrice;
         this.pDescription = pDescription;
         this.pKeyword = pKeyword;
     }

     public Information(String pId, String ptitle, String imageId) {
         this.pId = pId;
         this.ptitle = ptitle;
         ImageId = imageId;
     }
     public Information(){}

     public String getpId() {
         return pId;
     }

     public void setpId(String pId) {
         this.pId = pId;
     }

     public String getPtitle() {
         return ptitle;
     }

     public void setPtitle(String ptitle) {
         this.ptitle = ptitle;
     }

     public String getpCategory() {
         return pCategory;
     }

     public void setpCategory(String pCategory) {
         this.pCategory = pCategory;
     }

     public String getpBrand() {
         return pBrand;
     }

     public void setpBrand(String pBrand) {
         this.pBrand = pBrand;
     }

     public String getpPrice() {
         return pPrice;
     }

     public void setpPrice(String pPrice) {
         this.pPrice = pPrice;
     }

     public String getpKeyword() {
         return pKeyword;
     }

     public void setpKeyword(String pKeyword) {
         this.pKeyword = pKeyword;
     }

     public String getpDescription() {
         return pDescription;
     }

     public void setpDescription(String pDescription) {
         this.pDescription = pDescription;
     }

     public String getImageId() {
         return ImageId;
     }

     public void setImageId(String imageId) {
         ImageId = imageId;
     }


 }