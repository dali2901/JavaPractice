import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Sheep {
    private int x;
    private int y;

    public Sheep(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //toString的方法是 把你所要顯示的內容用「String 字串資料型態」顯示出來
    //toString是 Object的方法，而JAVA所有Class都繼承Object，所以所有Class都可以直接Override這個方法

    //toString是JAVA開發時為了方便所有Class的String操作特意加入的
    //像是 System.out.println( XXX ) ;
    // --> XXX這個Object 如果不是String類型，而且你沒有Override toString方法, 會得到一個Object的地址 XXXX@XXXX
    // --> XXX這個Object 如果不是String類型，但是你有Override toString方法,  那JAVA會自動調用 XXX.toString();
    // --> 所以以下這段只是為了讓他印出我們想看到的Sheep 移動到哪些座標
    @Override
    public String toString() {
        return this.x + "  " + this.y;
    }

    public void drawSheep(Graphics graphics) {
        graphics.setColor(Color.orange);
        graphics.fillOval(x + 23, y + 50, 225, 100);
        graphics.fillOval(x, y, 75, 75);
        graphics.fillRect(x + 50, y + 100, 25, 100);
        graphics.fillRect(x + 100, y + 100, 25, 100);
        graphics.fillRect(x + 150, y + 100, 25, 100);
        graphics.fillRect(x + 200, y + 100, 25, 100);

    }

    public void walk(int x, int y) {
        this.x += x;
        this.y += y;
    }

}

public class SwitchStatement extends JPanel implements KeyListener {

    Sheep s;

    public SwitchStatement() {
        s = new Sheep(40, 40);
        addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        s.drawSheep(g);
        requestFocusInWindow();
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

//---------------------------------------- Switch 的寫法----------------------------------------

        int k = e.getKeyCode();

        switch (k) {
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                s.walk(0, -5);
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                s.walk(0, 5);
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                s.walk(-5, 0);
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                s.walk(5, 0);
                break;
            default:
                JOptionPane.showMessageDialog(this, "請用方向鍵或者AWSD控制");
        }

        repaint();

        System.out.println(s);   //--> 這段只是為了調用 s 這隻Sheep的toString方法，印出Sheep 移動到哪些座標


//---------------------------------------- Switch 的寫法----------------------------------------

//Switch的幾點特性----------------------------------------
//1.Switch的限制, 只能用來比較一個variable
//2.只能用於 == 的比較 ,不支援 >、<、>=、<=
//3.只能用在int , chars , String , enums
//4.可以用 || 比較, 不能用 && 比較
// 5.有一個Fall through的特性, 所以要用break;


//---------------------------------------- if else 的寫法----------------------------------------

//        if (k == KeyEvent.VK_UP) {
//            s.walk(0, -5);
//        } else if (k == KeyEvent.VK_DOWN) {
//            s.walk(0, 5);
//
//        } else if (k == KeyEvent.VK_RIGHT) {
//            s.walk(5, 0);
//        } else if (k == KeyEvent.VK_LEFT) {
//            s.walk(-5, 0);
//        }
//        repaint();

//---------------------------------------- if else 的寫法----------------------------------------


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setContentPane(new SwitchStatement());
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);


    }


}
