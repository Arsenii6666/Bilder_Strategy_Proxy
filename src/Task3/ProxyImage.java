package Task3;

import javax.swing.*;

public class ProxyImage implements MyImage{
    private RealImage realImage;
    private String filename;
    public ProxyImage(String filename){
        this.filename=filename;
    }
    public void display() {
        if (realImage.equals(null)){
            realImage=new RealImage(filename);
        }
        realImage.display();
    }
}
