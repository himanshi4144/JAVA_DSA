package Cars;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;
import javax.swing.Timer;
import javax.imageio.ImageIO;

public class Work extends JPanel implements ActionListener, KeyListener {
    private int space;
    private int Width = 80;
    private int height = 70;
    private int speed;
    private int WIDTH = 500;
    private int HEIGHT = 700;
    private int move = 20;
    private int count = 1;
    private ArrayList<Rectangle> ocars;
    private ArrayList<Rectangle> line;
    private Random random;
    private Rectangle car;
    private BufferedImage bg;
    private BufferedImage road;
    private BufferedImage car1;
    private BufferedImage car2;
    private BufferedImage tree1;
    private BufferedImage tree2;
    private Boolean linef = true;
    private Timer t;
    private boolean gameOver;

    public Work() {
        try {
            // Load images
            bg = ImageIO.read(new File("C:\\Users\\asus\\Documents\\Car\\bg.jpg"));
            road = ImageIO.read(new File("C:\\Users\\asus\\Documents\\Car\\road.jpg"));
            car1 = ImageIO.read(new File("C:\\Users\\asus\\Documents\\Car\\car1.jpg"));
            car2 = ImageIO.read(new File("C:\\Users\\asus\\Documents\\Car\\car2.jpg"));
            tree1 = ImageIO.read(new File("C:\\Users\\asus\\Documents\\Car\\tree1.jpg"));
            tree2 = ImageIO.read(new File("C:\\Users\\asus\\Documents\\Car\\tree2.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Work.class.getName()).log(Level.SEVERE, null, ex);
        }

        t = new Timer(20, this);
        random = new Random();
        ocars = new ArrayList<>();
        line = new ArrayList<>();
        car = new Rectangle(WIDTH / 2 - 90, HEIGHT - 100, Width, height);
        space = 300;
        speed = 50;
        addKeyListener(this);
        setFocusable(true);

        addocars(true);
        addocars(true);
        addocars(true);
        addocars(true);

        addLines(true);
        addLines(true);
        addLines(true);
        addLines(true);
        addLines(true);
        addLines(true);
        addLines(true);
        addLines(true);
        addLines(true);

        gameOver = false;
        t.start();
    }

    public void addLines(boolean first) {
        int x = WIDTH / 2 - 2;
        int y = 0;
        int Width = 4;
        int height = 300;
        int space = 20;
        if (first) {
            line.add(new Rectangle(x, y - (line.size() * space), Width, height));
        } else {
            line.add(new Rectangle(x, line.get(line.size() - 1).y - space, Width, height));
        }
    }

    public void addocars(boolean first) {
        int pos = random.nextInt() % 2;
        int x = 0;
        int y = 0;
        int Width = this.Width;
        int HEIGHT = this.height;
        if (pos == 0) {
            x = Width / 2 - 90;
        } else {
            x = Width / 2 + 10;
        }
        if (first) {
            ocars.add(new Rectangle(x, y - 100 - (ocars.size() * space), Width, HEIGHT));
        } else {
            ocars.add(new Rectangle(x, ocars.get(ocars.size() - 1).y - 300, Width, HEIGHT));
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!gameOver) {
            g.drawImage(bg, 0, 0, null);
            g.drawImage(road, WIDTH / 2 - 125, 0, null);
            g.setColor(Color.WHITE);
            for (Rectangle rect : line) {
                g.fillRect(rect.x, rect.y, rect.width, rect.height);
            }

            for (Rectangle rect : ocars) {
                if (random.nextInt() % 2 == 0) {
                    g.drawImage(car1, rect.x, rect.y, null);
                } else {
                    g.drawImage(car2, rect.x, rect.y, null);
                }
            }

            g.drawImage(car1, car.x, car.y, null); // Player's car
        } else {
            g.setColor(Color.RED);
            g.drawString("Game Over", WIDTH / 2 - 50, HEIGHT / 2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameOver) {
            return;
        }

        count++;
        Rectangle rect;
        for (int i = 0; i < ocars.size(); i++) {
            rect = ocars.get(i);
            if (count % 1000 == 0) {
                if (move < 10) {
                    speed++;
                    move += 10;
                }
            }
            rect.y += speed;
        }

        // Check for collision with other cars
        for (Rectangle r : ocars) {
            if (r.intersects(car)) {
                gameOver = true; // End the game on collision
                break;
            }
        }

        // Move the road lines down and reset if necessary
        for (int i = 0; i < line.size(); i++) {
            rect = line.get(i);
            if (count % 1000 == 0) {
                speed++;
            }
            rect.y += speed;
        }

        for (int i = 0; i < ocars.size(); i++) {
            rect = ocars.get(i);
            if (rect.y + rect.height > HEIGHT) {
                ocars.remove(rect);
                addocars(false);
            }
        }

        for (int i = 0; i < line.size(); i++) {
            rect = line.get(i);
            if (rect.y + rect.height > HEIGHT) {
                line.remove(rect);
                addLines(false);
            }
        }

        repaint();
    }

    public void moveup() {
        if (car.y - move < 0) {
            System.out.println("Can't move up!");
        } else {
            car.y -= move;
        }
    }

    public void movedown() {
        if (car.y + move + car.height > HEIGHT - 1) {
            System.out.println("Can't move down!");
        } else {
            car.y += move;
        }
    }

    public void moveleft() {
        if (car.x - move < WIDTH / 2 - 90) {
            System.out.println("Can't move left!");
        } else {
            car.x -= move;
        }
    }

    public void moveright() {
        if (car.x + move > WIDTH / 2 + 10) {
            System.out.println("Can't move right!");
        } else {
            car.x += move;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not implemented
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Not implemented
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_UP:
                moveup();
                break;
            case KeyEvent.VK_DOWN:
                movedown();
                break;
            case KeyEvent.VK_LEFT:
                moveleft();
                break;
            case KeyEvent.VK_RIGHT:
                moveright();
                break;
            default:
                break;
        }
    }
}
