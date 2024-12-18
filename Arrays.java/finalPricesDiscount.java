class Solution {
    public int[] finalPrices(int[] prices) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<prices.length;i++){
            int itemPrice=prices[i];
            int discount=itemPrice;;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=itemPrice){
                    discount=itemPrice-prices[j];
                    break;
                }
            }
            list.add(discount);
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
