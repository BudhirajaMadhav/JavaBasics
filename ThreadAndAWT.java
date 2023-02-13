package JavaBasics;
import java.io.*;
import java.util.*;
import java.lang.Thread;
import java.awt.*;
import java.awt.event.*;

class ThreadAndAWT{

    public static void main(String[] args) {

        Printer newPrinter = new Printer();
        
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                newPrinter.setVal("Value 1");
                synchronized (newPrinter.val) {
                    newPrinter.print();
                }
            }
        };
        
        // Object obj = new Object() {
        //     @Override
        //     public String toString() {
        //         return "Object 1";
        //     }
        // };


        // InheritedThread thread2 = new InheritedThread(newPrinter);
        // ImplementedRunnable runnable = new ImplementedRunnable();
        // Thread thread3 = new Thread(runnable);
        // thread1.setPriority(Thread.MAX_PRIORITY);
        // thread1.setName("Khushi");
        // thread1.start();
        // thread2.setPriority(Thread.MIN_PRIORITY);
        // thread2.start();

        // Thread mainThread = Thread.currentThread();
        // System.out.println(mainThread.getPriority());


        PracticeAWT practiceAWT = new PracticeAWT();


    }
}


class PracticeAWT extends Frame implements ActionListener {
    public PracticeAWT() {
        Button b = new Button("Click Me");
        b.setBounds(30, 100, 80, 30);

        // anonymous class
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked anonymous");
            }
        });

        

        b.addActionListener(this);

        add(b);
        setSize(1300, 700);
        setLayout(null);
        setVisible(true);
        setResizable(true);
        
        Label label = new Label("Name");
        label.setBounds(30, 50, 60, 30);
        add(label);

        TextField textField = new TextField("vp mc");
        textField.setBounds(100, 50, 80, 30);
        add(textField);

        TextArea textArea = new TextArea("This is a text area");
        textArea.setBounds(30, 150, 80, 40);
        add(textArea);

        Checkbox checkbox = new Checkbox("Check me");
        checkbox.setBounds(30, 200, 80, 30);
        add(checkbox);
        
        checkbox.addItemListener(e -> {
            if(checkbox.getState()) {
                System.out.println("Checked");
            } else {
                System.out.println("Unchecked");
            }
        });

        CheckboxGroup checkboxGroup = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Check me 1", checkboxGroup, true);
        checkbox1.setBounds(30, 250, 80, 30);
        add(checkbox1);

        Checkbox checkbox2 = new Checkbox("Check me 2", checkboxGroup, false);
        checkbox2.setBounds(30, 300, 80, 30);
        add(checkbox2);

        Choice choice = new Choice();
        choice.setBounds(30, 350, 80, 30);
        choice.add("Choice 1");
        choice.add("Choice 2");
        choice.add("Choice 3");
        choice.add("Choice 4");
        add(choice);

        java.awt.List list = new java.awt.List();
        list.setBounds(30, 400, 80, 30);
        list.add("List 1");
        list.add("List 2");
        list.add("List 3");
        list.add("List 4");
        add(list);

        // make a canvas and draw a circle in it
        Canvas canvas = new Canvas() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.RED);
                g.fillOval(0, 0, 80, 80);
            }
        };

        canvas.setBounds(30, 450, 80, 80);
        add(canvas);

        Panel panel = new Panel();
        panel.setBounds(30, 550, 80, 80);
        panel.setBackground(Color.PINK);
        add(panel);

        panel.add(new Label("Name"));

        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Menu");
        MenuItem menuItem = new MenuItem("Menu Item");
        menu.add(menuItem);
        Menu subMenu = new Menu("Sub Menu");
        MenuItem subMenuItem = new MenuItem("Sub Menu Item");
        subMenu.add(subMenuItem);

        menu.add(subMenu);
        menuBar.add(menu);
        setMenuBar(menuBar);

        // Dialog dialog = new Dialog(this, "Dialog", true);
        // dialog.setSize(300, 300);
        // dialog.setLayout(null);
        // dialog.setVisible(true);
        // dialog.setResizable(true);

        FlowLayout flowLayout = new FlowLayout();
        Panel panel1 = new Panel();
        panel1.setBounds(30, 700, 300, 80);
        panel1.setBackground(Color.PINK);
        panel1.setLayout(flowLayout);
        add(panel1);

        panel1.add(new Button("Button 1"));
        panel1.add(new Button("Button 2"));
        panel1.add(new Button("Button 3"));
        panel1.add(new Button("Button 4"));


        Panel panel2 = new Panel();
        BorderLayout borderLayout = new BorderLayout(20, 10);
        panel2.setBounds(500, 700, 300, 80);
        panel2.setBackground(Color.PINK);
        panel2.setLayout(borderLayout);

        panel2.add(new Button("Button 1"), BorderLayout.PAGE_START);
        panel2.add(new Button("Button 2"), BorderLayout.PAGE_END);
        panel2.add(new Button("Button 3"), BorderLayout.EAST);
        panel2.add(new Button("Button 4"), BorderLayout.LINE_START);
        panel2.add(new Button("Button 5"), BorderLayout.CENTER);

        add(panel2);

        Panel panel3 = new Panel();
        GridLayout gridLayout = new GridLayout(3, 3, 2, 2);
        panel3.setBounds(900, 700, 300, 80);
        panel3.setBackground(Color.PINK);
        panel3.setLayout(gridLayout);

        panel3.add(new Button("1"));
        panel3.add(new Button("2"));
        panel3.add(new Button("3"));
        panel3.add(new Button("4"));
        panel3.add(new Button("5"));
        panel3.add(new Button("6"));
        panel3.add(new Button("7"));
        panel3.add(new Button("8"));
        panel3.add(new Button("9"));

        add(panel3);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked within");
    }

}

class InheritedThread extends Thread {

    Printer printer;
    InheritedThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        printer.setVal("Value 2");
        printer.print();
    }
}

class ImplementedRunnable implements Runnable {
    public void run() {
        System.out.println("Thread 3");
    }
}

class Printer {

    String val;
    synchronized void setVal(String val) {
        this.val = val;
    }

    synchronized public void print() { 
        for (int idx = 0; idx < 10; idx++) {
            if(idx == 5) 
                try {
                    if(val.equals("Value 1"))
                        wait();
                    else
                        notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println(val);
        }
    }
}