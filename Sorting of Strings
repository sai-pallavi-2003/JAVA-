public class sortingstrings{
    public static void main(String[] args){
        int i,j;
        int n;
        String temp;
        // String[] strings;
        String strings[] = new String[100];
        n= Integer.parseInt(args[0]);
        System.out.println("the given strings are: ");
        for(i=0;i<n;i++){
          strings[i] = args[i+1];
        }
        for(i=1;i<=n;i++){
            System.out.println(args[i]);
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(strings[i].compareTo(strings[i+1])>0){
                    temp=strings[i];
                    strings[i]=strings[j];
                    strings[j]=temp;
                }
            }
        }
        // args[i].sort
        System.out.println("in alphabetical order: ");
        for(i=0;i<n;i++){
            System.out.println(strings[i]);
        }
        
    }
    
}
