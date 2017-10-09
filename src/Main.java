import javax.swing.*;

public class Main extends JFrame{


    private Main(){

        add(new JLabel("Hej allihopa!"));

        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Main();
        System.out.println("Skall satsa på en master inom Abstrakta maskiner och formella språk!");
        System.out.println("självfallet eller master i trollkonst");
        System.out.println("master i TrolldrycksElixir på Hogwarts universitet");
    }



}
