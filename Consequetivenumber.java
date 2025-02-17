

public class Consequetivenumber {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,0,0,1,1,1,1,0};
        numberseries(arr);
    }
static void numberseries(int[] arr)
{
int count = 0;
int prev = 0; 
for (int i = 0;i<arr.length;i++)
{
if(arr[i]==1)
count++;
else if(arr[i]==0)
{
if(prev<=count)
{
prev = count;
}
count = 0;
}
else
System.out.println("element not found");
}
if(prev>=count)
System.out.println(prev);
else
System.out.println(count);
}
}