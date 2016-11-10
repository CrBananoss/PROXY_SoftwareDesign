/**
 * Created by Joaquin on 11/10/2016.
 */
public class ProxyPatternDemo {

    public static void main (String[] args){
        Image image = new ProxyImage("test_image.jpg");

        //Image will load
        image.display();
        System.out.println("");

        //Image will not be loaded anymore
        image.display();
    }
}
