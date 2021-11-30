public class matrix_addition {
public static void main(String[] args) {
int a[][] = new int [3][3];
int b[][]= new int [3][3];
int sum[][]= new int [3][3];
int i,j,k=0;
for(i=0;i<3;i++){
for(j=0;j<3;j++){
a[i][j]=Integer.parseInt(args[k]);
k++;
}
}
for(i=0;i<3;i++){
for(j=0;j<3;j++){
b[i][j]=Integer.parseInt(args[k]);
k++;
}
}
for(i=0;i<3;i++){
for(j=0;j<3;j++){
sum[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("Given Matrix  A: ");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.print("\t"+a[i][j]);
}
System.out.println("\n");
}

System.out.println("Given Matrix  B: ");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.print("\t"+b[i][j]);
}
System.out.println("\n");
}
System.out.println("The sum of both matrices is: ");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.print("\t"+sum[i][j]);
}
System.out.println("\n");
}



}

}
