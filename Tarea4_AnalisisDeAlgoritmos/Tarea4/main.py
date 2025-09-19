stack = []

def push(stack, item):
    # Push
    stack.append(item)
    #print("Stack: ", stack)

def peek(stack):
    # Peek
    topElement = stack[-1]
    #print("Peek: ", topElement)
    return topElement

def pop(stack):
    # Pop
    poppedElement = stack.pop()
    #print("Pop: ", poppedElement)
    return poppedElement

def isEmpty(stack):
    # isEmpty
    isEmpty = not bool(stack)
    #print("isEmpty: ", isEmpty)
    return isEmpty

def size(stack):
    # Size
    #print("Size: ",len(stack))
    return len(stack)

# -~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-
#  Crear una lista de enteros en Python y realizar la suma con recursividad, el caso base es cuando la lista esta vacia.

list = [1,2,3,4,5]
def suma(list):
    if len(list) == 0:
        return 0
    else:
        result = list[0]
        list = list[1:]
        return result + suma(list)

print(suma(list))

#Contar los digitos de un entero positivo
numero = 123456789
def contarDigitos(numero):
    x = numero // 10
    if x == 0:
        return 1
    else:
        return 1 + contarDigitos(x)

print(contarDigitos(numero))

#Eliminar de un ADT pila el valor en la posición media.
stack = [1,2,3,4,3,2,1]
largoStack = len(stack)
def eliminarMedio(stack):
    auxiliar = []

    def eliminador(stack):
        if len(stack) == largoStack//2+1:
            pop(stack)
            return stack
        else:
            push(auxiliar, peek(stack))
            pop(stack)
            return eliminador(stack)
    stack = eliminador(stack)

    while len(auxiliar) > 0:
        push(stack, pop(auxiliar))

    return stack

print(eliminarMedio(stack))

# Verificar si na cadena es Palíndromo con recursividad

def palindrome(string):
    string = string.replace(" ","").lower()
    if len(string) <= 1:
        return True
    if string [0] != string [-1]:
        return False
    return palindrome(string[1:-1])

print (palindrome("ana"))