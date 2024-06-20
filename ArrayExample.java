class ArrayExample{
    public static void main(String args[]){
    int[] array1 = {2,3,4,5};
    int[] array2 = {1,2,3,4};  
    int[] Sumarray = new int[array1.length];
    for(int i=0;i<array1.length;i++){
       Sumarray[i] = array1[i]+array2[i];
    }
    for(int Sum : Sumarray){
 System.out.print(Sum + " ");
    }
    }
}
