import msvcrt
import os
char=''
print ("Please enter a value.")
while char != ' ':
    if ord(msvcrt.getch()==32):
        break
    char = msvcrt.getch()
    print (char)
    print(type(char))
os.system("pause")
