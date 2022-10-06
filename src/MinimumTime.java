public class MinimumTime {
        public int minCost(String colors, int[] neededTime) {
            int sum =0 ;
            int start =0;
            for(int i =1;i<neededTime.length;i++)
            {
                if(colors.charAt(start)!=colors.charAt(i)){
                    if((start+1)!=i)
                        sum += findSum(start,i,neededTime);
                    start = i;
                }
                if(i==neededTime.length-1){
                    sum += findSum(start,i+1,neededTime);
                }
            }
            return sum;
        }
        public int findSum(int start, int end,int[] neededTime){
            int max = Integer.MIN_VALUE;
            int sum =0;
            for(int i=start;i<end;i++){
                sum+=neededTime[i];
                if(max<neededTime[i])
                    max = neededTime[i];
            }
            return sum-max;
        }

    public static void main(String[] args) {
         MinimumTime minimumTime = new MinimumTime();
         minimumTime.minCost("aabaa", new int[]{1,2,3,4,1});
    }
    }