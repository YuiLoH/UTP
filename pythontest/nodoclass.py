class Nodo:
    def __init__(self, letra):
        self.letra = letra
        self.hijo = []
        self.padre = None

    def get_level(self):
        level = 0
        p = self.padre
        while p:
            level += 1
            p = p.padre

        return level

    def printnodo(self):
        spaces = ' ' * self.get_level() * 2
        prefix = spaces + "|_" if self.padre else " "
        print(prefix + self.letra)
        if self.hijo:
            for i in self.hijo:
                i.printnodo()

    def addnodo(self, hijo):
        hijo.padre = self
        self.hijo.append(hijo)

def formarnodo():
    raiz = Nodo('O')

    B = Nodo('B')
    B.addnodo(Nodo('E'))
    B.addnodo(Nodo('A'))
    B.addnodo(Nodo('E'))

    J = Nodo('J')
    J.addnodo(Nodo('O'))
    J.addnodo(Nodo('A'))
    J.addnodo(Nodo('E'))

    S = Nodo('S')
    S.addnodo(Nodo('O'))
    S.addnodo(Nodo('A'))

    raiz.addnodo(B)
    raiz.addnodo(J)
    raiz.addnodo(S)

    raiz.printnodo()

formarnodo()
