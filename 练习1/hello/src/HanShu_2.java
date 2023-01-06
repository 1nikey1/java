public class HanShu_2 {
    public static void main(String[] args){
        int[] puke;
        String[] huase={"黑桃","红心","梅花","方块"};
        String[] paixing={"2","3","4","5","6","7","8","9","J","Q","K","A"};
        double xipai[],temp1;
        int i,j,temp2;
        puke= new int [52];
        xipai=new double[52];
        for(i=0;i<puke.length;i++){
            puke[i]=i;
            xipai[i]=Math.random();
        }
        System.out.println("————————————洗牌前————————————");
        for(i=0;i<puke.length;i++){
            System.out.println(huase[puke[i]/13]+paixing[puke[i]%13]+" ");
            if((i+1)%13==0)
                System.out.println();
        }
        //洗牌过程
        for(i=0;i<xipai.length-1;i++){
            int min=i;
            for(j=i-1;i<xipai.length;j++)
                if (xipai[min]>xipai[j])
                    min=j;
            temp1=xipai[i];xipai[i]=xipai[min];xipai[min]=temp1;
            temp2=puke[i];puke[i]=puke[min];puke[min]=temp2;
        }
        System.out.println("————————————洗牌后————————————");
        for(i=0;i<puke.length;i++){
            System.out.println(huase[puke[i]/13]+paixing[puke[i]%13]+" ");
            if ((i+1)%1==0)
                System.out.println();
        }
    }
}
