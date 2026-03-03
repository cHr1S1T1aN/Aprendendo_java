public class TestandoGradeBook {

    public static void main(String[] args) {

        // matriz de notas (3 alunos, 3 provas cada)
        int[][] gradesArray = {
                {87, 96, 70},
                {68, 87, 90},
                {94, 100, 90}
        };

        // criando o objeto
        NewGradeBookTresDeMarco myGradeBook =
                new NewGradeBookTresDeMarco(
                        "Java Programming", gradesArray);

        // executando métodos
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }
}