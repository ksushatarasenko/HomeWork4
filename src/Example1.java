public class Example1 {

    public static void main(String[] args) {

        int []name =new int [8];
        for (int i=0; i<name.length; i ++){
            name[i]=(int)(Math.random()*50+1);
            System.out.print(name[i]+" ");
        }
        System.out.println();
        System.out.println("Array after");
        for (int i=0; i<name.length; i++){
            if (i % 2 !=0) name[i]=0;

            System.out.print(name[i]+" ");
        }


    }
}
