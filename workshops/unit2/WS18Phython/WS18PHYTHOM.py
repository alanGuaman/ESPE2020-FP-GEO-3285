Python 3.8.8 (tags/v3.8.8:024d805, Feb 19 2021, 13:08:11) [MSC v.1928 32 bit (Intel)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> 25+36
61
>>> 12-63
-51
>>> type (1)
<class 'int'>
>>> type ("adas")
<class 'str'>
>>> type ((4+5j))
<class 'complex'>
>>> type (True)
<class 'bool'>
>>> a = 1
>>> type (a)
<class 'int'>
>>> type(a)
<class 'int'>
>>> b = True
>>> type (b)
<class 'bool'>
>>> b=44
>>> type(b)
<class 'int'>
>>> 21+3
24
>>> 2//3
0
>>> 4**2
16
>>> False
False
>>> False & True
False
>>> True and True
True
>>> False and True
False
>>> 0 & 1
0
>>> print ("Hola")
Hola
>>> print("Mundo")
Mundo
>>> input("Inserte un valor")
Inserte un valor65
'65'
>>> a= input ("Inserte un valor: ")
Inserte un valor: 654
>>> int (a)
654
>>> a=int (a)
>>> a
654
>>> a=1
>>> if a ==1:
	print("Hola")
	else:
		
SyntaxError: invalid syntax
>>> for i in range (5):
	print("Hola")

	
Hola
Hola
Hola
Hola
Hola
>>> for i in range(2, 7):
	print("i")

	
i
i
i
i
i
>>> for i in renge(2, 7):
	print(i)

	
Traceback (most recent call last):
  File "<pyshell#40>", line 1, in <module>
    for i in renge(2, 7):
NameError: name 'renge' is not defined
>>> for i in range(2, 7):
	print(i)

	
2
3
4
5
6
>>> for i in range(2, 7):
	print(i)

	
2
3
4
5
6
>>> lista=[ 1,2.5,"3",True]
>>> for i int range (0,10):
	
SyntaxError: invalid syntax
>>> lista=[ 1,2.5,"3",True]
>>> for i in range (0,10):
	if(%2)==0:
		
SyntaxError: invalid syntax
>>> for i in range (0,10):
	if(i%2)==0:
		print(i)

		
0
2
4
6
8
>>> for i in range (0,20):
	if(i%2)==0:
		print(i)

		
0
2
4
6
8
10
12
14
16
18
>>> for i in range (0,10):
	if(i&2)==0:
		print(i)

		
0
1
4
5
8
9
>>> for i in range (0,20):
	if(i&2)==0:
		print(i)

		
0
1
4
5
8
9
12
13
16
17
>>> 