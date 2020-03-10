

class PeticionCompra:
    def __init__(self, indice, desc, amt):
        self.id = indice
        self.descripcion = desc
        self.cantidad = amt
    
    def getCantidad(self):
        return self.cantidad
    
    def toString(self):
        return str(self.id) + " : " + self.descripcion

class PRComerciante:
    def __init__(self, nombre):
        self.nombreComerciante = nombre

    def getNombreComerciante(self):
        return self.nombreComerciante

    def getNextComerciante(self):
        return self.nextComerciante

    def getName(self):
        return self.nombreComerciante

    def setNextComerciante(self, comerciante):
        self.nextComerciante = comerciante    
    
    def autorizar(self, peticion):
        pass
    
    

class GerenteRama(PRComerciante):
    limite = 75000
    def __init__(self, nombre):
        self.nombreComerciante = nombre

    def autorizar(self, peticion):
        cantidad = peticion.getCantidad()
        if (cantidad <= self.limite):
            print(" Gerente de rama:", self.getName(), " ha autorizado el pedido - ", peticion.toString())
            return True
        else:
            self.getNextComerciante().autorizar(peticion)

class GerenteRegional(PRComerciante):
    limite = 100000
    def __init__(self, nombre):
        self.nombreComerciante = nombre

    def autorizar(self, peticion):
        cantidad = peticion.getCantidad()
        if (cantidad <= self.limite):
            print(" Gerente regional:", self.getName(), " ha autorizado el pedido - ", peticion.toString())
            return True
        else:
            self.getNextComerciante().autorizar(peticion)

class VicePresidente(PRComerciante):
    limite = 200000
    def __init__(self, nombre):
        self.nombreComerciante = nombre

    def autorizar(self, peticion):
        cantidad = peticion.getCantidad()
        if (cantidad <= self.limite):
            print(" Vicepresidente:", self.getName(), " ha autorizado el pedido - ", peticion.toString())
            return True
        else:
            self.getNextComerciante().autorizar(peticion)

class Presidente(PRComerciante):
    limite = 400000
    def __init__(self, nombre):
        self.nombreComerciante = nombre

    def autorizar(self, peticion):
        cantidad = peticion.getCantidad()
        if (cantidad <= self.limite):
            print(" Presidente & COO:", self.getName(), " ha autorizado el pedido - ", peticion.toString())
            return True
        else:
            print("Pedido -", peticion.toString(), "no pudo ser autorizado")
            print("La junta ejecutiva necesita analizar la petición")
            print("Razón: Cantidad muy grande")

class PRGerente:
    gerenteRama = GerenteRama("Robin")
    gerenteRegional = GerenteRegional("Oscar")
    vicePresidente = VicePresidente("Kate")
    coo = Presidente("Coo")
    def crearFlujoAutorizacion(self):
        self.gerenteRama.setNextComerciante(self.gerenteRegional)
        self.gerenteRegional.setNextComerciante(self.vicePresidente)
        self.vicePresidente.setNextComerciante(self.coo)

if __name__ == '__main__':
    gerente = PRGerente()
    gerente.crearFlujoAutorizacion()

    peticion = PeticionCompra(1, "Objetos de oficina", 10000)
    gerente.gerenteRama.autorizar(peticion)

    peticion = PeticionCompra(2, "Obtención de Hardware", 90000)
    gerente.gerenteRama.autorizar(peticion)

    peticion = PeticionCompra(3, "Negociazo 1", 150000)
    gerente.gerenteRama.autorizar(peticion)

    peticion = PeticionCompra(4, "Negociazo 2", 300000)
    gerente.gerenteRama.autorizar(peticion)

    peticion = PeticionCompra(5, "Campaña AD", 800000)
    gerente.gerenteRama.autorizar(peticion)