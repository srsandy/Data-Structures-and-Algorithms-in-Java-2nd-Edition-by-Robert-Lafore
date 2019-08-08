class ValidWordAbbreviation {
	public static void main(String[] args) {
		String s = "internationalization", abbr = "i12iz4n";

		System.out.println(validWordAbbreviation(s,abbr));

	}

	public static boolean validWordAbbreviation(String word, String abbr) {
            int pos = 0;
            int i = 0;
            int num = 0;
            
            while(i<abbr.length()){
                if(Character.isDigit(abbr.charAt(i))){
                    while(i<abbr.length() && Character.isDigit(abbr.charAt(i))){
                        if(abbr.charAt(i) == '0' && num == 0){
                            return false;
                        }
                        if(num == 0){
                            num += Integer.parseInt(abbr.charAt(i)+"");
                        }
                        else{
                            num = num*10 + Integer.parseInt(abbr.charAt(i)+"");
                        }
                        i++;
                    }
                    pos += num;
                    num = 0;
                    
                }
                else{
                    if(pos >= word.length()){
                        return false;
                    }
                    if(abbr.charAt(i) != word.charAt(pos)){
                        return false;
                    }
                    pos++;
                    i++;
                }
            }
            return pos == word.length();
        }

}