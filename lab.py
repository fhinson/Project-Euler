Python 3.2.3 (default, Apr 11 2012, 07:12:16) [MSC v.1500 64 bit (AMD64)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> hello = "Hello World"
>>> hello
'Hello World'
>>> a = 1
>>> b = 2
>>> c = a+b
>>> c
3
>>> 1 + 2
3
>>> c = 10
>>> c
10
>>> c = 3.14
>>> c
3.14
>>> a = [2.1, 2.2, 2.3]
>>> a.length
Traceback (most recent call last):
  File "<pyshell#12>", line 1, in <module>
    a.length
AttributeError: 'list' object has no attribute 'length'
>>> len(a)
3
>>> a(0)
Traceback (most recent call last):
  File "<pyshell#14>", line 1, in <module>
    a(0)
TypeError: 'list' object is not callable
>>> a[0]
2.1
>>> a[len(a)-1]
2.3
>>> a[2]
2.3
>>> sentence = "This is a sentence"
>>> sentence
'This is a sentence'
>>> i = 4
>>> f = 4.3
>>> sum = i+f
>>> sum
8.3
>>> product = i*f
>>> product
17.2
>>> quotient = i/f
>>> quotient
0.9302325581395349
>>> difference = i-f
>>> difference
-0.2999999999999998
>>> t = [1,2,3,4,5]
>>> for w in t
SyntaxError: invalid syntax
>>> 
