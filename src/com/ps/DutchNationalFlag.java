package com.ps;

public class DutchNationalFlag {
	public static void swap(int bsd[],int i,int j){
		int temp = bsd[j];
		bsd[j]=bsd[i];
		bsd[i]=temp;
	}
	public static void main(String[] args) {
		int a[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		int i=0;
		int j=-1;
		int k=a.length;
		
		while(i<k){
			if(a[i]==0){
				swap(a,j+1,i);
				j++;i++;
			}
			else if(a[i]==1){
				i++;
			}
			else if(a[i]==2){
				if(a[k-1]!=2){
					swap(a,i,k-1);
					k--;
				}
				else{
					k--;
				}
			}
		}
		for (int i1 = 0; i1 < a.length; i1++) 
            System.out.print(a[i1]+" "); 
        System.out.println(""); 
	}
}
