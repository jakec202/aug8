package com.battingStats;

import java.text.DecimalFormat;
import java.util.Scanner;

class BattingStatsPart2 {
        
    public static void main(String[] args) {
    
            BattingStatsV1 player1 = new BattingStatsV1();
            new Scanner(System.in);
            String name = "Player";
            player1.getStats(name);
            player1.calcAvg();
            player1.calcSlug();
            player1.printAll(name);
            
   //         DecimalFormat df = new DecimalFormat ("#.###");
   //         df.setMinimumFractionDigits(3);
            
            System.out.println("Average: " + player1.calcAvg());
            System.out.println("Slugging %: " + player1.calcSlug());
            
        }

}
