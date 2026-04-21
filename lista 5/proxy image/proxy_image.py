from imagem_real import ImagemReal

class ProxyImage: # Proxy verifica se a requisição já teve acesso à ImagemReal
    def requestProxy(x):
        if x != None:
            print("Já teve acesso, apenas reutilizar.")
        else:
            x = ImagemReal.request()
