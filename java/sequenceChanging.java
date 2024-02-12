class sequenceChanging {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 25, 17, 8, 6};

        int n = arr.length;
        for(int i=1;i<n-1;i++){
            if(arr[i-1]<arr[i] && arr[i+1]<arr[i]){
                System.out.println("Sequence is changing at index: "+i);
            }
        }
    }
}