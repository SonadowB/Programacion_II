import math
class AreasFiguras:
    # Círculo
    def calcular_area_circulo(self, radio):
        return math.pi * radio ** 2

    # Rectángulo
    def calcular_area_rectangulo(self, base, altura):
        return base * altura

    # Triángulo rectángulo
    def calcular_area_triangulo(self, base, altura, es_triangulo):
        if es_triangulo:
            return (base * altura) / 2
        else:
            return 0

    # Trapecio
    def calcular_area_trapecio(self, base_mayor, base_menor, altura):
        return ((base_mayor + base_menor) * altura) / 2

    # Pentágono
    def calcular_area_pentagono(self, lado, apotema):
        perimetro = lado * 5
        return (perimetro * apotema) / 2

figuras = AreasFiguras()

radio = 5

b_rect = 4
alt_rect = 6

b_tri = 3
alt_tri = 4

b_mayor_trap = 6
b_menor_trap = 4
alt_trap = 5

l_pent = 4
apotema_pent = 3

area_circulo = figuras.calcular_area_circulo(radio)
area_rectangulo = figuras.calcular_area_rectangulo(b_rect, alt_rect)
area_triangulo = figuras.calcular_area_triangulo(b_tri, alt_tri, True)
area_trapecio = figuras.calcular_area_trapecio(b_mayor_trap, b_menor_trap, alt_trap)
area_pentagono = figuras.calcular_area_pentagono(l_pent, apotema_pent)

print(f"Área del círculo: {area_circulo}")
print(f"Área del rectángulo: {area_rectangulo}")
print(f"Área del triángulo rectángulo: {area_triangulo}")
print(f"Área del trapecio: {area_trapecio}")
print(f"Área del pentágono: {area_pentagono}")
