import java.awt.*;
import java.awt.event.*;

class MouseKeyboard extends Frame
{
    Label position;
    MouseKeyboard()
    {
        position = new Label("Move the mouse inside the window");

        add(position, BorderLayout.SOUTH);
        addMouseMotionListener(new MouseMotionAdapter()
        {
            public void mouseMoved(MouseEvent e)
            {
                position.setText("Mouse Position: X = " + e.getX() + 
                                 " Y = " + e.getY());
            }
        });

        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                position.setText("Mouse Clicked at X = " + e.getX() + 
                                 " Y = " + e.getY());
            }
        });
        addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                position.setText("Key Pressed: " + e.getKeyChar());
            }
        });
        setSize(500, 300);
        setTitle("Mouse and Keyboard Events");
        setFocusable(true);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new MouseKeyboard();
    }
}
