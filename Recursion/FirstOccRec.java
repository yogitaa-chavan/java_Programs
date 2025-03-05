class FirstOccRec 
{
	public static void main(String[] args) 
	{
		int[] arr={2,6,5,2,6,3};
		int key=8;
		System.out.println(KeyOcc(arr,0,key));
	}
	public static int KeyOcc(int arr[],int i,int key){
		if(key == arr[i])return i;
		if(i==arr.length-1) return -1;
		return KeyOcc(arr,i+1,key);
	}
}
