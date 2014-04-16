package com.jtechdev.widgets;

import java.awt.Dimension;
import java.awt.Image;

import com.jtechdev.painter.ImagePainter;
import com.jtechdev.swingx.EPPanel;

public class ImageBasedJComponent extends EPPanel {

    private final ImagePainter fPainter;

    public ImageBasedJComponent(Image image) {
        fPainter = new ImagePainter(image);
        setBackgroundPainter(fPainter);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(fPainter.getImage().getWidth(null),
                fPainter.getImage().getHeight(null));
    }
}
