import java.util.ArrayList;

public class Alunos {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Iniciar Chamada");
        alunos.add("Carlos");
        alunos.add("Pedro");
        alunos.add("Maria");
        alunos.add("Luis");
        alunos.add("Joao");
        alunos.add("Maria");
        alunos.add("Andre");
        alunos.add("Tauan");

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }
    }
}
