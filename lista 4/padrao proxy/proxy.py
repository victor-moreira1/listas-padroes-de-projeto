from time import sleep
from objeto_real import ObjetoReal

class ProxyLoading:
    def request_proxy():
        print("Proxy carregando...")
        ObjetoReal.request()
        sleep(10)