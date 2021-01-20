class foreach1d
{
    public static void main(String arg[])
    {
       int arr[][] = new int[3][3];
       arr[0][0]=10;
       arr[0][1]=106;
       arr[0][2]=105;
       arr[2][0]=103;
       arr[1][0]=11;
       
       for(int i[] : arr)
       {
          for(int j : i)
          { 
             System.out.print(j + " ");
          }
             System.out.println();
       }
     }
}