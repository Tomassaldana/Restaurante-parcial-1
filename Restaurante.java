/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import Restaurante.Cuenta;
import Restaurante.Cliente;
/**
 *
 * @Tomas Saldaña
 * Simulacion sistema de restaurante
 * metodos son elegir plato, pagar
 */
public class Restaurante {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        Map<Integer, Cuenta> cuentas = new HashMap<>();
        cuentas.put(12345, new Cuenta(12345, 1000000, "Juan Perez"));
        cuentas.put(23456, new Cuenta(23456, 5500000, "Jose Castro"));
        cuentas.put(34567, new Cuenta(34567, 1500000, "Julieta Venegas"));
        cuentas.put(45678, new Cuenta(45678, 22300000, "Gabriel Mora"));
        cuentas.put(56789, new Cuenta(56789, 3700000, "Angelica Velasco"));
        cuentas.put(67890, new Cuenta(67890, 7000000, "Mariana Rodriguez"));
        cuentas.put(78901, new Cuenta(78901, 1245000, "David Vargas"));
        cuentas.put(89012, new Cuenta(89012, 2500000, "Samuel Feris"));
        cuentas.put(90123, new Cuenta(90123, 4500000, "Michel Plazas"));
        cuentas.put(10123, new Cuenta(10123, 350000, "Benito Martinez"));

        // Pedir al usuario que ingrese el número de cuenta
        System.out.print("Ingrese su numero de cuenta: ");
        int numeroCuenta = scanner.nextInt();

        // Verificar si la cuenta existe 
        Cuenta cuentaCliente = cuentas.get(numeroCuenta);

        if (cuentaCliente != null) {
            System.out.println("Bienvenido " + cuentaCliente.getNombreTitular());
            System.out.println("Bienvenido Has accedido a la cuenta: " + numeroCuenta);
        } else {
            System.out.println("Número de cuenta no válido.");
            return; // Salir si la cuenta no existe
            
        }
        
        Cliente cliente = new Cliente(cuentaCliente.getNombreTitular(), numeroCuenta);
        cliente.setCuenta(cuentaCliente);
        String opcion;
        
        do {
            System.out.println("\nOpciones:");
            System.out.println("1. Ver menu");
            System.out.println("2. Ver carrito");
            System.out.println("3. Pagar");
            System.out.println("4. Salir");

            System.out.print("Ingrese una opcion: ");
            opcion = scanner.next();
            
            switch (opcion) {
                case "1" -> {
                    System.out.print("Cual menu desea?");
                    do {
                        System.out.println(" 1. Pollo sudado con arroz y papa");
                        System.out.println(" 2. Spaguettis a la bolognesa");
                        System.out.println(" 3. Cazuela de frijoles");
                        } while (!opcion.equals("4"));
                    switch (opcion) {
                        case "1" -> {
                            System.out.print("Cuesta" + precio + "Desea añadirlo al carrito?");
                        }
                        case "2" -> {
                            System.out.print("Cuesta" + precio + "Desea añadirlo al carrito?");
                        }
                        case "2" -> {
                            System.out.print("Cuesta" + precio + "Desea añadirlo al carrito?");
                        }
                    }
                    double precio;
                    
                }
                case "2" -> {
                    System.out.print("Carrito de compras ");
                    double monto = scanner.nextDouble();
                    cliente.getCuenta().retirar(monto);
                }
                case "3" -> {
                    System.out.print("pagar pedido ");
                    
                   } while (!opcion.equals("4"));
    }
}
    
    
    
  
