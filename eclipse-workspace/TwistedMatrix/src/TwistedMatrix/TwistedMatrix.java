package TwistedMatrix;
import java.io.*;

import java.util.*;
public class TwistedMatrix {

	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				int a[],i,j,n;

				n = s.nextInt();
				a = new int[n];
				for(i = 0 ; i<n ; i++)
				{
					a[i] = s.nextInt();
				}
				for(i=1;i<=n;i++)
				{
					for(j=1;j<=n-i;j++)
					{
						if(a[j-1]>a[j])
						{
							a[j-1]=a[j-1]+a[j];
							a[j] = a[j-1]-a[j];
							a[j-1] = a[j-1]-a[j];
						}
					}
				}
				for(i=0;i<n;i++)
				{
					System.out.print(a[i]+" ");
				}
		}
}
