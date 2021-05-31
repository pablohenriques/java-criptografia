1.	// André Barcelos Silva (barcelos.ds@gmail.com)
2.	// 09 de maior de 2014 - [13h53min]
3.	 
4.	import java.util.Scanner;
5.	 
6.	class MeuASCII {
7.	 
8.	        public static void main(String[] args){
9.	 
10.	                Scanner in = new Scanner(System.in);
11.	                ASCII c = new ASCII();
12.	 
13.	                System.out.println("ASCII");
14.	                System.out.println("1 - Texto para ASCII");
15.	                System.out.println("2 - ASCII para Texto");
16.	                System.out.print("Opção: ");
17.	 
18.	                Integer op = in.nextInt();
19.	 
20.	                if (op == 1) {
21.	                        System.out.print("Texto : ");
22.	                        in.nextLine();
23.	                        String t1 = in.nextLine();
24.	                        System.out.print("Valor : ");
25.	                        Integer v1 = in.nextInt();
26.	                        System.out.println(c.code(t1, v1));
27.	                } else if (op == 2) {
28.	                        System.out.print("Codigo: ");
29.	                        String t2 = in.next();
30.	                        System.out.print("Valor : ");
31.	                        Integer v2 = in.nextInt();
32.	                        System.out.println(c.decode(t2, v2));
33.	                } else {
34.	                        System.out.println("Esconha opcao correta...");
35.	                }
36.	        }
37.	}
