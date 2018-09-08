import java.util.Scanner;

class Stack {
	private Character[] a;
	private int ele;
	private int size;

	public Stack(int size) {
		a = new Character[size];
		this.size = size;
		ele = -1;
	}

	public void push(Character ch) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			ele++;
			a[ele] = ch;
		}
	}

	public Character top() {
		if (isEmpty()) {
			return '#';
		} else {
			return a[ele];
		}
	}

	public Character pop() {
		if (isEmpty()) {
			return '#';
		} else {
			return a[ele--];
		}
	}

	private boolean isEmpty() {
		if(ele == -1) return true;
		else return false;
	}

	private boolean isFull() {
		if(ele == size - 1) return true;
		return false;
	}

	public void display() {
		for(int i=0; i<=ele; i++) 
			System.out.print(a[i] + " ");
		System.out.println();
	}
}

class infixPostfix {
	private Character[] oprator;

	public infixPostfix() {
		oprator = new Character[]{'+', '-', '*', '/'};
	}

	public static void main(String[] args) {
		infixPostfix ip = new infixPostfix();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Infix expression");
		String infix = sc.nextLine();

		String postfix = ip.convert(infix);
		// String postfix = ip.convert("a*(b+c)-d/(e+f)");
		// String postfix = ip.convert("a+b-(c*d/f-g)");
		System.out.println(postfix);
	}

	public String convert(String exp) {
		int expLen = exp.length();
		Stack s = new Stack(expLen);

		String postfix = "";

		for(int i=0; i < expLen; i++) {
			if( exp.charAt(i) == '(' ) {
				s.push('(');

			} else if( eleExist(exp.charAt(i)) ) {
				
				Character top = s.top();

				if( eleExist (top)) {
					int didPopStackTop = 0;
					
					while( eleExist(top) ) {
						int p1 = opPriority(top);
						int p2 = opPriority(exp.charAt(i));

						if( p1 < p2 ) {
							s.push(exp.charAt(i));
							break;
						} else {
							postfix += s.pop();
							top = s.top();
							didPopStackTop = 1;
						} 
					}

					if( didPopStackTop == 1 ) s.push(exp.charAt(i)); 

				} else {
					s.push(exp.charAt(i)); 
				}

			} else if( exp.charAt(i) == ')' ) {
				
				while (true) {
					Character ch = s.pop();
					if(ch == '(') break;
					postfix += ch;
				}

			} else {
				postfix += exp.charAt(i);
			}
		}

		while(true) {
			Character ch = s.pop();
			if( ch == '#') { break; }
			postfix += ch;
		}

		return postfix;
	}

	private int opPriority(Character ch) {
		if(ch == '+' || ch == '-') return 1;
		if(ch == '*' || ch == '/') return 2;

		return 0;
	}

	private boolean eleExist(Character c) {
		for(int i=0; i<oprator.length; i++) {
			if(oprator[i] == c) return true;
		}
		return false;
	}
}