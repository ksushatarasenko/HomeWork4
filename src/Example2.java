public class Example2 {

    public static void main(String[] args) {

        int [] mas = new int[5];
        int ArrayStart = 10;
        int ArrayEnd = 99;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(ArrayStart+Math.random()*(ArrayEnd-ArrayStart+1));
            System.out.print(mas[i]+" ");
        }


         boolean checkResult= true;

        for (int i = 1; i < mas.length; i++) {
            if(mas[i]<=mas[i-1]){
                checkResult = false;
                break;
            }
        }
        if(checkResult){
            System.out.println("");
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("");
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }



}
