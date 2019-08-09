import java.util.*;

class WalkingRobotSimulation {
    public static void main(String[] args) {
        int[] commands = {-2,-1,8,9,6};
        int[][] obstacles = new int[][]{{-1,3},{0,1},{-1,5},{-2,-4},{5,4},{-2,-3},{5,-1},{1,-1},{5,5},{5,2}};

        System.out.println(robotSim(commands, obstacles));
    }

    public static int robotSim(int[] commands, int[][] obstacles) {
        
        Set<String> set = new HashSet<>();
        
        for (int[] obs : obstacles) {
            set.add(obs[0] + " " + obs[1]);
        }

        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        int x = 0;
        int y = 0;
        int d = 0;
        int ans = 0;
        
        for(int c : commands) {
            if(c == -1) {
                d++;
                if (d == 4) {
                    d = 0;
                }
            } else if(c == -2) {
                d--;
                if (d == -1) {
                    d = 3;
                }
            } else {
                while(c > 0 && !set.contains((x+dirs[d][0]) + " " + (y+dirs[d][1]))) {
                    x += dirs[d][0];
                    y += dirs[d][1];
                    c--;
                }
            }
            
            ans = Math.max(ans, x*x + y*y);
        }
        
        return ans;
        
    }


}