class Solution {
    public int maxPoints(int[][] points) {
        if(points.length<=2) return points.length;
        int max=0;
        int localMax=0;
        
        for(int i=0;i<points.length;i++){
            HashMap<String, Integer> map = new HashMap<>();
            int overlap=0;
            localMax=0;
            for(int j=0;j<points.length;j++){
                if(points[i][0]==points[j][0] && points[i][1]==points[j][1]){
                    overlap++;
                    continue;
                }
                int y = points[j][1]-points[i][1];
                int x = points[j][0]-points[i][0];
                int gcd = gcd(x,y);
                String slope = x/gcd + "@" + y/gcd;
                map.put(slope,map.getOrDefault(slope,0)+1);
                if(map.get(slope)>localMax){
                    localMax = map.get(slope);
                }
            }
            localMax+=overlap;
            max=Math.max(localMax,max);
        }

        return max;
    }
    
    private int gcd(int x, int y){
        if(y==0) return x;
        
        return gcd(y,x%y);
    }
}

