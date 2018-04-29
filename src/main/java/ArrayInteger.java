public class ArrayInteger {


    public static void main(String[] args) {
        int[] arrayInteger = new int[20];
        for(int i =0; i<20;i++) {
            arrayInteger[i] = -10 + (int) (Math.random() * 20);
            System.out.println(arrayInteger[i]);
        }

        System.out.println("end");
        int minPlus = 20;
        int maxMinus = -20;
        int minIndex = -1;
        int maxIndex = -1;

        for(int i =0; i<20;i++) {
            if ((arrayInteger[i]<minPlus)&&(arrayInteger[i]>0)){minPlus = arrayInteger[i]; minIndex = i;}
            if ((arrayInteger[i]>maxMinus)&&(arrayInteger[i]<0)){maxMinus = arrayInteger[i]; maxIndex = i;}
        }

        int temp = arrayInteger[minIndex];
        arrayInteger[minIndex] = arrayInteger[maxIndex];
        arrayInteger[maxIndex] = temp;

        for(int i =0; i<20;i++) {
             System.out.println(arrayInteger[i]);
        }
    }
}

