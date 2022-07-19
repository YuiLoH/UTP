palabra=["hola","oasis","oso"]
print(palabra)
pala=[]
lista=[]
j=0

for row in palabra:
    print(row)



for row in palabra:
    for i in row:
        pala.append(i)
    print(pala,len(pala),type(pala))
    lista.append(pala[:])
    pala.clear()
print(lista)
lista[0].pop(0)
print(lista)
