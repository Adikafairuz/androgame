package com.example;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javafx.geometry.Dimension2D;

public class GamePanel  extends JPanel{
   final int originalTilesize=16;
   final int scale = 3;
   public final int tileSize=originalTilesize *scale;
   public final int maxScreencol=20;
   public final int maxScreenRow=12;
   public final int screenWindth=tileSize * maxScreencol;
   public final int screenHeight=tileSize * maxScreenRow;
   public GamePanel() {
    this.setPreferredSize(new Dimension(screenWindth, screenHeight));;
    this.setBackground(Color.blue);
    this.setDoubleBuffered(true);
    }
    
}
