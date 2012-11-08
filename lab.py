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
>>> t = [1,2,3,4,5]
>>> t
[1, 2, 3, 4, 5]
>>> for w in t
SyntaxError: invalid syntax
>>> for w in t:
	sum+=t[w]

	
Traceback (most recent call last):
  File "<pyshell#5>", line 2, in <module>
    sum+=t[w]
TypeError: unsupported operand type(s) for +=: 'builtin_function_or_method' and 'int'
>>> sum = 0
>>> for w in t:
	sum = sum + t[w]

	
Traceback (most recent call last):
  File "<pyshell#9>", line 2, in <module>
    sum = sum + t[w]
IndexError: list index out of range
>>> sum = t[0] + t[1] + t[2] + t[3] +t[4]
>>> average = sum/len(t)
>>> average
3.0
>>> words = ["the", "quick", "brown", "fox"]
>>> words
['the', 'quick', 'brown', 'fox']
>>> words.capitalize
Traceback (most recent call last):
  File "<pyshell#15>", line 1, in <module>
    words.capitalize
AttributeError: 'list' object has no attribute 'capitalize'
>>> words.capitalize()
Traceback (most recent call last):
  File "<pyshell#16>", line 1, in <module>
    words.capitalize()
AttributeError: 'list' object has no attribute 'capitalize'
>>> words[0].capitalize()
'The'
>>> 
>>> words[1].capitalize()
'Quick'
>>> words[].capitalize()
SyntaxError: invalid syntax
>>> words[2].capitalize()
'Brown'
>>> words[3].capitalize()
'Fox'
>>> words[4].capitalize()
Traceback (most recent call last):
  File "<pyshell#23>", line 1, in <module>
    words[4].capitalize()
IndexError: list index out of range
>>> words
['the', 'quick', 'brown', 'fox']
>>> [words.captialize() for words]
SyntaxError: invalid syntax
>>> [words.captialize() for words in ["the", "quick", "brown", "fox"]
KeyboardInterrupt
>>> a = ["A","B","C","D"]
>>> a[0].lower()
'a'
>>> a[1].lower()
'b'
>>> a[2].lower()
'c'
>>> a[3].lower()
'd'
>>> b = "'happy', 'cars'".split()
>>> b
["'happy',", "'cars'"]
>>> b = "happy, freedom, running, clockspeoplecars".split()
>>> b
['happy,', 'freedom,', 'running,', 'clockspeoplecars']
>>> b = "happy freedom running clocks cars".split()
>>> b
['happy', 'freedom', 'running', 'clocks', 'cars']
>>> b.insert(3, 'lol')
>>> b
['happy', 'freedom', 'running', 'lol', 'clocks', 'cars']
>>> b.sort()
>>> b
['cars', 'clocks', 'freedom', 'happy', 'lol', 'running']
>>> b.pop(3)
'happy'
>>> b
['cars', 'clocks', 'freedom', 'lol', 'running']
>>> b
'cars clocks freedom lol running'
>>> a = [[1,2,3],[4,5,6],[7,8,9]]
>>> a
[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
>>> a[0][0]
1
>>> a[2][2]
9
>>> 
