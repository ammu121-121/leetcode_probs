class Solution {
    public int maxArea(int[] h) {
        
       int i=0,j= h.length-1,max=0,l=0;
    while(i<j){
               int b= j-i;
     if(h[i]>h[j]){
       l=h[j];
       j--;
     }
     else if(h[i]<h[j]){
   l= h[i];i++;
     }

   else{
    l=h[i];
    i++;j--;
   }
  
int max1=l*b;
if(max<max1)max=max1;

    }
return max;
    }
}