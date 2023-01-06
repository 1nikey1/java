public class DiGui {
    int dg(int n){
        if(n==1){
            return 1;
        }
        else {
            return dg(n-1)*n;
        }
    }
}
