import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[]args) {

        ArrayList<Integer> horasTrabajadas = new ArrayList<>();
        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);

        ArrayList<Integer> valorPorHora = new ArrayList<>();
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);

        ArrayList<Integer> totalPorDia = new ArrayList<>();

        for (int i = 0;  i < horasTrabajadas.size(); i++){
            int total = horasTrabajadas.get(i) * valorPorHora.get(i);
            totalPorDia.add(total);
        }

        int totalFinal = 0;
        for (int total:totalPorDia) {
            totalFinal+=total;
        }

        System.out.println(totalPorDia);
        System.out.println("El total a cobrar es: $" + totalFinal);

    }
    
}
