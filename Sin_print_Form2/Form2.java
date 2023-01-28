
//Вычисление величины Sin(x) в пределах [0, 22] градусов

 package forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import javax.swing.event.*;


public class Form2 extends JFrame {

    JLabel lb1;
    JTextArea jt;
    JPopupMenu pm;

    public void funs(){


     //-------------------------Ваш код----------------------------------------


      //код программы

     //------------------------------------------------------------------------

    }


    //----------------Шаблонный код--------------------

    public Form2(String title, int x0, int y0, int w, int h){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(x0, y0, w, h);
        setResizable(false);
        setLayout(new BorderLayout());
        var panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel1.setBackground(new Color(250, 160, 122));
        var bt1 = new JButton("Выполнить");
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { funs();}
        });
        var bt2 = new JButton("Выход");
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { dispose();}
        });
        panel1.add(bt1);panel1.add(bt2);
        var panel2 = new JPanel();
        panel2.setBackground(new Color(145, 222, 179));
        panel2.setLayout(new BorderLayout());
        lb1 = new JLabel("Вывод данных", JLabel.CENTER);
        jt  = new JTextArea(10, 30);
        pm = new JPopupMenu();
        JMenuItem m_cut = new JMenuItem("Вырезать");
        JMenuItem m_copy = new JMenuItem("Копировать");
        JMenuItem m_paste = new JMenuItem("Вставить");
        JMenuItem m_print = new JMenuItem("Напечатать");
        pm.add(m_cut);
        pm.add(m_copy);
        pm.add(m_paste);
        pm.add(m_print);
                m_cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.cut();
            }
        });
        m_copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.copy();
            }
        });
        m_paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.paste();
            }
        });
        m_print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jt.print();
                } catch (PrinterException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        jt.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                showPopup(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                showPopup(e);
            }

            private void showPopup(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    pm.show(e.getComponent(),
                            e.getX(), e.getY());
                }
            }
        });

        JScrollPane sp = new JScrollPane(jt);
        panel2.add(sp, BorderLayout.CENTER);
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        setVisible(true);
    }


    public void add_text(String str){ jt.setText(jt.getText() + str); }
    public void clear(){ jt.setText(""); }

}
