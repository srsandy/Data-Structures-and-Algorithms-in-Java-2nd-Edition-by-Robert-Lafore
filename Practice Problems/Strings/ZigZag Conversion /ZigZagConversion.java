class ZigZagConversion {
    public static String convert(String s, int numRows) {
        StringBuffer[] sb = new StringBuffer[numRows];
        
        for(int i = 0; i< numRows; i++) {
            sb[i] = new StringBuffer();
        }
        
        int len = s.length();
        
        int i = 0; 
        
        while(i < len) {
            for(int j =0; j<numRows && i<len; j++) {
                sb[j].append(s.charAt(i++));
            }
            
            for(int j = numRows -2; j > 0 && i <len; j--) {
                sb[j].append(s.charAt(i++));
            }
        }
        
        for(int j = 1; j< numRows; j++) {
            sb[0].append(sb[j]);
        }
        
        return sb[0].toString();
    }

    public static void main(String[] args) {
        
        String s = "PAYPALISHIRING";
        int numRows = 4;


        String solution = convert(s, numRows);

        System.out.println(solution);
    }
}
