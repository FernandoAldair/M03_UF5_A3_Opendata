import Model.Nacimientos;
import com.opencsv.bean.CsvToBean;

import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    Csv csv = new Csv();

    void start(){

        boolean continuar = true;
        int opcion;

        csv.lista();


        while (continuar != false){

            System.out.println("1   Imprimir lista de nacimiento de 2015");
            System.out.println("2.  Nacimientos en España (cantidad)");
            System.out.println("3.  Nacimientos en Pakistan (lista) ");
            System.out.println("4.  Nacimientos en los  distritos que contiene la palabra 'Sant' en su nombre");
            System.out.println("5   Nacimientos en los barrios que empiezan por 'la'");
            System.out.println("0.  Salir");

            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    System.out.println(csv.desgracias.stream()
                            .filter(nacimientos -> nacimientos.getLloc_naixement().contains("Espanya"))
                            .count());
                    break;

                case 2:
                    csv.desgracias.stream()
                            .filter(naixement -> naixement.getLloc_naixement().equals("Pakistan"))
                            .forEach(System.out::println);
                    break;

                case 3:
                    csv.desgracias.stream()
                            .filter(nacimientos -> nacimientos.getNom_Districte().contains("Sant"))
                            .forEach(System.out::println);
                    break;

                case 4:
                    csv.desgracias.stream()
                            .filter(nacimientos -> nacimientos.getAny().contains("2015"))
                            .forEach(System.out::println);

                case 5:
                    csv.desgracias.stream()
                            .filter(nacimientos -> nacimientos.getNom_Barri().contains("la"))
                            .forEach(System.out::println);
                    break;

                case 0:
                    System.out.println("saliendo");
                    continuar = false;
                    break;

            }
        }
    }

}