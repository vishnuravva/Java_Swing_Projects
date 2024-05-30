package Swing_Projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Todo extends JFrame{
    int task;

    private JTextField task_field;
    private JLabel heading;
    Font font = new Font("Roboto",Font.PLAIN,20);
    private JButton addTaskBtn;
    private JTextArea alltasks;
    ArrayList<String> tasks;

    Todo(){
        tasks = new ArrayList<String>();
        components();
        events();
//        display();


    }
    private void components(){
        setTitle("Todo App");
        setLayout(null);
        setSize(700,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        task_field = new JTextField();
        task_field.setBounds(20,100,550,40);
        task_field.setFont(font);

        addTaskBtn = new JButton("+");
        addTaskBtn.setBounds(580,100,100,40);
        addTaskBtn.setFont(font);

        heading = new JLabel("Todo");
        heading.setBounds(325,20,200,40);
        heading.setFont(font);

//        alltasks = new JTextArea();
//        alltasks.setBounds(20,170,660,450);
//        alltasks.setFont(font);


        ;
add(heading);
        add(task_field);
        add(addTaskBtn);
//        add(alltasks);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    private void events(){
        addTaskBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(!task_field.getText().isEmpty()){
                    tasks.add(task_field.getText());
                    System.out.println(task_field.getText());
                    display();
                    task_field.setText("");
                    System.out.println("tasks : " + tasks );
                }

            }
        });
    }
    private void display(){
        int size = 170;
        for (int i = 0; i < tasks.size(); i++) {
            JLabel task = new JLabel(tasks.get(i));
            task.setBounds(20,size,660,30);
            task.setFont(font);
            add(task);
            size+=40;
        }
    }
    public static void main(String[] args) {
new Todo();
    }
}
