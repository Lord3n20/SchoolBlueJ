
/**
 * Beschreiben Sie hier die Klasse Start.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import basis.*;
import java.awt.Color;
public class Start{
    private Fenster window;
    private IgelStift pen;
    private Maus mouse;
    private Tastatur keys;
    public void main (){
        window = new Fenster("Enzo ist richtig schlecht im Coding mit Java", 960,510);
        pen = new IgelStift();
        window.setzeHintergrundFarbe(Color.BLACK);
        pen.bewegeBis(30,40);
        pen.setzeFarbe(Color.WHITE);
        mouse = new Maus();
        keys = new Tastatur();
        dreieck();
        koords();
        nikolaus();
        sechseck();
        rechteck();
        malen();
    }

    void dreieck(){
        pen.runter();
        int x = 3;
        while(x!=0){
            pen.bewegeUm(20);
            pen.dreheUm(120);
            x-=1;
        }
        pen.hoch();
        pen.bewegeBis(50,75);
    }

    void koords(){
        pen.runter();
        pen.bewegeBis(0,75);
        pen.bewegeBis(25,75);
        pen.bewegeBis(25,50);
        pen.bewegeBis(20,55);
        pen.bewegeBis(30,55);
        pen.bewegeBis(25,50);
        pen.bewegeBis(25,100);
        pen.hoch();
        pen.bewegeBis(50,75);
        pen.runter();
        pen.bewegeBis(45,70);
        pen.bewegeBis(45,80);
        pen.bewegeBis(50,75);
        pen.hoch();
        pen.bewegeBis(100,75);
    }

    void nikolaus(){
        pen.runter();
        pen.dreheUm(90);
        pen.bewegeUm(15);
        pen.dreheUm(315);
        pen.bewegeUm(15);
        pen.dreheUm(270);
        pen.bewegeUm(15);
        pen.dreheUm(225);
        pen.bewegeUm(20);
        pen.dreheUm(143);
        pen.bewegeUm(25);
        pen.dreheUm(127);
        pen.bewegeUm(15);
        pen.dreheUm(127);
        pen.bewegeUm(25);
        pen.dreheUm(143);
        pen.bewegeUm(20);
        pen.hoch();
    }

    void sechseck(){
        int x = 6;
        pen.bewegeBis(150,150);
        while(x!=0){
            pen.dreheUm(-60);
            nikolaus();
            x-=1;
        }
        pen.hoch();
        pen.bewegeBis(200,100);
    }

    void rechteck(){
        pen.zeichneRechteck(240,120);
        pen.zeichneRechteck(240,60);
        pen.zeichneRechteck(160,120);
        pen.zeichneRechteck(80,120); //Rechteck x=80 y=60
        pen.bewegeBis(240,130);
        pen.dreheBis(0);
        stern();
        pen.bewegeBis(240,190);
        pen.dreheBis(0);
        kreis(240,190);
        pen.bewegeBis(320,130);
        pen.dreheBis(0);
        BAUM();
        pen.bewegeBis(320,190);
        pen.dreheBis(0);
        stern();
        pen.bewegeBis(400,130);
        pen.dreheBis(45);
        kreis(400,130);
        pen.bewegeBis(400,190);
        pen.dreheBis(0);
        BAUM();
    }

    void stern(){
        pen.dreheUm(90);
        pen.bewegeUm(2);
        pen.dreheUm(90);
        pen.bewegeUm(10);
        pen.runter();
        pen.dreheUm(-120);
        int x=6;
        while(x!=0){
            pen.dreheUm(60);
            pen.bewegeUm(10);
            pen.dreheUm(-120);
            pen.bewegeUm(10);
            x-=1;
        }
        pen.hoch();
    }

    void kreis(int woX, int woY){
        pen.kreis(woX, woY, 20);
        pen.runter();
        int x= 4;
        while(x!=0){
            pen.bewegeUm(20);
            pen.dreheUm(180);
            pen.bewegeUm(20);
            pen.dreheUm(90);
            x-=1;
        }
        pen.hoch();
    }

    void BAUM() {
        pen.dreheUm(90);
        pen.bewegeUm(20);
        pen.runter();
        pen.dreheUm(150);
        pen.bewegeUm(35);
        pen.dreheUm(120); //unten:
        pen.bewegeUm(15); //stumpf
        pen.dreheUm(-90);
        pen.bewegeUm(7);
        pen.dreheUm(90);
        pen.bewegeUm(5);
        pen.dreheUm(90);
        pen.bewegeUm(7);
        pen.dreheUm(-90);
        pen.bewegeUm(15);
        pen.dreheUm(-240);
        pen.bewegeUm(35);
        pen.hoch();
    }

    void farbkasten(int y){
        int x = 1;
        int z = y;
        pen.dreheBis(0);
        pen.bewegeBis(940,10);
        pen.setzeFarbe(Color.WHITE);
        pen.zeichneRechteck(12,51);
        pen.bewegeUm(10);
        pen.dreheBis(-90);
        while(x!=6){
            while(y!=0){
                if(x==1){pen.setzeFarbe(Color.WHITE);}
                if(x==2){pen.setzeFarbe(Color.BLACK);}
                if(x==3){pen.setzeFarbe(Color.RED);}
                if(x==4){pen.setzeFarbe(Color.GREEN);}
                if(x==5){pen.setzeFarbe(Color.BLUE);}
                pen.zeichneRechteck(y,y);
                y-=1;

            }
            x+=1;
            pen.bewegeUm(10);
            y=z;
        }
        pen.setzeFarbe(Color.WHITE);
    }

    void aktuelleFarbe(int x){
        pen.dreheBis(-90);
        pen.hoch();
        int y = 7;
        pen.bewegeBis(950,70);
        while(y!=0){
            if(x==1){pen.setzeFarbe(Color.WHITE);}
            if(x==2){pen.setzeFarbe(Color.BLACK);}
            if(x==3){pen.setzeFarbe(Color.RED);}
            if(x==4){pen.setzeFarbe(Color.GREEN);}
            if(x==5){pen.setzeFarbe(Color.BLUE);}
            pen.zeichneRechteck(y,y);
            y-=1;
        }
        pen.hoch();
    }

    void farbAuswahl(int farbe){
        pen.hoch();
        if(farbe==1){pen.setzeFarbe(Color.WHITE);}
        if(farbe==2){pen.setzeFarbe(Color.BLACK);}
        if(farbe==3){pen.setzeFarbe(Color.RED);}
        if(farbe==4){pen.setzeFarbe(Color.GREEN);}
        if(farbe==5){pen.setzeFarbe(Color.BLUE);}
        aktuelleFarbe(farbe);
    }

    void malen(){
        int farbe=1;
        farbAuswahl(farbe);
        farbkasten(9);
        while(!mouse.istRechtsGedrueckt()){
            //if(keys.zeichen() == 'p'){
            //    farbe+=1;
            //    if(farbe==6){;farbe=1;}
            //    farbAuswahl(farbe);
            //}
            while(mouse.istGedrueckt()){
                if(mouse.hPosition() >= 930){
                    pen.hoch();
                    int mausX = mouse.vPosition();
                    if(mausX <= 10 && mausX >= 20){farbe=1;}
                    if(mausX <= 20 && mausX >= 30){farbe=2;}
                    if(mausX <= 30 && mausX >= 40){farbe=3;}
                    if(mausX <= 40 && mausX >= 50){farbe=4;}
                    if(mausX <= 50 && mausX >= 60){farbe=5;}
                    farbAuswahl(farbe);
                    pen.hoch();
                } else {
                    pen.runter();
                    pen.bewegeBis(mouse.hPosition(),mouse.vPosition());
                    int x = 5;
                    if(farbe==2){while(x!=0){pen.zeichneKreis(x);x-=1;}}
                }
            }
            pen.hoch();
            pen.bewegeBis(mouse.hPosition(),mouse.vPosition());
        }
        pen.gibFrei();
    }
}
