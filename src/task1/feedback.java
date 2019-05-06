/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.io.IOException;
import java.io.Serializable;
import java.util.* ;
/**
  *
 * @author abdo cs
 */
public class feedback implements Serializable{
    public static ArrayList<feedback> feedbacks =new ArrayList<feedback>();
    private String words;
    private  int id;
public final String fbfilename ="feedback.bin";

    public feedback(String word,int id) {
         this.words=word;
         this.id=id;
    }
    
   filemangerbinary fmanager =new filemangerbinary();
    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
     public void setid(int id) {
        this.id = id;
    }
      public int getid() {
        return this.id;
    }
     public boolean addfeedback()  {
        
        loadFromFile();
        feedbacks.add(this);
        commitToFile("feedback.bin");
        return true;
    }
     
     public ArrayList<feedback> All(){
         loadFromFile();
         return feedbacks;
     }
     
    public boolean commitToFile(String path) {
        
          return fmanager.write( path, feedbacks);
       
    }

    public void loadFromFile() {
        
         if ( fmanager.read(fbfilename) == null) 
         {
         }
       else feedbacks = (ArrayList<feedback>) fmanager.read(fbfilename);
    }
    
}