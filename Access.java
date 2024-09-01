package maze_solver;

import java.util.*;

import javax.swing.SwingUtilities;



public class Access {



    public static void main(String[] args) {

    	Scanner sc=new Scanner(System.in);


    	

        SwingUtilities.invokeLater(new Runnable() {

            @Override

            public void run() {

                View view = new View();

                view.setVisible(true);

            }

        });

    }

}

