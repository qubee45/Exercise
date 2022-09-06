package com.loops.java;

public class loop {
	
public static void main(String[] args) {
	//forloop();
	//dowhile();
	//whileloop();
	nastedloop();
}

public static void forloop(){
	for (int i =1; i<=10; i++) {
		System.out.println(i);
	}
	
}
public static void dowhile() {
int 	i=1;
	do {
		System.out.println(i);
		i++;
	}
	while (i<=10); 
	
}

public static void whileloop() {
	int i =1;
	while (i<=10) {
		System.out.println(i);
		i++;
	}
	
}
public static void nastedloop() {
	int i;
	int j;
	for ( i =1; i<=10; i++) {
		for ( j=1; j<=10; j++) {
			System.out.println("NastedLop ="+ i +" ==> "+ j);
	}
	System.out.println("=> i Value =" + i);
}

}

}

