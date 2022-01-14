/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobileworkshop;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.Serializable;

public class Customer extends Member implements Serializable {
   
private    String Name;
private String Car_registration_no;
private String Car_model;
private String E_mail;

private   Boolean checkMechanicIsFree;
    Image ImageOfCar= new Image() {
        @Override
        public int getWidth(ImageObserver io) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getHeight(ImageObserver io) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public ImageProducer getSource() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Graphics getGraphics() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object getProperty(String string, ImageObserver io) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
private   Boolean ConfirmationOfPickup;
 private    String locationOfPickup;
 private   String noteForPickUp;
  private  String  SendMessageToMechanic;
 private  String GetMessageFromMechanic;
 private   String  SendMessageToStoreManager;
 private  String GetMessageFromStoreManager;

  
    
    
    
    
    
    public void signup (String Position,String Name, String Car_model, String E_mail) {}
    
    

    public void setImageOfCar(Image ImageOfCar) {
        this.ImageOfCar = ImageOfCar;
    }

    public void setConfirmationOfPickup(Boolean ConfirmationOfPickup) {
        this.ConfirmationOfPickup = ConfirmationOfPickup;
    }

    public void setLocationOfPickup(String locationOfPickup) {
        this.locationOfPickup = locationOfPickup;
    }

    public void setNoteForPickUp(String noteForPickUp) {
        this.noteForPickUp = noteForPickUp;
    }

    public void setSendMessageToMechanic(String SendMessageToMechanic) {
        this.SendMessageToMechanic = SendMessageToMechanic;
    }

    public void setSendMessageToStoreManager(String SendMessageToStoreManager) {
        this.SendMessageToStoreManager = SendMessageToStoreManager;
    }

    
    
    
    public Boolean getCheckMechanicIsFree() {
        return checkMechanicIsFree;
    }

    public Boolean getConfirmationOfPickup() {
        return ConfirmationOfPickup;
    }

    public String getGetMessageFromMechanic() {
        return GetMessageFromMechanic;
    }

    public String getGetMessageFromStoreManager() {
        return GetMessageFromStoreManager;
    }


    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCar_registration_no(String Car_registration_no) {
        this.Car_registration_no = Car_registration_no;
    }

    public void setCar_model(String Car_model) {
        this.Car_model = Car_model;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public String getName() {
        return Name;
    }

    public String getCar_registration_no() {
        return Car_registration_no;
    }

    public String getCar_model() {
        return Car_model;
    }

    public String getE_mail() {
        return E_mail;
    }
}
