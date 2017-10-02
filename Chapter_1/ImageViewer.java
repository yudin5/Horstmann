package Chapter_1;

import java.awt.*;
import javax.swing.*;

/**
 * A program for viewing images.
 * @version 1.30 2014-02-27
 * @author Cay Horstmann
 */

public class ImageViewer
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            JFrame frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}