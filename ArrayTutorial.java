public class ArrayTutorial{

static  int[] arrayNew = new int[110];

public static void main(String[] args){

    for(int i = 0; i<=(arrayNew.length)-1;i++){

      arrayNew[i]=i;
    }
    for(int i = 0; i<=arrayNew.length-1;i++){

      System.out.println(arrayNew[i]);
    }

  }
}
