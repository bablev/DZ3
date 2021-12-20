import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    int Milan = 0;
    int Real_Madrid = 0;
    JButton MilanButton = new JButton("AC Milan");
    JButton MadridButton = new JButton("Real Madrid");
    JLabel Result = new JLabel("Result 0 X 0");
    JLabel Goal = new JLabel("Last Scorer: N/A");
    Label Winner = new Label("Winner: DRAW");

    void Result(){
        Result.setText(("Result" + Milan + "X" +Real_Madrid));
        if (Milan > Real_Madrid){
            Winner.setText("Winner: Milan");
        }
        else if (Milan < Real_Madrid)
            Winner.setText("Winner: Real Madrid");
        else Winner.setText("Draw");
    }

    public App(){
        setSize(800, 900);
        setLayout(new FlowLayout());
        add(MilanButton);
        add(MadridButton);
        add(Result);
        add(Goal);
        add(Winner);
        MilanButton.addActionListener(ae ->{
            Milan++;
            Goal.setText("Last Scorer: Milan");
            Result();
        });

        MadridButton.addActionListener(ae -> {
            Real_Madrid++;
            Goal.setText("Last Scorer: Real Madrid");
            Result();
        });
    }
}
