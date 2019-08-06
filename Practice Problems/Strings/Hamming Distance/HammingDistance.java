class HammingDistance {
    public static int hammingDist(String str1, String str2) { 
        int i = 0, distance = 0; 

        if(str1.length() != str2.length()) {
            System.out.println("Strings length are not equal.");
            return -1; 
        }

        while (i < str1.length()) { 
            if (str1.charAt(i) != str2.charAt(i)) 
                distance++; 
            i++; 
        } 
    
    return distance; 
}  

    public static void main(String[] args) {
        
        String str1 = "karolin"; 
        String str2 = "kerstin";

        int dist = hammingDist(str1, str2);

        System.out.println("Hamming Distance = " + dist);
    }
}
