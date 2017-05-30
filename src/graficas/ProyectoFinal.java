package graficas;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProyectoFinal extends JFrame{
    public ProyectoFinal(){
        add(new NewPanel());
    }  

    public static void main(String[] args) {
        ProyectoFinal frame = new ProyectoFinal();
        frame.setTitle("TestPaintComponent");
        frame.setSize(538,410);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }      

}   

class NewPanel extends JPanel implements ActionListener, MouseListener {        
    private Timer time;
    private URL url = null;
    private int x1,x = 10,dirx = 10,diry = 0,y = 0, re, cx=100 , cy=100, score, con = 5 , ser = 0 , k, j, i=4, son, vel=100;
    Random ale = new Random();
    ArrayList<Integer> punX = new ArrayList();
    ArrayList<Integer> punY = new ArrayList();
    @Override
    
    public void mouseClicked(MouseEvent e) {
        Point p = e.getPoint();
        time.start();
        if(x1==0){
            if(getBounds().contains(p)){
                x1 = 1;
            }
            if(get1().contains(p)){
                x1 = 3;
            }
        }
        if(x1==1){
            
            re = x1;
            if(get2().contains(p)){
                x1 = 0;
            }
            if(get3().contains(p)){
                x1 = 2;
            }
            if(get4().contains(p)){
                x1 = 3;
            }
        }
        if(x1==2){
            re = x1;
            if(get2().contains(p)){
                x1 = 0;
            }
            if(get4().contains(p)){
                x1 = 3;
            }
            
        }
        if(x1==3){
            if(getV1().contains(p)){
                time.setDelay(500);
            }
            if(getV5().contains(p)){
                time.setDelay(200);
            }
            if(getV10().contains(p)){
                time.setDelay(50);
            }
            if(get2().contains(p)){
                x1 = 0;
            }
            if(getcontinueJ().contains(p)){
                x1 = re;
            }
            if(getSonido().contains(p)){
                son = 1;
             try {
                 url = new URL("file:ball_1.wav");
                 AudioClip ac = Applet.newAudioClip(url);
                 ac.play();
             } catch (MalformedURLException ex) {
                 Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(getNotson().contains(p)){
                son = 2;
            }
        }
        if(x1==5){
            if(getAga().contains(p)){
                x1 = 0;
            }
        }
    }

    private boolean checkCollisions() {
        Rectangle pie5 = this.get5();
        Rectangle pie6 = this.get6();
        Rectangle pie7 = this.get7();
        Rectangle pie8 = this.get8();
        
        Rectangle man1 = new Rectangle(dirx+120, 150+diry, 10, 10);
        boolean t = false;
        if(man1.intersects(pie6)||man1.intersects(pie7)||man1.intersects(pie5)||man1.intersects(pie8)){
            t = true;
        }
        return t;
    }

    private boolean checkCollision() {
        Rectangle pie5 = this.get5();
        Rectangle pie6 = this.get6();
        Rectangle pie7 = this.get7();
        Rectangle pie8 = this.get8();
        Rectangle pie9 = this.get9();
        Rectangle pie10 = this.get10();
        Rectangle pie11 = this.get11();
        Rectangle pie12 = this.get12();
        Rectangle pie13 = this.get13();
        Rectangle pie14 = this.get14();
        Rectangle pie15 = this.get15();
        Rectangle pie16 = this.get16();
        Rectangle pie17 = this.get17();
        Rectangle pie18 = this.get18();
        Rectangle pie19 = this.get19();
        Rectangle pie20 = this.get20();
        Rectangle pie21 = this.get21();
        Rectangle man1 = new Rectangle(dirx+120, 150+diry, 10, 10);
        boolean t2 = false;
        if(man1.intersects(pie6)||man1.intersects(pie7)||man1.intersects(pie5)||man1.intersects(pie8)||man1.intersects(pie9)||man1.intersects(pie10)||man1.intersects(pie11)||man1.intersects(pie12)||man1.intersects(pie13)||man1.intersects(pie14)||man1.intersects(pie15)||man1.intersects(pie16)||man1.intersects(pie17)||man1.intersects(pie18)||man1.intersects(pie19)||man1.intersects(pie20)||man1.intersects(pie21)){
            t2 = true;
        }
        return t2;
    }
    private boolean comida(){
        Rectangle com = this.getComida();
        Rectangle man1 = new Rectangle(dirx+120, 150+diry, 10, 10);
        boolean t3 = false;
        if(man1.intersects(com)){
            t3 = true;
            score += 10;
            con -= 1;
        }
        return t3;
    }
    private boolean com(){
        Rectangle pie5 = this.get5();
        Rectangle pie6 = this.get6();
        Rectangle pie7 = this.get7();
        Rectangle pie8 = this.get8();
        Rectangle pie9 = this.get9();
        Rectangle pie10 = this.get10();
        Rectangle pie11 = this.get11();
        Rectangle pie12 = this.get12();
        Rectangle pie13 = this.get13();
        Rectangle pie14 = this.get14();
        Rectangle pie15 = this.get15();
        Rectangle pie16 = this.get16();
        Rectangle pie17 = this.get17();
        Rectangle pie18 = this.get18();
        Rectangle pie19 = this.get19();
        Rectangle pie20 = this.get20();
        Rectangle pie21 = this.get21();
        Rectangle man1 = this.getComida();
        boolean t4 = false;
        if(man1.intersects(pie6)||man1.intersects(pie7)||man1.intersects(pie5)||man1.intersects(pie8)||man1.intersects(pie9)||man1.intersects(pie10)||man1.intersects(pie11)||man1.intersects(pie12)||man1.intersects(pie13)||man1.intersects(pie14)||man1.intersects(pie15)||man1.intersects(pie16)||man1.intersects(pie17)||man1.intersects(pie18)||man1.intersects(pie19)||man1.intersects(pie20)||man1.intersects(pie21)){
            t4 = true;
        }
        return t4;
    }
    private boolean comi(){
        Rectangle pie5 = this.get5();
        Rectangle pie6 = this.get6();
        Rectangle pie7 = this.get7();
        Rectangle pie8 = this.get8();
        Rectangle man1 = this.getComida();
        boolean t5 = false;
        if(man1.intersects(pie6)||man1.intersects(pie7)||man1.intersects(pie5)||man1.intersects(pie8)){
            t5= true;
        }
        return t5;
    }
    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }  
   
    
    @Override
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        boolean t = checkCollisions();
        boolean t2 = checkCollision();
        boolean t3 = comida();
        boolean t4 = com();
        boolean t5 = comi();
        if(t3 == true){
            cx = ale.nextInt(400) + 10;
            cy = ale.nextInt(300) + 60;
            i += 1;
            try {
                 url = new URL("file:ball_1.wav");
                 AudioClip ac = Applet.newAudioClip(url);
                 ac.play();
             } catch (MalformedURLException ex) {
                 Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        if(t == true){
            x1 = 5;
        }
        if(con == 0){
            x = 10;
            y = 0;
            x1 = 2;
            i = 4;
            dirx = 50;
            diry = -60;
            punX.clear();
            punY.clear();
        }
        if(t2 == true && x1 ==2){
            x1 = 5;
            i = 4;
            punX.clear();
            punY.clear();
        }
        Image S = loadImage("Sin título.png");
        Rectangle Cabeza = this.getCabeza();
        switch (x1) {
            case 0:
                Image fondo = loadImage("Menu.png");
                g.drawImage(fondo, 0, 0, this);
                i = 4;
                punX.clear();
                punY.clear();
                break;
            case 1:
                Image N1 = loadImage("nivel 1.png");
                g.drawImage(N1, 0, 0, this);
                g.drawImage(S, 190, 150, this);
                g.drawImage(S, 100, 35, 80, 30, this);
                g.drawImage(S, 235, 35, 40, 30, this);
                g.setColor(Color.BLACK);
                g.fillRect(0, 70, 525, 10);
                g.fillRect(0, 70, 10, 300);
                g.fillRect(510, 70, 10, 300);
                g.fillRect(0, 360, 525, 10);
                g.setColor(Color.WHITE);
                g.fillRect(Cabeza.x,Cabeza.y,10,10);
                g.setColor(Color.BLACK);
                g.drawRect(Cabeza.x,Cabeza.y,10,10);
                dirx = x + dirx;
                diry = y + diry;
                punX.add(dirx+120);
                punY.add(diry+150);
                if(punX.size()>=5){
                    for(int mo = 0; mo<i ; mo++){
                        g.setColor(Color.WHITE);
                        g.fillRect(punX.get(punX.size()-2-mo),punY.get(punY.size()-2-mo),10,10);
                        g.setColor(Color.BLACK);
                        g.drawRect(punX.get(punX.size()-2-mo),punY.get(punY.size()-2-mo),10,10);
                    }
                }
                g.drawString(""+score, 120, 60);
                g.drawString(" "+con, 250, 60);
                g.setColor(Color.RED);
                if(t5 == false){
                    g.fillRect(cx, cy, 10, 10);
                }
                break;
            case 2:
                con = 5;
                Image N2 = loadImage("nivel 2.png");
                g.drawImage(N2, -3, -3, this);
                g.drawImage(S, 100, 35, 80, 30, this);
                g.drawImage(S, 235, 35, 40, 30, this);
                g.drawImage(S, 190, 150, this);
                g.setColor(Color.BLACK);
                g.fillRect(0, 70, 525, 10);
                g.fillRect(0, 70, 10, 300);
                g.fillRect(510, 70, 10, 300);
                g.fillRect(0, 360, 525, 10);
                g.fillRect(55, 70, 10, 60);
                g.fillRect(55, 120, 415, 10);
                g.fillRect(55, 165, 10, 145);
                g.fillRect(55, 300, 415, 10);
                g.fillRect(465, 120, 10, 65);
                g.fillRect(462, 246, 10, 65);
                g.fillRect(112, 240, 10, 60);
                g.fillRect(112, 180, 64, 10);
                g.fillRect(166, 120, 10, 135);
                g.fillRect(216, 245, 200, 10);
                g.fillRect(410, 187, 10, 68);
                g.fillRect(350, 120, 10, 80);
                g.fillRect(255, 187, 10, 67);
                g.setColor(Color.WHITE);
                g.fillRect(Cabeza.x,Cabeza.y,10,10);
                g.setColor(Color.BLACK);
                g.drawRect(Cabeza.x,Cabeza.y,10,10);
                punX.add(dirx+120);
                punY.add(diry+150);
                dirx = x + dirx;
                diry = y + diry;
                if(punX.size()>=5){
                    for(int mo = 0; mo<i ; mo++){
                        g.setColor(Color.WHITE);
                        g.fillRect(punX.get(punX.size()-2-mo),punY.get(punY.size()-2-mo),10,10);
                        g.setColor(Color.BLACK);
                        g.drawRect(punX.get(punX.size()-2-mo),punY.get(punY.size()-2-mo),10,10);
                    }
                }
                g.drawString(""+score, 120, 60);
                g.drawString(" "+con, 250, 60);
                g.setColor(Color.RED);
                if(t4==false){
                    g.fillRect(cx, cy, 10, 10);
                }
                break;
            case 3:
                Image Op = loadImage("opciones.png");              
                g.drawImage(Op, 0, 0, this);
                g.drawRect(335, 220, 20, 25);
                g.drawString("5", 340, 240);
                g.drawRect(250, 220, 20, 25);
                g.drawRect(420, 220, 20, 25);
                if(son ==1){
                    g.drawRect(250, 65, 80, 50);
                }else{
                    g.drawRect(360, 65, 80, 50);
                }
                break;
            case 5:
                punX.clear();
                punY.clear();
                Image Go = loadImage("gameover.jpg");
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, 550, 400);
                g.drawImage(Go, 0, 0, this);
                g.setColor(Color.WHITE);
                g.drawRect(190, 180, 120, 30);
                g.drawString("Score:            "+score, 200, 200);
                g.drawRect(215, 280, 70, 30);
                g.drawString("Try Again", 225, 300);
                x = 10;
                y = 0;
                i = 4;
                dirx = 10;
                diry = 10;
                cx = 300;
                cy = 300;
                t=false;
                t2=false;
                con = 5;
                score = 0;
                time.stop();
                break;
            default :
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        checkCollisions();
        checkCollision();
        repaint();
    }
    public NewPanel() {
        
        time = new Timer(vel, this);
        this.time.start();
        this.addMouseListener(this);
        addKeyListener(new TAdapter());
        setFocusable(true);
        
    }
    
    public Rectangle getCabeza(){
        return new Rectangle (dirx+120, 150+diry, 10, 10);
    }
    @Override
    public Rectangle getBounds(){
        return new Rectangle (200, 170, 285, 197);
    }
    public Rectangle getSonido(){
        return new Rectangle (250, 65, 80, 50);
    }
    public Rectangle getNotson(){
        return new Rectangle (360, 65, 80, 50);
    }
    public Rectangle get1(){
        return new Rectangle (200, 210, 285, 237);
    }
    public Rectangle get2(){
        return new Rectangle (0, 0, 120, 30);
    }
    public Rectangle get3(){
        return new Rectangle (230, 0, 510, 30);
    }
    public Rectangle get4(){
        return new Rectangle (120, 0,110 , 30);
    }
    public Rectangle getcontinueJ(){
        return new Rectangle (200,270,125,35);
    }
    public Rectangle get5(){
        return new Rectangle (0, 70, 525, 10);
    }
    public Rectangle get6(){
        return new Rectangle (0, 70, 10, 300);
    }
    public Rectangle get7(){
        return new Rectangle (510, 70, 10, 300);
    }
    public Rectangle get8(){
        return new Rectangle (0, 360, 525, 10);
    }
    public Rectangle get9(){
        return new Rectangle (55, 70, 10, 60);
    }
    public Rectangle get10(){
        return new Rectangle (55, 120, 415, 10);
    }
    public Rectangle get11(){
        return new Rectangle (55, 165, 10, 145);
    }
    public Rectangle get12(){
        return new Rectangle (55, 300, 415, 10);
    }
    public Rectangle get13(){
        return new Rectangle (465, 120, 10, 65);
    }
    public Rectangle get14(){
        return new Rectangle (462, 246, 10, 65);
    }
    public Rectangle get15(){
        return new Rectangle (112, 240, 10, 60);
    }
    public Rectangle get16(){
        return new Rectangle (112, 180, 64, 10);
    }
    public Rectangle get17(){
        return new Rectangle (166, 120, 10, 135);
    }
    public Rectangle get18(){
        return new Rectangle (216, 245, 200, 10);
    }
    public Rectangle get19(){
        return new Rectangle (410, 187, 10, 68);
    }
    public Rectangle get20(){
        return new Rectangle (350, 120, 10, 80);
    }
    public Rectangle get21(){
        return new Rectangle (255, 187, 10, 67);
    }
    public Rectangle getAga(){
        return new Rectangle (215, 280, 70, 30);
    }
    public Rectangle getComida(){
        return new Rectangle (cx,cy,10,10);
    }
    public Rectangle getV5(){
        return new Rectangle (335, 220, 20, 25);
    }
    public Rectangle getV1(){
        return new Rectangle (250, 220, 20, 25);
    }
    public Rectangle getV10(){
        return new Rectangle (420, 220, 20, 25);
    }
    public Image loadImage(String imageName){
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        
        return image;
    }
    
    public void addPuntX(){
        punX.add(k);
    }
    public void addPunty(){
        punY.add(j);
    }
    private class TAdapter extends KeyAdapter{

        @Override
        public void keyReleased(KeyEvent e){

        }
        @Override
        public void keyPressed(KeyEvent e){

            int key = e.getKeyCode();
            if(key == KeyEvent.VK_DOWN){
                y = 10;
                x = 0;
            }
            if(key == KeyEvent.VK_UP){
                y = -10;
                x = 0;
            }
            if(key == KeyEvent.VK_RIGHT){
                x = 10;
                y = 0;
            }
            if(key == KeyEvent.VK_LEFT){
                x = -10;
                y = 0;
            }
        }
    }
}