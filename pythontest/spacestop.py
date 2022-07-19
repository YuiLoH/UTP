import msvcrt
import os

x=''
while 1:
    print ('Testing..',x)
    os.system('cls')
    if msvcrt.kbhit():
        if ord(msvcrt.getch()) == 32:
            break
        else:
            x=msvcrt.getch()
            continue
