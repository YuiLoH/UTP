import ply.lex as lex
import ply.yacc as yacc
import sys

er=[]
tokens  = [
    'DECIMAL',
    'ENTERO'
]

# Tokens
# Caracteres ignorados
t_ignore = r' '

def t_DECIMAL(t):
    r'\d+\.\d+'
    t.value=float(t.value)
    return t

def t_ENTERO(t):
    r'\d+'
    t.value=int(t.value)
    return t


def t_newline(t):
    r'\n+'
    t.lexer.lineno += t.value.count("\n")
    
def t_error(t):
    er.append("Caracter ilegal: "+ t.value[0]+", en la línea: "+ str(t.lexer.lineno))
    t.lexer.skip(1)
    
    
# Hash
class HashTable:  
    def __init__(self):
        self.MAX = 10
        self.arr = [[] for i in range(self.MAX)]
        
    def get_hash(self, key):
        hash = 0
        for char in key:
            hash += ord(char)
        return hash % self.MAX
    
    def __getitem__(self, key):
        arr_index = self.get_hash(key)
        for kv in self.arr[arr_index]:
            if kv[0] == key:
                return kv[1]
            
    def __setitem__(self, key, val):
        h = self.get_hash(key)
        found = False
        for idx, element in enumerate(self.arr[h]):
            if len(element)==2 and element[0] == key:
                self.arr[h][idx] = (key,val)
                found = True
        if not found:
            self.arr[h].append((key,val))
        
    def __delitem__(self, key):
        arr_index = self.get_hash(key)
        for index, kv in enumerate(self.arr[arr_index]):
            if kv[0] == key:
                print("del",index)
                del self.arr[arr_index][index]
# Tabla hash
tabla=HashTable()

# Construyendo el analizador léxico
lexer = lex.lex()

# PySimpleGUI
import PySimpleGUI as sg

layout = [[sg.Text("Ruta del archivo:")],
          [sg.In(key='-IN-') ,sg.FileBrowse(file_types=(("Text Files", "*.txt"),))],
          [sg.Button("Analizar")],
          [sg.Output(key='-OUT-', size=(80,15))],
          [sg.Text("Error:")],
          [sg.Text(key='-ERR-', size=(60,5))]]

# Crear ventana
window = sg.Window("Léxico", layout, margins=(100, 50))


# Crear loop de evento
while True:
    event, values = window.read()
    # Si presiona el botón Analizar
    if event == "Analizar":
        path = values['-IN-'] 
        f = open(path, 'r')
        entrada = f.read()
        f.close()
        lexer.input(entrada)
        print("Datos leídos:")
        print(entrada)
        while True:
            tok=lexer.token()
            if not tok:
                break
            #print(tok)
            tabla[str(tok.value)]=tok.type
            if er:
                window['-ERR-'].update(er[0])
        print("\nTabla de símbolo")
        for lista in tabla.arr:
            print(lista)
    # Termina el programa si el usuario cierra la ventana 
    if event == sg.WIN_CLOSED:
        break

window.close()
