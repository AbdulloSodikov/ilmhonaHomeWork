package Abdullo.ilmhona.another;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class NewClass1 {
        public int x;
        public int y;

        public void intXY (){
            System.out.println("х=" + x + "\n" + "y=" + y);

        }
        public void total (){
            System.out.println( "х+у = " + (x + y));

        }
        public void max (){
            if ( x > y){
                System.out.println("Наибольшое значение = " + x);
            }
            else {
                System.out.println("Наибольшое значение = " + y);
            }

        }

}
