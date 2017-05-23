import com_codebind.Login;

import javax.swing.*;

/**
 * Created by cuent on 23/05/2017.
 */
public class Main {
    static JFrame frame = new JFrame("Login");
    public static void main(String[] args) {
        Login lu = new Login();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setContentPane(lu.getJpanelMain());
    }
}
