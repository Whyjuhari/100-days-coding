package DAYS_60;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo() {
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();        
        slider = new JSlider();

        slider.setPreferredSize(new Dimension(400,200));

        slider.addChangeListener(this);

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 15));

        slider.setOrientation(SwingConstants.VERTICAL); // agar slider terbentuk dalam posisi vertical
        label.setText("C = " + slider.getValue());


        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);

    }



    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("C = " + slider.getValue());
    }
    
    
}
