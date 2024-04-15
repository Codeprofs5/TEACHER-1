"""//1
import keyword
print(keyword.kwlist)
"""

"""// declare a variable
m=10
print(m)
"""

"""#check data type of variables
x=20
print(type(x))
y="Dibya"
print(type(y))
z=10.9
print(type(z))
a=3+3j
print(type(a))
"""

"""#check if a variable belongs to specific class or not
x=30
print(isinstance(x,int))
print(isinstance(x,str))
print(isinstance(x,complex))
"""
"""#retrieve the imaginary parta nd real part of the complex number
comp=3+6j
print("imaginary part of the complex number:",comp.imag)
print("real part of the complex number:",comp.real)
"""
"""#dlt an object and check if the object is deleted or not
x=100
del(x)
"""

"""#print a string in different ways
str1='Dibya'
str2="Ranjan "
str3='''Patra'''
print(str1,str2,str3)
"""
"""#print string in multiple lines
str="How are you? \n" "hi! I am Dibya "
print(str)
"""

"""#input your name
str=input("Enter your name:")
print("Hi",str)
"""
"""  
a,b,c="Dibya",22,23
print(a,b,c)
"""
"""#swap two nos
a,b=5,6
print(a,b)
a,b=b,a
print(a,b)
"""
"""#swapping three numbers
a=input("Enter 1st no:")
b=input("Enter 2nd no:")
c=input("Enter 3rd n0:")
print(a,b,c ,"are three numbers to be swapped")
a,b,c=b,c,a
print(a,b,c , "after swapping")
"""
"""#print hello in 3 ways
str="hello"
print(str*3)
print(str,str,str)
print(3*str)
"""
"""#print welcome message
str=input("welcome message")
print(str)
""" 

"""#sum of three nos
a=int(input("Enter 1st no:"))
b=int(input("Enter 2nd no:"))
c=int(input("Enter 3rd n0:"))
sum=a+b+c
print(sum)
"""

"""#BMI calcultor
height=int(input("Enter the height of the person"))
weight=int(input("Enter the weight of the person"))
age=int(input("Enter the age of the person"))
if (age<66 and age>17):
    bmi=weight/(height*height)
    print((bmi,"is the BMI of the person"))
else:
    print("Sorry BMI cannot be calculated")
"""
"""#kilometer to miles
kilometer=int(input("Enter the kilometer travelled"))
miles=kilometer*0.621371
print(miles,"is the distance travelled in miles")
""" 
"""#conversion of tons into quintals and kilogram
t=float(input("Enter the weight in tons"))
q=t*10
k=t*1000
print(q,"Weight in quintals")
print(k,"weight in kilograms")
"""

"""#traversing straing an dseparating it with -
str=input("Enter your name:")
for character in str:
    print(character,end='-')
"""

 
"""#1palindrome in two ways
str=input("Enter you name")
print(str[-1::-1])
"""
"""#2
str=input("Enter your name")
for i in range(len(str)-1,-1,-1):
    print(str[i],end=" ")
    
"""
#22




""""
#23 to check an integer contains any zero or not
num=input("Enter any integer:")
if '0' in num:
    print("yes the integer you enetred contains zero")
else:
    print("Does not conatins any zero")
"""


""" #24 
str='='
str1=''' 
'''
print(str*20,str1*10,str*20)
"""
"""#25
str=input("Enter your username:")
str2=input("Enter your passcode")
if str in str2:
    print("Your passcode shouldnot contain your username")
else:
    print("THank you")
"""

