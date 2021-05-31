1.	// André Barcelos Silva (barcelos.ds@gmail.com)
2.	// 09 de maior de 2014 - [13h50min]
3.	 
4.	public class ASCII {
5.	 
6.	        public String code(String texto, Integer valor){
7.	                char c;
8.	                Integer d;
9.	                String e = "";
10.	                for (int i = 0; i < texto.length(); i++){
11.	                        c = texto.charAt(i);
12.	                        d = (int)c + valor;
13.	                        e += d + "-";
14.	                }
15.	                return e;
16.	        }
17.	 
18.	        public String decode(String ascii, Integer valor){
19.	                char c;
20.	                int d;
21.	                String e = "";
22.	                String f;
23.	                String g = "";
24.	                for (int i = 0; i < ascii.length(); i++) {
25.	                        while (ascii.charAt(i) != '-') {
26.	                                e += ascii.charAt(i);
27.	                                i++;   
28.	                        }
29.	                        d = Integer.parseInt(e) - valor;
30.	                        f = new Character((char)d).toString();
31.	                        e = "";
32.	                        g += f;
33.	                }
34.	                return g;
35.	        }
36.	}
